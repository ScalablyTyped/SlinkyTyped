package typingsSlinky.jexcel.mod

import org.scalajs.dom.raw.HTMLTableRowElement
import typingsSlinky.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionHistory extends js.Object {
  var action: String = js.native
  var insertBefore: Boolean = js.native
  var numOfRows: Double = js.native
  var rowData: js.Array[CellValue] = js.native
  var rowNode: js.Array[HTMLTableRowElement] = js.native
  var rowNumber: Double = js.native
  var rowRecords: js.Array[HTMLTableDataCellElement] = js.native
}

object ActionHistory {
  @scala.inline
  def apply(
    action: String,
    insertBefore: Boolean,
    numOfRows: Double,
    rowData: js.Array[CellValue],
    rowNode: js.Array[HTMLTableRowElement],
    rowNumber: Double,
    rowRecords: js.Array[HTMLTableDataCellElement]
  ): ActionHistory = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], numOfRows = numOfRows.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any], rowNumber = rowNumber.asInstanceOf[js.Any], rowRecords = rowRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionHistory]
  }
  @scala.inline
  implicit class ActionHistoryOps[Self <: ActionHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumOfRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numOfRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: js.Array[CellValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowNode(value: js.Array[HTMLTableRowElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowRecords(value: js.Array[HTMLTableDataCellElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRecords")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

