package typingsSlinky.passportGoogleOauth2.anon

import typingsSlinky.passportGoogleOauth2.passportGoogleOauth2Strings.Bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accesstoken extends js.Object {
  var access_token: String = js.native
  var expires_in: Double = js.native
  var id_token: String = js.native
  var scope: String = js.native
  var token_type: Bearer = js.native
}

object Accesstoken {
  @scala.inline
  def apply(access_token: String, expires_in: Double, id_token: String, scope: String, token_type: Bearer): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
  @scala.inline
  implicit class AccesstokenOps[Self <: Accesstoken] (val x: Self) extends AnyVal {
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
    def withExpires_in(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_type(value: Bearer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

