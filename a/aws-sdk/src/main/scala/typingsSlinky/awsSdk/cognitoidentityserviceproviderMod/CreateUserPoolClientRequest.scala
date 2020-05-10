package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserPoolClientRequest extends js.Object {
  /**
    * The allowed OAuth flows. Set to code to initiate a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the token endpoint. Set to implicit to specify that the client should get the access token (and, optionally, ID token, based on scopes) directly. Set to client_credentials to specify that the client should get the access token (and, optionally, ID token, based on scopes) from the token endpoint using a combination of client and client_secret.
    */
  var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.native
  /**
    * Set to true if the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.native
  /**
    * The allowed OAuth scopes. Possible values provided by OAuth are: phone, email, openid, and profile. Possible values provided by AWS are: aws.cognito.signin.user.admin. Custom scopes created in Resource Servers are also supported.
    */
  var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.native
  /**
    * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.  Cognito User Pools only supports sending events to Amazon Pinpoint projects in the US East (N. Virginia) us-east-1 Region, regardless of the region in which the user pool resides. 
    */
  var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.native
  /**
    * A list of allowed redirect (callback) URLs for the identity providers. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var CallbackURLs: js.UndefOr[CallbackURLsListType] = js.native
  /**
    * The client name for the user pool client you would like to create.
    */
  var ClientName: ClientNameType = js.native
  /**
    * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.native
  /**
    * The authentication flows that are supported by the user pool clients. Flow names without the ALLOW_ prefix are deprecated in favor of new names with the ALLOW_ prefix. Note that values with ALLOW_ prefix cannot be used along with values without ALLOW_ prefix. Valid values include:    ALLOW_ADMIN_USER_PASSWORD_AUTH: Enable admin based user password authentication flow ADMIN_USER_PASSWORD_AUTH. This setting replaces the ADMIN_NO_SRP_AUTH setting. With this authentication flow, Cognito receives the password in the request instead of using the SRP (Secure Remote Password protocol) protocol to verify passwords.    ALLOW_CUSTOM_AUTH: Enable Lambda trigger based authentication.    ALLOW_USER_PASSWORD_AUTH: Enable user password-based authentication. In this flow, Cognito receives the password in the request instead of using the SRP protocol to verify passwords.    ALLOW_USER_SRP_AUTH: Enable SRP based authentication.    ALLOW_REFRESH_TOKEN_AUTH: Enable authflow to refresh tokens.  
    */
  var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.native
  /**
    * Boolean to specify whether you want to generate a secret for the user pool client being created.
    */
  var GenerateSecret: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.GenerateSecret] = js.native
  /**
    * A list of allowed logout URLs for the identity providers.
    */
  var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.native
  /**
    * Use this setting to choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to ENABLED and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to LEGACY, those APIs will return a UserNotFoundException exception if the user does not exist in the user pool. Valid values include:    ENABLED - This prevents user existence-related errors.    LEGACY - This represents the old behavior of Cognito where user existence related errors are not prevented.   This setting affects the behavior of following APIs:    AdminInitiateAuth     AdminRespondToAuthChallenge     InitiateAuth     RespondToAuthChallenge     ForgotPassword     ConfirmForgotPassword     ConfirmSignUp     ResendConfirmationCode     After February 15th 2020, the value of PreventUserExistenceErrors will default to ENABLED for newly created user pool clients if no value is provided. 
    */
  var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes] = js.native
  /**
    * The read attributes.
    */
  var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.native
  /**
    * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
    */
  var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.native
  /**
    * A list of provider names for the identity providers that are supported on this client. The following are supported: COGNITO, Facebook, Google and LoginWithAmazon.
    */
  var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.native
  /**
    * The user pool ID for the user pool where you want to create a user pool client.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user pool attributes that the app client can write to. If your app client allows users to sign in through an identity provider, this array must include all attributes that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when users sign in to your application through an identity provider. If your app client lacks write access to a mapped attribute, Amazon Cognito throws an error when it attempts to update the attribute. For more information, see Specifying Identity Provider Attribute Mappings for Your User Pool.
    */
  var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.native
}

object CreateUserPoolClientRequest {
  @scala.inline
  def apply(ClientName: ClientNameType, UserPoolId: UserPoolIdType): CreateUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientName = ClientName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolClientRequest]
  }
  @scala.inline
  implicit class CreateUserPoolClientRequestOps[Self <: CreateUserPoolClientRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientName(value: ClientNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedOAuthFlows(value: OAuthFlowsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOAuthFlows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedOAuthFlows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOAuthFlows")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedOAuthFlowsUserPoolClient(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOAuthFlowsUserPoolClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedOAuthFlowsUserPoolClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOAuthFlowsUserPoolClient")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedOAuthScopes(value: ScopeListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOAuthScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedOAuthScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedOAuthScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyticsConfiguration(value: AnalyticsConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyticsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackURLs(value: CallbackURLsListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallbackURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallbackURLs")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRedirectURI(value: RedirectUrlType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRedirectURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRedirectURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRedirectURI")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitAuthFlows(value: ExplicitAuthFlowsListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExplicitAuthFlows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitAuthFlows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExplicitAuthFlows")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateSecret(value: GenerateSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerateSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerateSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoutURLs(value: LogoutURLsListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogoutURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoutURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogoutURLs")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventUserExistenceErrors(value: PreventUserExistenceErrorTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreventUserExistenceErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventUserExistenceErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreventUserExistenceErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withReadAttributes(value: ClientPermissionListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshTokenValidity(value: RefreshTokenValidityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshTokenValidity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshTokenValidity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshTokenValidity")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedIdentityProviders(value: SupportedIdentityProvidersListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedIdentityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedIdentityProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedIdentityProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteAttributes(value: ClientPermissionListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteAttributes")(js.undefined)
        ret
    }
  }
  
}

