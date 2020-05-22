package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSshPublicKeyRequest extends js.Object {
  /**
    * A system-assigned unique identifier for a file transfer protocol-enabled server.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
  /**
    * The public key portion of an SSH key pair.
    */
  var SshPublicKeyBody: typingsSlinky.awsSdk.transferMod.SshPublicKeyBody = js.native
  /**
    * The name of the user account that is assigned to one or more file transfer protocol-enabled servers.
    */
  var UserName: typingsSlinky.awsSdk.transferMod.UserName = js.native
}

object ImportSshPublicKeyRequest {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyBody: SshPublicKeyBody, UserName: UserName): ImportSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSshPublicKeyRequest]
  }
}

