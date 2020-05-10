package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainConfigurationRequest extends js.Object {
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.native
  /**
    * The name of the domain configuration. This value must be unique to a region.
    */
  var domainConfigurationName: DomainConfigurationName = js.native
  /**
    * The name of the domain.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for AWS-managed domains.
    */
  var serverCertificateArns: js.UndefOr[ServerCertificateArns] = js.native
  /**
    * The type of service delivered by the endpoint.
    */
  var serviceType: js.UndefOr[ServiceType] = js.native
  /**
    * The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for AWS-managed domains.
    */
  var validationCertificateArn: js.UndefOr[AcmCertificateArn] = js.native
}

object CreateDomainConfigurationRequest {
  @scala.inline
  def apply(domainConfigurationName: DomainConfigurationName): CreateDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainConfigurationRequest]
  }
  @scala.inline
  implicit class CreateDomainConfigurationRequestOps[Self <: CreateDomainConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainConfigurationName(value: DomainConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizerConfig(value: AuthorizerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerConfig")(js.undefined)
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
    def withServerCertificateArns(value: ServerCertificateArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCertificateArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateArns")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceType(value: ServiceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationCertificateArn(value: AcmCertificateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationCertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationCertificateArn")(js.undefined)
        ret
    }
  }
  
}

