package typingsSlinky.reactVirtualized.esMultiGridMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typingsSlinky.reactVirtualized.esGridMod.GridCellProps
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeProps
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeRenderer
import typingsSlinky.reactVirtualized.esGridMod.GridCellRenderer
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndices
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typingsSlinky.reactVirtualized.esGridMod.SectionRenderedParams
import typingsSlinky.reactVirtualized.mod.Alignment
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  classNameBottomLeftGrid ? :string,   classNameBottomRightGrid ? :string,   classNameTopLeftGrid ? :string,   classNameTopRightGrid ? :string,   enableFixedColumnScroll ? :boolean,   enableFixedRowScroll ? :boolean,   fixedColumnCount ? :number,   fixedRowCount ? :number,   style ? :react.react.CSSProperties,   styleBottomLeftGrid ? :react.react.CSSProperties,   styleBottomRightGrid ? :react.react.CSSProperties,   styleTopLeftGrid ? :react.react.CSSProperties,   styleTopRightGrid ? :react.react.CSSProperties} & react-virtualized.react-virtualized/dist/es/Grid.GridProps */
@js.native
trait MultiGridProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  /**
    * Set the width of the inner scrollable container to 'auto'.
    * This is useful for single-column Grids to ensure that the column doesn't extend below a vertical scrollbar.
    */
  var autoContainerWidth: js.UndefOr[Boolean] = js.native
  /**
    * Removes fixed height from the scrollingContainer so that the total height of rows can stretch the window.
    * Intended for use with WindowScroller
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /**
    * Removes fixed width from the scrollingContainer so that the total width of rows can stretch the window.
    * Intended for use with WindowScroller
    */
  var autoWidth: js.UndefOr[Boolean] = js.native
  /**
    * Responsible for rendering a group of cells given their index ranges.
    * Should implement the following interface: ({
    *   cellCache: Map,
    *   cellRenderer: Function,
    *   columnSizeAndPositionManager: CellSizeAndPositionManager,
    *   columnStartIndex: number,
    *   columnStopIndex: number,
    *   isScrolling: boolean,
    *   rowSizeAndPositionManager: CellSizeAndPositionManager,
    *   rowStartIndex: number,
    *   rowStopIndex: number,
    *   scrollLeft: number,
    *   scrollTop: number
    * }): Array<PropTypes.node>
    */
  var cellRangeRenderer: js.UndefOr[GridCellRangeRenderer] = js.native
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ columnIndex: number, rowIndex: number }): PropTypes.node
    */
  var cellRenderer: GridCellRenderer = js.native
  /**
    * Optional custom CSS class name to attach to root Grid element.
    */
  var className: js.UndefOr[String] = js.native
  var classNameBottomLeftGrid: js.UndefOr[String] = js.native
  var classNameBottomRightGrid: js.UndefOr[String] = js.native
  var classNameTopLeftGrid: js.UndefOr[String] = js.native
  var classNameTopRightGrid: js.UndefOr[String] = js.native
  /**
    * Number of columns in grid.
    */
  var columnCount: Double = js.native
  /**
    * Either a fixed column width (number) or a function that returns the width of a column given its index.
    * Should implement the following interface: (index: number): number
    */
  var columnWidth: Double | (js.Function1[/* params */ Index, Double]) = js.native
  /** Unfiltered props for the Grid container. */
  var containerProps: js.UndefOr[js.Object] = js.native
  /** ARIA role for the cell-container.  */
  var containerRole: js.UndefOr[String] = js.native
  /** Optional inline style applied to inner cell-container */
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * If CellMeasurer is used to measure this Grid's children, this should be a pointer to its CellMeasurerCache.
    * A shared CellMeasurerCache reference enables Grid and CellMeasurer to share measurement data.
    */
  var deferredMeasurementCache: js.UndefOr[CellMeasurerCache] = js.native
  var enableFixedColumnScroll: js.UndefOr[Boolean] = js.native
  var enableFixedRowScroll: js.UndefOr[Boolean] = js.native
  /**
    * Used to estimate the total width of a Grid before all of its columns have actually been measured.
    * The estimated total width is adjusted as columns are rendered.
    */
  var estimatedColumnSize: js.UndefOr[Double] = js.native
  /**
    * Used to estimate the total height of a Grid before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  var estimatedRowSize: js.UndefOr[Double] = js.native
  var fixedColumnCount: js.UndefOr[Double] = js.native
  var fixedRowCount: js.UndefOr[Double] = js.native
  /**
    * Exposed for testing purposes only.
    */
  var getScrollbarSize: js.UndefOr[js.Function0[Double]] = js.native
  /**
    * Height of Grid; this property determines the number of visible (vs virtualized) rows.
    */
  var height: Double = js.native
  /**
    * Optional custom id to attach to root Grid element.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Override internal is-scrolling state tracking.
    * This property is primarily intended for use with the WindowScroller component.
    */
  var isScrolling: js.UndefOr[Boolean] = js.native
  /**
    * Optional renderer to be used in place of rows when either :rowCount or :columnCount is 0.
    */
  var noContentRenderer: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
    */
  var onScroll: js.UndefOr[js.Function1[/* params */ ScrollParams, _]] = js.native
  /**
    * Called whenever a horizontal or vertical scrollbar is added or removed.
    * ({ horizontal: boolean, size: number, vertical: boolean }): void
    */
  var onScrollbarPresenceChange: js.UndefOr[js.Function1[/* params */ ScrollbarPresenceParams, _]] = js.native
  /**
    * Callback invoked with information about the section of the Grid that was just rendered.
    * ({ columnStartIndex, columnStopIndex, rowStartIndex, rowStopIndex }): void
    */
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.native
  /**
    * Number of columns to render before/after the visible section of the grid.
    * These columns can help for smoother scrolling on touch devices or browsers that send scroll events infrequently.
    */
  var overscanColumnCount: js.UndefOr[Double] = js.native
  /**
    * Calculates the number of cells to overscan before and after a specified range.
    * This function ensures that overscanning doesn't exceed the available cells.
    * Should implement the following interface: ({
    *   cellCount: number,
    *   overscanCellsCount: number,
    *   scrollDirection: number,
    *   startIndex: number,
    *   stopIndex: number
    * }): {overscanStartIndex: number, overscanStopIndex: number}
    */
  var overscanIndicesGetter: js.UndefOr[OverscanIndicesGetter] = js.native
  /**
    * Number of rows to render above/below the visible section of the grid.
    * These rows can help for smoother scrolling on touch devices or browsers that send scroll events infrequently.
    */
  var overscanRowCount: js.UndefOr[Double] = js.native
  /**
    * ARIA role for the grid element.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Number of rows in grid.
    */
  var rowCount: Double = js.native
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * Should implement the following interface: ({ index: number }): number
    */
  var rowHeight: Double | (js.Function1[/* params */ Index, Double]) = js.native
  /** Horizontal offset. */
  var scrollLeft: js.UndefOr[Double] = js.native
  /**
    * Controls scroll-to-cell behavior of the Grid.
    * The default ("auto") scrolls the least amount possible to ensure that the specified cell is fully visible.
    * Use "start" to align cells to the top/left of the Grid and "end" to align bottom/right.
    */
  var scrollToAlignment: js.UndefOr[Alignment] = js.native
  /**
    * Column index to ensure visible (by forcefully scrolling if necessary)
    */
  var scrollToColumn: js.UndefOr[Double] = js.native
  /**
    * Row index to ensure visible (by forcefully scrolling if necessary)
    */
  var scrollToRow: js.UndefOr[Double] = js.native
  /** Vertical offset. */
  var scrollTop: js.UndefOr[Double] = js.native
  /** Wait this amount of time after the last scroll event before resetting Grid `pointer-events`. */
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
  /** Optional inline style */
  var style: js.UndefOr[CSSProperties] = js.native
  var styleBottomLeftGrid: js.UndefOr[CSSProperties] = js.native
  var styleBottomRightGrid: js.UndefOr[CSSProperties] = js.native
  var styleTopLeftGrid: js.UndefOr[CSSProperties] = js.native
  var styleTopRightGrid: js.UndefOr[CSSProperties] = js.native
  /** Tab index for focus */
  var tabIndex: js.UndefOr[Double | Null] = js.native
  /**
    * Width of Grid; this property determines the number of visible (vs virtualized) columns.
    */
  var width: Double = js.native
}

object MultiGridProps {
  @scala.inline
  def apply(
    cellRenderer: /* props */ GridCellProps => TagMod[Any],
    columnCount: Double,
    columnWidth: Double | (js.Function1[/* params */ Index, Double]),
    height: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]),
    width: Double
  ): MultiGridProps = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiGridProps]
  }
  @scala.inline
  implicit class MultiGridPropsOps[Self <: MultiGridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellRenderer(value: /* props */ GridCellProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnWidthFunction1(value: /* params */ Index => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double | (js.Function1[/* params */ Index, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeightFunction1(value: /* params */ Index => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowHeight(value: Double | (js.Function1[/* params */ Index, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-readonly`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-readonly`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoContainerWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoContainerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoContainerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoContainerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRangeRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellRangeRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRangeRenderer")(js.undefined)
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
    def withClassNameBottomLeftGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameBottomLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNameBottomLeftGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameBottomLeftGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameBottomRightGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameBottomRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNameBottomRightGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameBottomRightGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameTopLeftGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameTopLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNameTopLeftGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameTopLeftGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameTopRightGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameTopRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNameTopRightGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameTopRightGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerRole")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferredMeasurementCache(value: CellMeasurerCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredMeasurementCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredMeasurementCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredMeasurementCache")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFixedColumnScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFixedColumnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFixedColumnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFixedColumnScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFixedRowScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFixedRowScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFixedRowScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFixedRowScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedColumnSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedColumnSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedColumnSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedColumnSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedRowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedRowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollbarSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollbarSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollbarSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollbarSize")(js.undefined)
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
    def withIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withNoContentRenderer(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noContentRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNoContentRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noContentRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* params */ ScrollParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollbarPresenceChange(value: /* params */ ScrollbarPresenceParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollbarPresenceChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollbarPresenceChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSectionRendered(value: /* params */ SectionRenderedParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSectionRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSectionRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSectionRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverscanIndicesGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanIndicesGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
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
    def withScrollToAlignment(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToAlignment")(js.undefined)
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
    def withScrollingResetTimeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingResetTimeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
    def withStyleBottomLeftGrid(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBottomLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleBottomLeftGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBottomLeftGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleBottomRightGrid(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBottomRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleBottomRightGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBottomRightGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleTopLeftGrid(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTopLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleTopLeftGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTopLeftGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleTopRightGrid(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTopRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleTopRightGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTopRightGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
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
    def withTabIndexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(null)
        ret
    }
  }
  
}

