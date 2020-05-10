package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CACertificateDescription extends js.Object {
  /**
    * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and "DISABLE"
    */
  var autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.native
  /**
    * The CA certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The CA certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The CA certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The date the CA certificate was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The customer version of the CA certificate.
    */
  var customerVersion: js.UndefOr[CustomerVersion] = js.native
  /**
    * The generation ID of the CA certificate.
    */
  var generationId: js.UndefOr[GenerationId] = js.native
  /**
    * The date the CA certificate was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The owner of the CA certificate.
    */
  var ownedBy: js.UndefOr[AwsAccountId] = js.native
  /**
    * The status of a CA certificate.
    */
  var status: js.UndefOr[CACertificateStatus] = js.native
  /**
    * When the CA certificate is valid.
    */
  var validity: js.UndefOr[CertificateValidity] = js.native
}

object CACertificateDescription {
  @scala.inline
  def apply(): CACertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CACertificateDescription]
  }
  @scala.inline
  implicit class CACertificateDescriptionOps[Self <: CACertificateDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRegistrationStatus(value: AutoRegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRegistrationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRegistrationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRegistrationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateArn(value: CertificateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificatePem(value: CertificatePem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePem")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerVersion(value: CustomerVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerationId(value: GenerationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generationId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnedBy(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: CACertificateStatus): Self = {
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
    @scala.inline
    def withValidity(value: CertificateValidity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validity")(js.undefined)
        ret
    }
  }
  
}

