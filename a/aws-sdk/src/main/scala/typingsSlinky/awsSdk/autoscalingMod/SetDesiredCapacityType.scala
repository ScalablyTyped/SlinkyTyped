package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDesiredCapacityType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The number of EC2 instances that should be running in the Auto Scaling group.
    */
  var DesiredCapacity: AutoScalingGroupDesiredCapacity = js.native
  /**
    * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor the cooldown period during manual scaling activities.
    */
  var HonorCooldown: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.HonorCooldown] = js.native
}

object SetDesiredCapacityType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, DesiredCapacity: AutoScalingGroupDesiredCapacity): SetDesiredCapacityType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], DesiredCapacity = DesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDesiredCapacityType]
  }
  @scala.inline
  implicit class SetDesiredCapacityTypeOps[Self <: SetDesiredCapacityType] (val x: Self) extends AnyVal {
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
    def withDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHonorCooldown(value: HonorCooldown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HonorCooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorCooldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HonorCooldown")(js.undefined)
        ret
    }
  }
  
}

