package typingsSlinky.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Cell values
// ----------------------------------------------------------------------
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait CellValue extends SourceValue

object CellValue {
  @scala.inline
  implicit def apply(value: Boolean): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: Double): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: String): CellValue = value.asInstanceOf[CellValue]
}

