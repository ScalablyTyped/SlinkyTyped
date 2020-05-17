package typingsSlinky.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.UndefOr[scala.Nothing]
*/
trait Optional[T] extends js.Object

object Optional {
  @scala.inline
  implicit def apply[T](value: T): Optional[T] = value.asInstanceOf[Optional[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => Optional[T]): Optional[T] = value.asInstanceOf[Optional[T]]
}

