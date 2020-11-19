package typingsSlinky.reduxStorage.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-storage", "createMiddleware")
@js.native
object createMiddleware extends js.Object {
  
  def apply(engine: StorageEngine): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(
    engine: StorageEngine,
    actionBlacklist: js.UndefOr[scala.Nothing],
    actionWhitelist: js.Array[String]
  ): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(
    engine: StorageEngine,
    actionBlacklist: js.UndefOr[scala.Nothing],
    actionWhitelist: ActionTypeCheckCallback
  ): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(engine: StorageEngine, actionBlacklist: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: ActionTypeCheckCallback): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}
