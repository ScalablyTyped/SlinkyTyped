package typingsSlinky.async.mod

import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[T]
  - typingsSlinky.std.IterableIterator[T]
  - typingsSlinky.async.mod.Dictionary[T]
*/
trait IterableCollection[T] extends js.Object

object IterableCollection {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): IterableCollection[T] = value.asInstanceOf[IterableCollection[T]]
  @scala.inline
  implicit def apply[T](value: Dictionary[T]): IterableCollection[T] = value.asInstanceOf[IterableCollection[T]]
  @scala.inline
  implicit def apply[T](value: IterableIterator[T]): IterableCollection[T] = value.asInstanceOf[IterableCollection[T]]
}

