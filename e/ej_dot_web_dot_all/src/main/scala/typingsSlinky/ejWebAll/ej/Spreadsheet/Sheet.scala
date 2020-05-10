package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet extends js.Object {
  /** Specifies the border for the cell in the Spreadsheet.
    * @Default {[]}
    */
  var border: js.UndefOr[js.Array[SheetsBorder]] = js.native
  /** Specifies the conditional formatting for the range of cell in Spreadsheet.
    * @Default {[]}
    */
  var cFormatRule: js.UndefOr[js.Array[SheetsCFormatRule]] = js.native
  /** Specifies the cell types for a cell or range in Spreadsheet.
    * @Default {[]}
    */
  var cellTypes: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates to define column count in the Spreadsheet.
    * @Default {21}
    */
  var colCount: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates to define column width in the Spreadsheet.
    * @Default {64}
    */
  var columnWidth: js.UndefOr[Double] = js.native
  /** Gets or sets the data to render the Spreadsheet.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates whether to enable or disable field as column header in the Spreadsheet.
    * @Default {false}
    */
  var fieldAsColumnHeader: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value to freeze columns in the Spreadsheet.
    * @Default {0}
    */
  var frozenColumns: js.UndefOr[Double] = js.native
  /** Gets or sets a value to freeze rows in the Spreadsheet.
    * @Default {0}
    */
  var frozenRows: js.UndefOr[Double] = js.native
  /** Specifies the header styles for the headers in datasource range.
    * @Default {null}
    */
  var headerStyles: js.UndefOr[js.Any] = js.native
  /** To hide the specified columns in Spreadsheet.
    * @Default {[]}
    */
  var hideColumns: js.UndefOr[js.Array[_]] = js.native
  /** To hide the specified rows in Spreadsheet.
    * @Default {[]}
    */
  var hideRows: js.UndefOr[js.Array[_]] = js.native
  /** To merge specified ranges in Spreadsheet.
    * @Default {[]}
    */
  var mergeCells: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the primary key for the datasource in Spreadsheet.
    */
  var primaryKey: js.UndefOr[String] = js.native
  /** Specifies the query for the dataSource in Spreadsheet.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Specifies single range or multiple range settings for a sheet in Spreadsheet.
    * @Default {[]}
    */
  var rangeSettings: js.UndefOr[js.Array[SheetsRangeSetting]] = js.native
  /** Gets or sets a value that indicates to define row count in the Spreadsheet.
    * @Default {20}
    */
  var rowCount: js.UndefOr[Double] = js.native
  /** Specifies the rows for a sheet in Spreadsheet.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[SheetsRow]] = js.native
  /** Specifies the name for sheet in the Spreadsheet.
    * @Default {string}
    */
  var sheetName: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to show or hide grid lines in the Spreadsheet.
    * @Default {true}
    */
  var showGridlines: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to show or hide headings in the Spreadsheet.
    * @Default {true}
    */
  var showHeadings: js.UndefOr[Boolean] = js.native
  /** Specifies the start cell for the datasource range in Spreadsheet.
    * @Default {A1}
    */
  var startCell: js.UndefOr[String] = js.native
}

object Sheet {
  @scala.inline
  def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  @scala.inline
  implicit class SheetOps[Self <: Sheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: js.Array[SheetsBorder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withCFormatRule(value: js.Array[SheetsCFormatRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cFormatRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCFormatRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cFormatRule")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTypes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withColCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
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
    def withFieldAsColumnHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldAsColumnHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldAsColumnHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldAsColumnHeader")(js.undefined)
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
    def withHeaderStyles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withHideColumns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withHideRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeCells(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCells")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSettings(value: js.Array[SheetsRangeSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[SheetsRow]): Self = {
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
    def withSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeadings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeadings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeadings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeadings")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCell")(js.undefined)
        ret
    }
  }
  
}

