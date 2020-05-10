package typingsSlinky.fixedDataTable2.mod

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.auto
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.hidden
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableProps extends ClassAttributes[Table] {
  /**
    * The number of rows outside the viewport to prerender. Defaults to roughly
    * half of the number of visible rows.
    */
  var bufferRowCount: js.UndefOr[Double] = js.native
  /**
    * Pixel height of fixedDataTableCellGroupLayout/cellGroupWrapper.
    * Default is headerHeight and groupHeaderHeight.
    *
    * This can be used with CSS to make a header cell span both the group & normal header row.
    * Setting this to a value larger than height will cause the content to
    * overflow the height. This is useful when adding a 2nd table as the group
    * header and vertically merging the 2 headers when a column is not part
    * of a group. Here are the necessary CSS changes:
    *
    * Both headers:
    *  - cellGroupWrapper needs overflow-x: hidden and pointer-events: none
    *  - cellGroup needs pointer-events: auto to reenable them on child els
    * Group header:
    *  - Layout/main needs overflow: visible and a higher z-index
    *  - CellLayout/main needs overflow-y: visible
    *  - cellGroup needs overflow: visible
    */
  var cellGroupWrapperHeight: js.UndefOr[Double] = js.native
  /**
    * Class name to be passed into parent container
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Pixel height of footer.
    */
  var footerHeight: js.UndefOr[Double] = js.native
  /**
    * Pixel height of the column group header.
    */
  var groupHeaderHeight: js.UndefOr[Double] = js.native
  /**
    * Pixel height of header.
    */
  var headerHeight: Double = js.native
  /**
    * Pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either `height` or `maxHeight` must be specified.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Whether columns are currently being reordered.
    */
  var isColumnReordering: js.UndefOr[Boolean] = js.native
  /**
    * Whether a column is currently being resized.
    */
  var isColumnResizing: js.UndefOr[Boolean] = js.native
  /** Boolean flags to control if scrolling with keys is enabled */
  var keyboardPageEnabled: js.UndefOr[Boolean] = js.native
  /** Boolean flags to control if scrolling with keys is enabled */
  var keyboardScrollEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Maximum pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either `height` or `maxHeight` must be specified.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Callback that is called when reordering has been completed
    * and columns need to be updated.
    *
    * ```
    * function(
    *   event {
    *     columnBefore: string|undefined, // the column before the new location of this one
    *     columnAfter: string|undefined,  // the column after the new location of this one
    *     reorderColumn: string,          // the column key that was just reordered
    *   }
    * )
    * ```
    */
  var onColumnReorderEndCallback: js.UndefOr[js.Function1[/* event */ ColumnReorderEndEvent, Unit]] = js.native
  /**
    * Callback that is called when resizer has been released
    * and column needs to be updated.
    *
    * Required if the isResizable property is true on any column.
    *
    * ```
    * function(
    *   newColumnWidth: number,
    *   columnKey: string,
    * )
    * ```
    */
  var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.native
  /**
    * Callback that is called when `rowHeightGetter` returns a different height
    * for a row than the `rowHeight` prop. This is necessary because initially
    * table estimates heights of some parts of the content.
    */
  var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.native
  /**
    * Callback when horizontally scrolling the grid.
    *
    * Return false to stop propagation.
    */
  var onHorizontalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.native
  /**
    * Callback that is called when a row is clicked.
    */
  var onRowClick: js.UndefOr[TableRowEventHandler] = js.native
  /**
    * Callback that is called when a row is double clicked.
    */
  var onRowDoubleClick: js.UndefOr[TableRowEventHandler] = js.native
  /**
    * Callback that is called when a mouse-down event happens on a row.
    */
  var onRowMouseDown: js.UndefOr[TableRowEventHandler] = js.native
  /**
    * Callback that is called when a mouse-enter event happens on a row.
    */
  var onRowMouseEnter: js.UndefOr[TableRowEventHandler] = js.native
  /**
    * Callback that is called when a mouse-leave event happens on a row.
    */
  var onRowMouseLeave: js.UndefOr[TableRowEventHandler] = js.native
  /**
    * Callback that is called when a mouse-up event happens on a row.
    */
  var onRowMouseUp: js.UndefOr[TableRowEventHandler] = js.native
  /**
    * Callback that is called when a touch-end event happens on a row.
    */
  var onRowTouchEnd: js.UndefOr[TableRowEventHandler] = js.native
  /**
    * Callback that is called when a touch-move event happens on a row.
    */
  var onRowTouchMove: js.UndefOr[TableRowEventHandler] = js.native
  /**
    * Callback that is called when a touch-start event happens on a row.
    */
  var onRowTouchStart: js.UndefOr[TableRowEventHandler] = js.native
  /**
    * Callback that is called when scrolling ends or stops with new horizontal
    * and vertical scroll values.
    */
  var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  /**
    * Callback that is called when scrolling starts with current horizontal
    * and vertical scroll values.
    */
  var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  /**
    * Callback when vertically scrolling the grid.
    *
    * Return false to stop propagation.
    */
  var onVerticalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.native
  var overflowX: js.UndefOr[hidden | auto] = js.native
  var overflowY: js.UndefOr[hidden | auto] = js.native
  /**
    * Pixel height of table's owner, this is used in a managed scrolling
    * situation when you want to slide the table up from below the fold
    * without having to constantly update the height on every scroll tick.
    * Instead, vary this property on scroll. By using `ownerHeight`, we
    * over-render the table while making sure the footer and horizontal
    * scrollbar of the table are visible when the current space for the table
    * in view is smaller than the final, over-flowing height of table. It
    * allows us to avoid resizing and reflowing table when it is moving in the
    * view.
    *
    * This is used if `ownerHeight < height` (or `maxHeight`).
    */
  var ownerHeight: js.UndefOr[Double] = js.native
  /**
    * To get any additional CSS classes that should be added to a row,
    * `rowClassNameGetter(index)` is called.
    */
  var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  /**
    * The row expanded for table row.
    * This can either be a React element, or a function that generates
    * a React Element. By default, the React element passed in can expect to
    * receive the following props:
    *
    * ```
    * props: {
    *   rowIndex; number // (the row index)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Table)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * If you pass in a function, you will receive the same props object as the
    * first argument.
    */
  var rowExpanded: js.UndefOr[ElementOrFunc[RowProps]] = js.native
  /**
    * Pixel height of rows unless `rowHeightGetter` is specified and returns
    * different value.
    */
  var rowHeight: Double = js.native
  /**
    * If specified, `rowHeightGetter(index)` is called for each row and the
    * returned value overrides `rowHeight` for particular row.
    */
  var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  /**
    * If specified, `rowKeyGetter(index)` is called for each row and the
    * returned value overrides `key` for the particular row.
    */
  var rowKeyGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  /**
    * Number of rows in the table.
    */
  var rowsCount: Double = js.native
  /**
    * Value of horizontal scroll.
    */
  var scrollLeft: js.UndefOr[Double] = js.native
  /**
    * Index of column to scroll to.
    */
  var scrollToColumn: js.UndefOr[Double] = js.native
  /**
    * Index of row to scroll to.
    */
  var scrollToRow: js.UndefOr[Double] = js.native
  /**
    * Value of vertical scroll.
    */
  var scrollTop: js.UndefOr[Double] = js.native
  /** Hide the scrollbar but still enable scroll functionality */
  var showScrollbarX: js.UndefOr[Boolean] = js.native
  /** Hide the scrollbar but still enable scroll functionality */
  var showScrollbarY: js.UndefOr[Boolean] = js.native
  /**
    * If enabled scroll events will not be propagated outside of the table.
    */
  var stopScrollPropagation: js.UndefOr[Boolean] = js.native
  /**
    * Pixel height of sub-row unless `subRowHeightGetter` is specified and returns
    * different value.  Defaults to 0 and no sub-row being displayed.
    */
  var subRowHeight: js.UndefOr[Double] = js.native
  /**
    * If specified, `subRowHeightGetter(index)` is called for each row and the
    * returned value overrides `subRowHeight` for particular row.
    */
  var subRowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  /**
    * Boolean flag indicating of touch scrolling should be enabled
    * This feature is current in beta and may have bugs
    */
  var touchScrollEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Pixel width of table. If all columns do not fit,
    * a horizontal scrollbar will appear.
    */
  var width: Double = js.native
}

object TableProps {
  @scala.inline
  def apply(headerHeight: Double, rowHeight: Double, rowsCount: Double, width: Double): TableProps = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCellGroupWrapperHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellGroupWrapperHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellGroupWrapperHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellGroupWrapperHeight")(js.undefined)
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
    def withFooterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withIsColumnReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColumnReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsColumnReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColumnReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withIsColumnResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColumnResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsColumnResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColumnResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardPageEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPageEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardPageEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPageEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardScrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardScrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnReorderEndCallback(value: /* event */ ColumnReorderEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnReorderEndCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnReorderEndCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnReorderEndCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResizeEndCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnResizeEndCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResizeEndCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentHeightChange(value: /* newHeight */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentHeightChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContentHeightChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentHeightChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHorizontalScroll(value: /* scrollPos */ Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHorizontalScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHorizontalScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHorizontalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowClick(value: (/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDoubleClick(value: (/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDoubleClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowMouseDown(value: (/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowMouseEnter(value: (/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowMouseLeave(value: (/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowMouseUp(value: (/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowTouchEnd(value: (/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowTouchEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowTouchMove(value: (/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowTouchMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowTouchStart(value: (/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowTouchStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollEnd(value: (/* x */ Double, /* y */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnScrollEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollStart(value: (/* x */ Double, /* y */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnScrollStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVerticalScroll(value: /* scrollPos */ Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVerticalScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVerticalScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVerticalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowX(value: hidden | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowY(value: hidden | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClassNameGetter(value: /* index */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassNameGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowClassNameGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassNameGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withRowExpandedReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowExpandedFunction1(value: RowProps => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpanded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowExpanded(value: ElementOrFunc[RowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeightGetter(value: /* index */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeightGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowHeightGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeightGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withRowKeyGetter(value: /* index */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKeyGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowKeyGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKeyGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRow")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScrollbarX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbarX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScrollbarX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbarX")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScrollbarY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbarY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScrollbarY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbarY")(js.undefined)
        ret
    }
    @scala.inline
    def withStopScrollPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopScrollPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopScrollPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopScrollPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withSubRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSubRowHeightGetter(value: /* index */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subRowHeightGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubRowHeightGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subRowHeightGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchScrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchScrollEnabled")(js.undefined)
        ret
    }
  }
  
}

