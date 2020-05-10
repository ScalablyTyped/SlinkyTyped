package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.csr

import typingsSlinky.jsrsasign.AnonHexName
import typingsSlinky.jsrsasign.AnonObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEMInfo extends js.Object {
  var pubkey: AnonObj = js.native
  var subject: AnonHexName = js.native
}

object PEMInfo {
  @scala.inline
  def apply(pubkey: AnonObj, subject: AnonHexName): PEMInfo = {
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
    def withPubkey(value: AnonObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: AnonHexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

