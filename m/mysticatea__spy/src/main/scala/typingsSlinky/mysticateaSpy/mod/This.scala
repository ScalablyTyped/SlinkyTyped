package typingsSlinky.mysticateaSpy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Nothing
*/
trait This[T] extends js.Object

object This {
  @scala.inline
  implicit def apply[T](value: scala.Nothing): This[T] = value.asInstanceOf[This[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => This[T]): This[T] = value.asInstanceOf[This[T]]
}

