package typingsSlinky.agGrid

import typingsSlinky.agGrid.anon.Instantiable
import typingsSlinky.agGrid.anon.InstantiableICellEditorComp
import typingsSlinky.agGrid.anon.InstantiableICellRendererComp
import typingsSlinky.agGrid.anon.InstantiableIFilterComp
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.gridOptionsMod.GridOptions
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererFunc
import typingsSlinky.agGrid.iFrameworkFactoryMod.IFrameworkFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/baseFrameworkFactory", JSImport.Namespace)
@js.native
object baseFrameworkFactoryMod extends js.Object {
  
  @js.native
  class BaseFrameworkFactory () extends IFrameworkFactory {
    
    def colDefCellEditor(colDef: ColDef): InstantiableICellEditorComp | String = js.native
    
    def colDefCellRenderer(colDef: ColDef): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def colDefFilter(colDef: ColDef): InstantiableIFilterComp | String = js.native
    
    def colDefFloatingCellRenderer(colDef: ColDef): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def dateComponent(gridOptions: GridOptions): Instantiable = js.native
    
    def gridOptionsFullWidthCellRenderer(gridOptions: GridOptions): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def gridOptionsGroupRowInnerRenderer(gridOptions: GridOptions): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def gridOptionsGroupRowRenderer(gridOptions: GridOptions): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def setTimeout(action: js.Any): Unit = js.native
    def setTimeout(action: js.Any, timeout: js.Any): Unit = js.native
  }
}
