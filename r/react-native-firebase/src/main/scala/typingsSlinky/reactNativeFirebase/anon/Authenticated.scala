package typingsSlinky.reactNativeFirebase.anon

import typingsSlinky.reactNativeFirebase.mod.RNFirebase.auth.AuthResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticated extends AuthResult {
  var authenticated: Boolean = js.native
  var user: js.Object | Null = js.native
}

object Authenticated {
  @scala.inline
  def apply(authenticated: Boolean): Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticated]
  }
  @scala.inline
  implicit class AuthenticatedOps[Self <: Authenticated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(null)
        ret
    }
  }
  
}

