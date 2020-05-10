package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepStatus extends js.Object {
  /**
    * The details for the step failure including reason, message, and log file path where the root cause was identified.
    */
  var FailureDetails: js.UndefOr[typingsSlinky.awsSdk.emrMod.FailureDetails] = js.native
  /**
    * The execution state of the cluster step.
    */
  var State: js.UndefOr[StepState] = js.native
  /**
    * The reason for the step execution status change.
    */
  var StateChangeReason: js.UndefOr[StepStateChangeReason] = js.native
  /**
    * The timeline of the cluster step status over time.
    */
  var Timeline: js.UndefOr[StepTimeline] = js.native
}

object StepStatus {
  @scala.inline
  def apply(): StepStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepStatus]
  }
  @scala.inline
  implicit class StepStatusOps[Self <: StepStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureDetails(value: FailureDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: StepState): Self = {
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
    @scala.inline
    def withStateChangeReason(value: StepStateChangeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeline(value: StepTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(js.undefined)
        ret
    }
  }
  
}

