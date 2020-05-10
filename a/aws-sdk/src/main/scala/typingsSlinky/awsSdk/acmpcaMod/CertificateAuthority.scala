package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthority extends js.Object {
  /**
    * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is  12345678-1234-1234-1234-123456789012 .
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.Arn] = js.native
  /**
    * Your private CA configuration.
    */
  var CertificateAuthorityConfiguration: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.CertificateAuthorityConfiguration] = js.native
  /**
    * Date and time at which your private CA was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * Reason the request to create your private CA failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.FailureReason] = js.native
  /**
    * Date and time at which your private CA was last updated.
    */
  var LastStateChangeAt: js.UndefOr[js.Date] = js.native
  /**
    * Date and time after which your private CA certificate is not valid.
    */
  var NotAfter: js.UndefOr[js.Date] = js.native
  /**
    * Date and time before which your private CA certificate is not valid.
    */
  var NotBefore: js.UndefOr[js.Date] = js.native
  /**
    * The period during which a deleted CA can be restored. For more information, see the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthorityRequest action. 
    */
  var RestorableUntil: js.UndefOr[js.Date] = js.native
  /**
    * Information about the certificate revocation list (CRL) created and maintained by your private CA. 
    */
  var RevocationConfiguration: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.RevocationConfiguration] = js.native
  /**
    * Serial number of your private CA.
    */
  var Serial: js.UndefOr[String] = js.native
  /**
    * Status of your private CA.
    */
  var Status: js.UndefOr[CertificateAuthorityStatus] = js.native
  /**
    * Type of your private CA.
    */
  var Type: js.UndefOr[CertificateAuthorityType] = js.native
}

object CertificateAuthority {
  @scala.inline
  def apply(): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthority]
  }
  @scala.inline
  implicit class CertificateAuthorityOps[Self <: CertificateAuthority] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateAuthorityConfiguration(value: CertificateAuthorityConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStateChangeAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStateChangeAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStateChangeAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStateChangeAt")(js.undefined)
        ret
    }
    @scala.inline
    def withNotAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withNotBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withRestorableUntil(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestorableUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestorableUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestorableUntil")(js.undefined)
        ret
    }
    @scala.inline
    def withRevocationConfiguration(value: RevocationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevocationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevocationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevocationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Serial")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: CertificateAuthorityStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CertificateAuthorityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

