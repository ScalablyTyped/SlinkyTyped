package typingsSlinky.reduxOptimisticUi.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-optimistic-ui", "optimistic")
@js.native
object optimistic extends js.Object {
  def apply[TState](reducer: Reducer[TState, AnyAction]): Reducer[OptimisticState[TState], AnyAction] = js.native
}

