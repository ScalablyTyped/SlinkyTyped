package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportCertificateResponse extends js.Object {
  /**
    * The base64 PEM-encoded certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  /**
    * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
    */
  var CertificateChain: js.UndefOr[typingsSlinky.awsSdk.acmMod.CertificateChain] = js.native
  /**
    * The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8 format and is base64 PEM-encoded. 
    */
  var PrivateKey: js.UndefOr[typingsSlinky.awsSdk.acmMod.PrivateKey] = js.native
}

object ExportCertificateResponse {
  @scala.inline
  def apply(): ExportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportCertificateResponse]
  }
  @scala.inline
  implicit class ExportCertificateResponseOps[Self <: ExportCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: CertificateBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateChain(value: CertificateChain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateChain")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKey(value: PrivateKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKey")(js.undefined)
        ret
    }
  }
  
}

