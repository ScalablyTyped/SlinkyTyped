package typingsSlinky.reduxTestkit.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.reduxTestkit.AnonFlush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", "FlushThunks")
@js.native
object FlushThunks extends js.Object {
  def createMiddleware(): (Middleware[js.Object, _, Dispatch[AnyAction]]) with AnonFlush = js.native
}

