package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendoUiStrings.`inline`
import typingsSlinky.kendoUi.kendoUiStrings.incell
import typingsSlinky.kendoUi.kendoUiStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptions extends js.Object {
  var allowCopy: js.UndefOr[Boolean | GridAllowCopy] = js.native
  var altRowTemplate: js.UndefOr[String | js.Function] = js.native
  var autoBind: js.UndefOr[Boolean] = js.native
  var beforeEdit: js.UndefOr[js.Function1[/* e */ GridBeforeEditEvent, Unit]] = js.native
  var cancel: js.UndefOr[js.Function1[/* e */ GridCancelEvent, Unit]] = js.native
  var cellClose: js.UndefOr[js.Function1[/* e */ GridCellCloseEvent, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* e */ GridChangeEvent, Unit]] = js.native
  var columnHide: js.UndefOr[js.Function1[/* e */ GridColumnHideEvent, Unit]] = js.native
  var columnLock: js.UndefOr[js.Function1[/* e */ GridColumnLockEvent, Unit]] = js.native
  var columnMenu: js.UndefOr[Boolean | GridColumnMenu] = js.native
  var columnMenuInit: js.UndefOr[js.Function1[/* e */ GridColumnMenuInitEvent, Unit]] = js.native
  var columnMenuOpen: js.UndefOr[js.Function1[/* e */ GridColumnMenuOpenEvent, Unit]] = js.native
  var columnReorder: js.UndefOr[js.Function1[/* e */ GridColumnReorderEvent, Unit]] = js.native
  var columnResize: js.UndefOr[js.Function1[/* e */ GridColumnResizeEvent, Unit]] = js.native
  var columnResizeHandleWidth: js.UndefOr[Double] = js.native
  var columnShow: js.UndefOr[js.Function1[/* e */ GridColumnShowEvent, Unit]] = js.native
  var columnUnlock: js.UndefOr[js.Function1[/* e */ GridColumnUnlockEvent, Unit]] = js.native
  var columns: js.UndefOr[js.Array[GridColumn]] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ GridDataBindingEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ GridDataBoundEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var detailCollapse: js.UndefOr[js.Function1[/* e */ GridDetailCollapseEvent, Unit]] = js.native
  var detailExpand: js.UndefOr[js.Function1[/* e */ GridDetailExpandEvent, Unit]] = js.native
  var detailInit: js.UndefOr[js.Function1[/* e */ GridDetailInitEvent, Unit]] = js.native
  var detailTemplate: js.UndefOr[String | js.Function] = js.native
  var edit: js.UndefOr[js.Function1[/* e */ GridEditEvent, Unit]] = js.native
  var editable: js.UndefOr[Boolean | `inline` | incell | popup | GridEditable] = js.native
  var excel: js.UndefOr[GridExcel] = js.native
  var excelExport: js.UndefOr[js.Function1[/* e */ GridExcelExportEvent, Unit]] = js.native
  var filter: js.UndefOr[js.Function1[/* e */ GridFilterEvent, Unit]] = js.native
  var filterMenuInit: js.UndefOr[js.Function1[/* e */ GridFilterMenuInitEvent, Unit]] = js.native
  var filterMenuOpen: js.UndefOr[js.Function1[/* e */ GridFilterMenuOpenEvent, Unit]] = js.native
  var filterable: js.UndefOr[Boolean | GridFilterable] = js.native
  var group: js.UndefOr[js.Function1[/* e */ GridGroupEvent, Unit]] = js.native
  var groupCollapse: js.UndefOr[js.Function1[/* e */ GridGroupCollapseEvent, Unit]] = js.native
  var groupExpand: js.UndefOr[js.Function1[/* e */ GridGroupExpandEvent, Unit]] = js.native
  var groupable: js.UndefOr[Boolean | GridGroupable] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var messages: js.UndefOr[GridMessages] = js.native
  var mobile: js.UndefOr[Boolean | String] = js.native
  var name: js.UndefOr[String] = js.native
  var navigatable: js.UndefOr[Boolean] = js.native
  var navigate: js.UndefOr[js.Function1[/* e */ GridNavigateEvent, Unit]] = js.native
  var noRecords: js.UndefOr[Boolean | GridNoRecords] = js.native
  var page: js.UndefOr[js.Function1[/* e */ GridPageEvent, Unit]] = js.native
  var pageable: js.UndefOr[Boolean | GridPageable] = js.native
  var pdf: js.UndefOr[GridPdf] = js.native
  var pdfExport: js.UndefOr[js.Function1[/* e */ GridPdfExportEvent, Unit]] = js.native
  var persistSelection: js.UndefOr[Boolean] = js.native
  var remove: js.UndefOr[js.Function1[/* e */ GridRemoveEvent, Unit]] = js.native
  var reorderable: js.UndefOr[Boolean] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var rowTemplate: js.UndefOr[String | js.Function] = js.native
  var save: js.UndefOr[js.Function1[/* e */ GridSaveEvent, Unit]] = js.native
  var saveChanges: js.UndefOr[js.Function1[/* e */ GridSaveChangesEvent, Unit]] = js.native
  var scrollable: js.UndefOr[Boolean | GridScrollable] = js.native
  var selectable: js.UndefOr[Boolean | String] = js.native
  var sort: js.UndefOr[js.Function1[/* e */ GridSortEvent, Unit]] = js.native
  var sortable: js.UndefOr[Boolean | GridSortable] = js.native
  var toolbar: js.UndefOr[String | js.Function | (js.Array[String | GridToolbarItem])] = js.native
}

object GridOptions {
  @scala.inline
  def apply(): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions]
  }
  @scala.inline
  implicit class GridOptionsOps[Self <: GridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCopy(value: Boolean | GridAllowCopy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withAltRowTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altRowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltRowTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altRowTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEdit(value: /* e */ GridBeforeEditEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: /* e */ GridCancelEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClose(value: /* e */ GridCellCloseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClose")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ GridChangeEvent => Unit): Self = {
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
    def withColumnHide(value: /* e */ GridColumnHideEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnLock(value: /* e */ GridColumnLockEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLock")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnMenu(value: Boolean | GridColumnMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnMenuInit(value: /* e */ GridColumnMenuInitEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMenuInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnMenuInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMenuInit")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnMenuOpen(value: /* e */ GridColumnMenuOpenEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMenuOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnReorder(value: /* e */ GridColumnReorderEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnReorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResize(value: /* e */ GridColumnResizeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResizeHandleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeHandleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnResizeHandleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeHandleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnShow(value: /* e */ GridColumnShowEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShow")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnUnlock(value: /* e */ GridColumnUnlockEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnUnlock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnUnlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnUnlock")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[GridColumn]): Self = {
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
    def withDataBinding(value: /* e */ GridDataBindingEvent => Unit): Self = {
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
    def withDataBound(value: /* e */ GridDataBoundEvent => Unit): Self = {
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
    def withDataSource(value: js.Any | DataSource): Self = {
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
    def withDetailCollapse(value: /* e */ GridDetailCollapseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetailCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailExpand(value: /* e */ GridDetailExpandEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetailExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailInit(value: /* e */ GridDetailInitEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetailInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailInit")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: /* e */ GridEditEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean | `inline` | incell | popup | GridEditable): Self = {
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
    def withExcel(value: GridExcel): Self = {
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
    def withExcelExport(value: /* e */ GridExcelExportEvent => Unit): Self = {
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
    def withFilter(value: /* e */ GridFilterEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMenuInit(value: /* e */ GridFilterMenuInitEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMenuInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterMenuInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMenuInit")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMenuOpen(value: /* e */ GridFilterMenuOpenEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMenuOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterable(value: Boolean | GridFilterable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: /* e */ GridGroupEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCollapse(value: /* e */ GridGroupCollapseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGroupCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupExpand(value: /* e */ GridGroupExpandEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGroupExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupable(value: Boolean | GridGroupable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupable")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: GridMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
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
    def withNavigatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatable")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigate(value: /* e */ GridNavigateEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRecords(value: Boolean | GridNoRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: /* e */ GridPageEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPageable(value: Boolean | GridPageable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageable")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: GridPdf): Self = {
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
    def withPdfExport(value: /* e */ GridPdfExportEvent => Unit): Self = {
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
    def withPersistSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* e */ GridRemoveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withReorderable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReorderable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderable")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: /* e */ GridSaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveChanges(value: /* e */ GridSaveChangesEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChanges")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSaveChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollable(value: Boolean | GridScrollable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: /* e */ GridSortEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean | GridSortable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: String | js.Function | (js.Array[String | GridToolbarItem])): Self = {
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
  }
  
}

