package typingsSlinky.primereact.treeTableMod

import typingsSlinky.primereact.anon.Delta
import typingsSlinky.primereact.anon.DropIndex
import typingsSlinky.primereact.anon.First
import typingsSlinky.primereact.anon.MultiSortMeta
import typingsSlinky.primereact.anon.Node
import typingsSlinky.primereact.anon.NodeOriginalEvent
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.treeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeTableProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[Boolean] = js.native
  var autoLayout: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var columnResizeMode: js.UndefOr[String] = js.native
  var contextMenuSelectionKey: js.UndefOr[js.Any] = js.native
  var currentPageReportTemplate: js.UndefOr[String] = js.native
  var defaultSortOrder: js.UndefOr[Double] = js.native
  var emptyMessage: js.UndefOr[String] = js.native
  var expandedKeys: js.UndefOr[js.Any] = js.native
  var filterMode: js.UndefOr[String] = js.native
  var filters: js.UndefOr[js.Object] = js.native
  var first: js.UndefOr[Double] = js.native
  var footer: js.UndefOr[js.Any] = js.native
  var footerColumnGroup: js.UndefOr[js.Any] = js.native
  var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.native
  var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.native
  var frozenWidth: js.UndefOr[String] = js.native
  var globalFilter: js.UndefOr[js.Any] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var headerColumnGroup: js.UndefOr[js.Any] = js.native
  var id: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var loadingIcon: js.UndefOr[String] = js.native
  var metaKeySelection: js.UndefOr[Boolean] = js.native
  var multiSortMeta: js.UndefOr[js.Array[_]] = js.native
  var onColReorder: js.UndefOr[js.Function1[/* e */ DropIndex, Unit]] = js.native
  var onCollapse: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ Delta, Unit]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.native
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onExpand: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[_], Unit]] = js.native
  var onPage: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.native
  var onRowClick: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onSort: js.UndefOr[js.Function1[/* e */ MultiSortMeta, Unit]] = js.native
  var onToggle: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onUnselect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.native
  var pageLinkSize: js.UndefOr[Double] = js.native
  var paginator: js.UndefOr[Boolean] = js.native
  var paginatorLeft: js.UndefOr[js.Any] = js.native
  var paginatorPosition: js.UndefOr[String] = js.native
  var paginatorRight: js.UndefOr[js.Any] = js.native
  var paginatorTemplate: js.UndefOr[String] = js.native
  var propagateSelectionDown: js.UndefOr[Boolean] = js.native
  var propagateSelectionUp: js.UndefOr[Boolean] = js.native
  var reorderableColumns: js.UndefOr[Boolean] = js.native
  var resizableColumns: js.UndefOr[Boolean] = js.native
  var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.native
  var rows: js.UndefOr[Double] = js.native
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
  var scrollHeight: js.UndefOr[String] = js.native
  var scrollable: js.UndefOr[Boolean] = js.native
  var selectionKeys: js.UndefOr[js.Any] = js.native
  var selectionMode: js.UndefOr[String] = js.native
  var sortField: js.UndefOr[String] = js.native
  var sortMode: js.UndefOr[String] = js.native
  var sortOrder: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabIndex: js.UndefOr[String] = js.native
  var tableClassName: js.UndefOr[String] = js.native
  var tableStyle: js.UndefOr[js.Object] = js.native
  var totalRecords: js.UndefOr[Double] = js.native
  var value: js.UndefOr[js.Array[TreeNode]] = js.native
}

object TreeTableProps {
  @scala.inline
  def apply(): TreeTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeTableProps]
  }
  @scala.inline
  implicit class TreeTablePropsOps[Self <: TreeTableProps] (val x: Self) extends AnyVal {
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
    def withContextMenuSelectionKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSelectionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuSelectionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSelectionKey")(js.undefined)
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
    def withExpandedKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(js.undefined)
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
    def withOnColReorder(value: /* e */ DropIndex => Unit): Self = {
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
    def withOnCollapse(value: /* e */ NodeOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
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
    def withOnContextMenu(value: /* e */ Node => Unit): Self = {
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
    def withOnExpand(value: /* e */ NodeOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
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
    def withOnRowClick(value: /* e */ NodeOriginalEvent => Unit): Self = {
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
    def withOnSelect(value: /* e */ NodeOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
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
    def withOnToggle(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnselect(value: /* e */ NodeOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnselect")(js.undefined)
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
    def withPropagateSelectionDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSelectionDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagateSelectionDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSelectionDown")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagateSelectionUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSelectionUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagateSelectionUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSelectionUp")(js.undefined)
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
    def withSelectionKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionKeys")(js.undefined)
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
    def withValue(value: js.Array[TreeNode]): Self = {
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
  }
  
}

