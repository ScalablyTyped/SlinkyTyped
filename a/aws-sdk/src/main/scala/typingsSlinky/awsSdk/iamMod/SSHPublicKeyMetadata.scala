package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSHPublicKeyMetadata extends js.Object {
  /**
    * The unique identifier for the SSH public key.
    */
  var SSHPublicKeyId: publicKeyIdType = js.native
  /**
    * The status of the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
    */
  var Status: statusType = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the SSH public key was uploaded.
    */
  var UploadDate: js.Date = js.native
  /**
    * The name of the IAM user associated with the SSH public key.
    */
  var UserName: userNameType = js.native
}

object SSHPublicKeyMetadata {
  @scala.inline
  def apply(SSHPublicKeyId: publicKeyIdType, Status: statusType, UploadDate: js.Date, UserName: userNameType): SSHPublicKeyMetadata = {
    val __obj = js.Dynamic.literal(SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UploadDate = UploadDate.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHPublicKeyMetadata]
  }
  @scala.inline
  implicit class SSHPublicKeyMetadataOps[Self <: SSHPublicKeyMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSSHPublicKeyId(value: publicKeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSHPublicKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: statusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: userNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

