package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateResponse extends js.Object {
  /**
    * The base64 PEM-encoded certificate specified by the CertificateArn parameter.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  /**
    * The base64 PEM-encoded certificate chain that chains up to the on-premises root CA certificate that you used to sign your private CA certificate. 
    */
  var CertificateChain: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.CertificateChain] = js.native
}

object GetCertificateResponse {
  @scala.inline
  def apply(): GetCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateResponse]
  }
  @scala.inline
  implicit class GetCertificateResponseOps[Self <: GetCertificateResponse] (val x: Self) extends AnyVal {
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
  }
  
}

