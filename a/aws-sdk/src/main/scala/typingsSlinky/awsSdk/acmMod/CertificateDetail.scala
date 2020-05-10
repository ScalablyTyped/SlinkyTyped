package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateDetail extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the certificate. This has the following format:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  /**
    * The time at which the certificate was requested. This value exists only when the certificate type is AMAZON_ISSUED. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The fully qualified domain name for the certificate, such as www.example.com or example.com.
    */
  var DomainName: js.UndefOr[DomainNameString] = js.native
  /**
    * Contains information about the initial validation of each domain name that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED. 
    */
  var DomainValidationOptions: js.UndefOr[DomainValidationList] = js.native
  /**
    * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the certificate public key can be used and consists of a name and an object identifier (OID). 
    */
  var ExtendedKeyUsages: js.UndefOr[ExtendedKeyUsageList] = js.native
  /**
    * The reason the certificate request failed. This value exists only when the certificate status is FAILED. For more information, see Certificate Request Failed in the AWS Certificate Manager User Guide. 
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.acmMod.FailureReason] = js.native
  /**
    * The date and time at which the certificate was imported. This value exists only when the certificate type is IMPORTED. 
    */
  var ImportedAt: js.UndefOr[js.Date] = js.native
  /**
    * A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple AWS resources. 
    */
  var InUseBy: js.UndefOr[InUseList] = js.native
  /**
    * The time at which the certificate was issued. This value exists only when the certificate type is AMAZON_ISSUED. 
    */
  var IssuedAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the certificate authority that issued and signed the certificate.
    */
  var Issuer: js.UndefOr[String] = js.native
  /**
    * The algorithm that was used to generate the public-private key pair.
    */
  var KeyAlgorithm: js.UndefOr[typingsSlinky.awsSdk.acmMod.KeyAlgorithm] = js.native
  /**
    * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
    */
  var KeyUsages: js.UndefOr[KeyUsageList] = js.native
  /**
    * The time after which the certificate is not valid.
    */
  var NotAfter: js.UndefOr[js.Date] = js.native
  /**
    * The time before which the certificate is not valid.
    */
  var NotBefore: js.UndefOr[js.Date] = js.native
  /**
    * Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes it possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might respond to certificate that has not been logged by showing an error message. The logs are cryptographically secure. 
    */
  var Options: js.UndefOr[CertificateOptions] = js.native
  /**
    * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can be renewed with the RenewCertificate command.
    */
  var RenewalEligibility: js.UndefOr[typingsSlinky.awsSdk.acmMod.RenewalEligibility] = js.native
  /**
    * Contains information about the status of ACM's managed renewal for the certificate. This field exists only when the certificate type is AMAZON_ISSUED.
    */
  var RenewalSummary: js.UndefOr[typingsSlinky.awsSdk.acmMod.RenewalSummary] = js.native
  /**
    * The reason the certificate was revoked. This value exists only when the certificate status is REVOKED. 
    */
  var RevocationReason: js.UndefOr[typingsSlinky.awsSdk.acmMod.RevocationReason] = js.native
  /**
    * The time at which the certificate was revoked. This value exists only when the certificate status is REVOKED. 
    */
  var RevokedAt: js.UndefOr[js.Date] = js.native
  /**
    * The serial number of the certificate.
    */
  var Serial: js.UndefOr[String] = js.native
  /**
    * The algorithm that was used to sign the certificate.
    */
  var SignatureAlgorithm: js.UndefOr[String] = js.native
  /**
    * The status of the certificate.
    */
  var Status: js.UndefOr[CertificateStatus] = js.native
  /**
    * The name of the entity that is associated with the public key contained in the certificate.
    */
  var Subject: js.UndefOr[String] = js.native
  /**
    * One or more domain names (subject alternative names) included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect to the website. 
    */
  var SubjectAlternativeNames: js.UndefOr[DomainList] = js.native
  /**
    * The source of the certificate. For certificates provided by ACM, this value is AMAZON_ISSUED. For certificates that you imported with ImportCertificate, this value is IMPORTED. ACM does not provide managed renewal for imported certificates. For more information about the differences between certificates that you import and those that ACM provides, see Importing Certificates in the AWS Certificate Manager User Guide. 
    */
  var Type: js.UndefOr[CertificateType] = js.native
}

object CertificateDetail {
  @scala.inline
  def apply(): CertificateDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDetail]
  }
  @scala.inline
  implicit class CertificateDetailOps[Self <: CertificateDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateAuthorityArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorityArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArn")(js.undefined)
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
    def withDomainName(value: DomainNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainValidationOptions(value: DomainValidationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainValidationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainValidationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainValidationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedKeyUsages(value: ExtendedKeyUsageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedKeyUsages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedKeyUsages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedKeyUsages")(js.undefined)
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
    def withImportedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withInUseBy(value: InUseList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InUseBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInUseBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InUseBy")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyAlgorithm(value: KeyAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyUsages(value: KeyUsageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyUsages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyUsages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyUsages")(js.undefined)
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
    def withOptions(value: CertificateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewalEligibility(value: RenewalEligibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenewalEligibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewalEligibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenewalEligibility")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewalSummary(value: RenewalSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenewalSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewalSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenewalSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withRevocationReason(value: RevocationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevocationReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevocationReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevocationReason")(js.undefined)
        ret
    }
    @scala.inline
    def withRevokedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevokedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevokedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevokedAt")(js.undefined)
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
    def withSignatureAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: CertificateStatus): Self = {
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
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectAlternativeNames(value: DomainList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectAlternativeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectAlternativeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectAlternativeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CertificateType): Self = {
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

