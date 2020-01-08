package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_Columns
import typingsSlinky.primereact.Anon_Data
import typingsSlinky.primereact.Anon_DataField
import typingsSlinky.primereact.Anon_DataIndex
import typingsSlinky.primereact.Anon_DataOriginalEvent
import typingsSlinky.primereact.Anon_DataOriginalEventAny
import typingsSlinky.primereact.Anon_Delta
import typingsSlinky.primereact.Anon_DragIndex
import typingsSlinky.primereact.Anon_First
import typingsSlinky.primereact.Anon_MultiSortMeta
import typingsSlinky.primereact.Anon_OriginalEventValue
import typingsSlinky.primereact.componentsDatatableDataTableMod.DataTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DataTable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.datatableMod.DataTable] {
  @JSImport("primereact/datatable", "DataTable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, onContextMenu, rows */
  def apply(
    alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined,
    autoLayout: js.UndefOr[Boolean] = js.undefined,
    columnResizeMode: String = null,
    compareSelectionBy: String = null,
    contextMenuSelection: js.Any = null,
    csvSeparator: String = null,
    currentPageReportTemplate: String = null,
    dataKey: String = null,
    defaultSortOrder: Int | Double = null,
    editMode: String = null,
    emptyMessage: String = null,
    expandedRows: js.Array[_] = null,
    exportFilename: String = null,
    exportFunction: /* e */ Anon_DataField => _ = null,
    filters: js.Object = null,
    first: Int | Double = null,
    footer: js.Any = null,
    footerColumnGroup: js.Any = null,
    frozenFooterColumnGroup: js.Any = null,
    frozenHeaderColumnGroup: js.Any = null,
    frozenValue: js.Array[_] = null,
    frozenWidth: String = null,
    globalFilter: js.Any = null,
    groupField: String = null,
    header: js.Any = null,
    headerColumnGroup: js.Any = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    multiSortMeta: js.Array[_] = null,
    onColReorder: /* e */ Anon_Columns => Unit = null,
    onColumnResizeEnd: /* e */ Anon_Delta => Unit = null,
    onContextMenuSelectionChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onFilter: /* filters */ js.Array[_] => Unit = null,
    onPage: /* e */ Anon_First => Unit = null,
    onRowClick: /* e */ Anon_DataIndex => Unit = null,
    onRowCollapse: /* e */ Anon_DataOriginalEventAny => Unit = null,
    onRowDoubleClick: /* e */ Anon_DataIndex => Unit = null,
    onRowEditCancel: /* e */ Anon_DataIndex => Unit = null,
    onRowEditInit: /* e */ Anon_DataOriginalEventAny => Unit = null,
    onRowEditSave: /* e */ Anon_DataOriginalEventAny => Unit = null,
    onRowExpand: /* e */ Anon_DataOriginalEventAny => Unit = null,
    onRowReorder: /* e */ Anon_DragIndex => Unit = null,
    onRowSelect: /* e */ Anon_DataOriginalEvent => Unit = null,
    onRowToggle: /* e */ Anon_Data => Unit = null,
    onRowUnselect: /* e */ Anon_DataOriginalEvent => Unit = null,
    onSelectionChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onSort: /* e */ Anon_MultiSortMeta => Unit = null,
    onValueChange: /* value */ js.Array[_] => Unit = null,
    onVirtualScroll: /* e */ Anon_First => Unit = null,
    pageLinkSize: Int | Double = null,
    paginator: js.UndefOr[Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: String = null,
    reorderableColumns: js.UndefOr[Boolean] = js.undefined,
    resizableColumns: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    rowClassName: /* rowData */ js.Any => js.Object = null,
    rowEditorValidator: /* rowData */ js.Any => Boolean = null,
    rowExpansionTemplate: /* data */ js.Any => js.UndefOr[typingsSlinky.react.reactMod._Global_.JSX.Element] = null,
    rowGroupFooterTemplate: (/* data */ js.Any, /* index */ Double) => js.UndefOr[TagMod[Any]] = null,
    rowGroupHeaderTemplate: (/* data */ js.Any, /* index */ Double) => js.UndefOr[TagMod[Any]] = null,
    rowGroupMode: String = null,
    rowsPerPageOptions: js.Array[Double] = null,
    scrollHeight: String = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    selection: js.Any = null,
    selectionMode: String = null,
    sortField: String = null,
    sortMode: String = null,
    sortOrder: Int | Double = null,
    stateKey: String = null,
    stateStorage: String = null,
    style: js.Object = null,
    tabIndex: String = null,
    tableClassName: String = null,
    tableStyle: js.Object = null,
    totalRecords: Int | Double = null,
    value: js.Array[_] = null,
    virtualRowHeight: Int | Double = null,
    virtualScroll: js.UndefOr[Boolean] = js.undefined,
    virtualScrollDelay: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.datatableMod.DataTable] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowPaginator)) __obj.updateDynamic("alwaysShowPaginator")(alwaysShowPaginator.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLayout)) __obj.updateDynamic("autoLayout")(autoLayout.asInstanceOf[js.Any])
    if (columnResizeMode != null) __obj.updateDynamic("columnResizeMode")(columnResizeMode.asInstanceOf[js.Any])
    if (compareSelectionBy != null) __obj.updateDynamic("compareSelectionBy")(compareSelectionBy.asInstanceOf[js.Any])
    if (contextMenuSelection != null) __obj.updateDynamic("contextMenuSelection")(contextMenuSelection.asInstanceOf[js.Any])
    if (csvSeparator != null) __obj.updateDynamic("csvSeparator")(csvSeparator.asInstanceOf[js.Any])
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (emptyMessage != null) __obj.updateDynamic("emptyMessage")(emptyMessage.asInstanceOf[js.Any])
    if (expandedRows != null) __obj.updateDynamic("expandedRows")(expandedRows.asInstanceOf[js.Any])
    if (exportFilename != null) __obj.updateDynamic("exportFilename")(exportFilename.asInstanceOf[js.Any])
    if (exportFunction != null) __obj.updateDynamic("exportFunction")(js.Any.fromFunction1(exportFunction))
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerColumnGroup != null) __obj.updateDynamic("footerColumnGroup")(footerColumnGroup.asInstanceOf[js.Any])
    if (frozenFooterColumnGroup != null) __obj.updateDynamic("frozenFooterColumnGroup")(frozenFooterColumnGroup.asInstanceOf[js.Any])
    if (frozenHeaderColumnGroup != null) __obj.updateDynamic("frozenHeaderColumnGroup")(frozenHeaderColumnGroup.asInstanceOf[js.Any])
    if (frozenValue != null) __obj.updateDynamic("frozenValue")(frozenValue.asInstanceOf[js.Any])
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth.asInstanceOf[js.Any])
    if (globalFilter != null) __obj.updateDynamic("globalFilter")(globalFilter.asInstanceOf[js.Any])
    if (groupField != null) __obj.updateDynamic("groupField")(groupField.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerColumnGroup != null) __obj.updateDynamic("headerColumnGroup")(headerColumnGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    if (multiSortMeta != null) __obj.updateDynamic("multiSortMeta")(multiSortMeta.asInstanceOf[js.Any])
    if (onColReorder != null) __obj.updateDynamic("onColReorder")(js.Any.fromFunction1(onColReorder))
    if (onColumnResizeEnd != null) __obj.updateDynamic("onColumnResizeEnd")(js.Any.fromFunction1(onColumnResizeEnd))
    if (onContextMenuSelectionChange != null) __obj.updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1(onContextMenuSelectionChange))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (onPage != null) __obj.updateDynamic("onPage")(js.Any.fromFunction1(onPage))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1(onRowClick))
    if (onRowCollapse != null) __obj.updateDynamic("onRowCollapse")(js.Any.fromFunction1(onRowCollapse))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction1(onRowDoubleClick))
    if (onRowEditCancel != null) __obj.updateDynamic("onRowEditCancel")(js.Any.fromFunction1(onRowEditCancel))
    if (onRowEditInit != null) __obj.updateDynamic("onRowEditInit")(js.Any.fromFunction1(onRowEditInit))
    if (onRowEditSave != null) __obj.updateDynamic("onRowEditSave")(js.Any.fromFunction1(onRowEditSave))
    if (onRowExpand != null) __obj.updateDynamic("onRowExpand")(js.Any.fromFunction1(onRowExpand))
    if (onRowReorder != null) __obj.updateDynamic("onRowReorder")(js.Any.fromFunction1(onRowReorder))
    if (onRowSelect != null) __obj.updateDynamic("onRowSelect")(js.Any.fromFunction1(onRowSelect))
    if (onRowToggle != null) __obj.updateDynamic("onRowToggle")(js.Any.fromFunction1(onRowToggle))
    if (onRowUnselect != null) __obj.updateDynamic("onRowUnselect")(js.Any.fromFunction1(onRowUnselect))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (onVirtualScroll != null) __obj.updateDynamic("onVirtualScroll")(js.Any.fromFunction1(onVirtualScroll))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginator)) __obj.updateDynamic("paginator")(paginator.asInstanceOf[js.Any])
    if (paginatorLeft != null) __obj.updateDynamic("paginatorLeft")(paginatorLeft.asInstanceOf[js.Any])
    if (paginatorPosition != null) __obj.updateDynamic("paginatorPosition")(paginatorPosition.asInstanceOf[js.Any])
    if (paginatorRight != null) __obj.updateDynamic("paginatorRight")(paginatorRight.asInstanceOf[js.Any])
    if (paginatorTemplate != null) __obj.updateDynamic("paginatorTemplate")(paginatorTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(reorderableColumns)) __obj.updateDynamic("reorderableColumns")(reorderableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (rowEditorValidator != null) __obj.updateDynamic("rowEditorValidator")(js.Any.fromFunction1(rowEditorValidator))
    if (rowExpansionTemplate != null) __obj.updateDynamic("rowExpansionTemplate")(js.Any.fromFunction1(rowExpansionTemplate))
    if (rowGroupFooterTemplate != null) __obj.updateDynamic("rowGroupFooterTemplate")(js.Any.fromFunction2(rowGroupFooterTemplate))
    if (rowGroupHeaderTemplate != null) __obj.updateDynamic("rowGroupHeaderTemplate")(js.Any.fromFunction2(rowGroupHeaderTemplate))
    if (rowGroupMode != null) __obj.updateDynamic("rowGroupMode")(rowGroupMode.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortMode != null) __obj.updateDynamic("sortMode")(sortMode.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (stateKey != null) __obj.updateDynamic("stateKey")(stateKey.asInstanceOf[js.Any])
    if (stateStorage != null) __obj.updateDynamic("stateStorage")(stateStorage.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (virtualRowHeight != null) __obj.updateDynamic("virtualRowHeight")(virtualRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualScroll)) __obj.updateDynamic("virtualScroll")(virtualScroll.asInstanceOf[js.Any])
    if (virtualScrollDelay != null) __obj.updateDynamic("virtualScrollDelay")(virtualScrollDelay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.datatableMod.DataTable] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.datatableMod.DataTable](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DataTableProps
}

