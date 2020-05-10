package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteScheduledActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The names of the scheduled actions to delete. The maximum number allowed is 50. 
    */
  var ScheduledActionNames: typingsSlinky.awsSdk.autoscalingMod.ScheduledActionNames = js.native
}

object BatchDeleteScheduledActionType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScheduledActionNames: ScheduledActionNames): BatchDeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionNames = ScheduledActionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteScheduledActionType]
  }
  @scala.inline
  implicit class BatchDeleteScheduledActionTypeOps[Self <: BatchDeleteScheduledActionType] (val x: Self) extends AnyVal {
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
    def withScheduledActionNames(value: ScheduledActionNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

