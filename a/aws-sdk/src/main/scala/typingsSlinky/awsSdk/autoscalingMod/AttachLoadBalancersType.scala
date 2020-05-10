package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancersType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The names of the load balancers. You can specify up to 10 load balancers.
    */
  var LoadBalancerNames: typingsSlinky.awsSdk.autoscalingMod.LoadBalancerNames = js.native
}

object AttachLoadBalancersType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, LoadBalancerNames: LoadBalancerNames): AttachLoadBalancersType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancersType]
  }
  @scala.inline
  implicit class AttachLoadBalancersTypeOps[Self <: AttachLoadBalancersType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerNames(value: LoadBalancerNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

