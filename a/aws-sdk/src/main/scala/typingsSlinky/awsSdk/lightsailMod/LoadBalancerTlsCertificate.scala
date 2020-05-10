package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTlsCertificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The time when you created your SSL/TLS certificate.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The domain name for your SSL/TLS certificate.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
    */
  var domainValidationRecords: js.UndefOr[LoadBalancerTlsCertificateDomainValidationRecordList] = js.native
  /**
    * The reason for the SSL/TLS certificate validation failure.
    */
  var failureReason: js.UndefOr[LoadBalancerTlsCertificateFailureReason] = js.native
  /**
    * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  /**
    * The time when the SSL/TLS certificate was issued.
    */
  var issuedAt: js.UndefOr[js.Date] = js.native
  /**
    * The issuer of the certificate.
    */
  var issuer: js.UndefOr[NonEmptyString] = js.native
  /**
    * The algorithm that was used to generate the key pair (the public and private key).
    */
  var keyAlgorithm: js.UndefOr[NonEmptyString] = js.native
  /**
    * The load balancer name where your SSL/TLS certificate is attached.
    */
  var loadBalancerName: js.UndefOr[ResourceName] = js.native
  /**
    * The AWS Region and Availability Zone where you created your certificate.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the SSL/TLS certificate (e.g., my-certificate).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The timestamp when the SSL/TLS certificate expires.
    */
  var notAfter: js.UndefOr[js.Date] = js.native
  /**
    * The timestamp when the SSL/TLS certificate is first valid.
    */
  var notBefore: js.UndefOr[js.Date] = js.native
  /**
    * An object containing information about the status of Lightsail's managed renewal for the certificate.
    */
  var renewalSummary: js.UndefOr[LoadBalancerTlsCertificateRenewalSummary] = js.native
  /**
    * The resource type (e.g., LoadBalancerTlsCertificate).     Instance  - A Lightsail instance (a virtual private server)     StaticIp  - A static IP address     KeyPair  - The key pair used to connect to a Lightsail instance     InstanceSnapshot  - A Lightsail instance snapshot     Domain  - A DNS zone     PeeredVpc  - A peered VPC     LoadBalancer  - A Lightsail load balancer     LoadBalancerTlsCertificate  - An SSL/TLS certificate associated with a Lightsail load balancer     Disk  - A Lightsail block storage disk     DiskSnapshot  - A block storage disk snapshot  
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The reason the certificate was revoked. Valid values are below.
    */
  var revocationReason: js.UndefOr[LoadBalancerTlsCertificateRevocationReason] = js.native
  /**
    * The timestamp when the SSL/TLS certificate was revoked.
    */
  var revokedAt: js.UndefOr[js.Date] = js.native
  /**
    * The serial number of the certificate.
    */
  var serial: js.UndefOr[NonEmptyString] = js.native
  /**
    * The algorithm that was used to sign the certificate.
    */
  var signatureAlgorithm: js.UndefOr[NonEmptyString] = js.native
  /**
    * The status of the SSL/TLS certificate. Valid values are below.
    */
  var status: js.UndefOr[LoadBalancerTlsCertificateStatus] = js.native
  /**
    * The name of the entity that is associated with the public key contained in the certificate.
    */
  var subject: js.UndefOr[NonEmptyString] = js.native
  /**
    * One or more domains or subdomains included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CNAME) of the certificate and additional domain names that can be used to connect to the website, such as example.com, www.example.com, or m.example.com.
    */
  var subjectAlternativeNames: js.UndefOr[StringList] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail load balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object LoadBalancerTlsCertificate {
  @scala.inline
  def apply(): LoadBalancerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificate]
  }
  @scala.inline
  implicit class LoadBalancerTlsCertificateOps[Self <: LoadBalancerTlsCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainValidationRecords(value: LoadBalancerTlsCertificateDomainValidationRecordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainValidationRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainValidationRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainValidationRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: LoadBalancerTlsCertificateFailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAttached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAttached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttached")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyAlgorithm(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancerName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: ResourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withNotBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewalSummary(value: LoadBalancerTlsCertificateRenewalSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewalSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withRevocationReason(value: LoadBalancerTlsCertificateRevocationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevocationReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationReason")(js.undefined)
        ret
    }
    @scala.inline
    def withRevokedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevokedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSerial(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: LoadBalancerTlsCertificateStatus): Self = {
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
    def withSubject(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectAlternativeNames(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectAlternativeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectAlternativeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectAlternativeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

