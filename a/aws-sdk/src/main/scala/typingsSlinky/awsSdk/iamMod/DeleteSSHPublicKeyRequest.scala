package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSSHPublicKeyRequest extends js.Object {
  /**
    * The unique identifier for the SSH public key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var SSHPublicKeyId: publicKeyIdType = js.native
  /**
    * The name of the IAM user associated with the SSH public key. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType = js.native
}

object DeleteSSHPublicKeyRequest {
  @scala.inline
  def apply(SSHPublicKeyId: publicKeyIdType, UserName: userNameType): DeleteSSHPublicKeyRequest = {
    val __obj = js.Dynamic.literal(SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSSHPublicKeyRequest]
  }
  @scala.inline
  implicit class DeleteSSHPublicKeyRequestOps[Self <: DeleteSSHPublicKeyRequest] (val x: Self) extends AnyVal {
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
    def withUserName(value: userNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

