package typingsSlinky.reduxDoghouse

import typingsSlinky.redux.mod.ActionCreator
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[A, C /* <: ActionCreator[A] */](actionCreator: C, dispatch: Dispatch[AnyAction]): C = js.native
}

