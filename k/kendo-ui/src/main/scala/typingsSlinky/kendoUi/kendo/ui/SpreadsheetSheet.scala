package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetSheet extends js.Object {
  var activeCell: js.UndefOr[String] = js.native
  var columns: js.UndefOr[js.Array[SpreadsheetSheetColumn]] = js.native
  var dataSource: js.UndefOr[DataSource] = js.native
  var filter: js.UndefOr[SpreadsheetSheetFilter] = js.native
  var frozenColumns: js.UndefOr[Double] = js.native
  var frozenRows: js.UndefOr[Double] = js.native
  var mergedCells: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  var rows: js.UndefOr[js.Array[SpreadsheetSheetRow]] = js.native
  var selection: js.UndefOr[String] = js.native
  var showGridLines: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[SpreadsheetSheetSort] = js.native
}

object SpreadsheetSheet {
  @scala.inline
  def apply(): SpreadsheetSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheet]
  }
  @scala.inline
  implicit class SpreadsheetSheetOps[Self <: SpreadsheetSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCell")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[SpreadsheetSheetColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: SpreadsheetSheetFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMergedCells(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergedCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedCells")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[SpreadsheetSheetRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: SpreadsheetSheetSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

