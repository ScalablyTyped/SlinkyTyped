package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.commonMod.Grid
import typingsSlinky.blueprintjsTable.draggableMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.locatorMod.ILocator
import typingsSlinky.blueprintjsTable.rowHeaderMod.IRowHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RowHeader {
  @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", "RowHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.rowHeaderMod.RowHeader] {
    @scala.inline
    def defaultRowHeight(value: Double): this.type = set("defaultRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def focusedCell(value: IFocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    @scala.inline
    def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def maxRowHeight(value: Double): this.type = set("maxRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minRowHeight(value: Double): this.type = set("minRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): this.type = set("onSelectionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def rowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): this.type = set("rowHeaderCellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def selectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
    @scala.inline
    def selectedRegions(value: js.Array[IRegion]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IRowHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    grid: Grid,
    locator: ILocator,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onLayoutLock: js.UndefOr[Boolean] => Unit,
    onReordered: (Double, Double, Double) => Unit,
    onReordering: (Double, Double, Double) => Unit,
    onResizeGuide: js.Array[Double] => Unit,
    onRowHeightChanged: (/* index */ Double, /* size */ Double) => Unit,
    onSelection: js.Array[IRegion] => Unit,
    rowIndexEnd: Double,
    rowIndexStart: Double
  ): Builder = {
    val __props = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1(onFocusedCell), onLayoutLock = js.Any.fromFunction1(onLayoutLock), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onResizeGuide = js.Any.fromFunction1(onResizeGuide), onRowHeightChanged = js.Any.fromFunction2(onRowHeightChanged), onSelection = js.Any.fromFunction1(onSelection), rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IRowHeaderProps]))
  }
}

