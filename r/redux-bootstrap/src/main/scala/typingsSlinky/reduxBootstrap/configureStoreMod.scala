package typingsSlinky.reduxBootstrap

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.redux.mod.Store
import typingsSlinky.redux.mod.StoreEnhancer
import typingsSlinky.reduxBootstrap.interfacesMod.interfaces.DevToolsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configureStoreMod {
  
  @JSImport("redux-bootstrap/dts/store/configure_store", JSImport.Default)
  @js.native
  def default(
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]],
    enhancers: js.Array[StoreEnhancer[_, js.Object]],
    rootReducer: Reducer[_, AnyAction],
    initialState: js.Any,
    devToolsOptions: DevToolsOptions
  ): Store[_, AnyAction] = js.native
}
