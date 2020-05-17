package typingsSlinky.reduxSagaTypes.mod

import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxSagaTypes.mod.ActionSubPattern[Guard]
  - js.Array[typingsSlinky.reduxSagaTypes.mod.ActionSubPattern[Guard]]
*/
trait ActionPattern[Guard /* <: Action[_] */] extends js.Object

object ActionPattern {
  @scala.inline
  implicit def apply[Guard](value: ActionSubPattern[Guard]): ActionPattern[Guard] = value.asInstanceOf[ActionPattern[Guard]]
  @scala.inline
  implicit def apply[Guard](value: js.Array[ActionSubPattern[Guard]]): ActionPattern[Guard] = value.asInstanceOf[ActionPattern[Guard]]
}

