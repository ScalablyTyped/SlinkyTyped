package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CellCancelEdit event.
  */
@js.native
trait ASPxClientSpreadsheetCellCancelEditEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the active cell's column index.
    */
  var columnIndex: Double = js.native
  /**
    * Gets the active cell's formula.
    */
  var formula: String = js.native
  /**
    * Gets the active cell's row index.
    */
  var rowIndex: Double = js.native
  /**
    * Gets the current worksheet's name.
    */
  var sheetName: String = js.native
  /**
    * Gets the active cell's current value.
    */
  var value: String = js.native
}

object ASPxClientSpreadsheetCellCancelEditEventArgs {
  @scala.inline
  def apply(columnIndex: Double, formula: String, rowIndex: Double, sheetName: String, value: String): ASPxClientSpreadsheetCellCancelEditEventArgs = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCellCancelEditEventArgs]
  }
  @scala.inline
  implicit class ASPxClientSpreadsheetCellCancelEditEventArgsOps[Self <: ASPxClientSpreadsheetCellCancelEditEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

