package typingsSlinky.reactRouterRedux.mod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-router-redux", "routerMiddleware")
@js.native
object routerMiddleware extends js.Object {
  
  def apply(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}
