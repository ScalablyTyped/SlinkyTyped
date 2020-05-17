package typingsSlinky.hapiHoek.mod.intersect

import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayLike[T]
  - typingsSlinky.std.Set[T]
  - scala.Null
*/
trait Array[T] extends js.Object

object Array {
  @scala.inline
  implicit def apply[T](value: ArrayLike[T]): Array[T] = value.asInstanceOf[Array[T]]
  @scala.inline
  implicit def apply[T](value: Null): Array[T] = value.asInstanceOf[Array[T]]
  @scala.inline
  implicit def apply[T](value: Set[T]): Array[T] = value.asInstanceOf[Array[T]]
}

