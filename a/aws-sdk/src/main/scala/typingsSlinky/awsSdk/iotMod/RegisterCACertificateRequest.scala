package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCACertificateRequest extends js.Object {
  /**
    * Allows this CA certificate to be used for auto registration of device certificates.
    */
  var allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.native
  /**
    * The CA certificate.
    */
  var caCertificate: CertificatePem = js.native
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.native
  /**
    * A boolean value that specifies if the CA certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
  /**
    * The private key verification certificate.
    */
  var verificationCertificate: CertificatePem = js.native
}

object RegisterCACertificateRequest {
  @scala.inline
  def apply(caCertificate: CertificatePem, verificationCertificate: CertificatePem): RegisterCACertificateRequest = {
    val __obj = js.Dynamic.literal(caCertificate = caCertificate.asInstanceOf[js.Any], verificationCertificate = verificationCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCACertificateRequest]
  }
  @scala.inline
  implicit class RegisterCACertificateRequestOps[Self <: RegisterCACertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaCertificate(value: CertificatePem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerificationCertificate(value: CertificatePem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowAutoRegistration(value: AllowAutoRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAutoRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoRegistration")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationConfig(value: RegistrationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationConfig")(js.undefined)
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

