package typingsSlinky.reduxDashAuthDashWrapper.history4RedirectMod

import typingsSlinky.redux.reduxMod.Action
import typingsSlinky.reduxDashAuthDashWrapper.history3RedirectMod.ConnectedRouterRedirectConfig
import typingsSlinky.reduxDashAuthDashWrapper.history3RedirectMod.InjectedAuthRouterProps
import typingsSlinky.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history4/redirect", "connectedRouterRedirect")
@js.native
object connectedRouterRedirect extends js.Object {
  def apply[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps with (InjectedAuthRouterProps[js.Function1[/* repeated */ _, Action[_]]])
  ] = js.native
}

