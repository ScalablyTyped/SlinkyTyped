package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserPoolClientRequest extends js.Object {
  
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
    * The ID of the client associated with the user pool.
    */
  var ClientId: ClientIdType = js.native
  
  /**
    * The client name from the update user pool client request.
    */
  var ClientName: js.UndefOr[ClientNameType] = js.native
  
  /**
    * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.native
  
  /**
    * The authentication flows that are supported by the user pool clients. Flow names without the ALLOW_ prefix are deprecated in favor of new names with the ALLOW_ prefix. Note that values with ALLOW_ prefix cannot be used along with values without ALLOW_ prefix. Valid values include:    ALLOW_ADMIN_USER_PASSWORD_AUTH: Enable admin based user password authentication flow ADMIN_USER_PASSWORD_AUTH. This setting replaces the ADMIN_NO_SRP_AUTH setting. With this authentication flow, Cognito receives the password in the request instead of using the SRP (Secure Remote Password protocol) protocol to verify passwords.    ALLOW_CUSTOM_AUTH: Enable Lambda trigger based authentication.    ALLOW_USER_PASSWORD_AUTH: Enable user password-based authentication. In this flow, Cognito receives the password in the request instead of using the SRP protocol to verify passwords.    ALLOW_USER_SRP_AUTH: Enable SRP based authentication.    ALLOW_REFRESH_TOKEN_AUTH: Enable authflow to refresh tokens.  
    */
  var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.native
  
  /**
    * A list of allowed logout URLs for the identity providers.
    */
  var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.native
  
  /**
    * Use this setting to choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to ENABLED and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to LEGACY, those APIs will return a UserNotFoundException exception if the user does not exist in the user pool. Valid values include:    ENABLED - This prevents user existence-related errors.    LEGACY - This represents the old behavior of Cognito where user existence related errors are not prevented.   This setting affects the behavior of following APIs:    AdminInitiateAuth     AdminRespondToAuthChallenge     InitiateAuth     RespondToAuthChallenge     ForgotPassword     ConfirmForgotPassword     ConfirmSignUp     ResendConfirmationCode     After February 15th 2020, the value of PreventUserExistenceErrors will default to ENABLED for newly created user pool clients if no value is provided. 
    */
  var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes] = js.native
  
  /**
    * The read-only attributes of the user pool.
    */
  var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.native
  
  /**
    * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
    */
  var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.native
  
  /**
    * A list of provider names for the identity providers that are supported on this client.
    */
  var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.native
  
  /**
    * The user pool ID for the user pool where you want to update the user pool client.
    */
  var UserPoolId: UserPoolIdType = js.native
  
  /**
    * The writeable attributes of the user pool.
    */
  var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.native
}
object UpdateUserPoolClientRequest {
  
  @scala.inline
  def apply(ClientId: ClientIdType, UserPoolId: UserPoolIdType): UpdateUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolClientRequest]
  }
  
  @scala.inline
  implicit class UpdateUserPoolClientRequestOps[Self <: UpdateUserPoolClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOAuthFlowsVarargs(value: OAuthFlowType*): Self = this.set("AllowedOAuthFlows", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOAuthFlows(value: OAuthFlowsType): Self = this.set("AllowedOAuthFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedOAuthFlows: Self = this.set("AllowedOAuthFlows", js.undefined)
    
    @scala.inline
    def setAllowedOAuthFlowsUserPoolClient(value: BooleanType): Self = this.set("AllowedOAuthFlowsUserPoolClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedOAuthFlowsUserPoolClient: Self = this.set("AllowedOAuthFlowsUserPoolClient", js.undefined)
    
    @scala.inline
    def setAllowedOAuthScopesVarargs(value: ScopeType*): Self = this.set("AllowedOAuthScopes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOAuthScopes(value: ScopeListType): Self = this.set("AllowedOAuthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedOAuthScopes: Self = this.set("AllowedOAuthScopes", js.undefined)
    
    @scala.inline
    def setAnalyticsConfiguration(value: AnalyticsConfigurationType): Self = this.set("AnalyticsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsConfiguration: Self = this.set("AnalyticsConfiguration", js.undefined)
    
    @scala.inline
    def setCallbackURLsVarargs(value: RedirectUrlType*): Self = this.set("CallbackURLs", js.Array(value :_*))
    
    @scala.inline
    def setCallbackURLs(value: CallbackURLsListType): Self = this.set("CallbackURLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackURLs: Self = this.set("CallbackURLs", js.undefined)
    
    @scala.inline
    def setClientName(value: ClientNameType): Self = this.set("ClientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientName: Self = this.set("ClientName", js.undefined)
    
    @scala.inline
    def setDefaultRedirectURI(value: RedirectUrlType): Self = this.set("DefaultRedirectURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRedirectURI: Self = this.set("DefaultRedirectURI", js.undefined)
    
    @scala.inline
    def setExplicitAuthFlowsVarargs(value: ExplicitAuthFlowsType*): Self = this.set("ExplicitAuthFlows", js.Array(value :_*))
    
    @scala.inline
    def setExplicitAuthFlows(value: ExplicitAuthFlowsListType): Self = this.set("ExplicitAuthFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitAuthFlows: Self = this.set("ExplicitAuthFlows", js.undefined)
    
    @scala.inline
    def setLogoutURLsVarargs(value: RedirectUrlType*): Self = this.set("LogoutURLs", js.Array(value :_*))
    
    @scala.inline
    def setLogoutURLs(value: LogoutURLsListType): Self = this.set("LogoutURLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoutURLs: Self = this.set("LogoutURLs", js.undefined)
    
    @scala.inline
    def setPreventUserExistenceErrors(value: PreventUserExistenceErrorTypes): Self = this.set("PreventUserExistenceErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventUserExistenceErrors: Self = this.set("PreventUserExistenceErrors", js.undefined)
    
    @scala.inline
    def setReadAttributesVarargs(value: ClientPermissionType*): Self = this.set("ReadAttributes", js.Array(value :_*))
    
    @scala.inline
    def setReadAttributes(value: ClientPermissionListType): Self = this.set("ReadAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadAttributes: Self = this.set("ReadAttributes", js.undefined)
    
    @scala.inline
    def setRefreshTokenValidity(value: RefreshTokenValidityType): Self = this.set("RefreshTokenValidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshTokenValidity: Self = this.set("RefreshTokenValidity", js.undefined)
    
    @scala.inline
    def setSupportedIdentityProvidersVarargs(value: ProviderNameType*): Self = this.set("SupportedIdentityProviders", js.Array(value :_*))
    
    @scala.inline
    def setSupportedIdentityProviders(value: SupportedIdentityProvidersListType): Self = this.set("SupportedIdentityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedIdentityProviders: Self = this.set("SupportedIdentityProviders", js.undefined)
    
    @scala.inline
    def setWriteAttributesVarargs(value: ClientPermissionType*): Self = this.set("WriteAttributes", js.Array(value :_*))
    
    @scala.inline
    def setWriteAttributes(value: ClientPermissionListType): Self = this.set("WriteAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteAttributes: Self = this.set("WriteAttributes", js.undefined)
  }
}
