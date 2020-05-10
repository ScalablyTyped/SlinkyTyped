package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate
import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typingsSlinky.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrvkeyobj extends js.Object {
  var prvkeyobj: js.UndefOr[RSAKey | ECDSA | DSA] = js.native
  var tbscertobj: js.UndefOr[TBSCertificate] = js.native
}

object AnonPrvkeyobj {
  @scala.inline
  def apply(): AnonPrvkeyobj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPrvkeyobj]
  }
  @scala.inline
  implicit class AnonPrvkeyobjOps[Self <: AnonPrvkeyobj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrvkeyobj(value: RSAKey | ECDSA | DSA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prvkeyobj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrvkeyobj: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prvkeyobj")(js.undefined)
        ret
    }
    @scala.inline
    def withTbscertobj(value: TBSCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbscertobj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbscertobj: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbscertobj")(js.undefined)
        ret
    }
  }
  
}

