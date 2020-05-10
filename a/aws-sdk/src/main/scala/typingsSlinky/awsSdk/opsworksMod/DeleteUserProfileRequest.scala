package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserProfileRequest extends js.Object {
  /**
    * The user's IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String = js.native
}

object DeleteUserProfileRequest {
  @scala.inline
  def apply(IamUserArn: String): DeleteUserProfileRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserProfileRequest]
  }
  @scala.inline
  implicit class DeleteUserProfileRequestOps[Self <: DeleteUserProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamUserArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

