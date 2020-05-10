package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureDetails extends js.Object {
  /**
    * Detailed information about the Automation step failure.
    */
  var Details: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.
    */
  var FailureStage: js.UndefOr[String] = js.native
  /**
    * The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.
    */
  var FailureType: js.UndefOr[String] = js.native
}

object FailureDetails {
  @scala.inline
  def apply(): FailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureDetails]
  }
  @scala.inline
  implicit class FailureDetailsOps[Self <: FailureDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: AutomationParameterMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureStage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureStage")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureType")(js.undefined)
        ret
    }
  }
  
}

