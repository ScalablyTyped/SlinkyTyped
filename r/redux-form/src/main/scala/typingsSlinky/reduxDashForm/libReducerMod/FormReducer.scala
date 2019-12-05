package typingsSlinky.reduxDashForm.libReducerMod

import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormReducer extends Reducer[FormStateMap, AnyAction] {
  def plugin(reducers: FormReducerMapObject): Reducer[FormStateMap, AnyAction] = js.native
}

