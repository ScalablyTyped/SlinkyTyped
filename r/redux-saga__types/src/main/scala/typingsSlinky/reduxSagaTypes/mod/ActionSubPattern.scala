package typingsSlinky.reduxSagaTypes.mod

import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxSagaTypes.mod.GuardPredicate[Guard, typingsSlinky.redux.mod.Action[js.Any]]
  - typingsSlinky.reduxSagaTypes.mod.StringableActionCreator[Guard]
  - typingsSlinky.reduxSagaTypes.mod.Predicate[typingsSlinky.redux.mod.Action[js.Any]]
  - typingsSlinky.reduxSagaTypes.mod.ActionType
*/
trait ActionSubPattern[Guard /* <: Action[_] */] extends ActionPattern[Guard]

object ActionSubPattern {
  @scala.inline
  implicit def apply[Guard](value: (GuardPredicate[Guard, Action[js.Any]]) | Predicate[Action[js.Any]]): ActionSubPattern[Guard] = value.asInstanceOf[ActionSubPattern[Guard]]
  @scala.inline
  implicit def apply[Guard](value: ActionType): ActionSubPattern[Guard] = value.asInstanceOf[ActionSubPattern[Guard]]
  @scala.inline
  implicit def apply[Guard](value: StringableActionCreator[Guard]): ActionSubPattern[Guard] = value.asInstanceOf[ActionSubPattern[Guard]]
}

