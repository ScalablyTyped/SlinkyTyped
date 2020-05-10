package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetOptions extends js.Object {
  var activeSheet: js.UndefOr[String] = js.native
  var change: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeEvent, Unit]] = js.native
  var changeFormat: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeFormatEvent, Unit]] = js.native
  var changing: js.UndefOr[js.Function1[/* e */ SpreadsheetChangingEvent, Unit]] = js.native
  var columnWidth: js.UndefOr[Double] = js.native
  var columns: js.UndefOr[Double] = js.native
  var copy: js.UndefOr[js.Function1[/* e */ SpreadsheetCopyEvent, Unit]] = js.native
  var cut: js.UndefOr[js.Function1[/* e */ SpreadsheetCutEvent, Unit]] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ SpreadsheetDataBindingEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ SpreadsheetDataBoundEvent, Unit]] = js.native
  var defaultCellStyle: js.UndefOr[SpreadsheetDefaultCellStyle] = js.native
  var deleteColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteColumnEvent, Unit]] = js.native
  var deleteRow: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteRowEvent, Unit]] = js.native
  var excel: js.UndefOr[SpreadsheetExcel] = js.native
  var excelExport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelExportEvent, Unit]] = js.native
  var excelImport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelImportEvent, Unit]] = js.native
  var headerHeight: js.UndefOr[Double] = js.native
  var headerWidth: js.UndefOr[Double] = js.native
  var hideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetHideColumnEvent, Unit]] = js.native
  var hideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetHideRowEvent, Unit]] = js.native
  var insertColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertColumnEvent, Unit]] = js.native
  var insertRow: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertRowEvent, Unit]] = js.native
  var insertSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertSheetEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var paste: js.UndefOr[js.Function1[/* e */ SpreadsheetPasteEvent, Unit]] = js.native
  var pdf: js.UndefOr[SpreadsheetPdf] = js.native
  var pdfExport: js.UndefOr[js.Function1[/* e */ SpreadsheetPdfExportEvent, Unit]] = js.native
  var removeSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRemoveSheetEvent, Unit]] = js.native
  var renameSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRenameSheetEvent, Unit]] = js.native
  var render: js.UndefOr[js.Function1[/* e */ SpreadsheetRenderEvent, Unit]] = js.native
  var rowHeight: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[Double] = js.native
  var select: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectEvent, Unit]] = js.native
  var selectSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectSheetEvent, Unit]] = js.native
  var sheets: js.UndefOr[js.Array[SpreadsheetSheet]] = js.native
  var sheetsbar: js.UndefOr[Boolean] = js.native
  var toolbar: js.UndefOr[Boolean | SpreadsheetToolbar] = js.native
  var unhideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideColumnEvent, Unit]] = js.native
  var unhideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideRowEvent, Unit]] = js.native
}

object SpreadsheetOptions {
  @scala.inline
  def apply(): SpreadsheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetOptions]
  }
  @scala.inline
  implicit class SpreadsheetOptionsOps[Self <: SpreadsheetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveSheet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ SpreadsheetChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeFormat(value: /* e */ SpreadsheetChangeFormatEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChangeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withChanging(value: /* e */ SpreadsheetChangingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changing")(js.undefined)
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
    def withColumns(value: Double): Self = {
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
    def withCopy(value: /* e */ SpreadsheetCopyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withCut(value: /* e */ SpreadsheetCutEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: /* e */ SpreadsheetDataBindingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: /* e */ SpreadsheetDataBoundEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCellStyle(value: SpreadsheetDefaultCellStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCellStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteColumn(value: /* e */ SpreadsheetDeleteColumnEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeleteColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRow(value: /* e */ SpreadsheetDeleteRowEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeleteRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRow")(js.undefined)
        ret
    }
    @scala.inline
    def withExcel(value: SpreadsheetExcel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excel")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelExport(value: /* e */ SpreadsheetExcelExportEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelExport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExcelExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelExport")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelImport(value: /* e */ SpreadsheetExcelImportEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelImport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExcelImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelImport")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHideColumn(value: /* e */ SpreadsheetHideColumnEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHideColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withHideRow(value: /* e */ SpreadsheetHideRowEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHideRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRow")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertColumn(value: /* e */ SpreadsheetInsertColumnEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertRow(value: /* e */ SpreadsheetInsertRowEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRow")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSheet(value: /* e */ SpreadsheetInsertSheetEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSheet")(js.undefined)
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
    def withPaste(value: /* e */ SpreadsheetPasteEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: SpreadsheetPdf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfExport(value: /* e */ SpreadsheetPdfExportEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfExport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPdfExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfExport")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSheet(value: /* e */ SpreadsheetRemoveSheetEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameSheet(value: /* e */ SpreadsheetRenameSheetEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenameSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* e */ SpreadsheetRenderEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
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
    def withSelect(value: /* e */ SpreadsheetSelectEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectSheet(value: /* e */ SpreadsheetSelectSheetEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withSheets(value: js.Array[SpreadsheetSheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetsbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetsbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsbar")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: Boolean | SpreadsheetToolbar): Self = {
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
    def withUnhideColumn(value: /* e */ SpreadsheetUnhideColumnEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhideColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnhideColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhideColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withUnhideRow(value: /* e */ SpreadsheetUnhideRowEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhideRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnhideRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhideRow")(js.undefined)
        ret
    }
  }
  
}

