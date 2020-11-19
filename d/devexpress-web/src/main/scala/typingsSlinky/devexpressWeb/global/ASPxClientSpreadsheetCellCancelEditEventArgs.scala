package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.CellCancelEdit event.
  */
@JSGlobal("ASPxClientSpreadsheetCellCancelEditEventArgs")
@js.native
class ASPxClientSpreadsheetCellCancelEditEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientSpreadsheetCellCancelEditEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetCellCancelEditEventArgs object. For internal use only.
    * @param columnIndex Gets the active cell's column index.
    * @param rowIndex Gets the active cell's row index.
    * @param formula Gets the active cell's formula.
    * @param value Gets the active cell's current value.
    * @param sheetName Gets the current worksheet's name.
    */
  def this(columnIndex: Double, rowIndex: Double, formula: String, value: String, sheetName: String) = this()
}
