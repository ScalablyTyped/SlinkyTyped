package typingsSlinky.pulumiAws.userPoolClientMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolClientState extends js.Object {
  /**
    * List of allowed OAuth flows (code, implicit, client_credentials).
    */
  val allowedOauthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  val allowedOauthFlowsUserPoolClient: js.UndefOr[Input[Boolean]] = js.native
  /**
    * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
    */
  val allowedOauthScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of allowed callback URLs for the identity providers.
    */
  val callbackUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The client secret of the user pool client.
    */
  val clientSecret: js.UndefOr[Input[String]] = js.native
  /**
    * The default redirect URI. Must be in the list of callback URLs.
    */
  val defaultRedirectUri: js.UndefOr[Input[String]] = js.native
  /**
    * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY,  USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
    */
  val explicitAuthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Should an application secret be generated.
    */
  val generateSecret: js.UndefOr[Input[Boolean]] = js.native
  /**
    * List of allowed logout URLs for the identity providers.
    */
  val logoutUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the application client.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * List of user pool attributes the application client can read from.
    */
  val readAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The time limit in days refresh tokens are valid for.
    */
  val refreshTokenValidity: js.UndefOr[Input[Double]] = js.native
  /**
    * List of provider names for the identity providers that are supported on this client.
    */
  val supportedIdentityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The user pool the client belongs to.
    */
  val userPoolId: js.UndefOr[Input[String]] = js.native
  /**
    * List of user pool attributes the application client can write to.
    */
  val writeAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object UserPoolClientState {
  @scala.inline
  def apply(): UserPoolClientState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolClientState]
  }
  @scala.inline
  implicit class UserPoolClientStateOps[Self <: UserPoolClientState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedOauthFlows(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOauthFlows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedOauthFlows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOauthFlows")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedOauthFlowsUserPoolClient(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOauthFlowsUserPoolClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedOauthFlowsUserPoolClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOauthFlowsUserPoolClient")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedOauthScopes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOauthScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedOauthScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOauthScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackUrls(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSecret(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRedirectUri(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRedirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRedirectUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRedirectUri")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitAuthFlows(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitAuthFlows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitAuthFlows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitAuthFlows")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateSecret(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoutUrls(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoutUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoutUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withReadAttributes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshTokenValidity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTokenValidity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshTokenValidity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTokenValidity")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedIdentityProviders(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedIdentityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedIdentityProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedIdentityProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteAttributes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAttributes")(js.undefined)
        ret
    }
  }
  
}

