package org.minbox.framework.api.boot.sample;

import org.minbox.framework.api.boot.common.model.ApiBootResult;
import org.minbox.framework.logging.spring.context.annotation.client.EnableLoggingClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ApiBoot Security Oauth2 示例
 * 注意ApiBoot默认拦截"/api/**"路径下的资源，可修改api.boot.security.auth-prefix参数进行修改默认路径
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-03-18 13:15
 * Blog：http://blog.yuqiyu.com
 * WebSite：http://www.jianshu.com/u/092df3f77bca
 * Gitee：https://gitee.com/hengboy
 * GitHub：https://github.com/hengboy
 */
@EnableLoggingClient
@EnableSwagger2
@SpringBootApplication
@RestController
@RequestMapping(value = "/api")
public class ApiBootSecurityOauth999Application {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(ApiBootSecurityOauth999Application.class);

    public static void main(String[] args) {
        
        TokenEndpoint dd;
        SpringApplication.run(ApiBootSecurityOauth999Application.class, args);
        logger.info("「「「「「ApiBoot Security Oauth Sample 启动成功.」」」」」");
    }

    @GetMapping(value = "/test")
    public ApiBootResult testToken() {
        return ApiBootResult.builder().data("这是一个测试Token有效性的方法输出.").build();
    }
}
