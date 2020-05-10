package typingsSlinky.muiDatatables.mod

import typingsSlinky.muiDatatables.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableState extends js.Object {
  var activeColumn: String | Null = js.native
  var announceText: String | Null = js.native
  var columns: js.Array[MUIDataTableColumnState] = js.native
  var count: Double = js.native
  var data: js.Array[_] = js.native
  var displayData: js.Array[AnonData] = js.native
  var expandedRows: MUIDataTableStateRows = js.native
  var filterData: js.Array[_] = js.native
  var filterList: js.Array[js.Array[String]] = js.native
  var page: Double = js.native
  var rowsPerPage: Double = js.native
  var rowsPerPageOptions: js.Array[Double] = js.native
  var searchText: String | Null = js.native
  var selectedRows: MUIDataTableStateRows = js.native
  var showResponsive: Boolean = js.native
}

object MUIDataTableState {
  @scala.inline
  def apply(
    columns: js.Array[MUIDataTableColumnState],
    count: Double,
    data: js.Array[_],
    displayData: js.Array[AnonData],
    expandedRows: MUIDataTableStateRows,
    filterData: js.Array[_],
    filterList: js.Array[js.Array[String]],
    page: Double,
    rowsPerPage: Double,
    rowsPerPageOptions: js.Array[Double],
    selectedRows: MUIDataTableStateRows,
    showResponsive: Boolean
  ): MUIDataTableState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], displayData = displayData.asInstanceOf[js.Any], expandedRows = expandedRows.asInstanceOf[js.Any], filterData = filterData.asInstanceOf[js.Any], filterList = filterList.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any], rowsPerPageOptions = rowsPerPageOptions.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], showResponsive = showResponsive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableState]
  }
  @scala.inline
  implicit class MUIDataTableStateOps[Self <: MUIDataTableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[MUIDataTableColumnState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayData(value: js.Array[AnonData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedRows(value: MUIDataTableStateRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterList(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsPerPageOptions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPageOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedRows(value: MUIDataTableStateRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveColumnNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColumn")(null)
        ret
    }
    @scala.inline
    def withAnnounceText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announceText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnounceTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announceText")(null)
        ret
    }
    @scala.inline
    def withSearchText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(null)
        ret
    }
  }
  
}

