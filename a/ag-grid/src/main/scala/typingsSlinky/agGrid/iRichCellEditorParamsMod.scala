package typingsSlinky.agGrid

import typingsSlinky.agGrid.componentResolverMod.ComponentHolder
import typingsSlinky.agGrid.iCellEditorMod.ICellEditorParams
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/interfaces/iRichCellEditorParams", JSImport.Namespace)
@js.native
object iRichCellEditorParamsMod extends js.Object {
  @js.native
  trait IRichCellEditorParams
    extends ICellEditorParams
       with ComponentHolder {
    var cellHeight: Double = js.native
    var cellRenderer: AnonInstantiableICellRendererComp | ICellRendererFunc | String = js.native
    var values: js.Array[String] = js.native
  }
  
}

