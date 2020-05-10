package typingsSlinky.jexcel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jexcel.AnonColspan
import typingsSlinky.jexcel.jexcelStrings.center
import typingsSlinky.jexcel.jexcelStrings.left
import typingsSlinky.jexcel.jexcelStrings.right
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializationOptions extends js.Object {
  /** Allow comments over the cells: bool */
  var allowComments: js.UndefOr[Boolean] = js.native
  /** Allow delete a column: bool */
  var allowDeleteColumn: js.UndefOr[Boolean] = js.native
  /** Allow delete a row: bool */
  var allowDeleteRow: js.UndefOr[Boolean] = js.native
  /** Allow table export: bool */
  var allowExport: js.UndefOr[Boolean] = js.native
  /** Allow insert a new column: bool */
  var allowInsertColumn: js.UndefOr[Boolean] = js.native
  /** Allow insert a new row: bool */
  var allowInsertRow: js.UndefOr[Boolean] = js.native
  /** Allow user to create a new column: bool */
  var allowManualInsertColumn: js.UndefOr[Boolean] = js.native
  /** Allow user to insert a new row: bool */
  var allowManualInsertRow: js.UndefOr[Boolean] = js.native
  /** Allow rename a column: bool */
  var allowRenameColumn: js.UndefOr[Boolean] = js.native
  /** Auto increment actions when using the dragging corner */
  var autoIncrement: js.UndefOr[js.Any] = js.native
  /** Allow column dragging: bool */
  var columnDrag: js.UndefOr[Boolean] = js.native
  /** Allow column resizing: bool */
  var columnResize: js.UndefOr[Boolean] = js.native
  /** Allow column sorting: bool */
  var columnSorting: js.UndefOr[Boolean] = js.native
  /** Column type, title, width, align, dropdown options, text wrapping, mask, etc.: object */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  /** Context menu content: function() { return customMenu } */
  // tslint:disable-next-line ban-types
  var contextMenu: js.UndefOr[js.Function] = js.native
  /** When is true copy and export will bring formula results, if false will bring formulas: boolean */
  var copyCompatibility: js.UndefOr[Boolean] = js.native
  /** Load a external CSV file from this URL: string */
  var csv: js.UndefOr[String] = js.native
  /** Default delimiter for the CSV file: string */
  var csvDelimiter: js.UndefOr[String] = js.native
  /** Default filename for a download method: string */
  var csvFileName: js.UndefOr[String] = js.native
  /** Load header titles from the CSV file: bool */
  var csvHeaders: js.UndefOr[Boolean] = js.native
  /** Load this data into the javascript table: array */
  var data: js.UndefOr[
    js.Array[
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ title in string | number ]: jexcel.jexcel.CellValue}
    */ typingsSlinky.jexcel.jexcelStrings.InitializationOptions with TopLevel[js.Any]) | js.Array[CellValue]
    ]
  ] = js.native
  /** Default align for a new column: [center, left, right] */
  var defaultColAlign: js.UndefOr[center | left | right] = js.native
  /** Default width for a new column: integer */
  var defaultColWidth: js.UndefOr[Double] = js.native
  /** Allow table edition: bool */
  var editable: js.UndefOr[Boolean] = js.native
  /** Fullscreen mode */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /** Include header titles on download: bool */
  var includeHeadersOnDownload: js.UndefOr[Boolean] = js.native
  /** Activate the table lazyloading */
  var lazyLoading: js.UndefOr[Boolean] = js.native
  /** Activate the loading spin */
  var loadingSpin: js.UndefOr[Boolean] = js.native
  /** Cells to be merged in the table initialization: object */
  var mergeCells: js.UndefOr[Record[String, _]] = js.native
  /** Meta information: object */
  var meta: js.UndefOr[Record[String, _]] = js.native
  /** Minimum table dimensions: [cols, rows] */
  var minDimensions: js.UndefOr[js.Array[Double] | (js.Tuple2[js.UndefOr[Double], Double])] = js.native
  /** Minimum number of spare cols: [integer] */
  var minSpareCols: js.UndefOr[js.Array[Double]] = js.native
  /** Minimum number of spare rows: [integer] */
  var minSpareRows: js.UndefOr[js.Array[Double]] = js.native
  /** Define the nested headers, including title, colspan, etc: object */
  var nestedHeaders: js.UndefOr[js.Array[js.Array[AnonColspan]]] = js.native
  /** Break the table by pages */
  var pagination: js.UndefOr[Double] = js.native
  /** Number of records per page: 25,50,75,100 for example. */
  var paginationOptions: js.UndefOr[js.Array[Double]] = js.native
  /** Enable execution of formulas inside the table */
  var parseFormulas: js.UndefOr[js.Any] = js.native
  /** Allow row dragging: bool */
  var rowDrag: js.UndefOr[Boolean] = js.native
  /** Allow row resizing: bool */
  var rowResize: js.UndefOr[Boolean] = js.native
  /** Row properties: height.: object */
  var rows: js.UndefOr[Record[String, _]] = js.native
  /** Allow search in the table */
  var search: js.UndefOr[Boolean] = js.native
  /** Allow selection copy: bool */
  var selectionCopy: js.UndefOr[Boolean] = js.native
  /**
    * Cells style in the table initialization: object
    * key: cellIndex. (e.g.) "A1", "C20"
    * value: css value. (e.g.) "background-color: orange;"
    */
  var style: js.UndefOr[StringDictionary[String]] = js.native
  /** Force the max height of the table: CSS String */
  var tableHeight: js.UndefOr[String] = js.native
  /** Allow table overflow: bool */
  var tableOverflow: js.UndefOr[Boolean] = js.native
  /** Force the max width of the table: CSS String */
  var tableWidth: js.UndefOr[String] = js.native
  /** All messages to be customized */
  var text: js.UndefOr[Record[String, _]] = js.native
  /** Add custom toolbars: object */
  var toolbar: js.UndefOr[js.Array[Record[String, _]]] = js.native
  /** Method to config custom script execution. NOTE: This does not work with lazyLoading, Pagination or Search options. */
  var updateTable: js.UndefOr[
    js.Function7[
      /* instance */ js.Any, 
      /* cell */ js.Any, 
      /* col */ js.Any, 
      /* row */ js.Any, 
      /* val */ js.Any, 
      /* label */ js.Any, 
      /* cellName */ js.Any, 
      Unit
    ]
  ] = js.native
  /** Load a external json file from this URL: string */
  var url: js.UndefOr[String] = js.native
  /** Global text wrapping: bool */
  var wordWrap: js.UndefOr[Boolean] = js.native
}

object InitializationOptions {
  @scala.inline
  def apply(): InitializationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializationOptions]
  }
  @scala.inline
  implicit class InitializationOptionsOps[Self <: InitializationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowComments")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleteColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleteColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleteRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleteRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExport")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInsertColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsertColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInsertRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsertRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowManualInsertColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowManualInsertColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowManualInsertColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowManualInsertColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowManualInsertRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowManualInsertRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowManualInsertRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowManualInsertRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRenameColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRenameColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRenameColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRenameColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoIncrement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
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
    def withContextMenu(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyCompatibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyCompatibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyCompatibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyCompatibility")(js.undefined)
        ret
    }
    @scala.inline
    def withCsv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withData(
      value: js.Array[
          (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ title in string | number ]: jexcel.jexcel.CellValue}
      */ typingsSlinky.jexcel.jexcelStrings.InitializationOptions with TopLevel[js.Any]) | js.Array[CellValue]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColAlign(value: center | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeHeadersOnDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeHeadersOnDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeHeadersOnDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeHeadersOnDownload")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingSpin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingSpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpin")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeCells(value: Record[String, _]): Self = {
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
    def withMeta(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDimensions(value: js.Array[Double] | (js.Tuple2[js.UndefOr[Double], Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSpareCols(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSpareCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareCols")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSpareRows(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSpareRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareRows")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedHeaders(value: js.Array[js.Array[AnonColspan]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationOptions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withParseFormulas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseFormulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseFormulas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseFormulas")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withRowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Record[String, _]): Self = {
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
    def withSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StringDictionary[String]): Self = {
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
    def withTableHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTableOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withTableWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: js.Array[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTable(
      value: (/* instance */ js.Any, /* cell */ js.Any, /* col */ js.Any, /* row */ js.Any, /* val */ js.Any, /* label */ js.Any, /* cellName */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTable")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutUpdateTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTable")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
  }
  
}

