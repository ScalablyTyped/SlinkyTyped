package typingsSlinky.phosphorAlgorithm.retroMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorAlgorithm.retroMod.IRetroable[T]
  - typingsSlinky.std.ArrayLike[T]
*/
trait RetroableOrArrayLike[T] extends js.Object

object RetroableOrArrayLike {
  @scala.inline
  implicit def apply[T](value: ArrayLike[T]): RetroableOrArrayLike[T] = value.asInstanceOf[RetroableOrArrayLike[T]]
  @scala.inline
  implicit def apply[T](value: IRetroable[T]): RetroableOrArrayLike[T] = value.asInstanceOf[RetroableOrArrayLike[T]]
}

