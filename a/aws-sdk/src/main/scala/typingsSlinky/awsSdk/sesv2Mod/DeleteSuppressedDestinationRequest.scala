package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSuppressedDestinationRequest extends js.Object {
  /**
    * The suppressed email destination to remove from the account suppression list.
    */
  var EmailAddress: typingsSlinky.awsSdk.sesv2Mod.EmailAddress = js.native
}

object DeleteSuppressedDestinationRequest {
  @scala.inline
  def apply(EmailAddress: EmailAddress): DeleteSuppressedDestinationRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuppressedDestinationRequest]
  }
  @scala.inline
  implicit class DeleteSuppressedDestinationRequestOps[Self <: DeleteSuppressedDestinationRequest] (val x: Self) extends AnyVal {
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
  }
  
}

