package typingsSlinky.reduxSagaTypes.mod

import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxSagaTypes.mod.Predicate[T]
  - typingsSlinky.reduxSagaTypes.mod.StringableActionCreator[typingsSlinky.redux.mod.Action[js.Any]]
  - typingsSlinky.reduxSagaTypes.mod.ActionType
*/
trait SubPattern[T] extends Pattern[T]

object SubPattern {
  @scala.inline
  implicit def apply[T](value: ActionType): SubPattern[T] = value.asInstanceOf[SubPattern[T]]
  @scala.inline
  implicit def apply[T](value: Predicate[T]): SubPattern[T] = value.asInstanceOf[SubPattern[T]]
  @scala.inline
  implicit def apply[T](value: StringableActionCreator[Action[js.Any]]): SubPattern[T] = value.asInstanceOf[SubPattern[T]]
}

