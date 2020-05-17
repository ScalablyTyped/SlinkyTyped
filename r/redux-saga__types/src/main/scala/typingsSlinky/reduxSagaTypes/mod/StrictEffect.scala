package typingsSlinky.reduxSagaTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxSagaTypes.mod.SimpleEffect[T, js.Any]
  - typingsSlinky.reduxSagaTypes.mod.StrictCombinatorEffect[T]
*/
trait StrictEffect[T] extends js.Object

object StrictEffect {
  @scala.inline
  implicit def apply[T](value: SimpleEffect[T, js.Any]): StrictEffect[T] = value.asInstanceOf[StrictEffect[T]]
  @scala.inline
  implicit def apply[T](value: StrictCombinatorEffect[T]): StrictEffect[T] = value.asInstanceOf[StrictEffect[T]]
}

