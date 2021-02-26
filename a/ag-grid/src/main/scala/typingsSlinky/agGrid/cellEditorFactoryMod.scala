package typingsSlinky.agGrid

import typingsSlinky.agGrid.anon.InstantiableICellEditorComp
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.iCellEditorMod.ICellEditorComp
import typingsSlinky.agGrid.iCellEditorMod.ICellEditorParams
import typingsSlinky.agGrid.utilsMod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellEditorFactoryMod {
  
  @JSImport("ag-grid/dist/lib/rendering/cellEditorFactory", "CellEditorFactory")
  @js.native
  class CellEditorFactory () extends StObject {
    
    def addCellEditor(key: String, cellEditor: InstantiableICellEditorComp): Unit = js.native
    
    var componentResolver: js.Any = js.native
    
    var context: js.Any = js.native
    
    def createCellEditor(column: ColDef, params: ICellEditorParams): Promise[ICellEditorComp] = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
  }
}
