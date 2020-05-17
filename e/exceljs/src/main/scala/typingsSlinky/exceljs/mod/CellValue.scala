package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - scala.Double
  - java.lang.String
  - scala.Boolean
  - typingsSlinky.std.Date
  - typingsSlinky.exceljs.mod.CellErrorValue
  - typingsSlinky.exceljs.mod.CellRichTextValue
  - typingsSlinky.exceljs.mod.CellHyperlinkValue
  - typingsSlinky.exceljs.mod.CellFormulaValue
  - typingsSlinky.exceljs.mod.CellSharedFormulaValue
*/
trait CellValue extends js.Object

object CellValue {
  @scala.inline
  implicit def apply(value: Boolean): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: CellErrorValue): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: CellFormulaValue): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: CellHyperlinkValue): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: CellRichTextValue): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: CellSharedFormulaValue): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: js.Date): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: Double): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: Null): CellValue = value.asInstanceOf[CellValue]
  @scala.inline
  implicit def apply(value: String): CellValue = value.asInstanceOf[CellValue]
}

