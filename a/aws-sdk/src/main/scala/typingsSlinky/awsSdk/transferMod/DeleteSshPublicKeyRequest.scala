package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSshPublicKeyRequest extends js.Object {
  /**
    * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server instance that has the user assigned to it.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
  /**
    * A unique identifier used to reference your user's specific SSH key.
    */
  var SshPublicKeyId: typingsSlinky.awsSdk.transferMod.SshPublicKeyId = js.native
  /**
    * A unique string that identifies a user whose public key is being deleted.
    */
  var UserName: typingsSlinky.awsSdk.transferMod.UserName = js.native
}

object DeleteSshPublicKeyRequest {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyId: SshPublicKeyId, UserName: UserName): DeleteSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSshPublicKeyRequest]
  }
  @scala.inline
  implicit class DeleteSshPublicKeyRequestOps[Self <: DeleteSshPublicKeyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerId(value: ServerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSshPublicKeyId(value: SshPublicKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: UserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

