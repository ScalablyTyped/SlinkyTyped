package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerTargetGroupsType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
    */
  var TargetGroupARNs: typingsSlinky.awsSdk.autoscalingMod.TargetGroupARNs = js.native
}

object AttachLoadBalancerTargetGroupsType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, TargetGroupARNs: TargetGroupARNs): AttachLoadBalancerTargetGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], TargetGroupARNs = TargetGroupARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancerTargetGroupsType]
  }
  @scala.inline
  implicit class AttachLoadBalancerTargetGroupsTypeOps[Self <: AttachLoadBalancerTargetGroupsType] (val x: Self) extends AnyVal {
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
    def withTargetGroupARNs(value: TargetGroupARNs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupARNs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

