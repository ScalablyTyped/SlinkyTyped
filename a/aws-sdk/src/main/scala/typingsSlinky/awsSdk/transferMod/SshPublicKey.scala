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
  @scala.inline
  implicit class SshPublicKeyOps[Self <: SshPublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateImported(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateImported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSshPublicKeyBody(value: SshPublicKeyBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKeyBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSshPublicKeyId(value: SshPublicKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKeyId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

