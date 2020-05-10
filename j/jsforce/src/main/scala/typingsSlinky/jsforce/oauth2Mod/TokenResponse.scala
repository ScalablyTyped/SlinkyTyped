package typingsSlinky.jsforce.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenResponse extends js.Object {
  var access_token: String = js.native
  var refresh_token: String = js.native
}

object TokenResponse {
  @scala.inline
  def apply(access_token: String, refresh_token: String): TokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
  @scala.inline
  implicit class TokenResponseOps[Self <: TokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh_token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

