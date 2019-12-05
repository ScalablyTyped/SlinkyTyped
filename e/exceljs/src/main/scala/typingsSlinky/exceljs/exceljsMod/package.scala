package typingsSlinky.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exceljsMod {
  import typingsSlinky.exceljs.Anon_From
  import typingsSlinky.exceljs.exceljsNumbers.`1`
  import typingsSlinky.std.Required

  type AutoFilter = String | Anon_From
  type Buffer = scala.scalajs.js.typedarray.ArrayBuffer
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - typings.std.Date
    - typings.exceljs.exceljsMod.CellErrorValue
    - typings.exceljs.exceljsMod.CellRichTextValue
    - typings.exceljs.exceljsMod.CellHyperlinkValue
    - typings.exceljs.exceljsMod.CellFormulaValue
    - typings.exceljs.exceljsMod.CellSharedFormulaValue
  */
  type CellValue = _CellValue | Null | Double | String | Boolean | js.Date
  type DefinedNamesModel = js.Array[DefinedNamesRanges]
  type DocumentType = `1`
  type TableColumn = Required[TableColumnProperties]
  type WorksheetView = WorksheetViewCommon with (WorksheetViewNormal | WorksheetViewFrozen | WorksheetViewSplit)
}
