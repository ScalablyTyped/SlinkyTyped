package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateOidcActionConfig extends js.Object {
  /**
    * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
    */
  var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams] = js.native
  /**
    * The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint = js.native
  /**
    * The OAuth 2.0 client identifier.
    */
  var ClientId: AuthenticateOidcActionClientId = js.native
  /**
    * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying a rule, you can omit this parameter if you set UseExistingClientSecret to true.
    */
  var ClientSecret: js.UndefOr[AuthenticateOidcActionClientSecret] = js.native
  /**
    * The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var Issuer: AuthenticateOidcActionIssuer = js.native
  /**
    * The behavior if the user is not authenticated. The following are possible values:   deny - Return an HTTP 401 Unauthorized error.   allow - Allow the request to be forwarded to the target.   authenticate - Redirect the request to the IdP authorization endpoint. This is the default value.  
    */
  var OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum] = js.native
  /**
    * The set of user claims to be requested from the IdP. The default is openid. To verify which scope values your IdP supports and how to separate multiple values, see the documentation for your IdP.
    */
  var Scope: js.UndefOr[AuthenticateOidcActionScope] = js.native
  /**
    * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
    */
  var SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName] = js.native
  /**
    * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
    */
  var SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout] = js.native
  /**
    * The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var TokenEndpoint: AuthenticateOidcActionTokenEndpoint = js.native
  /**
    * Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you can omit this parameter or set it to false.
    */
  var UseExistingClientSecret: js.UndefOr[AuthenticateOidcActionUseExistingClientSecret] = js.native
  /**
    * The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint = js.native
}

object AuthenticateOidcActionConfig {
  @scala.inline
  def apply(
    AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint,
    ClientId: AuthenticateOidcActionClientId,
    Issuer: AuthenticateOidcActionIssuer,
    TokenEndpoint: AuthenticateOidcActionTokenEndpoint,
    UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint
  ): AuthenticateOidcActionConfig = {
    val __obj = js.Dynamic.literal(AuthorizationEndpoint = AuthorizationEndpoint.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], Issuer = Issuer.asInstanceOf[js.Any], TokenEndpoint = TokenEndpoint.asInstanceOf[js.Any], UserInfoEndpoint = UserInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOidcActionConfig]
  }
  @scala.inline
  implicit class AuthenticateOidcActionConfigOps[Self <: AuthenticateOidcActionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationEndpoint(value: AuthenticateOidcActionAuthorizationEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: AuthenticateOidcActionClientId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: AuthenticateOidcActionIssuer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenEndpoint(value: AuthenticateOidcActionTokenEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInfoEndpoint(value: AuthenticateOidcActionUserInfoEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserInfoEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationRequestExtraParams(value: AuthenticateOidcActionAuthenticationRequestExtraParams): Self = {
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
    def withClientSecret(value: AuthenticateOidcActionClientSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnauthenticatedRequest(value: AuthenticateOidcActionConditionalBehaviorEnum): Self = {
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
    def withScope(value: AuthenticateOidcActionScope): Self = {
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
    def withSessionCookieName(value: AuthenticateOidcActionSessionCookieName): Self = {
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
    def withSessionTimeout(value: AuthenticateOidcActionSessionTimeout): Self = {
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
    @scala.inline
    def withUseExistingClientSecret(value: AuthenticateOidcActionUseExistingClientSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseExistingClientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExistingClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseExistingClientSecret")(js.undefined)
        ret
    }
  }
  
}

