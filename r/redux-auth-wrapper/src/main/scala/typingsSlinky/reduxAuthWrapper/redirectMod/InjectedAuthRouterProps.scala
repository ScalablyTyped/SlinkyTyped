package typingsSlinky.reduxAuthWrapper.redirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedAuthRouterProps[Redirect] extends InjectedAuthReduxProps {
  var redirect: Redirect = js.native
}

object InjectedAuthRouterProps {
  @scala.inline
  def apply[Redirect](isAuthenticated: Boolean, isAuthenticating: Boolean, redirect: Redirect, redirectPath: String): InjectedAuthRouterProps[Redirect] = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedAuthRouterProps[Redirect]]
  }
  @scala.inline
  implicit class InjectedAuthRouterPropsOps[Self[redirect] <: InjectedAuthRouterProps[redirect], Redirect] (val x: Self[Redirect]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Redirect] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Redirect]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Redirect] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Redirect] with Other]
    @scala.inline
    def withRedirect(value: Redirect): Self[Redirect] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

