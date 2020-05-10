package typingsSlinky.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/clientconfigi
@js.native
trait ClientConfigI extends js.Object {
  var clientId: String = js.native
  var redirectURI: String = js.native
  var scope: String = js.native
  var state: String = js.native
  var usePopup: Boolean = js.native
}

object ClientConfigI {
  @scala.inline
  def apply(clientId: String, redirectURI: String, scope: String, state: String, usePopup: Boolean): ClientConfigI = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], redirectURI = redirectURI.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], usePopup = usePopup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfigI]
  }
  @scala.inline
  implicit class ClientConfigIOps[Self <: ClientConfigI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsePopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePopup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

