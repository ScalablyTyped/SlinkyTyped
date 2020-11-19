package typingsSlinky.blueprintjsTable.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.rectMod.Rect
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.BATCH
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.NONE
import typingsSlinky.blueprintjsTable.tableBodyCellsMod.ITableBodyCellsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBodyCells {
  
  @JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.tableBodyCellsMod.TableBodyCells] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusedCell(value: IFocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompleteRender(value: () => Unit): this.type = set("onCompleteRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderMode(value: BATCH | NONE): this.type = set("renderMode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITableBodyCellsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement,
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect
  ): Builder = {
    val __props = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITableBodyCellsProps]))
  }
}
