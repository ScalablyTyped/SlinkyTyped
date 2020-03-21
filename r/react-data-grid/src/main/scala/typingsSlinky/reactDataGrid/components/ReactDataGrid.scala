package typingsSlinky.reactDataGrid.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ActionButton
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ActionMenu
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.CellCopyPasteEvent
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.CellDragEvent
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.CellExpandEvent
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.Column
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.DragHandleDoubleClickEvent
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.Filter
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.GridProps
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.GridRowsUpdatedEvent
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.OnRowExpandToggle
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.RowUpdateEvent
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ScrollState
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.SubRowDetails
import typingsSlinky.reactDataGrid.AnonEnableShiftSelect
import typingsSlinky.reactDataGrid.AnonIdx
import typingsSlinky.reactDataGrid.mod.^
import typingsSlinky.reactDataGrid.reactDataGridStrings.ASC
import typingsSlinky.reactDataGrid.reactDataGridStrings.DESC
import typingsSlinky.reactDataGrid.reactDataGridStrings.NONE
import typingsSlinky.reactDataGrid.reactDataGridStrings.changeRow
import typingsSlinky.reactDataGrid.reactDataGridStrings.loopOverRow
import typingsSlinky.reactDataGrid.reactDataGridStrings.multi
import typingsSlinky.reactDataGrid.reactDataGridStrings.none_
import typingsSlinky.reactDataGrid.reactDataGridStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDataGrid
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^[js.Any]] {
  @JSImport("react-data-grid", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]),
    rowsCount: Double,
    cellNavigationMode: none_ | loopOverRow | changeRow = null,
    columns: js.Array[Column[T]] = null,
    contextMenu: ReactElement = null,
    emptyRowsView: ReactComponentClass[_] = null,
    enableCellSelect: js.UndefOr[Boolean] = js.undefined,
    enableDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    enableRowSelect: Boolean | single | multi = null,
    getCellActions: (/* column */ Column[T], T) => js.Array[ActionButton | ActionMenu] = null,
    getSubRowDetails: T => SubRowDetails[_] = null,
    getValidFilterValues: /* columnKey */ String => js.Array[_] = null,
    headerFiltersHeight: Int | Double = null,
    headerRowHeight: Int | Double = null,
    minColumnWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    onAddFilter: /* filter */ Filter => Unit = null,
    onCellCopyPaste: /* e */ CellCopyPasteEvent => Unit = null,
    onCellDeSelected: /* coordinates */ AnonIdx => Unit = null,
    onCellExpand: /* e */ CellExpandEvent[T] => Unit = null,
    onCellSelected: /* coordinates */ AnonIdx => Unit = null,
    onCellsDragged: /* e */ CellDragEvent => Unit = null,
    onClearFilters: () => Unit = null,
    onColumnResize: (/* index */ Double, /* width */ Double) => Unit = null,
    onDragHandleDoubleClick: /* e */ DragHandleDoubleClickEvent[T] => Unit = null,
    onGridRowsUpdated: /* e */ GridRowsUpdatedEvent[T] => Unit = null,
    onGridSort: (/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE) => Unit = null,
    onRowClick: (/* rowIdx */ Double, T) => Unit = null,
    onRowExpandToggle: /* props */ OnRowExpandToggle => Unit = null,
    onRowSelect: /* rows */ js.Array[T] => Unit = null,
    onRowUpdated: /* e */ RowUpdateEvent[T] => Unit = null,
    onScroll: /* scrollState */ ScrollState => Unit = null,
    rowActionsCell: ReactComponentClass[_] = null,
    rowGroupRenderer: ReactComponentClass[js.Object] = null,
    rowHeight: Int | Double = null,
    rowKey: String = null,
    rowRenderer: ReactElement | ReactComponentClass[_] = null,
    rowScrollTimeout: Int | Double = null,
    rowSelection: AnonEnableShiftSelect[T] = null,
    selectAllRenderer: ReactComponentClass[_] = null,
    sortColumn: String = null,
    sortDirection: ASC | DESC | NONE = null,
    toolbar: ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^[js.Any]] = {
    val __obj = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any])
    if (cellNavigationMode != null) __obj.updateDynamic("cellNavigationMode")(cellNavigationMode.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (emptyRowsView != null) __obj.updateDynamic("emptyRowsView")(emptyRowsView.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellSelect)) __obj.updateDynamic("enableCellSelect")(enableCellSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDragAndDrop)) __obj.updateDynamic("enableDragAndDrop")(enableDragAndDrop.asInstanceOf[js.Any])
    if (enableRowSelect != null) __obj.updateDynamic("enableRowSelect")(enableRowSelect.asInstanceOf[js.Any])
    if (getCellActions != null) __obj.updateDynamic("getCellActions")(js.Any.fromFunction2(getCellActions))
    if (getSubRowDetails != null) __obj.updateDynamic("getSubRowDetails")(js.Any.fromFunction1(getSubRowDetails))
    if (getValidFilterValues != null) __obj.updateDynamic("getValidFilterValues")(js.Any.fromFunction1(getValidFilterValues))
    if (headerFiltersHeight != null) __obj.updateDynamic("headerFiltersHeight")(headerFiltersHeight.asInstanceOf[js.Any])
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onAddFilter != null) __obj.updateDynamic("onAddFilter")(js.Any.fromFunction1(onAddFilter))
    if (onCellCopyPaste != null) __obj.updateDynamic("onCellCopyPaste")(js.Any.fromFunction1(onCellCopyPaste))
    if (onCellDeSelected != null) __obj.updateDynamic("onCellDeSelected")(js.Any.fromFunction1(onCellDeSelected))
    if (onCellExpand != null) __obj.updateDynamic("onCellExpand")(js.Any.fromFunction1(onCellExpand))
    if (onCellSelected != null) __obj.updateDynamic("onCellSelected")(js.Any.fromFunction1(onCellSelected))
    if (onCellsDragged != null) __obj.updateDynamic("onCellsDragged")(js.Any.fromFunction1(onCellsDragged))
    if (onClearFilters != null) __obj.updateDynamic("onClearFilters")(js.Any.fromFunction0(onClearFilters))
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(js.Any.fromFunction2(onColumnResize))
    if (onDragHandleDoubleClick != null) __obj.updateDynamic("onDragHandleDoubleClick")(js.Any.fromFunction1(onDragHandleDoubleClick))
    if (onGridRowsUpdated != null) __obj.updateDynamic("onGridRowsUpdated")(js.Any.fromFunction1(onGridRowsUpdated))
    if (onGridSort != null) __obj.updateDynamic("onGridSort")(js.Any.fromFunction2(onGridSort))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowExpandToggle != null) __obj.updateDynamic("onRowExpandToggle")(js.Any.fromFunction1(onRowExpandToggle))
    if (onRowSelect != null) __obj.updateDynamic("onRowSelect")(js.Any.fromFunction1(onRowSelect))
    if (onRowUpdated != null) __obj.updateDynamic("onRowUpdated")(js.Any.fromFunction1(onRowUpdated))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (rowActionsCell != null) __obj.updateDynamic("rowActionsCell")(rowActionsCell.asInstanceOf[js.Any])
    if (rowGroupRenderer != null) __obj.updateDynamic("rowGroupRenderer")(rowGroupRenderer.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(rowRenderer.asInstanceOf[js.Any])
    if (rowScrollTimeout != null) __obj.updateDynamic("rowScrollTimeout")(rowScrollTimeout.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection.asInstanceOf[js.Any])
    if (selectAllRenderer != null) __obj.updateDynamic("selectAllRenderer")(selectAllRenderer.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDataGrid.mod.^[js.Any]]]
  }
  type Props = GridProps[js.Any]
}

