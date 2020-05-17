package typingsSlinky.reactNativeModal.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - T
*/
trait OrNull[T] extends js.Object

object OrNull {
  @scala.inline
  implicit def apply[T](value: Null): OrNull[T] = value.asInstanceOf[OrNull[T]]
  @scala.inline
  implicit def apply[T](value: T): OrNull[T] = value.asInstanceOf[OrNull[T]]
}

