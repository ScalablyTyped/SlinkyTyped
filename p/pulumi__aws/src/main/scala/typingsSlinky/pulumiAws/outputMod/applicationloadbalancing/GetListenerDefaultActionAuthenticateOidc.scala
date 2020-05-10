package typingsSlinky.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultActionAuthenticateOidc extends js.Object {
  var authenticationRequestExtraParams: StringDictionary[js.Any] = js.native
  var authorizationEndpoint: String = js.native
  var clientId: String = js.native
  var clientSecret: String = js.native
  var issuer: String = js.native
  var onUnauthenticatedRequest: String = js.native
  var scope: String = js.native
  var sessionCookieName: String = js.native
  var sessionTimeout: Double = js.native
  var tokenEndpoint: String = js.native
  var userInfoEndpoint: String = js.native
}

object GetListenerDefaultActionAuthenticateOidc {
  @scala.inline
  def apply(
    authenticationRequestExtraParams: StringDictionary[js.Any],
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
  ): GetListenerDefaultActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams.asInstanceOf[js.Any], authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultActionAuthenticateOidc]
  }
  @scala.inline
  implicit class GetListenerDefaultActionAuthenticateOidcOps[Self <: GetListenerDefaultActionAuthenticateOidc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationRequestExtraParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationRequestExtraParams")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

