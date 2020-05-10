package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationCodeGrantOptions extends js.Object {
  var code: String = js.native
  var redirect_uri: String = js.native
}

object AuthorizationCodeGrantOptions {
  @scala.inline
  def apply(code: String, redirect_uri: String): AuthorizationCodeGrantOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationCodeGrantOptions]
  }
  @scala.inline
  implicit class AuthorizationCodeGrantOptionsOps[Self <: AuthorizationCodeGrantOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirect_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

