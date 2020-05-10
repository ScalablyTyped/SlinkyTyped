package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsValidationContextAcmTrust extends js.Object {
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: CertificateAuthorityArns = js.native
}

object TlsValidationContextAcmTrust {
  @scala.inline
  def apply(certificateAuthorityArns: CertificateAuthorityArns): TlsValidationContextAcmTrust = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContextAcmTrust]
  }
  @scala.inline
  implicit class TlsValidationContextAcmTrustOps[Self <: TlsValidationContextAcmTrust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorityArns(value: CertificateAuthorityArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorityArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

