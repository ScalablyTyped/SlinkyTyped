package typingsSlinky.agGrid

import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.dateComponentMod.IDateComp
import typingsSlinky.agGrid.dateComponentMod.IDateParams
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsSlinky.agGrid.floatingFilterWrapperMod.IFloatingFilterWrapperComp
import typingsSlinky.agGrid.groupCellRendererMod.GroupCellRendererParams
import typingsSlinky.agGrid.headerCompMod.IHeaderComp
import typingsSlinky.agGrid.headerCompMod.IHeaderParams
import typingsSlinky.agGrid.headerGroupCompMod.IHeaderGroupComp
import typingsSlinky.agGrid.headerGroupCompMod.IHeaderGroupParams
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererComp
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererParams
import typingsSlinky.agGrid.iRichCellEditorParamsMod.IRichCellEditorParams
import typingsSlinky.agGrid.iSetFilterParamsMod.ISetFilterParams
import typingsSlinky.agGrid.loadingOverlayComponentMod.ILoadingOverlayComp
import typingsSlinky.agGrid.noRowsOverlayComponentMod.INoRowsOverlayComp
import typingsSlinky.agGrid.overlayWrapperComponentMod.IOverlayWrapperComp
import typingsSlinky.agGrid.utilsMod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentRecipesMod {
  
  @JSImport("ag-grid/dist/lib/components/framework/componentRecipes", "ComponentRecipes")
  @js.native
  class ComponentRecipes () extends StObject {
    
    var columnApi: js.Any = js.native
    
    var componentResolver: js.Any = js.native
    
    var filterManager: js.Any = js.native
    
    /* private */ def getFilterComponentPrototype[A, B](colDef: js.Any): js.Any = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptions: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def newCellRenderer(target: ColDef, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newCellRenderer(target: IRichCellEditorParams, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newCellRenderer(target: ISetFilterParams, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    
    def newDateComponent(params: IDateParams): Promise[IDateComp] = js.native
    
    /* private */ def newEmptyFloatingFilterWrapperComponent(column: js.Any): js.Any = js.native
    
    def newFloatingFilterWrapperComponent[M, P /* <: IFloatingFilterParams[M, _] */](column: Column, params: IFloatingFilterParams[M, _]): IFloatingFilterWrapperComp[M, _, _, _] = js.native
    
    def newFullRowGroupRenderer(params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    
    def newFullWidthGroupRowInnerCellRenderer(params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    
    def newHeaderComponent(params: IHeaderParams): Promise[IHeaderComp] = js.native
    
    def newHeaderGroupComponent(params: IHeaderGroupParams): Promise[IHeaderGroupComp] = js.native
    
    def newInnerCellRenderer(target: GroupCellRendererParams, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    
    def newLoadingOverlayComponent(): Promise[ILoadingOverlayComp] = js.native
    
    def newNoRowsOverlayComponent(): Promise[INoRowsOverlayComp] = js.native
    
    def newOverlayWrapperComponent(): IOverlayWrapperComp = js.native
  }
  /* static members */
  object ComponentRecipes {
    
    @JSImport("ag-grid/dist/lib/components/framework/componentRecipes", "ComponentRecipes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/components/framework/componentRecipes", "ComponentRecipes.filterToFloatingFilterNames")
    @js.native
    def filterToFloatingFilterNames: js.Any = js.native
    @scala.inline
    def filterToFloatingFilterNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterToFloatingFilterNames")(x.asInstanceOf[js.Any])
  }
}
