package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.groupCellRendererMod.GroupCellRendererParams
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererComp
import typingsSlinky.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRendererService", JSImport.Namespace)
@js.native
object cellRendererServiceMod extends js.Object {
  @js.native
  class CellRendererService () extends js.Object {
    var componentRecipes: js.Any = js.native
    var componentResolver: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    def bindToHtml(cellRendererPromise: Promise[ICellRendererComp], eTarget: HTMLElement): Promise[ICellRendererComp] = js.native
    def useCellRenderer(target: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
    def useFilterCellRenderer(target: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
    def useFullWidthGroupRowInnerCellRenderer(eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
    def useInnerCellRenderer(target: GroupCellRendererParams, originalColumn: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
    def useRichSelectCellRenderer(target: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
  }
  
}

