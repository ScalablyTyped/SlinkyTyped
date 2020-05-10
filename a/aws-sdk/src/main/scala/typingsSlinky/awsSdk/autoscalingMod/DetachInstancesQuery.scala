package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachInstancesQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.InstanceIds] = js.native
  /**
    * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances detached.
    */
  var ShouldDecrementDesiredCapacity: typingsSlinky.awsSdk.autoscalingMod.ShouldDecrementDesiredCapacity = js.native
}

object DetachInstancesQuery {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity): DetachInstancesQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachInstancesQuery]
  }
  @scala.inline
  implicit class DetachInstancesQueryOps[Self <: DetachInstancesQuery] (val x: Self) extends AnyVal {
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
    def withShouldDecrementDesiredCapacity(value: ShouldDecrementDesiredCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShouldDecrementDesiredCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceIds(value: InstanceIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(js.undefined)
        ret
    }
  }
  
}

