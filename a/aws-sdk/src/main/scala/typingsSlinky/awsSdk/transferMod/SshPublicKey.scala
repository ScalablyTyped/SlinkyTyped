package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SshPublicKey extends js.Object {
  /**
    * The date that the public key was added to the user account.
    */
  var DateImported: js.Date = js.native
  /**
    * The content of the SSH public key as specified by the PublicKeyId.
    */
  var SshPublicKeyBody: typingsSlinky.awsSdk.transferMod.SshPublicKeyBody = js.native
  /**
    * The SshPublicKeyId parameter contains the identifier of the public key.
    */
  var SshPublicKeyId: typingsSlinky.awsSdk.transferMod.SshPublicKeyId = js.native
}

object SshPublicKey {
  @scala.inline
  def apply(DateImported: js.Date, SshPublicKeyBody: SshPublicKeyBody, SshPublicKeyId: SshPublicKeyId): SshPublicKey = {
    val __obj = js.Dynamic.literal(DateImported = DateImported.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshPublicKey]
  }
}

