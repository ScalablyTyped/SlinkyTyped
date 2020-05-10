package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookTable extends Entity {
  // Represents a collection of all the columns in the table. Read-only.
  var columns: js.UndefOr[js.Array[WorkbookTableColumn]] = js.native
  // Indicates whether the first column contains special formatting.
  var highlightFirstColumn: js.UndefOr[Boolean] = js.native
  // Indicates whether the last column contains special formatting.
  var highlightLastColumn: js.UndefOr[Boolean] = js.native
  /**
    * Legacy Id used in older Excle clients. The value of the identifier remains the same even when the table is renamed.
    * This property should be interpreted as an opaque string value and should not be parsed to any other type. Read-only.
    */
  var legacyId: js.UndefOr[String] = js.native
  // Name of the table.
  var name: js.UndefOr[String] = js.native
  // Represents a collection of all the rows in the table. Read-only.
  var rows: js.UndefOr[js.Array[WorkbookTableRow]] = js.native
  /**
    * Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to
    * make reading the table easier.
    */
  var showBandedColumns: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make
    * reading the table easier.
    */
  var showBandedRows: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the
    * table contains a header row.
    */
  var showFilterButton: js.UndefOr[Boolean] = js.native
  // Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
  var showHeaders: js.UndefOr[Boolean] = js.native
  // Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
  var showTotals: js.UndefOr[Boolean] = js.native
  // Represents the sorting for the table. Read-only.
  var sort: js.UndefOr[WorkbookTableSort] = js.native
  /**
    * Constant value that represents the Table style. The possible values are: TableStyleLight1 thru TableStyleLight21,
    * TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style
    * present in the workbook can also be specified.
    */
  var style: js.UndefOr[String] = js.native
  // The worksheet containing the current table. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.native
}

object WorkbookTable {
  @scala.inline
  def apply(): WorkbookTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTable]
  }
  @scala.inline
  implicit class WorkbookTableOps[Self <: WorkbookTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[WorkbookTableColumn]): Self = {
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
    def withHighlightFirstColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightFirstColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightFirstColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightFirstColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightLastColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightLastColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightLastColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightLastColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyId")(js.undefined)
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
    def withRows(value: js.Array[WorkbookTableRow]): Self = {
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
    def withShowBandedColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBandedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBandedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBandedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBandedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBandedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBandedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBandedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFilterButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilterButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilterButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilterButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: WorkbookTableSort): Self = {
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
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheet(value: WorkbookWorksheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(js.undefined)
        ret
    }
  }
  
}

