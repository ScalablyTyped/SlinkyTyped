package typingsSlinky.reduxPromiseMiddleware.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-promise-middleware", "createPromise")
@js.native
object createPromise extends js.Object {
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(config: Config): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

