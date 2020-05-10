package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserRequest extends js.Object {
  /**
    * The ARN of the user's enrollment in the organization. Required.
    */
  var EnrollmentId: typingsSlinky.awsSdk.alexaforbusinessMod.EnrollmentId = js.native
  /**
    * The ARN of the user to delete in the organization. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object DeleteUserRequest {
  @scala.inline
  def apply(EnrollmentId: EnrollmentId): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(EnrollmentId = EnrollmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  @scala.inline
  implicit class DeleteUserRequestOps[Self <: DeleteUserRequest] (val x: Self) extends AnyVal {
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

