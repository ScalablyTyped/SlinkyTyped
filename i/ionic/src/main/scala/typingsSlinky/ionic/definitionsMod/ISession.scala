package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.anon.IdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISession extends js.Object {
  def getUser(): IdNumber = js.native
  def getUserToken(): String = js.native
  def isLoggedIn(): Boolean = js.native
  def login(email: String, password: String): js.Promise[Unit] = js.native
  def logout(): js.Promise[Unit] = js.native
  def ssoLogin(email: String): js.Promise[Unit] = js.native
  def tokenLogin(token: String): js.Promise[Unit] = js.native
}

object ISession {
  @scala.inline
  def apply(
    getUser: () => IdNumber,
    getUserToken: () => String,
    isLoggedIn: () => Boolean,
    login: (String, String) => js.Promise[Unit],
    logout: () => js.Promise[Unit],
    ssoLogin: String => js.Promise[Unit],
    tokenLogin: String => js.Promise[Unit]
  ): ISession = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction0(getUser), getUserToken = js.Any.fromFunction0(getUserToken), isLoggedIn = js.Any.fromFunction0(isLoggedIn), login = js.Any.fromFunction2(login), logout = js.Any.fromFunction0(logout), ssoLogin = js.Any.fromFunction1(ssoLogin), tokenLogin = js.Any.fromFunction1(tokenLogin))
    __obj.asInstanceOf[ISession]
  }
  @scala.inline
  implicit class ISessionOps[Self <: ISession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUser(value: () => IdNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserToken(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLoggedIn(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoggedIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogin(value: (String, String) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLogout(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSsoLogin(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssoLogin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTokenLogin(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenLogin")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

