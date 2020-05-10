package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSshPublicKeyRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
  /**
    * The public key portion of an SSH key pair.
    */
  var SshPublicKeyBody: typingsSlinky.awsSdk.transferMod.SshPublicKeyBody = js.native
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  var UserName: typingsSlinky.awsSdk.transferMod.UserName = js.native
}

object ImportSshPublicKeyRequest {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyBody: SshPublicKeyBody, UserName: UserName): ImportSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSshPublicKeyRequest]
  }
  @scala.inline
  implicit class ImportSshPublicKeyRequestOps[Self <: ImportSshPublicKeyRequest] (val x: Self) extends AnyVal {
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
    def withSshPublicKeyBody(value: SshPublicKeyBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKeyBody")(value.asInstanceOf[js.Any])
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

