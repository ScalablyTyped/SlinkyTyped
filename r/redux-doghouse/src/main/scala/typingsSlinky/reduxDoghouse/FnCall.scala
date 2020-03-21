package typingsSlinky.reduxDoghouse

import typingsSlinky.redux.mod.ActionCreatorsMapObject
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[M /* <: ActionCreatorsMapObject[_] */, N /* <: ActionCreatorsMapObject[_] */](actionCreators: M, dispatch: Dispatch[AnyAction]): N = js.native
}

