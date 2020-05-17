package typingsSlinky.ono.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ono.typesMod.ErrorLikeConstructorFunction[T]
  - typingsSlinky.ono.typesMod.ErrorLikeConstructorClass[T]
*/
trait ErrorLikeConstructor[T /* <: ErrorLike */] extends js.Object

object ErrorLikeConstructor {
  @scala.inline
  implicit def apply[T](value: ErrorLikeConstructorClass[T]): ErrorLikeConstructor[T] = value.asInstanceOf[ErrorLikeConstructor[T]]
  @scala.inline
  implicit def apply[T](value: ErrorLikeConstructorFunction[T]): ErrorLikeConstructor[T] = value.asInstanceOf[ErrorLikeConstructor[T]]
}

