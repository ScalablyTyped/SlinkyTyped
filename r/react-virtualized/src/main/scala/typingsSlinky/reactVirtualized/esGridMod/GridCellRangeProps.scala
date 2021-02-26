package typingsSlinky.reactVirtualized.esGridMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typingsSlinky.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typingsSlinky.reactVirtualized.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridCellRangeProps extends StObject {
  
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
    cellRenderer: /* props */ GridCellProps => ReactElement,
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
  implicit class GridCellRangePropsMutableBuilder[Self <: GridCellRangeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellCache(value: Map[_]): Self = StObject.set(x, "cellCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRenderer(value: /* props */ GridCellProps => ReactElement): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnSizeAndPositionManager(value: CellSizeAndPositionManager): Self = StObject.set(x, "columnSizeAndPositionManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStartIndex(value: Double): Self = StObject.set(x, "columnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStopIndex(value: Double): Self = StObject.set(x, "columnStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredMeasurementCache(value: CellMeasurerCache): Self = StObject.set(x, "deferredMeasurementCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOffsetAdjustment(value: Double): Self = StObject.set(x, "horizontalOffsetAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrollingOptOut(value: Boolean): Self = StObject.set(x, "isScrollingOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ReactComponentClass[GridCoreProps] with MeasuredCellParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSizeAndPositionManager(value: CellSizeAndPositionManager): Self = StObject.set(x, "rowSizeAndPositionManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStartIndex(value: Double): Self = StObject.set(x, "rowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStopIndex(value: Double): Self = StObject.set(x, "rowStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleCache(value: Map[CSSProperties]): Self = StObject.set(x, "styleCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOffsetAdjustment(value: Double): Self = StObject.set(x, "verticalOffsetAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleColumnIndices(value: VisibleCellRange): Self = StObject.set(x, "visibleColumnIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRowIndices(value: VisibleCellRange): Self = StObject.set(x, "visibleRowIndices", value.asInstanceOf[js.Any])
  }
}
