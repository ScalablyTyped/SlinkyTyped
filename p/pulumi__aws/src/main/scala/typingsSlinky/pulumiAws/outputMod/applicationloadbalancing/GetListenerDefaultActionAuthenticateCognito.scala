package typingsSlinky.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultActionAuthenticateCognito extends js.Object {
  var authenticationRequestExtraParams: StringDictionary[js.Any] = js.native
  var onUnauthenticatedRequest: String = js.native
  var scope: String = js.native
  var sessionCookieName: String = js.native
  var sessionTimeout: Double = js.native
  var userPoolArn: String = js.native
  var userPoolClientId: String = js.native
  var userPoolDomain: String = js.native
}

object GetListenerDefaultActionAuthenticateCognito {
  @scala.inline
  def apply(
    authenticationRequestExtraParams: StringDictionary[js.Any],
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    userPoolArn: String,
    userPoolClientId: String,
    userPoolDomain: String
  ): GetListenerDefaultActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultActionAuthenticateCognito]
  }
  @scala.inline
  implicit class GetListenerDefaultActionAuthenticateCognitoOps[Self <: GetListenerDefaultActionAuthenticateCognito] (val x: Self) extends AnyVal {
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
  }
  
}

