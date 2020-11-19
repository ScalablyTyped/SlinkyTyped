package typingsSlinky.reduxLogger.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-logger", "createLogger")
@js.native
object createLogger extends js.Object {
  
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(options: ReduxLoggerOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}
