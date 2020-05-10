package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimEventTypeDetails extends js.Object {
  var appealExplanation: js.UndefOr[String] = js.native
  var disputeNotes: js.UndefOr[String] = js.native
  var disputeReason: js.UndefOr[String] = js.native
  var updateStatus: js.UndefOr[String] = js.native
}

object ClaimEventTypeDetails {
  @scala.inline
  def apply(): ClaimEventTypeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimEventTypeDetails]
  }
  @scala.inline
  implicit class ClaimEventTypeDetailsOps[Self <: ClaimEventTypeDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppealExplanation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appealExplanation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppealExplanation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appealExplanation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisputeNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disputeNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisputeNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disputeNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisputeReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disputeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisputeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disputeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStatus")(js.undefined)
        ret
    }
  }
  
}

