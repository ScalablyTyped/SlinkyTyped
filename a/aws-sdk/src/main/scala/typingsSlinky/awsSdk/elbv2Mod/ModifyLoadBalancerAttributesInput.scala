package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLoadBalancerAttributesInput extends js.Object {
  /**
    * The load balancer attributes.
    */
  var Attributes: LoadBalancerAttributes = js.native
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typingsSlinky.awsSdk.elbv2Mod.LoadBalancerArn = js.native
}

object ModifyLoadBalancerAttributesInput {
  @scala.inline
  def apply(Attributes: LoadBalancerAttributes, LoadBalancerArn: LoadBalancerArn): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
  @scala.inline
  implicit class ModifyLoadBalancerAttributesInputOps[Self <: ModifyLoadBalancerAttributesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: LoadBalancerAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerArn(value: LoadBalancerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

