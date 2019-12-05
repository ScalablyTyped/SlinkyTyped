package typingsSlinky.agDashGrid

import typingsSlinky.agDashGrid.distLibEntitiesColDefMod.ColDef
import typingsSlinky.agDashGrid.distLibEntitiesColumnMod.Column
import typingsSlinky.agDashGrid.distLibFilterFloatingFilterMod.IFloatingFilterParams
import typingsSlinky.agDashGrid.distLibFilterFloatingFilterWrapperMod.IFloatingFilterWrapperComp
import typingsSlinky.agDashGrid.distLibHeaderRenderingHeaderGroupHeaderGroupCompMod.IHeaderGroupComp
import typingsSlinky.agDashGrid.distLibHeaderRenderingHeaderGroupHeaderGroupCompMod.IHeaderGroupParams
import typingsSlinky.agDashGrid.distLibHeaderRenderingHeaderHeaderCompMod.IHeaderComp
import typingsSlinky.agDashGrid.distLibHeaderRenderingHeaderHeaderCompMod.IHeaderParams
import typingsSlinky.agDashGrid.distLibInterfacesIRichCellEditorParamsMod.IRichCellEditorParams
import typingsSlinky.agDashGrid.distLibInterfacesISetFilterParamsMod.ISetFilterParams
import typingsSlinky.agDashGrid.distLibRenderingCellRenderersGroupCellRendererMod.GroupCellRendererParams
import typingsSlinky.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp
import typingsSlinky.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererParams
import typingsSlinky.agDashGrid.distLibRenderingDateComponentMod.IDateComp
import typingsSlinky.agDashGrid.distLibRenderingDateComponentMod.IDateParams
import typingsSlinky.agDashGrid.distLibRenderingOverlaysLoadingOverlayComponentMod.ILoadingOverlayComp
import typingsSlinky.agDashGrid.distLibRenderingOverlaysNoRowsOverlayComponentMod.INoRowsOverlayComp
import typingsSlinky.agDashGrid.distLibRenderingOverlaysOverlayWrapperComponentMod.IOverlayWrapperComp
import typingsSlinky.agDashGrid.distLibUtilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/componentRecipes", JSImport.Namespace)
@js.native
object distLibComponentsFrameworkComponentRecipesMod extends js.Object {
  @js.native
  class ComponentRecipes () extends js.Object {
    var columnApi: js.Any = js.native
    var componentResolver: js.Any = js.native
    var filterManager: js.Any = js.native
    var gridApi: js.Any = js.native
    var gridOptions: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    /* private */ def getFilterComponentPrototype[A, B](colDef: js.Any): js.Any = js.native
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
  @js.native
  object ComponentRecipes extends js.Object {
    var filterToFloatingFilterNames: js.Any = js.native
  }
  
}

