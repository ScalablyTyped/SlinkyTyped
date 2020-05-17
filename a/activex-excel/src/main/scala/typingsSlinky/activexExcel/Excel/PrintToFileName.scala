package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - java.lang.String
*/
trait PrintToFileName[T] extends js.Object

object PrintToFileName {
  @scala.inline
  implicit def apply[T](value: String): PrintToFileName[T] = value.asInstanceOf[PrintToFileName[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => PrintToFileName[T]): PrintToFileName[T] = value.asInstanceOf[PrintToFileName[T]]
}

