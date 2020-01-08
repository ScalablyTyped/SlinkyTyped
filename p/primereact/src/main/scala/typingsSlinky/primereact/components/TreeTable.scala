package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_ColumnsDragIndex
import typingsSlinky.primereact.Anon_Delta
import typingsSlinky.primereact.Anon_First
import typingsSlinky.primereact.Anon_MultiSortMeta
import typingsSlinky.primereact.Anon_NodeOriginalEvent
import typingsSlinky.primereact.Anon_OriginalEventValue
import typingsSlinky.primereact.componentsTreenodeTreeNodeMod.TreeNode
import typingsSlinky.primereact.componentsTreetableTreeTableMod.TreeTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeTable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.treetableMod.TreeTable] {
  @JSImport("primereact/treetable", "TreeTable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, onContextMenu, onSelect, rows */
  def apply(
    alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined,
    autoLayout: js.UndefOr[Boolean] = js.undefined,
    columnResizeMode: String = null,
    contextMenuSelectionKey: js.Any = null,
    currentPageReportTemplate: String = null,
    defaultSortOrder: Int | Double = null,
    emptyMessage: String = null,
    expandedKeys: js.Any = null,
    filterMode: String = null,
    filters: js.Object = null,
    first: Int | Double = null,
    footer: js.Any = null,
    footerColumnGroup: js.Any = null,
    frozenFooterColumnGroup: js.Any = null,
    frozenHeaderColumnGroup: js.Any = null,
    frozenWidth: String = null,
    globalFilter: js.Any = null,
    header: js.Any = null,
    headerColumnGroup: js.Any = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    multiSortMeta: js.Array[_] = null,
    onColReorder: /* e */ Anon_ColumnsDragIndex => Unit = null,
    onCollapse: /* e */ Anon_NodeOriginalEvent => Unit = null,
    onColumnResizeEnd: /* e */ Anon_Delta => Unit = null,
    onContextMenuSelectionChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onExpand: /* e */ Anon_NodeOriginalEvent => Unit = null,
    onFilter: /* filters */ js.Array[_] => Unit = null,
    onPage: /* e */ Anon_First => Unit = null,
    onRowClick: /* e */ Anon_NodeOriginalEvent => Unit = null,
    onSelectionChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onSort: /* e */ Anon_MultiSortMeta => Unit = null,
    onToggle: /* e */ Anon_OriginalEventValue => Unit = null,
    onUnselect: /* e */ Anon_NodeOriginalEvent => Unit = null,
    pageLinkSize: Int | Double = null,
    paginator: js.UndefOr[Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: String = null,
    propagateSelectionDown: js.UndefOr[Boolean] = js.undefined,
    propagateSelectionUp: js.UndefOr[Boolean] = js.undefined,
    reorderableColumns: js.UndefOr[Boolean] = js.undefined,
    resizableColumns: js.UndefOr[Boolean] = js.undefined,
    rowClassName: /* rowData */ js.Any => js.Object = null,
    rowsPerPageOptions: js.Array[Double] = null,
    scrollHeight: String = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    selectionKeys: js.Any = null,
    selectionMode: String = null,
    sortField: String = null,
    sortMode: String = null,
    sortOrder: Int | Double = null,
    style: js.Object = null,
    tabIndex: String = null,
    tableClassName: String = null,
    tableStyle: js.Object = null,
    totalRecords: Int | Double = null,
    value: js.Array[TreeNode] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.treetableMod.TreeTable] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowPaginator)) __obj.updateDynamic("alwaysShowPaginator")(alwaysShowPaginator.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLayout)) __obj.updateDynamic("autoLayout")(autoLayout.asInstanceOf[js.Any])
    if (columnResizeMode != null) __obj.updateDynamic("columnResizeMode")(columnResizeMode.asInstanceOf[js.Any])
    if (contextMenuSelectionKey != null) __obj.updateDynamic("contextMenuSelectionKey")(contextMenuSelectionKey.asInstanceOf[js.Any])
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate.asInstanceOf[js.Any])
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (emptyMessage != null) __obj.updateDynamic("emptyMessage")(emptyMessage.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerColumnGroup != null) __obj.updateDynamic("footerColumnGroup")(footerColumnGroup.asInstanceOf[js.Any])
    if (frozenFooterColumnGroup != null) __obj.updateDynamic("frozenFooterColumnGroup")(frozenFooterColumnGroup.asInstanceOf[js.Any])
    if (frozenHeaderColumnGroup != null) __obj.updateDynamic("frozenHeaderColumnGroup")(frozenHeaderColumnGroup.asInstanceOf[js.Any])
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth.asInstanceOf[js.Any])
    if (globalFilter != null) __obj.updateDynamic("globalFilter")(globalFilter.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerColumnGroup != null) __obj.updateDynamic("headerColumnGroup")(headerColumnGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    if (multiSortMeta != null) __obj.updateDynamic("multiSortMeta")(multiSortMeta.asInstanceOf[js.Any])
    if (onColReorder != null) __obj.updateDynamic("onColReorder")(js.Any.fromFunction1(onColReorder))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onColumnResizeEnd != null) __obj.updateDynamic("onColumnResizeEnd")(js.Any.fromFunction1(onColumnResizeEnd))
    if (onContextMenuSelectionChange != null) __obj.updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1(onContextMenuSelectionChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (onPage != null) __obj.updateDynamic("onPage")(js.Any.fromFunction1(onPage))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1(onRowClick))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1(onUnselect))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginator)) __obj.updateDynamic("paginator")(paginator.asInstanceOf[js.Any])
    if (paginatorLeft != null) __obj.updateDynamic("paginatorLeft")(paginatorLeft.asInstanceOf[js.Any])
    if (paginatorPosition != null) __obj.updateDynamic("paginatorPosition")(paginatorPosition.asInstanceOf[js.Any])
    if (paginatorRight != null) __obj.updateDynamic("paginatorRight")(paginatorRight.asInstanceOf[js.Any])
    if (paginatorTemplate != null) __obj.updateDynamic("paginatorTemplate")(paginatorTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSelectionDown)) __obj.updateDynamic("propagateSelectionDown")(propagateSelectionDown.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSelectionUp)) __obj.updateDynamic("propagateSelectionUp")(propagateSelectionUp.asInstanceOf[js.Any])
    if (!js.isUndefined(reorderableColumns)) __obj.updateDynamic("reorderableColumns")(reorderableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selectionKeys != null) __obj.updateDynamic("selectionKeys")(selectionKeys.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortMode != null) __obj.updateDynamic("sortMode")(sortMode.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.treetableMod.TreeTable] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.treetableMod.TreeTable](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TreeTableProps
}

