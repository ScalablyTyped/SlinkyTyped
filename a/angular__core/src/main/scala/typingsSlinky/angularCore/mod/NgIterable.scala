package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[T]
  - typingsSlinky.std.Iterable[T]
*/
trait NgIterable[T] extends js.Object

object NgIterable {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): NgIterable[T] = value.asInstanceOf[NgIterable[T]]
  @scala.inline
  implicit def apply[T](value: js.Iterable[T]): NgIterable[T] = value.asInstanceOf[NgIterable[T]]
}

