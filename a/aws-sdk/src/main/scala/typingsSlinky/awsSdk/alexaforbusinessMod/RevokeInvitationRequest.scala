package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeInvitationRequest extends js.Object {
  /**
    * The ARN of the enrollment invitation to revoke. Required.
    */
  var EnrollmentId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.EnrollmentId] = js.native
  /**
    * The ARN of the user for whom to revoke an enrollment invitation. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object RevokeInvitationRequest {
  @scala.inline
  def apply(): RevokeInvitationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeInvitationRequest]
  }
  @scala.inline
  implicit class RevokeInvitationRequestOps[Self <: RevokeInvitationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnrollmentId(value: EnrollmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnrollmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnrollmentId")(js.undefined)
        ret
    }
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

