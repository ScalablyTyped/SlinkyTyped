package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.columnHeaderMod.IColumnHeaderProps
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.commonMod.Grid
import typingsSlinky.blueprintjsTable.dragTypesMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.locatorMod.ILocator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnHeader {
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeader", "ColumnHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.columnHeaderMod.ColumnHeader] {
    @scala.inline
    def defaultColumnWidth(value: Double): this.type = set("defaultColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def focusedCell(value: IFocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    @scala.inline
    def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def maxColumnWidth(value: Double): this.type = set("maxColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def measurableElementRef(value: /* ref */ HTMLElement | Null => Unit): this.type = set("measurableElementRef", js.Any.fromFunction1(value))
    @scala.inline
    def minColumnWidth(value: Double): this.type = set("minColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): this.type = set("onSelectionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def selectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
    @scala.inline
    def selectedRegions(value: js.Array[IRegion]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IColumnHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    cellRenderer: /* columnIndex */ Double => ReactElement,
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    locator: ILocator,
    onColumnWidthChanged: (/* index */ Double, /* size */ Double) => Unit,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onLayoutLock: js.UndefOr[Boolean] => Unit,
    onReordered: (Double, Double, Double) => Unit,
    onReordering: (Double, Double, Double) => Unit,
    onResizeGuide: js.Array[Double] => Unit,
    onSelection: js.Array[IRegion] => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], onColumnWidthChanged = js.Any.fromFunction2(onColumnWidthChanged), onFocusedCell = js.Any.fromFunction1(onFocusedCell), onLayoutLock = js.Any.fromFunction1(onLayoutLock), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onResizeGuide = js.Any.fromFunction1(onResizeGuide), onSelection = js.Any.fromFunction1(onSelection))
    new Builder(js.Array(this.component, __props.asInstanceOf[IColumnHeaderProps]))
  }
}

