package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIdentityProviderRequest extends js.Object {
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  /**
    * The identity provider details. The following list describes the provider detail keys for each identity provider type.   For Google, Facebook and Login with Amazon:   client_id   client_secret   authorize_scopes     For Sign in with Apple:   client_id   team_id   key_id   private_key   authorize_scopes     For OIDC providers:   client_id   client_secret   attributes_request_method   oidc_issuer   authorize_scopes   authorize_url if not available from discovery URL specified by oidc_issuer key    token_url if not available from discovery URL specified by oidc_issuer key    attributes_url if not available from discovery URL specified by oidc_issuer key    jwks_uri if not available from discovery URL specified by oidc_issuer key    authorize_scopes     For SAML providers:   MetadataFile OR MetadataURL   IDPSignout optional     
    */
  var ProviderDetails: ProviderDetailsType = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameTypeV1 = js.native
  /**
    * The identity provider type.
    */
  var ProviderType: IdentityProviderTypeType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object CreateIdentityProviderRequest {
  @scala.inline
  def apply(
    ProviderDetails: ProviderDetailsType,
    ProviderName: ProviderNameTypeV1,
    ProviderType: IdentityProviderTypeType,
    UserPoolId: UserPoolIdType
  ): CreateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderDetails = ProviderDetails.asInstanceOf[js.Any], ProviderName = ProviderName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderRequest]
  }
  @scala.inline
  implicit class CreateIdentityProviderRequestOps[Self <: CreateIdentityProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProviderDetails(value: ProviderDetailsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderName(value: ProviderNameTypeV1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderType(value: IdentityProviderTypeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeMapping(value: AttributeMappingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withIdpIdentifiers(value: IdpIdentifiersListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdpIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdpIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdpIdentifiers")(js.undefined)
        ret
    }
  }
  
}

