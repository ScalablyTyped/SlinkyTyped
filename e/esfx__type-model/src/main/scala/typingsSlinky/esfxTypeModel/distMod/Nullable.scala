package typingsSlinky.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait Nullable[T] extends js.Object

object Nullable {
  @scala.inline
  implicit def apply[T](value: Null): Nullable[T] = value.asInstanceOf[Nullable[T]]
  @scala.inline
  implicit def apply[T](value: T): Nullable[T] = value.asInstanceOf[Nullable[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => Nullable[T]): Nullable[T] = value.asInstanceOf[Nullable[T]]
}

