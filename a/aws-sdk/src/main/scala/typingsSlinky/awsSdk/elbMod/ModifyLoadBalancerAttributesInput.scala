package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLoadBalancerAttributesInput extends js.Object {
  /**
    * The attributes for the load balancer.
    */
  var LoadBalancerAttributes: typingsSlinky.awsSdk.elbMod.LoadBalancerAttributes = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object ModifyLoadBalancerAttributesInput {
  @scala.inline
  def apply(LoadBalancerAttributes: LoadBalancerAttributes, LoadBalancerName: AccessPointName): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerAttributes = LoadBalancerAttributes.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
  @scala.inline
  implicit class ModifyLoadBalancerAttributesInputOps[Self <: ModifyLoadBalancerAttributesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerAttributes(value: LoadBalancerAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerName(value: AccessPointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

