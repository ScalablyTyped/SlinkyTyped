package typingsSlinky.reduxStorage.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-storage", "reducer")
@js.native
object reducer extends js.Object {
  def apply[TState](reducer: Reducer[TState, AnyAction]): Reducer[TState, AnyAction] = js.native
  def apply[TState](reducer: Reducer[TState, AnyAction], merger: StateMerger): Reducer[TState, AnyAction] = js.native
}

