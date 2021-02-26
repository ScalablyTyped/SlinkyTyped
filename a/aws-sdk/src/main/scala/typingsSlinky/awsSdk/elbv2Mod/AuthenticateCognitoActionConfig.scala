package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticateCognitoActionConfig extends StObject {
  
  /**
    * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
    */
  var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams] = js.native
  
  /**
    * The behavior if the user is not authenticated. The following are possible values:   deny - Return an HTTP 401 Unauthorized error.   allow - Allow the request to be forwarded to the target.   authenticate - Redirect the request to the IdP authorization endpoint. This is the default value.  
    */
  var OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum] = js.native
  
  /**
    * The set of user claims to be requested from the IdP. The default is openid. To verify which scope values your IdP supports and how to separate multiple values, see the documentation for your IdP.
    */
  var Scope: js.UndefOr[AuthenticateCognitoActionScope] = js.native
  
  /**
    * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
    */
  var SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName] = js.native
  
  /**
    * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
    */
  var SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
    */
  var UserPoolArn: AuthenticateCognitoActionUserPoolArn = js.native
  
  /**
    * The ID of the Amazon Cognito user pool client.
    */
  var UserPoolClientId: AuthenticateCognitoActionUserPoolClientId = js.native
  
  /**
    * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
    */
  var UserPoolDomain: AuthenticateCognitoActionUserPoolDomain = js.native
}
object AuthenticateCognitoActionConfig {
  
  @scala.inline
  def apply(
    UserPoolArn: AuthenticateCognitoActionUserPoolArn,
    UserPoolClientId: AuthenticateCognitoActionUserPoolClientId,
    UserPoolDomain: AuthenticateCognitoActionUserPoolDomain
  ): AuthenticateCognitoActionConfig = {
    val __obj = js.Dynamic.literal(UserPoolArn = UserPoolArn.asInstanceOf[js.Any], UserPoolClientId = UserPoolClientId.asInstanceOf[js.Any], UserPoolDomain = UserPoolDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateCognitoActionConfig]
  }
  
  @scala.inline
  implicit class AuthenticateCognitoActionConfigMutableBuilder[Self <: AuthenticateCognitoActionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationRequestExtraParams(value: AuthenticateCognitoActionAuthenticationRequestExtraParams): Self = StObject.set(x, "AuthenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationRequestExtraParamsUndefined: Self = StObject.set(x, "AuthenticationRequestExtraParams", js.undefined)
    
    @scala.inline
    def setOnUnauthenticatedRequest(value: AuthenticateCognitoActionConditionalBehaviorEnum): Self = StObject.set(x, "OnUnauthenticatedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUnauthenticatedRequestUndefined: Self = StObject.set(x, "OnUnauthenticatedRequest", js.undefined)
    
    @scala.inline
    def setScope(value: AuthenticateCognitoActionScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    @scala.inline
    def setSessionCookieName(value: AuthenticateCognitoActionSessionCookieName): Self = StObject.set(x, "SessionCookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionCookieNameUndefined: Self = StObject.set(x, "SessionCookieName", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: AuthenticateCognitoActionSessionTimeout): Self = StObject.set(x, "SessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimeoutUndefined: Self = StObject.set(x, "SessionTimeout", js.undefined)
    
    @scala.inline
    def setUserPoolArn(value: AuthenticateCognitoActionUserPoolArn): Self = StObject.set(x, "UserPoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolClientId(value: AuthenticateCognitoActionUserPoolClientId): Self = StObject.set(x, "UserPoolClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolDomain(value: AuthenticateCognitoActionUserPoolDomain): Self = StObject.set(x, "UserPoolDomain", value.asInstanceOf[js.Any])
  }
}
