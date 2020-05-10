package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableMeta extends js.Object {
  var columnData: js.Array[MUIDataTableColumnOptions] = js.native
  var columnIndex: Double = js.native
  var rowData: js.Array[_] = js.native
  var rowIndex: Double = js.native
  var tableData: js.Array[MUIDataTableData] = js.native
  var tableState: MUIDataTableState = js.native
}

object MUIDataTableMeta {
  @scala.inline
  def apply(
    columnData: js.Array[MUIDataTableColumnOptions],
    columnIndex: Double,
    rowData: js.Array[_],
    rowIndex: Double,
    tableData: js.Array[MUIDataTableData],
    tableState: MUIDataTableState
  ): MUIDataTableMeta = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], tableData = tableData.asInstanceOf[js.Any], tableState = tableState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableMeta]
  }
  @scala.inline
  implicit class MUIDataTableMetaOps[Self <: MUIDataTableMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnData(value: js.Array[MUIDataTableColumnOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableData(value: js.Array[MUIDataTableData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableState(value: MUIDataTableState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

