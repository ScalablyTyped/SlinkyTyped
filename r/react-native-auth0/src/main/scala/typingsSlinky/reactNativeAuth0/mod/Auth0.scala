package typingsSlinky.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0 extends js.Object {
  var auth: Auth = js.native
  var webAuth: WebAuth = js.native
  def users(token: String): Users_ = js.native
}

object Auth0 {
  @scala.inline
  def apply(auth: Auth, users: String => Users_, webAuth: WebAuth): Auth0 = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], users = js.Any.fromFunction1(users), webAuth = webAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0]
  }
  @scala.inline
  implicit class Auth0Ops[Self <: Auth0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: Auth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: String => Users_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWebAuth(value: WebAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAuth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

