package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateWebsiteAuthorizationProviderRequest extends js.Object {
  /**
    * The authorization provider type.
    */
  var AuthorizationProviderType: typingsSlinky.awsSdk.worklinkMod.AuthorizationProviderType = js.native
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DomainName] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
}

object AssociateWebsiteAuthorizationProviderRequest {
  @scala.inline
  def apply(AuthorizationProviderType: AuthorizationProviderType, FleetArn: FleetArn): AssociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderRequest]
  }
  @scala.inline
  implicit class AssociateWebsiteAuthorizationProviderRequestOps[Self <: AssociateWebsiteAuthorizationProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationProviderType(value: AuthorizationProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFleetArn(value: FleetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
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
  }
  
}

