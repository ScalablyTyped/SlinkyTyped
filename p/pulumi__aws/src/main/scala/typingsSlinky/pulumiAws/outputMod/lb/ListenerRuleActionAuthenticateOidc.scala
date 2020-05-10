package typingsSlinky.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleActionAuthenticateOidc extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The authorization endpoint of the IdP.
    */
  var authorizationEndpoint: String = js.native
  /**
    * The OAuth 2.0 client identifier.
    */
  var clientId: String = js.native
  /**
    * The OAuth 2.0 client secret.
    */
  var clientSecret: String = js.native
  /**
    * The OIDC issuer identifier of the IdP.
    */
  var issuer: String = js.native
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: String = js.native
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: String = js.native
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: String = js.native
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: Double = js.native
  /**
    * The token endpoint of the IdP.
    */
  var tokenEndpoint: String = js.native
  /**
    * The user info endpoint of the IdP.
    */
  var userInfoEndpoint: String = js.native
}

object ListenerRuleActionAuthenticateOidc {
  @scala.inline
  def apply(
    authorizationEndpoint: String,
    clientId: String,
    clientSecret: String,
    issuer: String,
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    tokenEndpoint: String,
    userInfoEndpoint: String
  ): ListenerRuleActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionAuthenticateOidc]
  }
  @scala.inline
  implicit class ListenerRuleActionAuthenticateOidcOps[Self <: ListenerRuleActionAuthenticateOidc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnUnauthenticatedRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnauthenticatedRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionCookieName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInfoEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfoEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationRequestExtraParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationRequestExtraParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationRequestExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationRequestExtraParams")(js.undefined)
        ret
    }
  }
  
}

