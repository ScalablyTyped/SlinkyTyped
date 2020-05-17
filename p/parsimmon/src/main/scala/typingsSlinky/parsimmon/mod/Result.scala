package typingsSlinky.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parsimmon.mod.Success[T]
  - typingsSlinky.parsimmon.mod.Failure
*/
trait Result[T] extends js.Object

object Result {
  @scala.inline
  implicit def apply[T](value: Failure): Result[T] = value.asInstanceOf[Result[T]]
  @scala.inline
  implicit def apply[T](value: Success[T]): Result[T] = value.asInstanceOf[Result[T]]
}

