package typingsSlinky.fixedDataTable.mod

import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.Props
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableProps extends Props[Table] {
  /**
    * Pixel height of the footer.
    *
    * defaultValue: 0
    */
  var footerHeight: js.UndefOr[Double] = js.native
  /**
    * Pixel height of the column group header.
    *
    * defaultValue: 0
    */
  var groupHeaderHeight: js.UndefOr[Double] = js.native
  /**
    * Pixel height of the header.
    *
    * defaultValue: 0
    */
  var headerHeight: js.UndefOr[Double] = js.native
  /**
    * Pixel height of table. If all rows do not fit, a
    * vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Whether a column is currently being resized.
    */
  var isColumnResizing: js.UndefOr[Boolean] = js.native
  /**
    * Maximum pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Callback that is called when resizer has been released
    * and column needs to be updated.
    *
    * Required if the isResizable property is true on any
    * column.
    */
  var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.native
  /**
    * Callback that is called when rowHeightGetter returns a
    * different height for a row than the rowHeight prop. This
    *  is necessary because initially table estimates heights
    * of some parts of the content.
    */
  var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.native
  /**
    * Callback that is called when a row is clicked.
    */
  var onRowClick: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when a row is double clicked.
    */
  var onRowDoubleClick: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when a mouse-down event happens
    * on a row.
    */
  var onRowMouseDown: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when a mouse-enter event happens
    * on a row.
    */
  var onRowMouseEnter: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when a mouse-leave event happens
    * on a row.
    */
  var onRowMouseLeave: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event_, Table], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when scrolling ends or stops with
    * new horizontal and vertical scroll values.
    */
  var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  /**
    * Callback that is called when scrolling starts with
    * current horizontal and vertical scroll values.
    */
  var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  /**
    * 'hidden'|'auto'
    */
  var overflowX: js.UndefOr[String] = js.native
  /**
    * 'hidden'|'auto'
    */
  var overflowY: js.UndefOr[String] = js.native
  /**
    * Pixel height of table's owner, this is used in a managed
    * scrolling situation when you want to slide the table up
    * from below the fold without having to constantly update
    * the height on every scroll tick. Instead, vary this
    * property on scroll. By using ownerHeight, we over-render
    * the table while making sure the footer and horizontal
    * scrollbar of the table are visible when the current space
    * for the table in view is smaller than the final,
    * over-flowing height of table. It allows us to avoid
    * resizing and reflowing table when it is moving in the
    * view.
    *
    * This is used if ownerHeight < height (or maxHeight).
    */
  var ownerHeight: js.UndefOr[Double] = js.native
  /**
    * To get any additional CSS classes that should be added to
    *  a row, rowClassNameGetter(index) is called.
    */
  var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  /**
    * Pixel height of rows unless rowHeightGetter is specified
    * and returns different value.
    */
  var rowHeight: Double = js.native
  /**
    * If specified, rowHeightGetter(index) is called for each
    * row and the returned value overrides rowHeight for
    * particular row.
    */
  var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  /**
    * Number of rows in the table.
    */
  var rowsCount: Double = js.native
  /**
    * Value of horizontal scroll.
    *
    * defaultValue: 0
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
    *
    * defaultValue: 0
    */
  var scrollTop: js.UndefOr[Double] = js.native
  /**
    * Pixel width of table. If all columns do not fit, a
    * horizontal scrollbar will appear.
    */
  var width: Double = js.native
}

object TableProps {
  @scala.inline
  def apply(rowHeight: Double, rowsCount: Double, width: Double): TableProps = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.undefined)
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
    def withOverflowX(value: String): Self = {
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
    def withOverflowY(value: String): Self = {
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
  }
  
}

