package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCACertificateRequest extends js.Object {
  /**
    * The CA certificate identifier.
    */
  var certificateId: CertificateId = js.native
  /**
    * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
    */
  var newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.native
  /**
    * The updated status of the CA certificate.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var newStatus: js.UndefOr[CACertificateStatus] = js.native
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.native
  /**
    * If true, removes auto registration.
    */
  var removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.native
}

object UpdateCACertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId): UpdateCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCACertificateRequest]
  }
  @scala.inline
  implicit class UpdateCACertificateRequestOps[Self <: UpdateCACertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewAutoRegistrationStatus(value: AutoRegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAutoRegistrationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewAutoRegistrationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAutoRegistrationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNewStatus(value: CACertificateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStatus")(js.undefined)
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
    def withRemoveAutoRegistration(value: RemoveAutoRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAutoRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAutoRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAutoRegistration")(js.undefined)
        ret
    }
  }
  
}

