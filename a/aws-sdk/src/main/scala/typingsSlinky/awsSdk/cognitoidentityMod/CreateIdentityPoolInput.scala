package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIdentityPoolInput extends js.Object {
  /**
    * Enables or disables the Basic (Classic) authentication flow. For more information, see Identity Pools (Federated Identities) Authentication Flow in the Amazon Cognito Developer Guide.
    */
  var AllowClassicFlow: js.UndefOr[ClassicFlow] = js.native
  /**
    * TRUE if the identity pool supports unauthenticated logins.
    */
  var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated = js.native
  /**
    * An array of Amazon Cognito user pools and their client IDs.
    */
  var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.native
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the DeveloperProviderName, you can use letters as well as period (.), underscore (_), and dash (-). Once you have set a developer provider name, you cannot change it. Please take care in setting this parameter.
    */
  var DeveloperProviderName: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.DeveloperProviderName] = js.native
  /**
    * A string that you provide.
    */
  var IdentityPoolName: typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolName = js.native
  /**
    * Tags to assign to the identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.native
  /**
    * A list of OpendID Connect provider ARNs.
    */
  var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.native
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.
    */
  var SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.native
  /**
    * Optional key:value pairs mapping provider names to provider app IDs.
    */
  var SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.native
}

object CreateIdentityPoolInput {
  @scala.inline
  def apply(AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated, IdentityPoolName: IdentityPoolName): CreateIdentityPoolInput = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityPoolInput]
  }
  @scala.inline
  implicit class CreateIdentityPoolInputOps[Self <: CreateIdentityPoolInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUnauthenticatedIdentities(value: IdentityPoolUnauthenticated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowUnauthenticatedIdentities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityPoolName(value: IdentityPoolName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowClassicFlow(value: ClassicFlow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowClassicFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClassicFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowClassicFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitoIdentityProviders(value: CognitoIdentityProviderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoIdentityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoIdentityProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoIdentityProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperProviderName(value: DeveloperProviderName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeveloperProviderName")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityPoolTags(value: IdentityPoolTagsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolTags")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenIdConnectProviderARNs(value: OIDCProviderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenIdConnectProviderARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIdConnectProviderARNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenIdConnectProviderARNs")(js.undefined)
        ret
    }
    @scala.inline
    def withSamlProviderARNs(value: SAMLProviderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamlProviderARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamlProviderARNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamlProviderARNs")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedLoginProviders(value: IdentityProviders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedLoginProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedLoginProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedLoginProviders")(js.undefined)
        ret
    }
  }
  
}

