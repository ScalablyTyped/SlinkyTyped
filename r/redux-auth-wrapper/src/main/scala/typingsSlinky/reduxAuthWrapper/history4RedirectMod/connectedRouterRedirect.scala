package typingsSlinky.reduxAuthWrapper.history4RedirectMod

import typingsSlinky.redux.mod.Action
import typingsSlinky.reduxAuthWrapper.mod.AuthWrapperDecorator
import typingsSlinky.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig
import typingsSlinky.reduxAuthWrapper.redirectMod.InjectedAuthRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-auth-wrapper/history4/redirect", "connectedRouterRedirect")
@js.native
object connectedRouterRedirect extends js.Object {
  
  def apply[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps with (InjectedAuthRouterProps[js.Function1[/* repeated */ _, Action[_]]])
  ] = js.native
}
