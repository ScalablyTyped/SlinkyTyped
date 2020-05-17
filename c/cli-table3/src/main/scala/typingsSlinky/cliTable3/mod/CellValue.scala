package typingsSlinky.cliTable3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait CellValue extends Cell

object CellValue {
  @scala.inline
  implicit def apply(value: Boolean): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: Double): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: Null): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: String): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => CellValue): CellValue = value.asInstanceOf[CellValue]
}

