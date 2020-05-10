package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateRequest extends js.Object {
  /**
    * The CA certificate used to sign the device certificate being registered.
    */
  var caCertificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: CertificatePem = js.native
  /**
    * A boolean value that specifies if the certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActiveFlag] = js.native
  /**
    * The status of the register certificate request.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
}

object RegisterCertificateRequest {
  @scala.inline
  def apply(certificatePem: CertificatePem): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
  @scala.inline
  implicit class RegisterCertificateRequestOps[Self <: RegisterCertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificatePem(value: CertificatePem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaCertificatePem(value: CertificatePem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificatePem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaCertificatePem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificatePem")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAsActive(value: SetAsActiveFlag): Self = {
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
    @scala.inline
    def withStatus(value: CertificateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

