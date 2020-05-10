package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateDescription extends js.Object {
  /**
    * The certificate ID of the CA certificate used to sign this certificate.
    */
  var caCertificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The date and time the certificate was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The customer version of the certificate.
    */
  var customerVersion: js.UndefOr[CustomerVersion] = js.native
  /**
    * The generation ID of the certificate.
    */
  var generationId: js.UndefOr[GenerationId] = js.native
  /**
    * The date and time the certificate was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the AWS account that owns the certificate.
    */
  var ownedBy: js.UndefOr[AwsAccountId] = js.native
  /**
    * The ID of the AWS account of the previous owner of the certificate.
    */
  var previousOwnedBy: js.UndefOr[AwsAccountId] = js.native
  /**
    * The status of the certificate.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
  /**
    * The transfer data.
    */
  var transferData: js.UndefOr[TransferData] = js.native
  /**
    * When the certificate is valid.
    */
  var validity: js.UndefOr[CertificateValidity] = js.native
}

object CertificateDescription {
  @scala.inline
  def apply(): CertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDescription]
  }
  @scala.inline
  implicit class CertificateDescriptionOps[Self <: CertificateDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificateId")(js.undefined)
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
    def withPreviousOwnedBy(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousOwnedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousOwnedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousOwnedBy")(js.undefined)
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
    @scala.inline
    def withTransferData(value: TransferData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferData")(js.undefined)
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

