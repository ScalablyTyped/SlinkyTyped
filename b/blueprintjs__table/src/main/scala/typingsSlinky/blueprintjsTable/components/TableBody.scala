package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.dragTypesMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.locatorMod.ILocator
import typingsSlinky.blueprintjsTable.menuContextMod.IMenuContext
import typingsSlinky.blueprintjsTable.rectMod.Rect
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.BATCH
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.NONE
import typingsSlinky.blueprintjsTable.tableBodyMod.ITableBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody {
  
  @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.tableBodyMod.TableBody] {
    
    @scala.inline
    def bodyContextMenuRenderer(value: /* context */ IMenuContext => ReactElement): this.type = set("bodyContextMenuRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusedCell(value: IFocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numFrozenColumns(value: Double): this.type = set("numFrozenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numFrozenRows(value: Double): this.type = set("numFrozenRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompleteRender(value: () => Unit): this.type = set("onCompleteRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): this.type = set("onSelectionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderMode(value: BATCH | NONE): this.type = set("renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
    
    @scala.inline
    def selectedRegionsVarargs(value: IRegion*): this.type = set("selectedRegions", js.Array(value :_*))
    
    @scala.inline
    def selectedRegions(value: js.Array[IRegion]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITableBodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement,
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    locator: ILocator,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onSelection: js.Array[IRegion] => Unit,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect
  ): Builder = {
    val __props = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection), rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITableBodyProps]))
  }
}
