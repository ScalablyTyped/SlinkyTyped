package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateCognitoActionConfig extends js.Object {
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
  implicit class AuthenticateCognitoActionConfigOps[Self <: AuthenticateCognitoActionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserPoolArn(value: AuthenticateCognitoActionUserPoolArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolClientId(value: AuthenticateCognitoActionUserPoolClientId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolDomain(value: AuthenticateCognitoActionUserPoolDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationRequestExtraParams(value: AuthenticateCognitoActionAuthenticationRequestExtraParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationRequestExtraParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationRequestExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationRequestExtraParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnauthenticatedRequest(value: AuthenticateCognitoActionConditionalBehaviorEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUnauthenticatedRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUnauthenticatedRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUnauthenticatedRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: AuthenticateCognitoActionScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionCookieName(value: AuthenticateCognitoActionSessionCookieName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionCookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionCookieName")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionTimeout(value: AuthenticateCognitoActionSessionTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionTimeout")(js.undefined)
        ret
    }
  }
  
}

