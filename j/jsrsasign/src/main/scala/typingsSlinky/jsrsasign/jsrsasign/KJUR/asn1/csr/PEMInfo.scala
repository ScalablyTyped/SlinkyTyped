package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.csr

import typingsSlinky.jsrsasign.anon.HexName
import typingsSlinky.jsrsasign.anon.Obj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEMInfo extends js.Object {
  var pubkey: Obj = js.native
  var subject: HexName = js.native
}

object PEMInfo {
  @scala.inline
  def apply(pubkey: Obj, subject: HexName): PEMInfo = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEMInfo]
  }
  @scala.inline
  implicit class PEMInfoOps[Self <: PEMInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPubkey(value: Obj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: HexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

