package typingsSlinky.ionic.libSshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSHKeyCreateDetails extends js.Object {
  var pubkey: String = js.native
}

object SSHKeyCreateDetails {
  @scala.inline
  def apply(pubkey: String): SSHKeyCreateDetails = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHKeyCreateDetails]
  }
  @scala.inline
  implicit class SSHKeyCreateDetailsOps[Self <: SSHKeyCreateDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPubkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubkey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

