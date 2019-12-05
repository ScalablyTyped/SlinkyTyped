package typingsSlinky.agDashGrid

import typingsSlinky.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typingsSlinky.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController
import typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentResolver
import typingsSlinky.agDashGrid.distLibContextContextMod.Context
import typingsSlinky.agDashGrid.distLibDragAndDropDragAndDropServiceMod.DragAndDropService
import typingsSlinky.agDashGrid.distLibEventServiceMod.EventService
import typingsSlinky.agDashGrid.distLibFilterFilterManagerMod.FilterManager
import typingsSlinky.agDashGrid.distLibFocusedCellControllerMod.FocusedCellController
import typingsSlinky.agDashGrid.distLibGridApiMod.GridApi
import typingsSlinky.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agDashGrid.distLibGridPanelGridPanelMod.GridPanel
import typingsSlinky.agDashGrid.distLibInterfacesIContextMenuFactoryMod.IContextMenuFactory
import typingsSlinky.agDashGrid.distLibInterfacesIRangeControllerMod.IRangeController
import typingsSlinky.agDashGrid.distLibMiscAnimationFrameServiceMod.AnimationFrameService
import typingsSlinky.agDashGrid.distLibRenderingCellEditorFactoryMod.CellEditorFactory
import typingsSlinky.agDashGrid.distLibRenderingCellRendererFactoryMod.CellRendererFactory
import typingsSlinky.agDashGrid.distLibRenderingCellRendererServiceMod.CellRendererService
import typingsSlinky.agDashGrid.distLibRenderingColumnAnimationServiceMod.ColumnAnimationService
import typingsSlinky.agDashGrid.distLibRenderingColumnHoverServiceMod.ColumnHoverService
import typingsSlinky.agDashGrid.distLibRenderingHeightScalerMod.HeightScaler
import typingsSlinky.agDashGrid.distLibRenderingRowRendererMod.RowRenderer
import typingsSlinky.agDashGrid.distLibRenderingValueFormatterServiceMod.ValueFormatterService
import typingsSlinky.agDashGrid.distLibRowModelsPaginationProxyMod.PaginationProxy
import typingsSlinky.agDashGrid.distLibSortControllerMod.SortController
import typingsSlinky.agDashGrid.distLibStylingStylingServiceMod.StylingService
import typingsSlinky.agDashGrid.distLibTemplateServiceMod.TemplateService
import typingsSlinky.agDashGrid.distLibValueServiceExpressionServiceMod.ExpressionService
import typingsSlinky.agDashGrid.distLibValueServiceValueServiceMod.ValueService
import typingsSlinky.agDashGrid.distLibWidgetsPopupServiceMod.PopupService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/beans", JSImport.Namespace)
@js.native
object distLibRenderingBeansMod extends js.Object {
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
    var rangeController: IRangeController = js.native
    var rowRenderer: RowRenderer = js.native
    var sortController: SortController = js.native
    var stylingService: StylingService = js.native
    var taskQueue: AnimationFrameService = js.native
    var templateService: TemplateService = js.native
    var valueFormatterService: ValueFormatterService = js.native
    var valueService: ValueService = js.native
    /* private */ def postConstruct(): js.Any = js.native
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
  }
  
}

