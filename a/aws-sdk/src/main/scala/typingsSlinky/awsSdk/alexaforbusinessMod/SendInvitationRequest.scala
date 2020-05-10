package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendInvitationRequest extends js.Object {
  /**
    * The ARN of the user to whom to send an invitation. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object SendInvitationRequest {
  @scala.inline
  def apply(): SendInvitationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendInvitationRequest]
  }
  @scala.inline
  implicit class SendInvitationRequestOps[Self <: SendInvitationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(js.undefined)
        ret
    }
  }
  
}

