package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSuppressedDestinationRequest extends js.Object {
  /**
    * The email address that should be added to the suppression list for your account.
    */
  var EmailAddress: typingsSlinky.awsSdk.sesv2Mod.EmailAddress = js.native
  /**
    * The factors that should cause the email address to be added to the suppression list for your account.
    */
  var Reason: SuppressionListReason = js.native
}

object PutSuppressedDestinationRequest {
  @scala.inline
  def apply(EmailAddress: EmailAddress, Reason: SuppressionListReason): PutSuppressedDestinationRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSuppressedDestinationRequest]
  }
  @scala.inline
  implicit class PutSuppressedDestinationRequestOps[Self <: PutSuppressedDestinationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: SuppressionListReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

