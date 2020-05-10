package typingsSlinky.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authresponse
  */
@js.native
trait AuthResponse extends js.Object {
  var access_token: String = js.native
  var expires_at: Double = js.native
  var expires_in: Double = js.native
  var first_issued_at: Double = js.native
  var id_token: String = js.native
  var login_hint: String = js.native
  var scope: String = js.native
}

object AuthResponse {
  @scala.inline
  def apply(
    access_token: String,
    expires_at: Double,
    expires_in: Double,
    first_issued_at: Double,
    id_token: String,
    login_hint: String,
    scope: String
  ): AuthResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], first_issued_at = first_issued_at.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], login_hint = login_hint.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResponse]
  }
  @scala.inline
  implicit class AuthResponseOps[Self <: AuthResponse] (val x: Self) extends AnyVal {
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
    def withExpires_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_in(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_issued_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_issued_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin_hint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login_hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

