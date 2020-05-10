package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateVerifyProcRequest extends js.Object {
  var certificate: Certificate = js.native
  /**
    * Error code.
    */
  var errorCode: Double = js.native
  var hostname: String = js.native
  /**
    * Verification result from chromium.
    */
  var verificationResult: String = js.native
}

object CertificateVerifyProcRequest {
  @scala.inline
  def apply(certificate: Certificate, errorCode: Double, hostname: String, verificationResult: String): CertificateVerifyProcRequest = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], verificationResult = verificationResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateVerifyProcRequest]
  }
  @scala.inline
  implicit class CertificateVerifyProcRequestOps[Self <: CertificateVerifyProcRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerificationResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

