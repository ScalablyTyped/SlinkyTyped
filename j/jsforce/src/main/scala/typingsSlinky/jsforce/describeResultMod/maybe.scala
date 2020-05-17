package typingsSlinky.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait maybe[T] extends js.Object

object maybe {
  @scala.inline
  implicit def apply[T](value: Null): maybe[T] = value.asInstanceOf[maybe[T]]
  @scala.inline
  implicit def apply[T](value: T): maybe[T] = value.asInstanceOf[maybe[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => maybe[T]): maybe[T] = value.asInstanceOf[maybe[T]]
}

