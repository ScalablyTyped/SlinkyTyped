package typingsSlinky.agGrid.gridOptionsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.AnonInstantiable
import typingsSlinky.agGrid.AnonInstantiableAny
import typingsSlinky.agGrid.AnonInstantiableICellRendererComp
import typingsSlinky.agGrid.AnonInstantiableILoadingOverlayComp
import typingsSlinky.agGrid.AnonInstantiableINoRowsOverlayComp
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.colDefMod.ColGroupDef
import typingsSlinky.agGrid.colDefMod.IAggFunc
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.componentProviderMod.AgGridRegisteredComponentInput
import typingsSlinky.agGrid.componentResolverMod.ComponentHolder
import typingsSlinky.agGrid.eventsMod.BodyScrollEvent
import typingsSlinky.agGrid.eventsMod.CellClickedEvent
import typingsSlinky.agGrid.eventsMod.CellContextMenuEvent
import typingsSlinky.agGrid.eventsMod.CellDoubleClickedEvent
import typingsSlinky.agGrid.eventsMod.CellEditingStartedEvent
import typingsSlinky.agGrid.eventsMod.CellEditingStoppedEvent
import typingsSlinky.agGrid.eventsMod.CellFocusedEvent
import typingsSlinky.agGrid.eventsMod.CellMouseDownEvent
import typingsSlinky.agGrid.eventsMod.CellMouseOutEvent
import typingsSlinky.agGrid.eventsMod.CellMouseOverEvent
import typingsSlinky.agGrid.eventsMod.CellValueChangedEvent
import typingsSlinky.agGrid.eventsMod.ColumnAggFuncChangeRequestEvent
import typingsSlinky.agGrid.eventsMod.ColumnEverythingChangedEvent
import typingsSlinky.agGrid.eventsMod.ColumnGroupOpenedEvent
import typingsSlinky.agGrid.eventsMod.ColumnMovedEvent
import typingsSlinky.agGrid.eventsMod.ColumnPinnedEvent
import typingsSlinky.agGrid.eventsMod.ColumnPivotChangeRequestEvent
import typingsSlinky.agGrid.eventsMod.ColumnPivotChangedEvent
import typingsSlinky.agGrid.eventsMod.ColumnPivotModeChangedEvent
import typingsSlinky.agGrid.eventsMod.ColumnResizedEvent
import typingsSlinky.agGrid.eventsMod.ColumnRowGroupChangeRequestEvent
import typingsSlinky.agGrid.eventsMod.ColumnRowGroupChangedEvent
import typingsSlinky.agGrid.eventsMod.ColumnValueChangeRequestEvent
import typingsSlinky.agGrid.eventsMod.ColumnValueChangedEvent
import typingsSlinky.agGrid.eventsMod.ColumnVisibleEvent
import typingsSlinky.agGrid.eventsMod.DisplayedColumnsChangedEvent
import typingsSlinky.agGrid.eventsMod.DragStartedEvent
import typingsSlinky.agGrid.eventsMod.DragStoppedEvent
import typingsSlinky.agGrid.eventsMod.FilterChangedEvent
import typingsSlinky.agGrid.eventsMod.FilterModifiedEvent
import typingsSlinky.agGrid.eventsMod.GridColumnsChangedEvent
import typingsSlinky.agGrid.eventsMod.GridReadyEvent
import typingsSlinky.agGrid.eventsMod.ModelUpdatedEvent
import typingsSlinky.agGrid.eventsMod.NewColumnsLoadedEvent
import typingsSlinky.agGrid.eventsMod.PaginationChangedEvent
import typingsSlinky.agGrid.eventsMod.PasteEndEvent
import typingsSlinky.agGrid.eventsMod.PasteStartEvent
import typingsSlinky.agGrid.eventsMod.PinnedRowDataChangedEvent
import typingsSlinky.agGrid.eventsMod.RangeSelectionChangedEvent
import typingsSlinky.agGrid.eventsMod.RowClickedEvent
import typingsSlinky.agGrid.eventsMod.RowDataChangedEvent
import typingsSlinky.agGrid.eventsMod.RowDataUpdatedEvent
import typingsSlinky.agGrid.eventsMod.RowDoubleClickedEvent
import typingsSlinky.agGrid.eventsMod.RowDragEvent
import typingsSlinky.agGrid.eventsMod.RowEditingStartedEvent
import typingsSlinky.agGrid.eventsMod.RowEditingStoppedEvent
import typingsSlinky.agGrid.eventsMod.RowGroupOpenedEvent
import typingsSlinky.agGrid.eventsMod.RowSelectedEvent
import typingsSlinky.agGrid.eventsMod.RowValueChangedEvent
import typingsSlinky.agGrid.eventsMod.SelectionChangedEvent
import typingsSlinky.agGrid.eventsMod.SortChangedEvent
import typingsSlinky.agGrid.eventsMod.ViewportChangedEvent
import typingsSlinky.agGrid.eventsMod.VirtualColumnsChangedEvent
import typingsSlinky.agGrid.eventsMod.VirtualRowRemovedEvent
import typingsSlinky.agGrid.exportParamsMod.CsvExportParams
import typingsSlinky.agGrid.exportParamsMod.ProcessCellForExportParams
import typingsSlinky.agGrid.exportParamsMod.ProcessHeaderForExportParams
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.gridCellMod.GridCellDef
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererFunc
import typingsSlinky.agGrid.iComponentMod.IComponent
import typingsSlinky.agGrid.iDatasourceMod.IDatasource
import typingsSlinky.agGrid.iServerSideDatasourceMod.IServerSideDatasource
import typingsSlinky.agGrid.iViewportDatasourceMod.IViewportDatasource
import typingsSlinky.agGrid.rowNodeMod.RowNode
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptions extends ComponentHolder {
  var accentedSort: js.UndefOr[Boolean] = js.native
  var aggFuncs: js.UndefOr[StringDictionary[IAggFunc]] = js.native
  var aggregateOnlyChangedColumns: js.UndefOr[Boolean] = js.native
  var alignedGrids: js.UndefOr[js.Array[GridOptions]] = js.native
  var allowContextMenuWithControlKey: js.UndefOr[Boolean] = js.native
  var alwaysShowStatusBar: js.UndefOr[Boolean] = js.native
  var angularCompileFilters: js.UndefOr[Boolean] = js.native
  var angularCompileHeaders: js.UndefOr[Boolean] = js.native
  var angularCompileRows: js.UndefOr[Boolean] = js.native
  var animateRows: js.UndefOr[Boolean] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var api: js.UndefOr[GridApi] = js.native
  var autoGroupColumnDef: js.UndefOr[ColDef] = js.native
  var autoSizePadding: js.UndefOr[Double] = js.native
  var batchUpdateWaitMillis: js.UndefOr[Double] = js.native
  var cacheBlockSize: js.UndefOr[Double] = js.native
  var cacheOverflowSize: js.UndefOr[Double] = js.native
  var cacheQuickFilter: js.UndefOr[Boolean] = js.native
  var clipboardDeliminator: js.UndefOr[String] = js.native
  var colResizeDefault: js.UndefOr[String] = js.native
  var colWidth: js.UndefOr[Double] = js.native
  var columnApi: js.UndefOr[ColumnApi] = js.native
  var columnDefs: js.UndefOr[js.Array[ColDef | ColGroupDef]] = js.native
  var columnTypes: js.UndefOr[StringDictionary[ColDef]] = js.native
  var components: js.UndefOr[StringDictionary[AgGridRegisteredComponentInput[IComponent[_]]]] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var context: js.UndefOr[js.Any] = js.native
  var contractColumnSelection: js.UndefOr[Boolean] = js.native
  var datasource: js.UndefOr[IDatasource] = js.native
  var dateComponent: js.UndefOr[AnonInstantiable] = js.native
  var dateComponentFramework: js.UndefOr[js.Any] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var defaultColDef: js.UndefOr[ColDef] = js.native
  var defaultColGroupDef: js.UndefOr[ColGroupDef] = js.native
  var defaultExportParams: js.UndefOr[CsvExportParams] = js.native
  var defaultGroupSortComparator: js.UndefOr[js.Function2[/* nodeA */ RowNode, /* nodeB */ RowNode, Double]] = js.native
  var deltaRowDataMode: js.UndefOr[Boolean] = js.native
  var detailCellRenderer: js.UndefOr[AnonInstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var detailCellRendererFramework: js.UndefOr[js.Any] = js.native
  var detailCellRendererParams: js.UndefOr[js.Any] = js.native
  var detailRowHeight: js.UndefOr[Double] = js.native
  var doesDataFlower: js.UndefOr[js.Function1[/* dataItem */ js.Any, Boolean]] = js.native
  var doesExternalFilterPass: js.UndefOr[js.Function1[/* node */ RowNode, Boolean]] = js.native
  var domLayout: js.UndefOr[String] = js.native
  var editType: js.UndefOr[String] = js.native
  var embedFullWidthRows: js.UndefOr[Boolean] = js.native
  var enableCellChangeFlash: js.UndefOr[Boolean] = js.native
  var enableCellExpressions: js.UndefOr[Boolean] = js.native
  var enableColResize: js.UndefOr[Boolean] = js.native
  var enableFilter: js.UndefOr[Boolean] = js.native
  var enableGroupEdit: js.UndefOr[Boolean] = js.native
  var enableOldSetFilterModel: js.UndefOr[Boolean] = js.native
  var enableRangeSelection: js.UndefOr[Boolean] = js.native
  var enableRtl: js.UndefOr[Boolean] = js.native
  var enableServerSideFilter: js.UndefOr[Boolean] = js.native
  var enableServerSideSorting: js.UndefOr[Boolean] = js.native
  var enableSorting: js.UndefOr[Boolean] = js.native
  var enableStatusBar: js.UndefOr[Boolean] = js.native
  var ensureDomOrder: js.UndefOr[Boolean] = js.native
  var enterMovesDown: js.UndefOr[Boolean] = js.native
  var enterMovesDownAfterEdit: js.UndefOr[Boolean] = js.native
  var excelStyles: js.UndefOr[js.Array[_]] = js.native
  var floatingFilter: js.UndefOr[Boolean] = js.native
  var floatingFiltersHeight: js.UndefOr[Double] = js.native
  var forPrint: js.UndefOr[Boolean] = js.native
  var frameworkComponents: js.UndefOr[StringDictionary[AnonInstantiableAny]] = js.native
  var fullWidthCellRenderer: js.UndefOr[AnonInstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var fullWidthCellRendererFramework: js.UndefOr[js.Any] = js.native
  var fullWidthCellRendererParams: js.UndefOr[js.Any] = js.native
  var functionsPassive: js.UndefOr[Boolean] = js.native
  var functionsReadOnly: js.UndefOr[Boolean] = js.native
  var getBusinessKeyForNode: js.UndefOr[js.Function1[/* node */ RowNode, String]] = js.native
  var getChildCount: js.UndefOr[js.Function1[/* dataItem */ js.Any, Double]] = js.native
  var getContextMenuItems: js.UndefOr[GetContextMenuItems] = js.native
  var getDataPath: js.UndefOr[GetDataPath] = js.native
  var getDocument: js.UndefOr[js.Function0[Document_]] = js.native
  var getMainMenuItems: js.UndefOr[GetMainMenuItems] = js.native
  var getNodeChildDetails: js.UndefOr[GetNodeChildDetails] = js.native
  var getRowClass: js.UndefOr[js.Function1[/* params */ js.Any, String | js.Array[String]]] = js.native
  var getRowHeight: js.UndefOr[js.Function] = js.native
  var getRowNodeId: js.UndefOr[GetRowNodeIdFunc] = js.native
  var getRowStyle: js.UndefOr[js.Function] = js.native
  var gridAutoHeight: js.UndefOr[Boolean] = js.native
  var groupColumnDef: js.UndefOr[ColDef] = js.native
  var groupDefaultExpanded: js.UndefOr[Double] = js.native
  var groupHeaderHeight: js.UndefOr[Double] = js.native
  var groupHideOpenParents: js.UndefOr[Boolean] = js.native
  var groupIncludeFooter: js.UndefOr[Boolean] = js.native
  var groupIncludeTotalFooter: js.UndefOr[Boolean] = js.native
  var groupMultiAutoColumn: js.UndefOr[Boolean] = js.native
  var groupRemoveLowestSingleChildren: js.UndefOr[Boolean] = js.native
  var groupRemoveSingleChildren: js.UndefOr[Boolean] = js.native
  var groupRowAggNodes: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], _]] = js.native
  var groupRowInnerRenderer: js.UndefOr[AnonInstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var groupRowInnerRendererFramework: js.UndefOr[js.Any] = js.native
  var groupRowRenderer: js.UndefOr[AnonInstantiableICellRendererComp | ICellRendererFunc | String] = js.native
  var groupRowRendererFramework: js.UndefOr[js.Any] = js.native
  var groupRowRendererParams: js.UndefOr[js.Any] = js.native
  var groupSelectsChildren: js.UndefOr[Boolean] = js.native
  var groupSelectsFiltered: js.UndefOr[Boolean] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var groupSuppressAutoColumn: js.UndefOr[Boolean] = js.native
  var groupSuppressBlankHeader: js.UndefOr[Boolean] = js.native
  var groupSuppressRow: js.UndefOr[Boolean] = js.native
  var groupUseEntireRow: js.UndefOr[Boolean] = js.native
  var headerHeight: js.UndefOr[Double] = js.native
  var icons: js.UndefOr[js.Any] = js.native
  var infiniteInitialRowCount: js.UndefOr[Double] = js.native
  var isExternalFilterPresent: js.UndefOr[js.Function0[Boolean]] = js.native
  var isFullWidthCell: js.UndefOr[js.Function1[/* rowNode */ RowNode, Boolean]] = js.native
  var isRowMaster: js.UndefOr[IsRowMaster] = js.native
  var isRowSelectable: js.UndefOr[IsRowSelectable] = js.native
  var loadingOverlayComponent: js.UndefOr[AnonInstantiableILoadingOverlayComp | String] = js.native
  var loadingOverlayComponentFramework: js.UndefOr[js.Any] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var localeText: js.UndefOr[js.Any] = js.native
  var localeTextFunc: js.UndefOr[js.Function] = js.native
  var masterDetail: js.UndefOr[Boolean] = js.native
  var maxBlocksInCache: js.UndefOr[Double] = js.native
  var maxColWidth: js.UndefOr[Double] = js.native
  var maxConcurrentDatasourceRequests: js.UndefOr[Double] = js.native
  var minColWidth: js.UndefOr[Double] = js.native
  var multiSortKey: js.UndefOr[String] = js.native
  var navigateToNextCell: js.UndefOr[js.Function1[/* params */ NavigateToNextCellParams, GridCellDef]] = js.native
  var noRowsOverlayComponent: js.UndefOr[AnonInstantiableINoRowsOverlayComp | String] = js.native
  var noRowsOverlayComponentFramework: js.UndefOr[js.Any] = js.native
  var onBodyScroll: js.UndefOr[js.Function1[/* event */ BodyScrollEvent, Unit]] = js.native
  var onCellClicked: js.UndefOr[js.Function1[/* event */ CellClickedEvent, Unit]] = js.native
  var onCellContextMenu: js.UndefOr[js.Function1[/* event */ CellContextMenuEvent, Unit]] = js.native
  var onCellDoubleClicked: js.UndefOr[js.Function1[/* event */ CellDoubleClickedEvent, Unit]] = js.native
  var onCellEditingStarted: js.UndefOr[js.Function1[/* event */ CellEditingStartedEvent, Unit]] = js.native
  var onCellEditingStopped: js.UndefOr[js.Function1[/* event */ CellEditingStoppedEvent, Unit]] = js.native
  var onCellFocused: js.UndefOr[js.Function1[/* event */ CellFocusedEvent, Unit]] = js.native
  var onCellMouseDown: js.UndefOr[js.Function1[/* event */ CellMouseDownEvent, Unit]] = js.native
  var onCellMouseOut: js.UndefOr[js.Function1[/* event */ CellMouseOutEvent, Unit]] = js.native
  var onCellMouseOver: js.UndefOr[js.Function1[/* event */ CellMouseOverEvent, Unit]] = js.native
  var onCellValueChanged: js.UndefOr[js.Function1[/* event */ CellValueChangedEvent, Unit]] = js.native
  var onColumnAggFuncChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnAggFuncChangeRequestEvent, Unit]] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var onColumnEverythingChanged: js.UndefOr[js.Function1[/* event */ ColumnEverythingChangedEvent, Unit]] = js.native
  var onColumnGroupOpened: js.UndefOr[js.Function1[/* event */ ColumnGroupOpenedEvent, Unit]] = js.native
  var onColumnMoved: js.UndefOr[js.Function1[/* event */ ColumnMovedEvent, Unit]] = js.native
  var onColumnPinned: js.UndefOr[js.Function1[/* event */ ColumnPinnedEvent, Unit]] = js.native
  var onColumnPivotChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnPivotChangeRequestEvent, Unit]] = js.native
  var onColumnPivotChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotChangedEvent, Unit]] = js.native
  var onColumnPivotModeChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotModeChangedEvent, Unit]] = js.native
  var onColumnResized: js.UndefOr[js.Function1[/* event */ ColumnResizedEvent, Unit]] = js.native
  var onColumnRowGroupChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangeRequestEvent, Unit]] = js.native
  var onColumnRowGroupChanged: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangedEvent, Unit]] = js.native
  var onColumnValueChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnValueChangeRequestEvent, Unit]] = js.native
  var onColumnValueChanged: js.UndefOr[js.Function1[/* event */ ColumnValueChangedEvent, Unit]] = js.native
  var onColumnVisible: js.UndefOr[js.Function1[/* event */ ColumnVisibleEvent, Unit]] = js.native
  var onDisplayedColumnsChanged: js.UndefOr[js.Function1[/* event */ DisplayedColumnsChangedEvent, Unit]] = js.native
  var onDragStarted: js.UndefOr[js.Function1[/* event */ DragStartedEvent, Unit]] = js.native
  var onDragStopped: js.UndefOr[js.Function1[/* event */ DragStoppedEvent, Unit]] = js.native
  var onFilterChanged: js.UndefOr[js.Function1[/* event */ FilterChangedEvent, Unit]] = js.native
  var onFilterModified: js.UndefOr[js.Function1[/* event */ FilterModifiedEvent, Unit]] = js.native
  var onGridColumnsChanged: js.UndefOr[js.Function1[/* event */ GridColumnsChangedEvent, Unit]] = js.native
  var onGridReady: js.UndefOr[js.Function1[/* event */ GridReadyEvent, Unit]] = js.native
  var onGridSizeChanged: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onModelUpdated: js.UndefOr[js.Function1[/* event */ ModelUpdatedEvent, Unit]] = js.native
  var onNewColumnsLoaded: js.UndefOr[js.Function1[/* event */ NewColumnsLoadedEvent, Unit]] = js.native
  var onPaginationChanged: js.UndefOr[js.Function1[/* event */ PaginationChangedEvent, Unit]] = js.native
  var onPasteEnd: js.UndefOr[js.Function1[/* event */ PasteEndEvent, Unit]] = js.native
  var onPasteStart: js.UndefOr[js.Function1[/* event */ PasteStartEvent, Unit]] = js.native
  var onPinnedRowDataChanged: js.UndefOr[js.Function1[/* event */ PinnedRowDataChangedEvent, Unit]] = js.native
  var onRangeSelectionChanged: js.UndefOr[js.Function1[/* event */ RangeSelectionChangedEvent, Unit]] = js.native
  var onRowClicked: js.UndefOr[js.Function1[/* event */ RowClickedEvent, Unit]] = js.native
  var onRowDataChanged: js.UndefOr[js.Function1[/* event */ RowDataChangedEvent, Unit]] = js.native
  var onRowDataUpdated: js.UndefOr[js.Function1[/* event */ RowDataUpdatedEvent, Unit]] = js.native
  var onRowDoubleClicked: js.UndefOr[js.Function1[/* event */ RowDoubleClickedEvent, Unit]] = js.native
  var onRowDragEnd: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.native
  var onRowDragEnter: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.native
  var onRowDragLeave: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.native
  var onRowDragMove: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.native
  var onRowEditingStarted: js.UndefOr[js.Function1[/* event */ RowEditingStartedEvent, Unit]] = js.native
  var onRowEditingStopped: js.UndefOr[js.Function1[/* event */ RowEditingStoppedEvent, Unit]] = js.native
  var onRowGroupOpened: js.UndefOr[js.Function1[/* event */ RowGroupOpenedEvent, Unit]] = js.native
  var onRowSelected: js.UndefOr[js.Function1[/* event */ RowSelectedEvent, Unit]] = js.native
  var onRowValueChanged: js.UndefOr[js.Function1[/* event */ RowValueChangedEvent, Unit]] = js.native
  var onSelectionChanged: js.UndefOr[js.Function1[/* event */ SelectionChangedEvent, Unit]] = js.native
  var onSortChanged: js.UndefOr[js.Function1[/* event */ SortChangedEvent, Unit]] = js.native
  var onViewportChanged: js.UndefOr[js.Function1[/* event */ ViewportChangedEvent, Unit]] = js.native
  var onVirtualColumnsChanged: js.UndefOr[js.Function1[/* event */ VirtualColumnsChangedEvent, Unit]] = js.native
  var onVirtualRowRemoved: js.UndefOr[js.Function1[/* event */ VirtualRowRemovedEvent, Unit]] = js.native
  var overlayLoadingTemplate: js.UndefOr[String] = js.native
  var overlayNoRowsTemplate: js.UndefOr[String] = js.native
  var pagination: js.UndefOr[Boolean] = js.native
  var paginationAutoPageSize: js.UndefOr[Boolean] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var paginationNumberFormatter: js.UndefOr[js.Function1[/* params */ PaginationNumberFormatterParams, String]] = js.native
  var paginationPageSize: js.UndefOr[Double] = js.native
  var paginationStartPage: js.UndefOr[Double] = js.native
  var pinnedBottomRowData: js.UndefOr[js.Array[_]] = js.native
  var pinnedTopRowData: js.UndefOr[js.Array[_]] = js.native
  var pivotColumnGroupTotals: js.UndefOr[String] = js.native
  var pivotGroupHeaderHeight: js.UndefOr[Double] = js.native
  var pivotHeaderHeight: js.UndefOr[Double] = js.native
  var pivotMode: js.UndefOr[Boolean] = js.native
  var pivotPanelShow: js.UndefOr[String] = js.native
  var pivotRowTotals: js.UndefOr[String] = js.native
  var pivotTotals: js.UndefOr[Boolean] = js.native
  var popupParent: js.UndefOr[HTMLElement] = js.native
  var postProcessPopup: js.UndefOr[js.Function1[/* params */ PostProcessPopupParams, Unit]] = js.native
  var postSort: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], Unit]] = js.native
  var processCellForClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, _]] = js.native
  var processCellFromClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, _]] = js.native
  var processDataFromClipboard: js.UndefOr[
    js.Function1[/* params */ ProcessDataFromClipboardParams, js.Array[js.Array[String]]]
  ] = js.native
  var processHeaderForClipboard: js.UndefOr[js.Function1[/* params */ ProcessHeaderForExportParams, _]] = js.native
  var processRowPostCreate: js.UndefOr[js.Function1[/* params */ ProcessRowParams, Unit]] = js.native
  var processSecondaryColDef: js.UndefOr[js.Function1[/* colDef */ ColDef, Unit]] = js.native
  var processSecondaryColGroupDef: js.UndefOr[js.Function1[/* colGroupDef */ ColGroupDef, Unit]] = js.native
  var purgeClosedRowNodes: js.UndefOr[Boolean] = js.native
  var quickFilterText: js.UndefOr[String] = js.native
  var rememberGroupStateWhenNewData: js.UndefOr[Boolean] = js.native
  var rowBuffer: js.UndefOr[Double] = js.native
  var rowClass: js.UndefOr[String | js.Array[String]] = js.native
  var rowClassRules: js.UndefOr[StringDictionary[js.Function | String]] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var rowData: js.UndefOr[js.Array[_]] = js.native
  var rowDeselection: js.UndefOr[Boolean] = js.native
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. PLEASE!*
    ****************************************************************/
  var rowDragManaged: js.UndefOr[Boolean] = js.native
  var rowGroupPanelShow: js.UndefOr[String] = js.native
  var rowHeight: js.UndefOr[Double] = js.native
  var rowModelType: js.UndefOr[String] = js.native
  var rowMultiSelectWithClick: js.UndefOr[Boolean] = js.native
  var rowSelection: js.UndefOr[String] = js.native
  var rowStyle: js.UndefOr[js.Any] = js.native
  var scrollbarWidth: js.UndefOr[Double] = js.native
  var sendToClipboard: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.native
  var serverSideDatasource: js.UndefOr[IServerSideDatasource] = js.native
  var serverSideSortingAlwaysResets: js.UndefOr[Boolean] = js.native
  var showToolPanel: js.UndefOr[Boolean] = js.native
  var singleClickEdit: js.UndefOr[Boolean] = js.native
  var slaveGrids: js.UndefOr[js.Array[GridOptions]] = js.native
  var sortingOrder: js.UndefOr[js.Array[String]] = js.native
  var stopEditingWhenGridLosesFocus: js.UndefOr[Boolean] = js.native
  var suppressAggAtRootLevel: js.UndefOr[Boolean] = js.native
  var suppressAggFuncInHeader: js.UndefOr[Boolean] = js.native
  var suppressAnimationFrame: js.UndefOr[Boolean] = js.native
  var suppressAsyncEvents: js.UndefOr[Boolean] = js.native
  var suppressAutoSize: js.UndefOr[Boolean] = js.native
  var suppressCellSelection: js.UndefOr[Boolean] = js.native
  var suppressChangeDetection: js.UndefOr[Boolean] = js.native
  var suppressClickEdit: js.UndefOr[Boolean] = js.native
  var suppressClipboardPaste: js.UndefOr[Boolean] = js.native
  var suppressColumnMoveAnimation: js.UndefOr[Boolean] = js.native
  var suppressColumnVirtualisation: js.UndefOr[Boolean] = js.native
  var suppressContextMenu: js.UndefOr[Boolean] = js.native
  var suppressCopyRowsToClipboard: js.UndefOr[Boolean] = js.native
  var suppressCsvExport: js.UndefOr[Boolean] = js.native
  var suppressDragLeaveHidesColumns: js.UndefOr[Boolean] = js.native
  var suppressEnterpriseResetOnNewColumns: js.UndefOr[Boolean] = js.native
  var suppressExcelExport: js.UndefOr[Boolean] = js.native
  var suppressFieldDotNotation: js.UndefOr[Boolean] = js.native
  var suppressFocusAfterRefresh: js.UndefOr[Boolean] = js.native
  var suppressHorizontalScroll: js.UndefOr[Boolean] = js.native
  var suppressLoadingOverlay: js.UndefOr[Boolean] = js.native
  var suppressMakeColumnVisibleAfterUnGroup: js.UndefOr[Boolean] = js.native
  var suppressMenuHide: js.UndefOr[Boolean] = js.native
  var suppressMiddleClickScrolls: js.UndefOr[Boolean] = js.native
  var suppressMovableColumns: js.UndefOr[Boolean] = js.native
  var suppressMultiRangeSelection: js.UndefOr[Boolean] = js.native
  var suppressMultiSort: js.UndefOr[Boolean] = js.native
  var suppressNoRowsOverlay: js.UndefOr[Boolean] = js.native
  var suppressPaginationPanel: js.UndefOr[Boolean] = js.native
  var suppressParentsInRowNodes: js.UndefOr[Boolean] = js.native
  var suppressPreventDefaultOnMouseWheel: js.UndefOr[Boolean] = js.native
  var suppressPropertyNamesCheck: js.UndefOr[Boolean] = js.native
  var suppressRowClickSelection: js.UndefOr[Boolean] = js.native
  var suppressRowDrag: js.UndefOr[Boolean] = js.native
  var suppressRowHoverHighlight: js.UndefOr[Boolean] = js.native
  var suppressRowTransform: js.UndefOr[Boolean] = js.native
  var suppressScrollOnNewData: js.UndefOr[Boolean] = js.native
  var suppressTabbing: js.UndefOr[Boolean] = js.native
  var suppressTouch: js.UndefOr[Boolean] = js.native
  var tabToNextCell: js.UndefOr[js.Function1[/* params */ TabToNextCellParams, GridCellDef]] = js.native
  var toolPanelSuppressColumnExpandAll: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressColumnFilter: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressColumnSelectAll: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressPivotMode: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressPivots: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressRowGroups: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressSideButtons: js.UndefOr[Boolean] = js.native
  var toolPanelSuppressValues: js.UndefOr[Boolean] = js.native
  var treeData: js.UndefOr[Boolean] = js.native
  var unSortIcon: js.UndefOr[Boolean] = js.native
  var valueCache: js.UndefOr[Boolean] = js.native
  var valueCacheNeverExpires: js.UndefOr[Boolean] = js.native
  var viewportDatasource: js.UndefOr[IViewportDatasource] = js.native
  var viewportRowModelBufferSize: js.UndefOr[Double] = js.native
  var viewportRowModelPageSize: js.UndefOr[Double] = js.native
}

object GridOptions {
  @scala.inline
  def apply(): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions]
  }
  @scala.inline
  implicit class GridOptionsOps[Self <: GridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentedSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentedSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentedSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentedSort")(js.undefined)
        ret
    }
    @scala.inline
    def withAggFuncs(value: StringDictionary[IAggFunc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggFuncs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggFuncs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggFuncs")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregateOnlyChangedColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateOnlyChangedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateOnlyChangedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateOnlyChangedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignedGrids(value: js.Array[GridOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignedGrids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignedGrids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignedGrids")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowContextMenuWithControlKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowContextMenuWithControlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowContextMenuWithControlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowContextMenuWithControlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysShowStatusBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowStatusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowStatusBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowStatusBar")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularCompileFilters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularCompileFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularCompileFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularCompileFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularCompileHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularCompileHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularCompileHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularCompileHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularCompileRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularCompileRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularCompileRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularCompileRows")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateRows")(js.undefined)
        ret
    }
    @scala.inline
    def withApi(value: GridApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGroupColumnDef(value: ColDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGroupColumnDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGroupColumnDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGroupColumnDef")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSizePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSizePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSizePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSizePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchUpdateWaitMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchUpdateWaitMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchUpdateWaitMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchUpdateWaitMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheBlockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheBlockSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheBlockSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheOverflowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheOverflowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheOverflowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheOverflowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheQuickFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheQuickFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheQuickFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheQuickFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardDeliminator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardDeliminator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardDeliminator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardDeliminator")(js.undefined)
        ret
    }
    @scala.inline
    def withColResizeDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colResizeDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColResizeDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colResizeDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withColWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnApi(value: ColumnApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnApi")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDefs(value: js.Array[ColDef | ColGroupDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnTypes(value: StringDictionary[ColDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: StringDictionary[AgGridRegisteredComponentInput[IComponent[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContractColumnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contractColumnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContractColumnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contractColumnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasource(value: IDatasource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasource")(js.undefined)
        ret
    }
    @scala.inline
    def withDateComponent(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withDateComponentFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateComponentFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateComponentFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateComponentFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColDef(value: ColDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColDef")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColGroupDef(value: ColGroupDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColGroupDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColGroupDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColGroupDef")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExportParams(value: CsvExportParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExportParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExportParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExportParams")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultGroupSortComparator(value: (/* nodeA */ RowNode, /* nodeB */ RowNode) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultGroupSortComparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDefaultGroupSortComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultGroupSortComparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaRowDataMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaRowDataMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaRowDataMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaRowDataMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDetailCellRenderer(value: AnonInstantiableICellRendererComp | ICellRendererFunc | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCellRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailCellRendererFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCellRendererFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailCellRendererFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCellRendererFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailCellRendererParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCellRendererParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailCellRendererParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCellRendererParams")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDoesDataFlower(value: /* dataItem */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesDataFlower")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoesDataFlower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesDataFlower")(js.undefined)
        ret
    }
    @scala.inline
    def withDoesExternalFilterPass(value: /* node */ RowNode => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesExternalFilterPass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoesExternalFilterPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesExternalFilterPass")(js.undefined)
        ret
    }
    @scala.inline
    def withDomLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withEditType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editType")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbedFullWidthRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedFullWidthRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedFullWidthRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedFullWidthRows")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellChangeFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellChangeFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellChangeFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellChangeFlash")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellExpressions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellExpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroupEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOldSetFilterModel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOldSetFilterModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOldSetFilterModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOldSetFilterModel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRangeSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRangeSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRangeSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRangeSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRtl")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableServerSideFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableServerSideFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableServerSideFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableServerSideFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableServerSideSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableServerSideSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableServerSideSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableServerSideSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableStatusBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStatusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableStatusBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStatusBar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnsureDomOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureDomOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnsureDomOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureDomOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterMovesDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMovesDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterMovesDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMovesDown")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterMovesDownAfterEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMovesDownAfterEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterMovesDownAfterEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMovesDownAfterEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelStyles(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcelStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingFiltersHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFiltersHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingFiltersHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFiltersHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withForPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworkComponents(value: StringDictionary[AnonInstantiableAny]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameworkComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidthCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidthCellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFullWidthCellRenderer(value: AnonInstantiableICellRendererComp | ICellRendererFunc | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidthCellRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidthCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidthCellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidthCellRendererFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidthCellRendererFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidthCellRendererFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidthCellRendererFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidthCellRendererParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidthCellRendererParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidthCellRendererParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidthCellRendererParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionsPassive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionsPassive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionsPassive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionsPassive")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionsReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionsReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionsReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBusinessKeyForNode(value: /* node */ RowNode => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBusinessKeyForNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetBusinessKeyForNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBusinessKeyForNode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChildCount(value: /* dataItem */ js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetChildCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContextMenuItems(value: /* params */ GetContextMenuItemsParams => js.Array[String | MenuItemDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContextMenuItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetContextMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContextMenuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDataPath(value: /* data */ js.Any => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDataPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDocument(value: () => Document_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMainMenuItems(value: /* params */ GetMainMenuItemsParams => js.Array[String | MenuItemDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMainMenuItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetMainMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMainMenuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNodeChildDetails(value: /* dataItem */ js.Any => NodeChildDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeChildDetails")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetNodeChildDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeChildDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowClass(value: /* params */ js.Any => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRowClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowHeight(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowNodeId(value: /* data */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowNodeId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRowNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowNodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowStyle(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetRowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupColumnDef(value: ColDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupColumnDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupColumnDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupColumnDef")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupDefaultExpanded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDefaultExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDefaultExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDefaultExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupHideOpenParents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHideOpenParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupHideOpenParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHideOpenParents")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIncludeFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIncludeFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIncludeFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIncludeFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIncludeTotalFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIncludeTotalFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIncludeTotalFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIncludeTotalFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupMultiAutoColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMultiAutoColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupMultiAutoColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMultiAutoColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupRemoveLowestSingleChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRemoveLowestSingleChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupRemoveLowestSingleChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRemoveLowestSingleChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupRemoveSingleChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRemoveSingleChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupRemoveSingleChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRemoveSingleChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupRowAggNodes(value: /* nodes */ js.Array[RowNode] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowAggNodes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGroupRowAggNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowAggNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupRowInnerRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowInnerRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupRowInnerRenderer(value: AnonInstantiableICellRendererComp | ICellRendererFunc | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowInnerRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupRowInnerRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowInnerRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupRowInnerRendererFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowInnerRendererFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupRowInnerRendererFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowInnerRendererFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupRowRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupRowRenderer(value: AnonInstantiableICellRendererComp | ICellRendererFunc | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupRowRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupRowRendererFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowRendererFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupRowRendererFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowRendererFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupRowRendererParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowRendererParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupRowRendererParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRowRendererParams")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSelectsChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelectsChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSelectsChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelectsChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSelectsFiltered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelectsFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSelectsFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelectsFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSuppressAutoColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSuppressAutoColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSuppressAutoColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSuppressAutoColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSuppressBlankHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSuppressBlankHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSuppressBlankHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSuppressBlankHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSuppressRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSuppressRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSuppressRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSuppressRow")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupUseEntireRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupUseEntireRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupUseEntireRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupUseEntireRow")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteInitialRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteInitialRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteInitialRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteInitialRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExternalFilterPresent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternalFilterPresent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsExternalFilterPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternalFilterPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFullWidthCell(value: /* rowNode */ RowNode => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullWidthCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsFullWidthCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullWidthCell")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowMaster(value: /* dataItem */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowMaster")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsRowMaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowMaster")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowSelectable(value: /* node */ RowNode => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelectable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsRowSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingOverlayComponent(value: AnonInstantiableILoadingOverlayComp | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOverlayComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingOverlayComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOverlayComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingOverlayComponentFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOverlayComponentFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingOverlayComponentFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOverlayComponentFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeText")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleTextFunc(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeTextFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleTextFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeTextFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterDetail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBlocksInCache(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBlocksInCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBlocksInCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBlocksInCache")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentDatasourceRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentDatasourceRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentDatasourceRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentDatasourceRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSortKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSortKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSortKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSortKey")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateToNextCell(value: /* params */ NavigateToNextCellParams => GridCellDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateToNextCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNavigateToNextCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateToNextCell")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRowsOverlayComponent(value: AnonInstantiableINoRowsOverlayComp | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRowsOverlayComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRowsOverlayComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRowsOverlayComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRowsOverlayComponentFramework(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRowsOverlayComponentFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRowsOverlayComponentFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRowsOverlayComponentFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBodyScroll(value: /* event */ BodyScrollEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBodyScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBodyScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBodyScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClicked(value: /* event */ CellClickedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellContextMenu(value: /* event */ CellContextMenuEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellDoubleClicked(value: /* event */ CellDoubleClickedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDoubleClicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellDoubleClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDoubleClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellEditingStarted(value: /* event */ CellEditingStartedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellEditingStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellEditingStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellEditingStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellEditingStopped(value: /* event */ CellEditingStoppedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellEditingStopped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellEditingStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellEditingStopped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellFocused(value: /* event */ CellFocusedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellFocused")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellMouseDown(value: /* event */ CellMouseDownEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellMouseOut(value: /* event */ CellMouseOutEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellMouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellMouseOver(value: /* event */ CellMouseOverEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellValueChanged(value: /* event */ CellValueChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnAggFuncChangeRequest(value: /* event */ ColumnAggFuncChangeRequestEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnAggFuncChangeRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnAggFuncChangeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnAggFuncChangeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnEverythingChanged(value: /* event */ ColumnEverythingChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnEverythingChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnEverythingChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnEverythingChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnGroupOpened(value: /* event */ ColumnGroupOpenedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnGroupOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnGroupOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnGroupOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnMoved(value: /* event */ ColumnMovedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnMoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnMoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnMoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnPinned(value: /* event */ ColumnPinnedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnPinned")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnPinned")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnPivotChangeRequest(value: /* event */ ColumnPivotChangeRequestEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnPivotChangeRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnPivotChangeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnPivotChangeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnPivotChanged(value: /* event */ ColumnPivotChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnPivotChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnPivotChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnPivotChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnPivotModeChanged(value: /* event */ ColumnPivotModeChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnPivotModeChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnPivotModeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnPivotModeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnResized(value: /* event */ ColumnResizedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnRowGroupChangeRequest(value: /* event */ ColumnRowGroupChangeRequestEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnRowGroupChangeRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnRowGroupChangeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnRowGroupChangeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnRowGroupChanged(value: /* event */ ColumnRowGroupChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnRowGroupChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnRowGroupChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnRowGroupChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnValueChangeRequest(value: /* event */ ColumnValueChangeRequestEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnValueChangeRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnValueChangeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnValueChangeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnValueChanged(value: /* event */ ColumnValueChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnVisible(value: /* event */ ColumnVisibleEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisplayedColumnsChanged(value: /* event */ DisplayedColumnsChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisplayedColumnsChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisplayedColumnsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisplayedColumnsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStarted(value: /* event */ DragStartedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStopped(value: /* event */ DragStoppedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStopped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStopped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterChanged(value: /* event */ FilterChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterModified(value: /* event */ FilterModifiedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterModified")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterModified")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGridColumnsChanged(value: /* event */ GridColumnsChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridColumnsChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGridColumnsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridColumnsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGridReady(value: /* event */ GridReadyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGridReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGridSizeChanged(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridSizeChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGridSizeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGridSizeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModelUpdated(value: /* event */ ModelUpdatedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModelUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnModelUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModelUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewColumnsLoaded(value: /* event */ NewColumnsLoadedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewColumnsLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewColumnsLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewColumnsLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaginationChanged(value: /* event */ PaginationChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaginationChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaginationChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaginationChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPasteEnd(value: /* event */ PasteEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPasteEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPasteStart(value: /* event */ PasteStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPasteStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPinnedRowDataChanged(value: /* event */ PinnedRowDataChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinnedRowDataChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPinnedRowDataChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPinnedRowDataChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRangeSelectionChanged(value: /* event */ RangeSelectionChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRangeSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRangeSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRangeSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowClicked(value: /* event */ RowClickedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDataChanged(value: /* event */ RowDataChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDataChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDataChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDataChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDataUpdated(value: /* event */ RowDataUpdatedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDataUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDataUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDataUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDoubleClicked(value: /* event */ RowDoubleClickedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDoubleClicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDoubleClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDoubleClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDragEnd(value: /* event */ RowDragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDragEnter(value: /* event */ RowDragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDragLeave(value: /* event */ RowDragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDragMove(value: /* event */ RowDragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDragMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDragMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDragMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowEditingStarted(value: /* event */ RowEditingStartedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditingStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowEditingStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditingStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowEditingStopped(value: /* event */ RowEditingStoppedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditingStopped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowEditingStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowEditingStopped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowGroupOpened(value: /* event */ RowGroupOpenedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowGroupOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowGroupOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowGroupOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowSelected(value: /* event */ RowSelectedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowValueChanged(value: /* event */ RowValueChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* event */ SelectionChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSortChanged(value: /* event */ SortChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSortChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewportChanged(value: /* event */ ViewportChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewportChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVirtualColumnsChanged(value: /* event */ VirtualColumnsChangedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualColumnsChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVirtualColumnsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualColumnsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVirtualRowRemoved(value: /* event */ VirtualRowRemovedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualRowRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVirtualRowRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualRowRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayLoadingTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayLoadingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayLoadingTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayLoadingTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayNoRowsTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayNoRowsTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayNoRowsTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayNoRowsTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationAutoPageSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationAutoPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationAutoPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationAutoPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationNumberFormatter(value: /* params */ PaginationNumberFormatterParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationNumberFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaginationNumberFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationNumberFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationStartPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationStartPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationStartPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationStartPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnedBottomRowData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedBottomRowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinnedBottomRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedBottomRowData")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnedTopRowData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedTopRowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinnedTopRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedTopRowData")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotColumnGroupTotals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotColumnGroupTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotColumnGroupTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotColumnGroupTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotGroupHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGroupHeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotGroupHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGroupHeaderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotHeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotHeaderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotPanelShow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotPanelShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotPanelShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotPanelShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotRowTotals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotRowTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotRowTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotRowTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupParent(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupParent")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcessPopup(value: /* params */ PostProcessPopupParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessPopup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostProcessPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessPopup")(js.undefined)
        ret
    }
    @scala.inline
    def withPostSort(value: /* nodes */ js.Array[RowNode] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postSort")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessCellForClipboard(value: /* params */ ProcessCellForExportParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCellForClipboard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessCellForClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCellForClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessCellFromClipboard(value: /* params */ ProcessCellForExportParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCellFromClipboard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessCellFromClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCellFromClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessDataFromClipboard(value: /* params */ ProcessDataFromClipboardParams => js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDataFromClipboard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessDataFromClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDataFromClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessHeaderForClipboard(value: /* params */ ProcessHeaderForExportParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processHeaderForClipboard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessHeaderForClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processHeaderForClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessRowPostCreate(value: /* params */ ProcessRowParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processRowPostCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessRowPostCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processRowPostCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessSecondaryColDef(value: /* colDef */ ColDef => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processSecondaryColDef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessSecondaryColDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processSecondaryColDef")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessSecondaryColGroupDef(value: /* colGroupDef */ ColGroupDef => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processSecondaryColGroupDef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessSecondaryColGroupDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processSecondaryColGroupDef")(js.undefined)
        ret
    }
    @scala.inline
    def withPurgeClosedRowNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeClosedRowNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurgeClosedRowNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeClosedRowNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickFilterText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickFilterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickFilterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickFilterText")(js.undefined)
        ret
    }
    @scala.inline
    def withRememberGroupStateWhenNewData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberGroupStateWhenNewData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRememberGroupStateWhenNewData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberGroupStateWhenNewData")(js.undefined)
        ret
    }
    @scala.inline
    def withRowBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClass(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClassRules(value: StringDictionary[js.Function | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowClassRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassRules")(js.undefined)
        ret
    }
    @scala.inline
    def withRowData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDeselection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeselection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDeselection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeselection")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDragManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDragManaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragManaged")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroupPanelShow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupPanelShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroupPanelShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupPanelShow")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRowModelType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowModelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowModelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowModelType")(js.undefined)
        ret
    }
    @scala.inline
    def withRowMultiSelectWithClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMultiSelectWithClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowMultiSelectWithClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMultiSelectWithClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withRowStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSendToClipboard(value: /* params */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendToClipboard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSendToClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendToClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideDatasource(value: IServerSideDatasource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideDatasource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideDatasource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideDatasource")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideSortingAlwaysResets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideSortingAlwaysResets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideSortingAlwaysResets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideSortingAlwaysResets")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleClickEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleClickEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleClickEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleClickEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withSlaveGrids(value: js.Array[GridOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slaveGrids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlaveGrids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slaveGrids")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortingOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStopEditingWhenGridLosesFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEditingWhenGridLosesFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopEditingWhenGridLosesFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEditingWhenGridLosesFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressAggAtRootLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAggAtRootLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressAggAtRootLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAggAtRootLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressAggFuncInHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAggFuncInHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressAggFuncInHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAggFuncInHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressAnimationFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAnimationFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressAnimationFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAnimationFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressAsyncEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAsyncEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressAsyncEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAsyncEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAutoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressCellSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressCellSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressCellSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressCellSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressChangeDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressChangeDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressChangeDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressChangeDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressClickEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressClickEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressClickEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressClickEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressClipboardPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressClipboardPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressClipboardPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressClipboardPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressColumnMoveAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressColumnMoveAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressColumnMoveAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressColumnMoveAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressColumnVirtualisation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressColumnVirtualisation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressColumnVirtualisation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressColumnVirtualisation")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressCopyRowsToClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressCopyRowsToClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressCopyRowsToClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressCopyRowsToClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressCsvExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressCsvExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressCsvExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressCsvExport")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressDragLeaveHidesColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressDragLeaveHidesColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressDragLeaveHidesColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressDragLeaveHidesColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressEnterpriseResetOnNewColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressEnterpriseResetOnNewColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressEnterpriseResetOnNewColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressEnterpriseResetOnNewColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressExcelExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressExcelExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressExcelExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressExcelExport")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressFieldDotNotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFieldDotNotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressFieldDotNotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFieldDotNotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressFocusAfterRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFocusAfterRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressFocusAfterRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFocusAfterRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressHorizontalScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressHorizontalScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressHorizontalScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressHorizontalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressLoadingOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressLoadingOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressLoadingOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressLoadingOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMakeColumnVisibleAfterUnGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMakeColumnVisibleAfterUnGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMakeColumnVisibleAfterUnGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMakeColumnVisibleAfterUnGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMenuHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMenuHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMenuHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMenuHide")(js.undefined)
        ret
    }
  }
  
}

