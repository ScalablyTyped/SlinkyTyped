package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainNameConfiguration extends js.Object {
  /**
    * A domain name for the API.
    */
  var ApiGatewayDomainName: js.UndefOr[string] = js.native
  /**
    * An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  /**
    * The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain name.
    */
  var CertificateName: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
    */
  var CertificateUploadDate: js.UndefOr[js.Date] = js.native
  /**
    * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  var DomainNameStatus: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.DomainNameStatus] = js.native
  /**
    * An optional text message containing detailed information about status of the domain name migration.
    */
  var DomainNameStatusMessage: js.UndefOr[string] = js.native
  /**
    * The endpoint type.
    */
  var EndpointType: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.EndpointType] = js.native
  /**
    * The Amazon Route 53 Hosted Zone ID of the endpoint.
    */
  var HostedZoneId: js.UndefOr[string] = js.native
  /**
    * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
    */
  var SecurityPolicy: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.SecurityPolicy] = js.native
}

object DomainNameConfiguration {
  @scala.inline
  def apply(): DomainNameConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainNameConfiguration]
  }
  @scala.inline
  implicit class DomainNameConfigurationOps[Self <: DomainNameConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiGatewayDomainName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiGatewayDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiGatewayDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiGatewayDomainName")(js.undefined)
        ret
    }
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
    def withCertificateName(value: StringWithLengthBetween1And128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateName")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateUploadDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateUploadDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateUploadDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateUploadDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainNameStatus(value: DomainNameStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNameStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNameStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNameStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainNameStatusMessage(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNameStatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNameStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNameStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointType(value: EndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedZoneId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityPolicy(value: SecurityPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityPolicy")(js.undefined)
        ret
    }
  }
  
}

