package typingsSlinky.agGrid

import typingsSlinky.agGrid.animationFrameServiceMod.AnimationFrameService
import typingsSlinky.agGrid.cellEditorFactoryMod.CellEditorFactory
import typingsSlinky.agGrid.cellRendererFactoryMod.CellRendererFactory
import typingsSlinky.agGrid.cellRendererServiceMod.CellRendererService
import typingsSlinky.agGrid.columnAnimationServiceMod.ColumnAnimationService
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnControllerMod.ColumnController
import typingsSlinky.agGrid.columnHoverServiceMod.ColumnHoverService
import typingsSlinky.agGrid.componentResolverMod.ComponentResolver
import typingsSlinky.agGrid.contextMod.Context
import typingsSlinky.agGrid.dragAndDropServiceMod.DragAndDropService
import typingsSlinky.agGrid.eventServiceMod.EventService
import typingsSlinky.agGrid.expressionServiceMod.ExpressionService
import typingsSlinky.agGrid.filterManagerMod.FilterManager
import typingsSlinky.agGrid.focusedCellControllerMod.FocusedCellController
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agGrid.gridPanelMod.GridPanel
import typingsSlinky.agGrid.heightScalerMod.HeightScaler
import typingsSlinky.agGrid.iContextMenuFactoryMod.IContextMenuFactory
import typingsSlinky.agGrid.iRangeControllerMod.IRangeController
import typingsSlinky.agGrid.paginationProxyMod.PaginationProxy
import typingsSlinky.agGrid.popupServiceMod.PopupService
import typingsSlinky.agGrid.rowRendererMod.RowRenderer
import typingsSlinky.agGrid.sortControllerMod.SortController
import typingsSlinky.agGrid.stylingServiceMod.StylingService
import typingsSlinky.agGrid.templateServiceMod.TemplateService
import typingsSlinky.agGrid.valueFormatterServiceMod.ValueFormatterService
import typingsSlinky.agGrid.valueServiceMod.ValueService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rendering/beans", JSImport.Namespace)
@js.native
object beansMod extends js.Object {
  
  @js.native
  class Beans () extends js.Object {
    
    @JSName("$compile")
    var $compile: js.Any = js.native
    
    var cellEditorFactory: CellEditorFactory = js.native
    
    var cellRendererFactory: CellRendererFactory = js.native
    
    var cellRendererService: CellRendererService = js.native
    
    var columnAnimationService: ColumnAnimationService = js.native
    
    var columnApi: ColumnApi = js.native
    
    var columnController: ColumnController = js.native
    
    var columnHoverService: ColumnHoverService = js.native
    
    var componentResolver: ComponentResolver = js.native
    
    var context: Context = js.native
    
    var contextMenuFactory: IContextMenuFactory = js.native
    
    var doingMasterDetail: Boolean = js.native
    
    var dragAndDropService: DragAndDropService = js.native
    
    var enterprise: Boolean = js.native
    
    var eventService: EventService = js.native
    
    var expressionService: ExpressionService = js.native
    
    var filterManager: FilterManager = js.native
    
    var focusedCellController: FocusedCellController = js.native
    
    var gridApi: GridApi = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    var gridPanel: GridPanel = js.native
    
    var heightScaler: HeightScaler = js.native
    
    var paginationProxy: PaginationProxy = js.native
    
    var popupService: PopupService = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    var rangeController: IRangeController = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    var rowRenderer: RowRenderer = js.native
    
    var sortController: SortController = js.native
    
    var stylingService: StylingService = js.native
    
    var taskQueue: AnimationFrameService = js.native
    
    var templateService: TemplateService = js.native
    
    var valueFormatterService: ValueFormatterService = js.native
    
    var valueService: ValueService = js.native
  }
}
