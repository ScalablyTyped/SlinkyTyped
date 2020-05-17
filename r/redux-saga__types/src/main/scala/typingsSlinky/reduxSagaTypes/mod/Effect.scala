package typingsSlinky.reduxSagaTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxSagaTypes.mod.SimpleEffect[T, js.Any]
  - typingsSlinky.reduxSagaTypes.mod.CombinatorEffect[T, js.Any]
*/
trait Effect[T] extends js.Object

object Effect {
  @scala.inline
  implicit def apply[T](value: CombinatorEffect[T, js.Any]): Effect[T] = value.asInstanceOf[Effect[T]]
  @scala.inline
  implicit def apply[T](value: SimpleEffect[T, js.Any]): Effect[T] = value.asInstanceOf[Effect[T]]
}

