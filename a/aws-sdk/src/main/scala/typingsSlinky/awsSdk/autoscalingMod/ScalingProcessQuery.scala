package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingProcessQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * One or more of the following processes. If you omit this parameter, all processes are specified.    Launch     Terminate     HealthCheck     ReplaceUnhealthy     AZRebalance     AlarmNotification     ScheduledActions     AddToLoadBalancer   
    */
  var ScalingProcesses: js.UndefOr[ProcessNames] = js.native
}

object ScalingProcessQuery {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): ScalingProcessQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingProcessQuery]
  }
  @scala.inline
  implicit class ScalingProcessQueryOps[Self <: ScalingProcessQuery] (val x: Self) extends AnyVal {
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
    def withScalingProcesses(value: ProcessNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingProcesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingProcesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingProcesses")(js.undefined)
        ret
    }
  }
  
}

