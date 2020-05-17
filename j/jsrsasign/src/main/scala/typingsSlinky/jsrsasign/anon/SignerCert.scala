package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.TSTInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignerCert extends js.Object {
  var certs: js.Array[String] = js.native
  var hashAlg: String = js.native
  var sigAlg: String = js.native
  var signerCert: String = js.native
  var signerPrvKey: String = js.native
  var tstInfo: TSTInfo = js.native
}

object SignerCert {
  @scala.inline
  def apply(
    certs: js.Array[String],
    hashAlg: String,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String,
    tstInfo: TSTInfo
  ): SignerCert = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any], tstInfo = tstInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerCert]
  }
  @scala.inline
  implicit class SignerCertOps[Self <: SignerCert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCerts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlg")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTstInfo(value: TSTInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tstInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

