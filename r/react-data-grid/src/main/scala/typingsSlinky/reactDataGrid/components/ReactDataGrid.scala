package typingsSlinky.reactDataGrid.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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
import typingsSlinky.reactDataGrid.anon.EnableShiftSelect
import typingsSlinky.reactDataGrid.anon.Idx
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

object ReactDataGrid {
  @JSImport("react-data-grid", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^[js.Any]] {
    @scala.inline
    def cellNavigationMode(value: none_ | loopOverRow | changeRow): this.type = set("cellNavigationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def columns(value: js.Array[Column[T]]): this.type = set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def contextMenu(value: ReactElement): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyRowsViewFunctionComponent(value: ReactComponentClass[_]): this.type = set("emptyRowsView", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyRowsViewComponentClass(value: ReactComponentClass[_]): this.type = set("emptyRowsView", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyRowsView(value: ReactComponentClass[_]): this.type = set("emptyRowsView", value.asInstanceOf[js.Any])
    @scala.inline
    def enableCellSelect(value: Boolean): this.type = set("enableCellSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def enableDragAndDrop(value: Boolean): this.type = set("enableDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def enableRowSelect(value: Boolean | single | multi): this.type = set("enableRowSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def getCellActions(value: (/* column */ Column[T], T) => js.Array[ActionButton | ActionMenu]): this.type = set("getCellActions", js.Any.fromFunction2(value))
    @scala.inline
    def getSubRowDetails(value: T => SubRowDetails[_]): this.type = set("getSubRowDetails", js.Any.fromFunction1(value))
    @scala.inline
    def getValidFilterValues(value: /* columnKey */ String => js.Array[_]): this.type = set("getValidFilterValues", js.Any.fromFunction1(value))
    @scala.inline
    def headerFiltersHeight(value: Double): this.type = set("headerFiltersHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRowHeight(value: Double): this.type = set("headerRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minColumnWidth(value: Double): this.type = set("minColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onAddFilter(value: /* filter */ Filter => Unit): this.type = set("onAddFilter", js.Any.fromFunction1(value))
    @scala.inline
    def onCellCopyPaste(value: /* e */ CellCopyPasteEvent => Unit): this.type = set("onCellCopyPaste", js.Any.fromFunction1(value))
    @scala.inline
    def onCellDeSelected(value: /* coordinates */ Idx => Unit): this.type = set("onCellDeSelected", js.Any.fromFunction1(value))
    @scala.inline
    def onCellExpand(value: /* e */ CellExpandEvent[T] => Unit): this.type = set("onCellExpand", js.Any.fromFunction1(value))
    @scala.inline
    def onCellSelected(value: /* coordinates */ Idx => Unit): this.type = set("onCellSelected", js.Any.fromFunction1(value))
    @scala.inline
    def onCellsDragged(value: /* e */ CellDragEvent => Unit): this.type = set("onCellsDragged", js.Any.fromFunction1(value))
    @scala.inline
    def onClearFilters(value: () => Unit): this.type = set("onClearFilters", js.Any.fromFunction0(value))
    @scala.inline
    def onColumnResize(value: (/* index */ Double, /* width */ Double) => Unit): this.type = set("onColumnResize", js.Any.fromFunction2(value))
    @scala.inline
    def onDragHandleDoubleClick(value: /* e */ DragHandleDoubleClickEvent[T] => Unit): this.type = set("onDragHandleDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onGridRowsUpdated(value: /* e */ GridRowsUpdatedEvent[T] => Unit): this.type = set("onGridRowsUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def onGridSort(value: (/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE) => Unit): this.type = set("onGridSort", js.Any.fromFunction2(value))
    @scala.inline
    def onRowClick(value: (/* rowIdx */ Double, T) => Unit): this.type = set("onRowClick", js.Any.fromFunction2(value))
    @scala.inline
    def onRowExpandToggle(value: /* props */ OnRowExpandToggle => Unit): this.type = set("onRowExpandToggle", js.Any.fromFunction1(value))
    @scala.inline
    def onRowSelect(value: /* rows */ js.Array[T] => Unit): this.type = set("onRowSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onRowUpdated(value: /* e */ RowUpdateEvent[T] => Unit): this.type = set("onRowUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def onScroll(value: /* scrollState */ ScrollState => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def rowActionsCellFunctionComponent(value: ReactComponentClass[_]): this.type = set("rowActionsCell", value.asInstanceOf[js.Any])
    @scala.inline
    def rowActionsCellComponentClass(value: ReactComponentClass[_]): this.type = set("rowActionsCell", value.asInstanceOf[js.Any])
    @scala.inline
    def rowActionsCell(value: ReactComponentClass[_]): this.type = set("rowActionsCell", value.asInstanceOf[js.Any])
    @scala.inline
    def rowGroupRendererFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("rowGroupRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def rowGroupRendererComponentClass(value: ReactComponentClass[js.Object]): this.type = set("rowGroupRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def rowGroupRenderer(value: ReactComponentClass[js.Object]): this.type = set("rowGroupRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def rowKey(value: String): this.type = set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def rowRendererReactElement(value: ReactElement): this.type = set("rowRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def rowRendererFunctionComponent(value: ReactComponentClass[_]): this.type = set("rowRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def rowRendererComponentClass(value: ReactComponentClass[_]): this.type = set("rowRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def rowRenderer(value: ReactElement | ReactComponentClass[_]): this.type = set("rowRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def rowScrollTimeout(value: Double): this.type = set("rowScrollTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def rowSelection(value: EnableShiftSelect[T]): this.type = set("rowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def selectAllRendererFunctionComponent(value: ReactComponentClass[_]): this.type = set("selectAllRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def selectAllRendererComponentClass(value: ReactComponentClass[_]): this.type = set("selectAllRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def selectAllRenderer(value: ReactComponentClass[_]): this.type = set("selectAllRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def sortColumn(value: String): this.type = set("sortColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def sortDirection(value: ASC | DESC | NONE): this.type = set("sortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbar(value: ReactElement): this.type = set("toolbar", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: GridProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]), rowsCount: Double): Builder[T] = {
    val __props = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[GridProps[T]]))
  }
}

