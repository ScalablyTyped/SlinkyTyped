package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiConfigHandler extends js.Object {
  /** Action to take when users access resources that require authentication. Defaults to redirect. */
  var authFailAction: js.UndefOr[String] = js.native
  /** Level of login required to access this resource. Defaults to optional. */
  var login: js.UndefOr[String] = js.native
  /** Path to the script from the application root directory. */
  var script: js.UndefOr[String] = js.native
  /** Security (HTTPS) enforcement for this URL. */
  var securityLevel: js.UndefOr[String] = js.native
  /** URL to serve the endpoint at. */
  var url: js.UndefOr[String] = js.native
}

object ApiConfigHandler {
  @scala.inline
  def apply(): ApiConfigHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiConfigHandler]
  }
  @scala.inline
  implicit class ApiConfigHandlerOps[Self <: ApiConfigHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthFailAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authFailAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthFailAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authFailAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.undefined)
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

