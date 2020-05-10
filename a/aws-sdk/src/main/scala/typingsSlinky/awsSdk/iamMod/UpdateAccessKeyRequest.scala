package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccessKeyRequest extends js.Object {
  /**
    * The access key ID of the secret access key you want to update. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var AccessKeyId: accessKeyIdType = js.native
  /**
    *  The status you want to assign to the secret access key. Active means that the key can be used for API calls to AWS, while Inactive means that the key cannot be used.
    */
  var Status: statusType = js.native
  /**
    * The name of the user whose key you want to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}

object UpdateAccessKeyRequest {
  @scala.inline
  def apply(AccessKeyId: accessKeyIdType, Status: statusType): UpdateAccessKeyRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccessKeyRequest]
  }
  @scala.inline
  implicit class UpdateAccessKeyRequestOps[Self <: UpdateAccessKeyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyId(value: accessKeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: statusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: existingUserNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
  }
  
}

