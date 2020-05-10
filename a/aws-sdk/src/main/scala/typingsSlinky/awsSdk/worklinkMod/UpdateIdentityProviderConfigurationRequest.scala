package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIdentityProviderConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
  /**
    * The SAML metadata document provided by the customer’s identity provider. The existing IdentityProviderSamlMetadata is unset if null is passed.
    */
  var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
  /**
    * The type of identity provider.
    */
  var IdentityProviderType: typingsSlinky.awsSdk.worklinkMod.IdentityProviderType = js.native
}

object UpdateIdentityProviderConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, IdentityProviderType: IdentityProviderType): UpdateIdentityProviderConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], IdentityProviderType = IdentityProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateIdentityProviderConfigurationRequestOps[Self <: UpdateIdentityProviderConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetArn(value: FleetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityProviderType(value: IdentityProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityProviderSamlMetadata(value: SamlMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderSamlMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityProviderSamlMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderSamlMetadata")(js.undefined)
        ret
    }
  }
  
}

