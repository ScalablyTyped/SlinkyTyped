package typingsSlinky.reactSelect.srcAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactSelect.srcAsyncMod.ClassProps[T]
  - typingsSlinky.reactSelect.srcAsyncMod.FunctionProps[T]
*/
trait SelectComponentProps[T] extends js.Object

object SelectComponentProps {
  @scala.inline
  implicit def apply[T](value: ClassProps[T] | FunctionProps[T]): SelectComponentProps[T] = value.asInstanceOf[SelectComponentProps[T]]
}

