package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashAlg extends js.Object {
  var hashAlg: String = js.native
  var sAttr: SignaturePolicyIdentifier = js.native
  var sigAlg: String = js.native
  var signerCert: String = js.native
  var signerPrvKey: String = js.native
}

object HashAlg {
  @scala.inline
  def apply(
    hashAlg: String,
    sAttr: SignaturePolicyIdentifier,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String
  ): HashAlg = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], sAttr = sAttr.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlg]
  }
  @scala.inline
  implicit class HashAlgOps[Self <: HashAlg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSAttr(value: SignaturePolicyIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigAlg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignerCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignerPrvKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerPrvKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

