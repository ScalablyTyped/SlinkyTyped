package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.TreeListDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.native
  var beforeEdit: js.UndefOr[js.Function1[/* e */ TreeListBeforeEditEvent, Unit]] = js.native
  var cancel: js.UndefOr[js.Function1[/* e */ TreeListCancelEvent, Unit]] = js.native
  var cellClose: js.UndefOr[js.Function1[/* e */ TreeListCellCloseEvent, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* e */ TreeListChangeEvent, Unit]] = js.native
  var collapse: js.UndefOr[js.Function1[/* e */ TreeListCollapseEvent, Unit]] = js.native
  var columnHide: js.UndefOr[js.Function1[/* e */ TreeListColumnHideEvent, Unit]] = js.native
  var columnLock: js.UndefOr[js.Function1[/* e */ TreeListColumnLockEvent, Unit]] = js.native
  var columnMenu: js.UndefOr[Boolean | TreeListColumnMenu] = js.native
  var columnMenuInit: js.UndefOr[js.Function1[/* e */ TreeListColumnMenuInitEvent, Unit]] = js.native
  var columnMenuOpen: js.UndefOr[js.Function1[/* e */ TreeListColumnMenuOpenEvent, Unit]] = js.native
  var columnReorder: js.UndefOr[js.Function1[/* e */ TreeListColumnReorderEvent, Unit]] = js.native
  var columnResize: js.UndefOr[js.Function1[/* e */ TreeListColumnResizeEvent, Unit]] = js.native
  var columnShow: js.UndefOr[js.Function1[/* e */ TreeListColumnShowEvent, Unit]] = js.native
  var columnUnlock: js.UndefOr[js.Function1[/* e */ TreeListColumnUnlockEvent, Unit]] = js.native
  var columns: js.UndefOr[js.Array[TreeListColumn]] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ TreeListDataBindingEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeListDataBoundEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | TreeListDataSource] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ TreeListDragEvent, Unit]] = js.native
  var dragend: js.UndefOr[js.Function1[/* e */ TreeListDragendEvent, Unit]] = js.native
  var dragstart: js.UndefOr[js.Function1[/* e */ TreeListDragstartEvent, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* e */ TreeListDropEvent, Unit]] = js.native
  var edit: js.UndefOr[js.Function1[/* e */ TreeListEditEvent, Unit]] = js.native
  var editable: js.UndefOr[Boolean | TreeListEditable] = js.native
  var excel: js.UndefOr[TreeListExcel] = js.native
  var excelExport: js.UndefOr[js.Function1[/* e */ TreeListExcelExportEvent, Unit]] = js.native
  var expand: js.UndefOr[js.Function1[/* e */ TreeListExpandEvent, Unit]] = js.native
  var filterMenuInit: js.UndefOr[js.Function1[/* e */ TreeListFilterMenuInitEvent, Unit]] = js.native
  var filterMenuOpen: js.UndefOr[js.Function1[/* e */ TreeListFilterMenuOpenEvent, Unit]] = js.native
  var filterable: js.UndefOr[Boolean | TreeListFilterable] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var messages: js.UndefOr[TreeListMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var navigatable: js.UndefOr[Boolean] = js.native
  var pageable: js.UndefOr[Boolean | TreeListPageable] = js.native
  var pdf: js.UndefOr[TreeListPdf] = js.native
  var pdfExport: js.UndefOr[js.Function1[/* e */ TreeListPdfExportEvent, Unit]] = js.native
  var remove: js.UndefOr[js.Function1[/* e */ TreeListRemoveEvent, Unit]] = js.native
  var reorderable: js.UndefOr[Boolean] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var save: js.UndefOr[js.Function1[/* e */ TreeListSaveEvent, Unit]] = js.native
  var saveChanges: js.UndefOr[js.Function1[/* e */ TreeListSaveChangesEvent, Unit]] = js.native
  var scrollable: js.UndefOr[Boolean | js.Any] = js.native
  var selectable: js.UndefOr[Boolean | String] = js.native
  var sortable: js.UndefOr[Boolean | TreeListSortable] = js.native
  var toolbar: js.UndefOr[js.Array[TreeListToolbarItem] | js.Any] = js.native
}

object TreeListOptions {
  @scala.inline
  def apply(): TreeListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListOptions]
  }
  @scala.inline
  implicit class TreeListOptionsOps[Self <: TreeListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBeforeEdit(value: /* e */ TreeListBeforeEditEvent => Unit): Self = {
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
    def withCancel(value: /* e */ TreeListCancelEvent => Unit): Self = {
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
    def withCellClose(value: /* e */ TreeListCellCloseEvent => Unit): Self = {
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
    def withChange(value: /* e */ TreeListChangeEvent => Unit): Self = {
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
    def withCollapse(value: /* e */ TreeListCollapseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHide(value: /* e */ TreeListColumnHideEvent => Unit): Self = {
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
    def withColumnLock(value: /* e */ TreeListColumnLockEvent => Unit): Self = {
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
    def withColumnMenu(value: Boolean | TreeListColumnMenu): Self = {
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
    def withColumnMenuInit(value: /* e */ TreeListColumnMenuInitEvent => Unit): Self = {
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
    def withColumnMenuOpen(value: /* e */ TreeListColumnMenuOpenEvent => Unit): Self = {
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
    def withColumnReorder(value: /* e */ TreeListColumnReorderEvent => Unit): Self = {
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
    def withColumnResize(value: /* e */ TreeListColumnResizeEvent => Unit): Self = {
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
    def withColumnShow(value: /* e */ TreeListColumnShowEvent => Unit): Self = {
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
    def withColumnUnlock(value: /* e */ TreeListColumnUnlockEvent => Unit): Self = {
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
    def withColumns(value: js.Array[TreeListColumn]): Self = {
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
    def withDataBinding(value: /* e */ TreeListDataBindingEvent => Unit): Self = {
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
    def withDataBound(value: /* e */ TreeListDataBoundEvent => Unit): Self = {
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
    def withDataSource(value: js.Any | TreeListDataSource): Self = {
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
    def withDrag(value: /* e */ TreeListDragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragend(value: /* e */ TreeListDragendEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.undefined)
        ret
    }
    @scala.inline
    def withDragstart(value: /* e */ TreeListDragstartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: /* e */ TreeListDropEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: /* e */ TreeListEditEvent => Unit): Self = {
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
    def withEditable(value: Boolean | TreeListEditable): Self = {
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
    def withExcel(value: TreeListExcel): Self = {
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
    def withExcelExport(value: /* e */ TreeListExcelExportEvent => Unit): Self = {
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
    def withExpand(value: /* e */ TreeListExpandEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMenuInit(value: /* e */ TreeListFilterMenuInitEvent => Unit): Self = {
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
    def withFilterMenuOpen(value: /* e */ TreeListFilterMenuOpenEvent => Unit): Self = {
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
    def withFilterable(value: Boolean | TreeListFilterable): Self = {
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
    def withMessages(value: TreeListMessages): Self = {
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
    def withPageable(value: Boolean | TreeListPageable): Self = {
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
    def withPdf(value: TreeListPdf): Self = {
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
    def withPdfExport(value: /* e */ TreeListPdfExportEvent => Unit): Self = {
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
    def withRemove(value: /* e */ TreeListRemoveEvent => Unit): Self = {
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
    def withSave(value: /* e */ TreeListSaveEvent => Unit): Self = {
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
    def withSaveChanges(value: /* e */ TreeListSaveChangesEvent => Unit): Self = {
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
    def withScrollable(value: Boolean | js.Any): Self = {
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
    def withSortable(value: Boolean | TreeListSortable): Self = {
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
    def withToolbar(value: js.Array[TreeListToolbarItem] | js.Any): Self = {
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

