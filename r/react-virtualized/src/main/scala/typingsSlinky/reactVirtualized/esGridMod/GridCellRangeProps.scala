package typingsSlinky.reactVirtualized.esGridMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typingsSlinky.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typingsSlinky.reactVirtualized.mod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridCellRangeProps extends js.Object {
  var cellCache: Map[_] = js.native
  var cellRenderer: GridCellRenderer = js.native
  var columnSizeAndPositionManager: CellSizeAndPositionManager = js.native
  var columnStartIndex: Double = js.native
  var columnStopIndex: Double = js.native
  var deferredMeasurementCache: CellMeasurerCache = js.native
  var horizontalOffsetAdjustment: Double = js.native
  var isScrolling: Boolean = js.native
  var isScrollingOptOut: Boolean = js.native
  var parent: ReactComponentClass[GridCoreProps] with MeasuredCellParent = js.native
  var rowSizeAndPositionManager: CellSizeAndPositionManager = js.native
  var rowStartIndex: Double = js.native
  var rowStopIndex: Double = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var styleCache: Map[CSSProperties] = js.native
  var verticalOffsetAdjustment: Double = js.native
  var visibleColumnIndices: VisibleCellRange = js.native
  var visibleRowIndices: VisibleCellRange = js.native
}

object GridCellRangeProps {
  @scala.inline
  def apply(
    cellCache: Map[_],
    cellRenderer: /* props */ GridCellProps => TagMod[Any],
    columnSizeAndPositionManager: CellSizeAndPositionManager,
    columnStartIndex: Double,
    columnStopIndex: Double,
    deferredMeasurementCache: CellMeasurerCache,
    horizontalOffsetAdjustment: Double,
    isScrolling: Boolean,
    isScrollingOptOut: Boolean,
    parent: ReactComponentClass[GridCoreProps] with MeasuredCellParent,
    rowSizeAndPositionManager: CellSizeAndPositionManager,
    rowStartIndex: Double,
    rowStopIndex: Double,
    scrollLeft: Double,
    scrollTop: Double,
    styleCache: Map[CSSProperties],
    verticalOffsetAdjustment: Double,
    visibleColumnIndices: VisibleCellRange,
    visibleRowIndices: VisibleCellRange
  ): GridCellRangeProps = {
    val __obj = js.Dynamic.literal(cellCache = cellCache.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), columnSizeAndPositionManager = columnSizeAndPositionManager.asInstanceOf[js.Any], columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columnStopIndex = columnStopIndex.asInstanceOf[js.Any], deferredMeasurementCache = deferredMeasurementCache.asInstanceOf[js.Any], horizontalOffsetAdjustment = horizontalOffsetAdjustment.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], isScrollingOptOut = isScrollingOptOut.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rowSizeAndPositionManager = rowSizeAndPositionManager.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any], rowStopIndex = rowStopIndex.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], styleCache = styleCache.asInstanceOf[js.Any], verticalOffsetAdjustment = verticalOffsetAdjustment.asInstanceOf[js.Any], visibleColumnIndices = visibleColumnIndices.asInstanceOf[js.Any], visibleRowIndices = visibleRowIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridCellRangeProps]
  }
  @scala.inline
  implicit class GridCellRangePropsOps[Self <: GridCellRangeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellCache(value: Map[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellRenderer(value: /* props */ GridCellProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumnSizeAndPositionManager(value: CellSizeAndPositionManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSizeAndPositionManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeferredMeasurementCache(value: CellMeasurerCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredMeasurementCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalOffsetAdjustment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffsetAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrollingOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollingOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ReactComponentClass[GridCoreProps] with MeasuredCellParent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSizeAndPositionManager(value: CellSizeAndPositionManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSizeAndPositionManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleCache(value: Map[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalOffsetAdjustment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOffsetAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleColumnIndices(value: VisibleCellRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleColumnIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleRowIndices(value: VisibleCellRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRowIndices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

