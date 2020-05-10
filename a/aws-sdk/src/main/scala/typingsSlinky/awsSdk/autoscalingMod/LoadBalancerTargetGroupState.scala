package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTargetGroupState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511] = js.native
  /**
    * The state of the target group.    Adding - The Auto Scaling instances are being registered with the target group.    Added - All Auto Scaling instances are registered with the target group.    InService - At least one Auto Scaling instance passed an ELB health check.    Removing - The Auto Scaling instances are being deregistered from the target group. If connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the instances.    Removed - All Auto Scaling instances are deregistered from the target group.  
    */
  var State: js.UndefOr[XmlStringMaxLen255] = js.native
}

object LoadBalancerTargetGroupState {
  @scala.inline
  def apply(): LoadBalancerTargetGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTargetGroupState]
  }
  @scala.inline
  implicit class LoadBalancerTargetGroupStateOps[Self <: LoadBalancerTargetGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerTargetGroupARN(value: XmlStringMaxLen511): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerTargetGroupARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerTargetGroupARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerTargetGroupARN")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

