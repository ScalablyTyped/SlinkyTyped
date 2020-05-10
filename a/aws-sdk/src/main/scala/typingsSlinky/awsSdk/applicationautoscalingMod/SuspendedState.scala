package typingsSlinky.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendedState extends js.Object {
  /**
    * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to true if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is false. 
    */
  var DynamicScalingInSuspended: js.UndefOr[ScalingSuspended] = js.native
  /**
    * Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to true if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is false. 
    */
  var DynamicScalingOutSuspended: js.UndefOr[ScalingSuspended] = js.native
  /**
    * Whether scheduled scaling is suspended. Set the value to true if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is false. 
    */
  var ScheduledScalingSuspended: js.UndefOr[ScalingSuspended] = js.native
}

object SuspendedState {
  @scala.inline
  def apply(): SuspendedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspendedState]
  }
  @scala.inline
  implicit class SuspendedStateOps[Self <: SuspendedState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicScalingInSuspended(value: ScalingSuspended): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicScalingInSuspended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicScalingInSuspended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicScalingInSuspended")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicScalingOutSuspended(value: ScalingSuspended): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicScalingOutSuspended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicScalingOutSuspended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicScalingOutSuspended")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledScalingSuspended(value: ScalingSuspended): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledScalingSuspended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledScalingSuspended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledScalingSuspended")(js.undefined)
        ret
    }
  }
  
}

