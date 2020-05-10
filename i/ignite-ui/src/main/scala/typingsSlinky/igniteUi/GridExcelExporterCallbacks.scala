package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridExcelExporterCallbacks
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A function to call after the cell is exported.
  	 * Function takes arguments sender and args.
  	 * Use args.columnKey to get the igGrid column key of the cell.
  	 * Use args.columnIndex to get the igGrid column index of the cell.
  	 * Use args.cellValue to get the igGrid cell value.
  	 * Use args.rowId to get key or index of row.
  	 * Use args.xlRow to get reference to the worksheet row.
  	 * Use args.grid to get reference to the igGrid widget.
  	 *
  	 */
  var cellExported: js.UndefOr[js.Function] = js.native
  /**
  	 * Cancel="true" A function to call before the cell is exported.
  	 * Function takes arguments sender and args.
  	 * Use args.columnKey to get the igGrid column key of the cell.
  	 * Use args.columnIndex to get the igGrid column index of the cell.
  	 * Use args.cellValue to get or set the igGrid cell value.
  	 * Use args.rowId to get key or index of row.
  	 * Use args.xlRow to get reference to the worksheet row.
  	 * Use args.grid to get reference to the igGrid widget.
  	 * Return false in order to cancel exporting the cell.
  	 *
  	 */
  var cellExporting: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call when exporting fails.
  	 * Use error to obtain reference of the error object.
  	 *
  	 */
  var error: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call before the Excel file is downloaded.
  	 * Function takes arguments sender and args.
  	 * Use args.grid to get reference to the igGrid widget.
  	 * Use args.workbook to get reference to the Excel workbook.
  	 * Use args.worksheet to get reference to the Excel worksheet.
  	 * Return false in order to cancel downloading the file.
  	 *
  	 */
  var exportEnding: js.UndefOr[js.Function] = js.native
  /**
  	 * Cancel="true" A function to call before exporting starts.
  	 * Function takes arguments sender and args.
  	 * Use args.grid to get reference to igGrid widget.
  	 * Return false in order to cancel exporting.
  	 *
  	 */
  var exportStarting: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call after a header cell is exported.
  	 * Function takes arguments sender and args.
  	 * Use args.headerText to get the igGrid column header text.
  	 * Use args.columnKey to get the igGrid column key.
  	 * Use args.columnIndex to get the igGrid column index.
  	 *
  	 */
  var headerCellExported: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call before the header cell is exported.
  	 * Function takes arguments sender and args.
  	 * Use args.headerText to get or set the igGrid column header text.
  	 * Use args.columnKey to get the igGrid column key.
  	 * Use args.columnIndex to get the igGrid column index.
  	 * Return false in order to cancel exporting the cell.
  	 *
  	 */
  var headerCellExporting: js.UndefOr[js.Function] = js.native
  /**
  	 * Cancel="true" A function to call after the row is exported.
  	 * Function takes arguments sender and args.
  	 * Use args.rowId to get key or index of row.
  	 * Use args.element to get row TR element.
  	 * Use args.xlRow to get reference to the worksheet row.
  	 * Use args.grid to get reference to the igGrid widget.
  	 * Note: When exporting igHierarchicalGrid this callback is available only for the root grid rows.
  	 *
  	 */
  var rowExported: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call before the row is exported.
  	 * Function takes arguments sender and args.
  	 * Use args.rowId to get key or index of row.
  	 * Use args.element to get row TR element.
  	 * Use args.xlRow to get reference to the worksheet row.
  	 * Use args.grid to get reference to the igGrid widget.
  	 * Return false in order to cancel exporting the row.
  	 * Note: When exporting igHierarchicalGrid this callback is available only for the root grid rows.
  	 *
  	 */
  var rowExporting: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call when saving the file succeeds.
  	 * Use data to get the reference of saved object.
  	 *
  	 */
  var success: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call after the summary is exported.
  	 * Function takes arguments sender and args.
  	 * Use args.headerText to get the igGrid column header text.
  	 * Use args.columnKey to get the igGrid column key.
  	 * Use args.columnIndex to get the igGrid column index.
  	 * Use args.summary to get a reference to the summary object.
  	 * Use args.xlRowIndex to get the Excel worksheet row index.
  	 *
  	 */
  var summaryExported: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call before the summary is exported.
  	 * Function takes arguments sender and args.
  	 * Use args.headerText to get the igGrid column header text.
  	 * Use args.columnKey to get the igGrid column key.
  	 * Use args.columnIndex to get the igGrid column index.
  	 * Use args.summary to get a reference to the summary object.
  	 * Use args.xlRowIndex to get reference to worksheet row index.
  	 * Return false in order to cancel exporting the summary.
  	 *
  	 */
  var summaryExporting: js.UndefOr[js.Function] = js.native
}

object GridExcelExporterCallbacks {
  @scala.inline
  def apply(): GridExcelExporterCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridExcelExporterCallbacks]
  }
  @scala.inline
  implicit class GridExcelExporterCallbacksOps[Self <: GridExcelExporterCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellExported(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellExported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellExported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellExported")(js.undefined)
        ret
    }
    @scala.inline
    def withCellExporting(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellExporting")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExportEnding(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportEnding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportEnding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportEnding")(js.undefined)
        ret
    }
    @scala.inline
    def withExportStarting(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportStarting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportStarting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportStarting")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCellExported(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellExported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCellExported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellExported")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCellExporting(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCellExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellExporting")(js.undefined)
        ret
    }
    @scala.inline
    def withRowExported(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowExported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExported")(js.undefined)
        ret
    }
    @scala.inline
    def withRowExporting(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExporting")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryExported(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryExported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExported")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryExporting(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExporting")(js.undefined)
        ret
    }
  }
  
}

