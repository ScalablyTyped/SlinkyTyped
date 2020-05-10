package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainName extends js.Object {
  /**
    * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var certificateArn: js.UndefOr[String] = js.native
  /**
    * The name of the certificate that will be used by edge-optimized endpoint for this domain name.
    */
  var certificateName: js.UndefOr[String] = js.native
  /**
    * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
    */
  var certificateUploadDate: js.UndefOr[js.Date] = js.native
  /**
    * The domain name of the Amazon CloudFront distribution associated with this custom domain name for an edge-optimized endpoint. You set up this association when adding a DNS record pointing the custom domain name to this distribution name. For more information about CloudFront distributions, see the Amazon CloudFront documentation.
    */
  var distributionDomainName: js.UndefOr[String] = js.native
  /**
    * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized endpoint. The valid value is Z2FDTNDATAQYW2 for all the regions. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
    */
  var distributionHostedZoneId: js.UndefOr[String] = js.native
  /**
    * The custom domain name as an API host name, for example, my-api.example.com.
    */
  var domainName: js.UndefOr[String] = js.native
  /**
    * The status of the DomainName migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  var domainNameStatus: js.UndefOr[DomainNameStatus] = js.native
  /**
    * An optional text message containing detailed information about status of the DomainName migration.
    */
  var domainNameStatusMessage: js.UndefOr[String] = js.native
  /**
    * The endpoint configuration of this DomainName showing the endpoint types of the domain name. 
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.native
  /**
    * The reference to an AWS-managed certificate that will be used for validating the regional domain name. AWS Certificate Manager is the only supported source.
    */
  var regionalCertificateArn: js.UndefOr[String] = js.native
  /**
    * The name of the certificate that will be used for validating the regional domain name.
    */
  var regionalCertificateName: js.UndefOr[String] = js.native
  /**
    * The domain name associated with the regional endpoint for this custom domain name. You set up this association by adding a DNS record that points the custom domain name to this regional domain name. The regional domain name is returned by API Gateway when you create a regional endpoint.
    */
  var regionalDomainName: js.UndefOr[String] = js.native
  /**
    * The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
    */
  var regionalHostedZoneId: js.UndefOr[String] = js.native
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are TLS_1_0 and TLS_1_2.
    */
  var securityPolicy: js.UndefOr[SecurityPolicy] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
}

object DomainName {
  @scala.inline
  def apply(): DomainName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainName]
  }
  @scala.inline
  implicit class DomainNameOps[Self <: DomainName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: String): Self = {
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
    def withCertificateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateName")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateUploadDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateUploadDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateUploadDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateUploadDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionDomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionHostedZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionHostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionHostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
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
    def withDomainNameStatus(value: DomainNameStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainNameStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNameStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainNameStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainNameStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainNameStatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNameStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainNameStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointConfiguration(value: EndpointConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionalCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalCertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionalCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalCertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionalCertificateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalCertificateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionalCertificateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalCertificateName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionalDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionalDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalDomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionalHostedZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalHostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionalHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalHostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityPolicy(value: SecurityPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: MapOfStringToString): Self = {
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

