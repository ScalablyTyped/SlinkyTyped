package typingsSlinky.agGrid

import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.iCellEditorMod.ICellEditor
import typingsSlinky.agGrid.iCellEditorMod.ICellEditorParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectCellEditorMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.agGrid.iComponentMod.IComponent because Already inherited
  - typingsSlinky.agGrid.iCellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/selectCellEditor", "SelectCellEditor")
  @js.native
  class SelectCellEditor ()
    extends Component
       with ICellEditor {
    
    @JSName("afterGuiAttached")
    def afterGuiAttached_MSelectCellEditor(): Unit = js.native
    
    var eSelect: js.Any = js.native
    
    var focusAfterAttached: js.Any = js.native
    
    @JSName("focusIn")
    def focusIn_MSelectCellEditor(): Unit = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    @JSName("init")
    def init_MSelectCellEditor(params: ISelectCellEditorParams): Unit = js.native
    
    var valueFormatterService: js.Any = js.native
  }
  
  @js.native
  trait ISelectCellEditorParams extends ICellEditorParams {
    
    var values: js.Array[_] = js.native
  }
}
