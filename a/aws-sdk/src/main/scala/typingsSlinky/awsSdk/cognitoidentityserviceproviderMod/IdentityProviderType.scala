package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderType extends js.Object {
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  /**
    * The date the identity provider was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  /**
    * The date the identity provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The identity provider details. The following list describes the provider detail keys for each identity provider type.   For Google, Facebook and Login with Amazon:   client_id   client_secret   authorize_scopes     For Sign in with Apple:   client_id   team_id   key_id   private_key   authorize_scopes     For OIDC providers:   client_id   client_secret   attributes_request_method   oidc_issuer   authorize_scopes   authorize_url if not available from discovery URL specified by oidc_issuer key    token_url if not available from discovery URL specified by oidc_issuer key    attributes_url if not available from discovery URL specified by oidc_issuer key    jwks_uri if not available from discovery URL specified by oidc_issuer key    authorize_scopes     For SAML providers:   MetadataFile OR MetadataURL   IDPSignOut optional     
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
  /**
    * The identity provider type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object IdentityProviderType {
  @scala.inline
  def apply(): IdentityProviderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderType]
  }
  @scala.inline
  implicit class IdentityProviderTypeOps[Self <: IdentityProviderType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
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
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderDetails(value: ProviderDetailsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: ProviderNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderType(value: IdentityProviderTypeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(js.undefined)
        ret
    }
  }
  
}

