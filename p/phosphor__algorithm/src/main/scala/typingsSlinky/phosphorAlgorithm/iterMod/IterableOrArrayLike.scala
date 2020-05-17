package typingsSlinky.phosphorAlgorithm.iterMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorAlgorithm.iterMod.IIterable[T]
  - typingsSlinky.std.ArrayLike[T]
*/
trait IterableOrArrayLike[T] extends js.Object

object IterableOrArrayLike {
  @scala.inline
  implicit def apply[T](value: ArrayLike[T]): IterableOrArrayLike[T] = value.asInstanceOf[IterableOrArrayLike[T]]
  @scala.inline
  implicit def apply[T](value: IIterable[T]): IterableOrArrayLike[T] = value.asInstanceOf[IterableOrArrayLike[T]]
}

