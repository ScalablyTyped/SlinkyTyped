package typingsSlinky.pouchDashReduxDashMiddleware.pouchDashReduxDashMiddlewareMod

import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Dispatch
import typingsSlinky.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pouch-redux-middleware", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T](): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply[T](paths: js.Array[Path[T]]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply[T](paths: Path[T]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

