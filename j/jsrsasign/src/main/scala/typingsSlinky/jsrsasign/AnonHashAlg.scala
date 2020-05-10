package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHashAlg extends js.Object {
  var hashAlg: String = js.native
  var sAttr: AnonSignaturePolicyIdentifier = js.native
  var sigAlg: String = js.native
  var signerCert: String = js.native
  var signerPrvKey: String = js.native
}

object AnonHashAlg {
  @scala.inline
  def apply(
    hashAlg: String,
    sAttr: AnonSignaturePolicyIdentifier,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String
  ): AnonHashAlg = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], sAttr = sAttr.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHashAlg]
  }
  @scala.inline
  implicit class AnonHashAlgOps[Self <: AnonHashAlg] (val x: Self) extends AnyVal {
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
    def withSAttr(value: AnonSignaturePolicyIdentifier): Self = {
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

