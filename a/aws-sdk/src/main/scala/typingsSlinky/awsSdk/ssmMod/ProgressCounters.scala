package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressCounters extends js.Object {
  /**
    * The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.
    */
  var CancelledSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.
    */
  var FailedSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.
    */
  var SuccessSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.
    */
  var TimedOutSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.
    */
  var TotalSteps: js.UndefOr[Integer] = js.native
}

object ProgressCounters {
  @scala.inline
  def apply(): ProgressCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressCounters]
  }
  @scala.inline
  implicit class ProgressCountersOps[Self <: ProgressCounters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelledSteps(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelledSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelledSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelledSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedSteps(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessSteps(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedOutSteps(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedOutSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedOutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedOutSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSteps(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalSteps")(js.undefined)
        ret
    }
  }
  
}

