package typingsSlinky.prompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.prompts.mod.PrevCaller[T, T]
*/
trait ValueOrFunc[T /* <: String */] extends js.Object

object ValueOrFunc {
  @scala.inline
  implicit def apply[T](value: PrevCaller[T, T]): ValueOrFunc[T] = value.asInstanceOf[ValueOrFunc[T]]
  @scala.inline
  implicit def apply[T](value: T): ValueOrFunc[T] = value.asInstanceOf[ValueOrFunc[T]]
}

