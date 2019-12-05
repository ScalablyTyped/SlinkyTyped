package typingsSlinky.agDashGrid

import typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentHolder
import typingsSlinky.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
import typingsSlinky.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/interfaces/iRichCellEditorParams", JSImport.Namespace)
@js.native
object distLibInterfacesIRichCellEditorParamsMod extends js.Object {
  @js.native
  trait IRichCellEditorParams
    extends ICellEditorParams
       with ComponentHolder {
    var cellHeight: Double = js.native
    var cellRenderer: Anon_ICellRendererComp | ICellRendererFunc | String = js.native
    var values: js.Array[String] = js.native
  }
  
}

