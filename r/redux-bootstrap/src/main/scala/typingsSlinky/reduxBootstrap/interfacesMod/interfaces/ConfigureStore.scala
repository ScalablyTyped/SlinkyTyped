package typingsSlinky.reduxBootstrap.interfacesMod.interfaces

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureStore
  extends js.Function {
  
  def apply(
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]],
    rootReducer: js.Object,
    initialState: js.Any
  ): Store[_, AnyAction] = js.native
}
