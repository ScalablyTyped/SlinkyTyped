package typingsSlinky.reduxDashBootstrap

import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Dispatch
import typingsSlinky.redux.reduxMod.Middleware
import typingsSlinky.redux.reduxMod.Reducer
import typingsSlinky.redux.reduxMod.Store
import typingsSlinky.redux.reduxMod.StoreEnhancer
import typingsSlinky.reduxDashBootstrap.dtsInterfacesInterfacesMod.interfaces.DevToolsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-bootstrap/dts/store/configure_store", JSImport.Namespace)
@js.native
object dtsStoreConfigureUnderscoreStoreMod extends js.Object {
  def default(
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]],
    enhancers: js.Array[StoreEnhancer[_, js.Object]],
    rootReducer: Reducer[_, AnyAction],
    initialState: js.Any,
    devToolsOptions: DevToolsOptions
  ): Store[_, AnyAction] = js.native
}

