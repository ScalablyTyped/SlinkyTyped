package typingsSlinky.reduxDashTestkit.reduxDashTestkitMod

import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Dispatch
import typingsSlinky.redux.reduxMod.Middleware
import typingsSlinky.reduxDashTestkit.Anon_Flush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", "FlushThunks")
@js.native
object FlushThunks extends js.Object {
  def createMiddleware(): (Middleware[js.Object, _, Dispatch[AnyAction]]) with Anon_Flush = js.native
}

