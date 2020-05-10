package typingsSlinky.pulumiAws.outputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleActionAuthenticateCognito extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[js.Any]] = js.native
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
    * The ARN of the Cognito user pool.
    */
  var userPoolArn: String = js.native
  /**
    * The ID of the Cognito user pool client.
    */
  var userPoolClientId: String = js.native
  /**
    * The domain prefix or fully-qualified domain name of the Cognito user pool.
    */
  var userPoolDomain: String = js.native
}

object ListenerRuleActionAuthenticateCognito {
  @scala.inline
  def apply(
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    userPoolArn: String,
    userPoolClientId: String,
    userPoolDomain: String
  ): ListenerRuleActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionAuthenticateCognito]
  }
  @scala.inline
  implicit class ListenerRuleActionAuthenticateCognitoOps[Self <: ListenerRuleActionAuthenticateCognito] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUserPoolArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolDomain")(value.asInstanceOf[js.Any])
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

