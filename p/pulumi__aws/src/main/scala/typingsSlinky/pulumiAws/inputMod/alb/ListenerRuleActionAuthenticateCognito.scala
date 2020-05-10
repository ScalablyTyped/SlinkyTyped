package typingsSlinky.pulumiAws.inputMod.alb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleActionAuthenticateCognito extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: js.UndefOr[Input[String]] = js.native
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN of the Cognito user pool.
    */
  var userPoolArn: Input[String] = js.native
  /**
    * The ID of the Cognito user pool client.
    */
  var userPoolClientId: Input[String] = js.native
  /**
    * The domain prefix or fully-qualified domain name of the Cognito user pool.
    */
  var userPoolDomain: Input[String] = js.native
}

object ListenerRuleActionAuthenticateCognito {
  @scala.inline
  def apply(userPoolArn: Input[String], userPoolClientId: Input[String], userPoolDomain: Input[String]): ListenerRuleActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionAuthenticateCognito]
  }
  @scala.inline
  implicit class ListenerRuleActionAuthenticateCognitoOps[Self <: ListenerRuleActionAuthenticateCognito] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserPoolArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolClientId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolDomain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationRequestExtraParams(value: Input[StringDictionary[_]]): Self = {
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
    @scala.inline
    def withOnUnauthenticatedRequest(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnauthenticatedRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUnauthenticatedRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnauthenticatedRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionCookieName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCookieName")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(js.undefined)
        ret
    }
  }
  
}

