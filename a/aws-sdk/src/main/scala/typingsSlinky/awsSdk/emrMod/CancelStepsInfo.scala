package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelStepsInfo extends js.Object {
  /**
    * The reason for the failure if the CancelSteps request fails.
    */
  var Reason: js.UndefOr[String] = js.native
  /**
    * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
    */
  var Status: js.UndefOr[CancelStepsRequestStatus] = js.native
  /**
    * The encrypted StepId of a step.
    */
  var StepId: js.UndefOr[typingsSlinky.awsSdk.emrMod.StepId] = js.native
}

object CancelStepsInfo {
  @scala.inline
  def apply(): CancelStepsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStepsInfo]
  }
  @scala.inline
  implicit class CancelStepsInfoOps[Self <: CancelStepsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: CancelStepsRequestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStepId(value: StepId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepId")(js.undefined)
        ret
    }
  }
  
}

