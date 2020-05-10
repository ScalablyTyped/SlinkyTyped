package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetUserPasswordRequest extends js.Object {
  /**
    * Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The new password that will be reset.
    */
  var NewPassword: UserPassword = js.native
  /**
    * The user name of the user whose password will be reset.
    */
  var UserName: CustomerUserName = js.native
}

object ResetUserPasswordRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, NewPassword: UserPassword, UserName: CustomerUserName): ResetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], NewPassword = NewPassword.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetUserPasswordRequest]
  }
  @scala.inline
  implicit class ResetUserPasswordRequestOps[Self <: ResetUserPasswordRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewPassword(value: UserPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: CustomerUserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

