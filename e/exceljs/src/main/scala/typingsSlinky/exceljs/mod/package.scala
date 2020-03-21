package typingsSlinky.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AutoFilter = java.lang.String | typingsSlinky.exceljs.AnonFrom
  type Buffer = scala.scalajs.js.typedarray.ArrayBuffer
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
  type CellValue = typingsSlinky.exceljs.mod._CellValue | scala.Null | scala.Double | java.lang.String | scala.Boolean | js.Date
  type DefinedNamesModel = js.Array[typingsSlinky.exceljs.mod.DefinedNamesRanges]
  type DocumentType = typingsSlinky.exceljs.exceljsNumbers.`1`
  type WorksheetView = typingsSlinky.exceljs.mod.WorksheetViewCommon with (typingsSlinky.exceljs.mod.WorksheetViewNormal | typingsSlinky.exceljs.mod.WorksheetViewFrozen | typingsSlinky.exceljs.mod.WorksheetViewSplit)
}
