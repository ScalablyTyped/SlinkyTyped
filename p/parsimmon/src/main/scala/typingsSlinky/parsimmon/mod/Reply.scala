package typingsSlinky.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parsimmon.mod.SuccessReply[T]
  - typingsSlinky.parsimmon.mod.FailureReply
*/
trait Reply[T] extends js.Object

object Reply {
  @scala.inline
  implicit def apply[T](value: FailureReply): Reply[T] = value.asInstanceOf[Reply[T]]
  @scala.inline
  implicit def apply[T](value: SuccessReply[T]): Reply[T] = value.asInstanceOf[Reply[T]]
}

