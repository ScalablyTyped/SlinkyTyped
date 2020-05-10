package typingsSlinky.auth0Js

import typingsSlinky.auth0Js.auth0JsStrings.code
import typingsSlinky.auth0Js.auth0JsStrings.fragment
import typingsSlinky.auth0Js.auth0JsStrings.query
import typingsSlinky.auth0Js.auth0JsStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResponseMode extends js.Object {
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: js.UndefOr[String] = js.native
  /** how the AuthN response is encoded and redirected back to the client. */
  var responseMode: js.UndefOr[query | fragment] = js.native
  /** type of the response used. */
  var responseType: js.UndefOr[code | token] = js.native
  /** scopes to be requested during AuthN. e.g. `openid email` */
  var scope: js.UndefOr[String] = js.native
}

object AnonResponseMode {
  @scala.inline
  def apply(): AnonResponseMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonResponseMode]
  }
  @scala.inline
  implicit class AnonResponseModeOps[Self <: AnonResponseMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMode(value: query | fragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMode")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: code | token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
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
  }
  
}

