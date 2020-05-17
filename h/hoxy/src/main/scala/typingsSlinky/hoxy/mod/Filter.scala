package typingsSlinky.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.RegExp
  - typingsSlinky.hoxy.mod.TesterFunction[T]
  - T
*/
trait Filter[T] extends js.Object

object Filter {
  @scala.inline
  implicit def apply[T](value: js.RegExp): Filter[T] = value.asInstanceOf[Filter[T]]
  @scala.inline
  implicit def apply[T](value: T): Filter[T] = value.asInstanceOf[Filter[T]]
  @scala.inline
  implicit def apply[T](value: TesterFunction[T]): Filter[T] = value.asInstanceOf[Filter[T]]
}

