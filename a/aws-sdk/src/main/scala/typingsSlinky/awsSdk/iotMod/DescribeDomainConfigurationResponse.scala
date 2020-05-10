package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainConfigurationResponse extends js.Object {
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.native
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.native
  /**
    * A Boolean value that specifies the current state of the domain configuration.
    */
  var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.native
  /**
    * The name of the domain.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * The type of the domain.
    */
  var domainType: js.UndefOr[DomainType] = js.native
  /**
    * A list containing summary information about the server certificate included in the domain configuration.
    */
  var serverCertificates: js.UndefOr[ServerCertificates] = js.native
  /**
    * The type of service delivered by the endpoint.
    */
  var serviceType: js.UndefOr[ServiceType] = js.native
}

object DescribeDomainConfigurationResponse {
  @scala.inline
  def apply(): DescribeDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeDomainConfigurationResponseOps[Self <: DescribeDomainConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDomainConfigurationArn(value: DomainConfigurationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainConfigurationName(value: ReservedDomainConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainConfigurationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationName")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainConfigurationStatus(value: DomainConfigurationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainConfigurationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurationStatus")(js.undefined)
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
    def withDomainType(value: DomainType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainType")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCertificates(value: ServerCertificates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificates")(js.undefined)
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
  }
  
}

