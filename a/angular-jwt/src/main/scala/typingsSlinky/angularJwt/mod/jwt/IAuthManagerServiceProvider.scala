package typingsSlinky.angularJwt.mod.jwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuthManagerServiceProvider extends js.Object {
  def authenticate(): Unit = js.native
  def checkAuthOnRefresh(): Unit = js.native
  def redirectWhenUnauthenticated(): Unit = js.native
  def unauthenticate(): Unit = js.native
}

object IAuthManagerServiceProvider {
  @scala.inline
  def apply(
    authenticate: () => Unit,
    checkAuthOnRefresh: () => Unit,
    redirectWhenUnauthenticated: () => Unit,
    unauthenticate: () => Unit
  ): IAuthManagerServiceProvider = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), checkAuthOnRefresh = js.Any.fromFunction0(checkAuthOnRefresh), redirectWhenUnauthenticated = js.Any.fromFunction0(redirectWhenUnauthenticated), unauthenticate = js.Any.fromFunction0(unauthenticate))
    __obj.asInstanceOf[IAuthManagerServiceProvider]
  }
  @scala.inline
  implicit class IAuthManagerServiceProviderOps[Self <: IAuthManagerServiceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckAuthOnRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthOnRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRedirectWhenUnauthenticated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectWhenUnauthenticated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnauthenticate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unauthenticate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

