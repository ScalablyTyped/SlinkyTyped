package typingsSlinky.reduxSagaTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxSagaTypes.mod.SubPattern[T]
  - js.Array[typingsSlinky.reduxSagaTypes.mod.SubPattern[T]]
*/
trait Pattern[T] extends js.Object

object Pattern {
  @scala.inline
  implicit def apply[T](value: js.Array[SubPattern[T]]): Pattern[T] = value.asInstanceOf[Pattern[T]]
  @scala.inline
  implicit def apply[T](value: SubPattern[T]): Pattern[T] = value.asInstanceOf[Pattern[T]]
}

