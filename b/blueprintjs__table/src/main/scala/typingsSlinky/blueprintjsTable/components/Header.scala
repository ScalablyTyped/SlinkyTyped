package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.commonMod.Grid
import typingsSlinky.blueprintjsTable.dragTypesMod.IClientCoordinates
import typingsSlinky.blueprintjsTable.dragTypesMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.esmRegionsMod.RegionCardinality
import typingsSlinky.blueprintjsTable.headerMod.IInternalHeaderProps
import typingsSlinky.blueprintjsTable.locatorMod.ILocator
import typingsSlinky.blueprintjsTable.resizeHandleMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @scala.inline
  def apply(
    fullRegionCardinality: RegionCardinality,
    getCellExtremaClasses: (Double, Double) => js.Array[String],
    getCellIndexClass: Double => String,
    getCellSize: Double => Double,
    getDragCoordinate: IClientCoordinates => Double,
    getIndexClass: Double => String,
    getMouseCoordinate: MouseEvent => Double,
    ghostCellRenderer: (Double, js.Array[String]) => ReactElement,
    grid: Grid,
    handleResizeEnd: (Double, Double) => Unit,
    handleSizeChanged: (Double, Double) => Unit,
    headerCellIsReorderablePropName: String,
    headerCellIsSelectedPropName: String,
    headerCellRenderer: Double => ReactElement,
    indexEnd: Double,
    indexStart: Double,
    isCellSelected: Double => Boolean,
    isGhostIndex: Double => Boolean,
    locator: ILocator,
    maxSize: Double,
    minSize: Double,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onLayoutLock: js.UndefOr[Boolean] => Unit,
    onReordered: (Double, Double, Double) => Unit,
    onReordering: (Double, Double, Double) => Unit,
    onResizeGuide: js.Array[Double] => Unit,
    onSelection: js.Array[IRegion] => Unit,
    resizeOrientation: Orientation,
    selectedRegions: js.Array[IRegion],
    toRegion: (Double, js.UndefOr[Double]) => IRegion,
    wrapCells: js.Array[ReactElement] => ReactElement
  ): Builder = {
    val __props = js.Dynamic.literal(fullRegionCardinality = fullRegionCardinality.asInstanceOf[js.Any], getCellExtremaClasses = js.Any.fromFunction2(getCellExtremaClasses), getCellIndexClass = js.Any.fromFunction1(getCellIndexClass), getCellSize = js.Any.fromFunction1(getCellSize), getDragCoordinate = js.Any.fromFunction1(getDragCoordinate), getIndexClass = js.Any.fromFunction1(getIndexClass), getMouseCoordinate = js.Any.fromFunction1(getMouseCoordinate), ghostCellRenderer = js.Any.fromFunction2(ghostCellRenderer), grid = grid.asInstanceOf[js.Any], handleResizeEnd = js.Any.fromFunction2(handleResizeEnd), handleSizeChanged = js.Any.fromFunction2(handleSizeChanged), headerCellIsReorderablePropName = headerCellIsReorderablePropName.asInstanceOf[js.Any], headerCellIsSelectedPropName = headerCellIsSelectedPropName.asInstanceOf[js.Any], headerCellRenderer = js.Any.fromFunction1(headerCellRenderer), indexEnd = indexEnd.asInstanceOf[js.Any], indexStart = indexStart.asInstanceOf[js.Any], isCellSelected = js.Any.fromFunction1(isCellSelected), isGhostIndex = js.Any.fromFunction1(isGhostIndex), locator = locator.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1(onFocusedCell), onLayoutLock = js.Any.fromFunction1(onLayoutLock), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onResizeGuide = js.Any.fromFunction1(onResizeGuide), onSelection = js.Any.fromFunction1(onSelection), resizeOrientation = resizeOrientation.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any], toRegion = js.Any.fromFunction2(toRegion), wrapCells = js.Any.fromFunction1(wrapCells))
    new Builder(js.Array(this.component, __props.asInstanceOf[IInternalHeaderProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/headers/header", "Header")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.headerMod.Header] {
    
    @scala.inline
    def convertPointToIndex(value: (/* clientXOrY */ Double, /* useMidpoint */ js.UndefOr[Boolean]) => Double): this.type = set("convertPointToIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusedCell(value: IFocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleResizeDoubleClick(value: /* index */ Double => Unit): this.type = set("handleResizeDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): this.type = set("onSelectionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
  }
  
  def withProps(p: IInternalHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
