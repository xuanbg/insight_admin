package com.insight.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 宣炳刚
 * @date 2017/9/15
 * @remark 应用入口程序
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class AdminApplication {

    /**
     * 应用入口方法
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
