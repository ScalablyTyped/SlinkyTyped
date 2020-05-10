package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainConfigurationRequest extends js.Object {
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.native
  /**
    * The name of the domain configuration to be updated.
    */
  var domainConfigurationName: ReservedDomainConfigurationName = js.native
  /**
    * The status to which the domain configuration should be updated.
    */
  var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.native
  /**
    * Removes the authorization configuration from a domain.
    */
  var removeAuthorizerConfig: js.UndefOr[RemoveAuthorizerConfig] = js.native
}

object UpdateDomainConfigurationRequest {
  @scala.inline
  def apply(domainConfigurationName: ReservedDomainConfigurationName): UpdateDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateDomainConfigurationRequestOps[Self <: UpdateDomainConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainConfigurationName(value: ReservedDomainConfigurationName): Self = {
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
    def withRemoveAuthorizerConfig(value: RemoveAuthorizerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAuthorizerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAuthorizerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAuthorizerConfig")(js.undefined)
        ret
    }
  }
  
}

