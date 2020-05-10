package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCertificateFromCsrRequest extends js.Object {
  /**
    * The certificate signing request (CSR).
    */
  var certificateSigningRequest: CertificateSigningRequest = js.native
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
}

object CreateCertificateFromCsrRequest {
  @scala.inline
  def apply(certificateSigningRequest: CertificateSigningRequest): CreateCertificateFromCsrRequest = {
    val __obj = js.Dynamic.literal(certificateSigningRequest = certificateSigningRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateFromCsrRequest]
  }
  @scala.inline
  implicit class CreateCertificateFromCsrRequestOps[Self <: CreateCertificateFromCsrRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateSigningRequest(value: CertificateSigningRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSigningRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAsActive(value: SetAsActive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsActive")(js.undefined)
        ret
    }
  }
  
}

