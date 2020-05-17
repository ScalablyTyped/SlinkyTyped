package typingsSlinky.grpcGrpcJs.serviceConfigMod

import typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfig extends js.Object {
  var loadBalancingConfig: js.Array[LoadBalancingConfig] = js.native
  var loadBalancingPolicy: js.UndefOr[String] = js.native
  var methodConfig: js.Array[MethodConfig] = js.native
}

object ServiceConfig {
  @scala.inline
  def apply(loadBalancingConfig: js.Array[LoadBalancingConfig], methodConfig: js.Array[MethodConfig]): ServiceConfig = {
    val __obj = js.Dynamic.literal(loadBalancingConfig = loadBalancingConfig.asInstanceOf[js.Any], methodConfig = methodConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
  @scala.inline
  implicit class ServiceConfigOps[Self <: ServiceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancingConfig(value: js.Array[LoadBalancingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodConfig(value: js.Array[MethodConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancingPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancingPolicy")(js.undefined)
        ret
    }
  }
  
}

