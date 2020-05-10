package typingsSlinky.cswAasJs.authContextMod

import typingsSlinky.cswAasJs.authMod.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthContextType extends js.Object {
  var auth: Auth | Null = js.native
  def login(): Unit = js.native
  def logout(): Unit = js.native
}

object AuthContextType {
  @scala.inline
  def apply(login: () => Unit, logout: () => Unit): AuthContextType = {
    val __obj = js.Dynamic.literal(login = js.Any.fromFunction0(login), logout = js.Any.fromFunction0(logout))
    __obj.asInstanceOf[AuthContextType]
  }
  @scala.inline
  implicit class AuthContextTypeOps[Self <: AuthContextType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAuth(value: Auth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(null)
        ret
    }
  }
  
}

