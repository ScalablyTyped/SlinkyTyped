package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typingsSlinky.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typingsSlinky.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ext extends js.Object {
  var ext: js.UndefOr[js.Array[SubjectAltName]] = js.native
  var sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String = js.native
  var sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String = js.native
  var sigalg: String = js.native
  var subject: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer = js.native
}

object Ext {
  @scala.inline
  def apply(
    sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String,
    sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String,
    sigalg: String,
    subject: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer
  ): Ext = {
    val __obj = js.Dynamic.literal(sbjprvkey = sbjprvkey.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ext]
  }
  @scala.inline
  implicit class ExtOps[Self <: Ext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSbjprvkey(value: RSAKey | ECDSA | DSA | JsonWebKey | E | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sbjprvkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSbjpubkey(value: RSAKey | ECDSA | DSA | JsonWebKey | E | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sbjpubkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigalg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigalg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt(value: js.Array[SubjectAltName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
  }
  
}

