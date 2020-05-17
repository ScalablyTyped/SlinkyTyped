package typingsSlinky.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XdsConfig extends js.Object {
  var balancerName: String = js.native
  var childPolicy: js.Array[LoadBalancingConfig] = js.native
  var fallbackPolicy: js.Array[LoadBalancingConfig] = js.native
}

object XdsConfig {
  @scala.inline
  def apply(
    balancerName: String,
    childPolicy: js.Array[LoadBalancingConfig],
    fallbackPolicy: js.Array[LoadBalancingConfig]
  ): XdsConfig = {
    val __obj = js.Dynamic.literal(balancerName = balancerName.asInstanceOf[js.Any], childPolicy = childPolicy.asInstanceOf[js.Any], fallbackPolicy = fallbackPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[XdsConfig]
  }
  @scala.inline
  implicit class XdsConfigOps[Self <: XdsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalancerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balancerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildPolicy(value: js.Array[LoadBalancingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackPolicy(value: js.Array[LoadBalancingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

