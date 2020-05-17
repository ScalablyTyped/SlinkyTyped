package typingsSlinky.reduxShortcuts.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.redux.mod.ActionCreator[typingsSlinky.redux.mod.Action[js.Any]]
  - js.Array[typingsSlinky.redux.mod.ActionCreator[typingsSlinky.redux.mod.Action[js.Any]]]
*/
trait ActionBindings extends js.Object

object ActionBindings {
  @scala.inline
  implicit def apply(value: ActionCreator[Action[js.Any]]): ActionBindings = value.asInstanceOf[ActionBindings]
  @scala.inline
  implicit def apply(value: js.Array[ActionCreator[Action[js.Any]]]): ActionBindings = value.asInstanceOf[ActionBindings]
}

