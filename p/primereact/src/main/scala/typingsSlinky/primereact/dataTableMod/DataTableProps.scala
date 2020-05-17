package typingsSlinky.primereact.dataTableMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.primereact.anon.Columns
import typingsSlinky.primereact.anon.Data
import typingsSlinky.primereact.anon.DataField
import typingsSlinky.primereact.anon.DataIndex
import typingsSlinky.primereact.anon.DataOriginalEvent
import typingsSlinky.primereact.anon.Delta
import typingsSlinky.primereact.anon.DragIndex
import typingsSlinky.primereact.anon.First
import typingsSlinky.primereact.anon.MultiSortMeta
import typingsSlinky.primereact.anon.Type
import typingsSlinky.primereact.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTableProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[Boolean] = js.native
  var autoLayout: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var columnResizeMode: js.UndefOr[String] = js.native
  var compareSelectionBy: js.UndefOr[String] = js.native
  var contextMenuSelection: js.UndefOr[js.Any] = js.native
  var csvSeparator: js.UndefOr[String] = js.native
  var currentPageReportTemplate: js.UndefOr[String] = js.native
  var dataKey: js.UndefOr[String] = js.native
  var defaultSortOrder: js.UndefOr[Double] = js.native
  var editMode: js.UndefOr[String] = js.native
  var emptyMessage: js.UndefOr[String] = js.native
  var expandableRowGroups: js.UndefOr[Boolean] = js.native
  var expandedRows: js.UndefOr[js.Array[_]] = js.native
  var exportFilename: js.UndefOr[String] = js.native
  var exportFunction: js.UndefOr[js.Function1[/* e */ DataField, _]] = js.native
  var filters: js.UndefOr[js.Object] = js.native
  var first: js.UndefOr[Double] = js.native
  var footer: js.UndefOr[js.Any] = js.native
  var footerColumnGroup: js.UndefOr[js.Any] = js.native
  var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.native
  var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.native
  var frozenValue: js.UndefOr[js.Array[_]] = js.native
  var frozenWidth: js.UndefOr[String] = js.native
  var globalFilter: js.UndefOr[js.Any] = js.native
  var groupField: js.UndefOr[String] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var headerColumnGroup: js.UndefOr[js.Any] = js.native
  var id: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var loadingIcon: js.UndefOr[String] = js.native
  var metaKeySelection: js.UndefOr[Boolean] = js.native
  var multiSortMeta: js.UndefOr[js.Array[_]] = js.native
  var onColReorder: js.UndefOr[js.Function1[/* e */ Columns, Unit]] = js.native
  var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ Delta, Unit]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.native
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[_], Unit]] = js.native
  var onPage: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.native
  var onRowClick: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.native
  var onRowCollapse: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.native
  var onRowDoubleClick: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.native
  var onRowEditCancel: js.UndefOr[js.Function1[/* e */ DataIndex, Unit]] = js.native
  var onRowEditInit: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.native
  var onRowEditSave: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.native
  var onRowExpand: js.UndefOr[js.Function1[/* e */ DataOriginalEvent, Unit]] = js.native
  var onRowReorder: js.UndefOr[js.Function1[/* e */ DragIndex, Unit]] = js.native
  var onRowSelect: js.UndefOr[js.Function1[/* e */ Type, Unit]] = js.native
  var onRowToggle: js.UndefOr[js.Function1[/* e */ Data, Unit]] = js.native
  var onRowUnselect: js.UndefOr[js.Function1[/* e */ Type, Unit]] = js.native
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onSort: js.UndefOr[js.Function1[/* e */ MultiSortMeta, Unit]] = js.native
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Array[_], Unit]] = js.native
  var onVirtualScroll: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.native
  var pageLinkSize: js.UndefOr[Double] = js.native
  var paginator: js.UndefOr[Boolean] = js.native
  var paginatorLeft: js.UndefOr[js.Any] = js.native
  var paginatorPosition: js.UndefOr[String] = js.native
  var paginatorRight: js.UndefOr[js.Any] = js.native
  var paginatorTemplate: js.UndefOr[String] = js.native
  var removableSort: js.UndefOr[Boolean] = js.native
  var reorderableColumns: js.UndefOr[Boolean] = js.native
  var resizableColumns: js.UndefOr[Boolean] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.native
  var rowEditorValidator: js.UndefOr[js.Function1[/* rowData */ js.Any, Boolean]] = js.native
  var rowExpansionTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[ReactElement]]] = js.native
  var rowGroupFooterTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[TagMod[Any]]]] = js.native
  var rowGroupHeaderTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[TagMod[Any]]]] = js.native
  var rowGroupMode: js.UndefOr[String] = js.native
  var rows: js.UndefOr[Double] = js.native
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
  var scrollHeight: js.UndefOr[String] = js.native
  var scrollable: js.UndefOr[Boolean] = js.native
  var selection: js.UndefOr[js.Any] = js.native
  var selectionMode: js.UndefOr[String] = js.native
  var sortField: js.UndefOr[String] = js.native
  var sortMode: js.UndefOr[String] = js.native
  var sortOrder: js.UndefOr[Double] = js.native
  var stateKey: js.UndefOr[String] = js.native
  var stateStorage: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabIndex: js.UndefOr[String] = js.native
  var tableClassName: js.UndefOr[String] = js.native
  var tableStyle: js.UndefOr[js.Object] = js.native
  var totalRecords: js.UndefOr[Double] = js.native
  var value: js.UndefOr[js.Array[_]] = js.native
  var virtualRowHeight: js.UndefOr[Double] = js.native
  var virtualScroll: js.UndefOr[Boolean] = js.native
  var virtualScrollDelay: js.UndefOr[Double] = js.native
}

object DataTableProps {
  @scala.inline
  def apply(): DataTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTableProps]
  }
  @scala.inline
  implicit class DataTablePropsOps[Self <: DataTableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysShowPaginator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowPaginator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowPaginator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowPaginator")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResizeMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnResizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareSelectionBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareSelectionBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareSelectionBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareSelectionBy")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuSelection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPageReportTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageReportTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageReportTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageReportTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withEditMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandableRowGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandableRowGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withExportFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withExportFunction(value: /* e */ DataField => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterColumnGroup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerColumnGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterColumnGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerColumnGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenFooterColumnGroup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenFooterColumnGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenFooterColumnGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenFooterColumnGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenHeaderColumnGroup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenHeaderColumnGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenHeaderColumnGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenHeaderColumnGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenValue(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupField")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderColumnGroup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColumnGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColumnGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColumnGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaKeySelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKeySelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaKeySelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKeySelection")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSortMeta(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSortMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSortMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSortMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColReorder(value: /* e */ Columns => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColReorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnResizeEnd(value: /* e */ Delta => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResizeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnResizeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResizeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: /* e */ DataOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenuSelectionChange(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenuSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilter(value: /* filters */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPage(value: /* e */ First => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowClick(value: /* e */ DataIndex => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowCollapse(value: /* e */ DataOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDoubleClick(value: /* e */ DataIndex => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowEditCancel(value: /* e */ DataIndex => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowEditCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowEditInit(value: /* e */ DataOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowEditInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowEditSave(value: /* e */ DataOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditSave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowEditSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditSave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowExpand(value: /* e */ DataOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowReorder(value: /* e */ DragIndex => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowReorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowSelect(value: /* e */ Type => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowToggle(value: /* e */ Data => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowUnselect(value: /* e */ Type => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowUnselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowUnselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSort(value: /* e */ MultiSortMeta => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChange(value: /* value */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVirtualScroll(value: /* e */ First => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVirtualScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLinkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLinkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLinkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLinkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginator")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginatorLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginatorLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginatorPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginatorPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginatorRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginatorRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginatorTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginatorTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginatorTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovableSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removableSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovableSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removableSort")(js.undefined)
        ret
    }
    @scala.inline
    def withReorderableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReorderableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withResizableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClassName(value: /* rowData */ js.Any => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEditorValidator(value: /* rowData */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditorValidator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowEditorValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditorValidator")(js.undefined)
        ret
    }
    @scala.inline
    def withRowExpansionTemplate(value: /* data */ js.Any => js.UndefOr[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpansionTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowExpansionTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpansionTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroupFooterTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupFooterTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowGroupFooterTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupFooterTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroupHeaderTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupHeaderTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowGroupHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroupMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupMode")(js.undefined)
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
    def withRowsPerPageOptions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPageOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsPerPageOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPageOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollable(value: Boolean): Self = {
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
    def withSelection(value: js.Any): Self = {
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
    def withSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSortField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(js.undefined)
        ret
    }
    @scala.inline
    def withSortMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStateKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStateStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
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
    def withTabIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTableClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRecords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualScrollDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScrollDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualScrollDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScrollDelay")(js.undefined)
        ret
    }
  }
  
}

