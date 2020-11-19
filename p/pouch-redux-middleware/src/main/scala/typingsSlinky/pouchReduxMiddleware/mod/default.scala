package typingsSlinky.pouchReduxMiddleware.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pouch-redux-middleware", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[T](): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply[T](paths: js.Array[Path[T]]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply[T](paths: Path[T]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}
