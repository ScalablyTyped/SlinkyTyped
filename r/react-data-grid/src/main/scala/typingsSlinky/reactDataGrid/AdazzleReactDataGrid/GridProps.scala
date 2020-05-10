package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactDataGrid.AnonEnableShiftSelect
import typingsSlinky.reactDataGrid.AnonIdx
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

@js.native
trait GridProps[T] extends js.Object {
  /**
    * Controls what happens when the user navigates beyond the first or last cells.
    * 'loopOverRow' will navigate to the beginning/end of the current row.
    * 'changeRow' will navigate to the beginning of the next row or the end of the last.
    * 'none' will do nothing.
    * @default none
    */
  var cellNavigationMode: js.UndefOr[none_ | loopOverRow | changeRow] = js.native
  /**
    * The columns to render.
    */
  var columns: js.UndefOr[js.Array[Column[T]]] = js.native
  /**
    * A context menu to disiplay when the user right-clicks a cell.
    * Consider using "react-contextmenu", included in "react-data-grid/addons".
    */
  var contextMenu: js.UndefOr[ReactElement] = js.native
  /**
    * A component to display when there are no rows to render.
    */
  var emptyRowsView: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Enables cells to be selected when clicked.
    * @default false
    */
  var enableCellSelect: js.UndefOr[Boolean] = js.native
  /**
    * Enables cells to be dragged and dropped
    * @default false
    */
  var enableDragAndDrop: js.UndefOr[Boolean] = js.native
  /**
    * When set to true or 'multi', enables multiple row select.
    * When set to 'single', enables single row select.
    * When set to false or not set, disables row select.
    * @default false
    */
  var enableRowSelect: js.UndefOr[Boolean | single | multi] = js.native
  var getCellActions: js.UndefOr[
    js.Function2[/* column */ Column[T], /* row */ T, js.Array[ActionButton | ActionMenu]]
  ] = js.native
  var getSubRowDetails: js.UndefOr[js.Function1[/* row */ T, SubRowDetails[_]]] = js.native
  /**
    * Responsible for returning an Array of values that can be used for filtering
    * a column that is column.filterable and using a column.filterRenderer that
    * displays a list of options.
    * @param columnKey the column key that we are looking to pull values from
    */
  var getValidFilterValues: js.UndefOr[js.Function1[/* columnKey */ String, js.Array[_]]] = js.native
  /**
    * The height of the header filter row in pixels.
    * @default 45
    */
  var headerFiltersHeight: js.UndefOr[Double] = js.native
  /**
    * The height of the header row in pixels.
    * @default rowHeight
    */
  var headerRowHeight: js.UndefOr[Double] = js.native
  /**
    * The minimum width of each column in pixels.
    * @default 80
    */
  var minColumnWidth: js.UndefOr[Double] = js.native
  /**
    * The minimum height of the entire grid in pixels.
    * @default 350
    */
  var minHeight: js.UndefOr[Double] = js.native
  /**
    * The minimum width of the entire grid in pixels.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Called when the user filters a column by some value.
    * Should restrict the rows in rowGetter to only things that match the filter.
    * @param filter The filter being added
    */
  var onAddFilter: js.UndefOr[js.Function1[/* filter */ Filter, Unit]] = js.native
  /**
    * Invoked when the user copies a value from one cell and pastes it into another (in the same column).
    * Should update the value of the cell in row e.toRow.
    * @param e Information about the event
    */
  var onCellCopyPaste: js.UndefOr[js.Function1[/* e */ CellCopyPasteEvent, Unit]] = js.native
  /**
    * Called when a cell is deselected.
    * @param coordinates The row and column indices of the deselected cell.
    */
  var onCellDeSelected: js.UndefOr[js.Function1[/* coordinates */ AnonIdx, Unit]] = js.native
  /**
    * Invoked when the user clicks on one cell to expand it.
    * @param e Information about the event
    */
  var onCellExpand: js.UndefOr[js.Function1[/* e */ CellExpandEvent[T], Unit]] = js.native
  /**
    * Called when a cell is selected.
    * @param coordinates The row and column indices of the selected cell.
    */
  var onCellSelected: js.UndefOr[js.Function1[/* coordinates */ AnonIdx, Unit]] = js.native
  /**
    * Invoked when the user pulls down the drag handle of an editable cell.
    * Should update the values of the selected cells.
    * @param e Information about the event
    */
  var onCellsDragged: js.UndefOr[js.Function1[/* e */ CellDragEvent, Unit]] = js.native
  /**
    * Called when the user clears all filters.
    * Should restore the rows in rowGetter to their original state.
    */
  var onClearFilters: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Invoked when a column has been resized.
    * @param index The index of the column
    * @param width The new width of the column
    */
  var onColumnResize: js.UndefOr[js.Function2[/* index */ Double, /* width */ Double, Unit]] = js.native
  /**
    * Invoked when the user double clicks on the drag handle of an editable cell.
    * Should update the values of the cells beneath the selected cell.
    * @param e Information about the event
    */
  var onDragHandleDoubleClick: js.UndefOr[js.Function1[/* e */ DragHandleDoubleClickEvent[T], Unit]] = js.native
  /**
    * Invoked after the user updates the grid rows in any way.
    * @param e Information about the event
    */
  var onGridRowsUpdated: js.UndefOr[js.Function1[/* e */ GridRowsUpdatedEvent[T], Unit]] = js.native
  /**
    * Called when the user sorts the grid by some column.
    * Should update the order of the rows returned by rowGetter.
    * @param sortColumn The name of the column being sorted by
    * @param sortDirection The direction to sort ('ASC'/'DESC'/'NONE')
    */
  var onGridSort: js.UndefOr[
    js.Function2[/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE, Unit]
  ] = js.native
  /**
    * An event function called when a row is clicked.
    * Clicking the header row will trigger a call with -1 for the rowIdx.
    * @param rowIdx zero index number of row clicked
    * @param row object behind the row
    */
  var onRowClick: js.UndefOr[js.Function2[/* rowIdx */ Double, /* row */ T, Unit]] = js.native
  /**
    * An event function called when a row is expanded with the toggle
    * @param props OnRowExpandToggle object
    */
  var onRowExpandToggle: js.UndefOr[js.Function1[/* props */ OnRowExpandToggle, Unit]] = js.native
  /**
    * Called when a row is selected.
    * @param rows The (complete) current selection of rows.
    */
  var onRowSelect: js.UndefOr[js.Function1[/* rows */ js.Array[T], Unit]] = js.native
  /**
    * Invoked when the user changes the value of a single cell.
    * Should update that cell's value.
    * @param e Information about the event
    */
  var onRowUpdated: js.UndefOr[js.Function1[/* e */ RowUpdateEvent[T], Unit]] = js.native
  /**
    * Called when the grid is scrolled
    */
  var onScroll: js.UndefOr[js.Function1[/* scrollState */ ScrollState, Unit]] = js.native
  /**
    * A custom formatter for select row column
    * @default AdazzleReactDataGridPlugins.Editors.CheckboxEditor
    */
  var rowActionsCell: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Gets the data to render in each row. Required.
    * Can be an array or a function that takes an index and returns an object.
    */
  var rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]) = js.native
  /**
    * A react component to customize how the grouping header row is rendered
    */
  var rowGroupRenderer: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  /**
    * The height of each individual row in pixels.
    * @default 35
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /**
    * A property that's unique to every row.
    * This property is required to enable row selection.
    * @default 'id'
    */
  var rowKey: js.UndefOr[String] = js.native
  /**
    * A react component to customize how rows are rendered.
    * If you want to define your own, consider extending ReactDataGrid.Row.
    */
  var rowRenderer: js.UndefOr[ReactElement | ReactComponentClass[_]] = js.native
  /**
    * How long to wait before rendering a new row while scrolling in milliseconds.
    * @default 0
    */
  var rowScrollTimeout: js.UndefOr[Double] = js.native
  /**
    * Options object for selecting rows
    */
  var rowSelection: js.UndefOr[AnonEnableShiftSelect[T]] = js.native
  /**
    * The total number of rows to render. Required.
    */
  var rowsCount: Double = js.native
  /**
    * A custom formatter for the select all checkbox cell
    * @default react-data-grid/src/formatters/SelectAll.js
    */
  var selectAllRenderer: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * key of the initial sorted column
    */
  var sortColumn: js.UndefOr[String] = js.native
  /**
    * Initial sorting direction
    */
  var sortDirection: js.UndefOr[ASC | DESC | NONE] = js.native
  /**
    * A toolbar to display above the grid.
    * Consider using the toolbar included in "react-data-grid/addons".
    */
  var toolbar: js.UndefOr[ReactElement] = js.native
}

object GridProps {
  @scala.inline
  def apply[T](rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]), rowsCount: Double): GridProps[T] = {
    val __obj = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps[T]]
  }
  @scala.inline
  implicit class GridPropsOps[Self[t] <: GridProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRowGetterFunction1(value: /* rowIdx */ Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowGetter(value: js.Array[T] | (js.Function1[/* rowIdx */ Double, T])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellNavigationMode(value: none_ | loopOverRow | changeRow): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellNavigationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellNavigationMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellNavigationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Column[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyRowsViewFunctionComponent(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyRowsView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyRowsViewComponentClass(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyRowsView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyRowsView(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyRowsView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyRowsView: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyRowsView")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellSelect(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDragAndDrop(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDragAndDrop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowSelect(value: Boolean | single | multi): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCellActions(value: (/* column */ Column[T], /* row */ T) => js.Array[ActionButton | ActionMenu]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellActions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetCellActions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellActions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubRowDetails(value: /* row */ T => SubRowDetails[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubRowDetails")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSubRowDetails: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubRowDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValidFilterValues(value: /* columnKey */ String => js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidFilterValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetValidFilterValues: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidFilterValues")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFiltersHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFiltersHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFiltersHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFiltersHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRowHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRowHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColumnWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColumnWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAddFilter(value: /* filter */ Filter => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAddFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellCopyPaste(value: /* e */ CellCopyPasteEvent => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellCopyPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellCopyPaste: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellCopyPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellDeSelected(value: /* coordinates */ AnonIdx => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDeSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellDeSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDeSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellExpand(value: /* e */ CellExpandEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellExpand: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellSelected(value: /* coordinates */ AnonIdx => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellsDragged(value: /* e */ CellDragEvent => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellsDragged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellsDragged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellsDragged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClearFilters(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClearFilters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClearFilters: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClearFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnResize(value: (/* index */ Double, /* width */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnResize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragHandleDoubleClick(value: /* e */ DragHandleDoubleClickEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragHandleDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragHandleDoubleClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragHandleDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGridRowsUpdated(value: /* e */ GridRowsUpdatedEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridRowsUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGridRowsUpdated: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridRowsUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGridSort(value: (/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridSort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnGridSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridSort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowClick(value: (/* rowIdx */ Double, /* row */ T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowExpandToggle(value: /* props */ OnRowExpandToggle => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowExpandToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowExpandToggle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowExpandToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowSelect(value: /* rows */ js.Array[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowUpdated(value: /* e */ RowUpdateEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowUpdated: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* scrollState */ ScrollState => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withRowActionsCellFunctionComponent(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowActionsCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowActionsCellComponentClass(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowActionsCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowActionsCell(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowActionsCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowActionsCell: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowActionsCell")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroupRendererFunctionComponent(value: ReactComponentClass[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowGroupRendererComponentClass(value: ReactComponentClass[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowGroupRenderer(value: ReactComponentClass[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroupRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRowKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRowRendererReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowRendererFunctionComponent(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowRendererComponentClass(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowRenderer(value: ReactElement | ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRowScrollTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowScrollTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowScrollTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowScrollTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelection(value: AnonEnableShiftSelect[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSelection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllRendererFunctionComponent(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAllRendererComponentClass(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAllRenderer(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColumn(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortColumn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirection(value: ASC | DESC | NONE): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
  }
  
}

