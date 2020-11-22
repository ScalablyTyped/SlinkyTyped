package typingsSlinky.muiDatatables.mod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.muiDatatables.anon.ColIndex
import typingsSlinky.muiDatatables.anon.Columns
import typingsSlinky.muiDatatables.anon.DataLookup
import typingsSlinky.muiDatatables.anon.Lookup
import typingsSlinky.muiDatatables.anon.PartialMUIDataTableTextLaBody
import typingsSlinky.muiDatatables.anon.Partialfilenamestringsepa
import typingsSlinky.muiDatatables.anon.RowIndex
import typingsSlinky.muiDatatables.anon.XAxis
import typingsSlinky.muiDatatables.muiDatatablesBooleans.`false`
import typingsSlinky.muiDatatables.muiDatatablesStrings.above
import typingsSlinky.muiDatatables.muiDatatablesStrings.asc
import typingsSlinky.muiDatatables.muiDatatablesStrings.chip
import typingsSlinky.muiDatatables.muiDatatablesStrings.desc
import typingsSlinky.muiDatatables.muiDatatablesStrings.none
import typingsSlinky.muiDatatables.muiDatatablesStrings.replace
import typingsSlinky.muiDatatables.muiDatatablesStrings.reset
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  caseSensitive :boolean,   confirmFilters :boolean,   columnOrder :std.Array<number>,   count :number, customFilterDialogFooter (filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList'], applyNewFilters : (args : ...any): any | undefined): react.react.ReactNode, customFooter (rowCount : number, page : number, rowsPerPage : number, changeRowsPerPage : (page : string | number): void, changePage : (newPage : number): void, textLabels : std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels>): react.react.ReactNode, customRowRender (data : std.Array<any>, dataIndex : number, rowIndex : number): react.react.ReactNode, customSearch (searchQuery : string, currentRow : std.Array<any>, columns : std.Array<any>): boolean, customSearchRender (searchText : string, handleSearch : (text : string): void, hideSearch : (): void, options : any): react.react.Component<{}, {}, any> | react.react.<global>.JSX.Element, customSort (data : std.Array<any>, colIndex : number, order : string): std.Array<any>, customTableBodyFooterRender (options : {  data :std.Array<any>,   selectableRows :mui-datatables.mui-datatables.SelectableRows,   columns :std.Array<any>}): any, customToolbar (data : {  displayData :mui-datatables.mui-datatables.DisplayData}): react.react.ReactNode, customToolbarSelect (selectedRows : {  data :std.Array<{  index :number,   dataIndex :number}>,   lookup :{[key: number] : boolean}}, displayData : mui-datatables.mui-datatables.DisplayData, setSelectedRows : (rows : std.Array<number>): void): react.react.ReactNode,   disableToolbarSelect :boolean,   download :mui-datatables.mui-datatables.ToolbarButton,   downloadOptions :std.Partial<{  filename :string,   separator :string,   filterOptions :std.Partial<{  useDisplayedColumnsOnly :boolean,   useDisplayedRowsOnly :boolean}>}>,   draggableColumns :mui-datatables.mui-datatables.MUIDataTableDraggableColumns,   elevation :number,   enableNestedDataAccess :string,   expandableRows :boolean,   expandableRowsHeader :boolean,   expandableRowsOnClick :boolean,   filter :mui-datatables.mui-datatables.ToolbarButton,   filterArrayFullMatch :boolean,   filterType :mui-datatables.mui-datatables.FilterType,   fixedHeader :boolean,   fixedHeaderOptions :{  xAxis :boolean,   yAxis :boolean},   fixedSelectColumn :boolean, isRowExpandable (dataIndex : number, expandedRows : mui-datatables.mui-datatables.MUIDataTableIsRowCheck | undefined): boolean, isRowSelectable (dataIndex : number, selectedRows : mui-datatables.mui-datatables.MUIDataTableIsRowCheck | undefined): boolean,   jumpToPage :boolean, onCellClick (colData : any, cellMeta : {  colIndex :number,   rowIndex :number,   dataIndex :number,   event :react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>}): void, onChangePage (currentPage : number): void, onChangeRowsPerPage (numberOfRows : number): void, onColumnOrderChange (newColumnOrder : std.Array<number>, columnIndex : number, newPosition : number): void, onColumnSortChange (changedColumn : string, direction : 'asc' | 'desc'): void,   onColumnViewChange :(changedColumn : string, action : string): void | undefined, onDownload (buildHead : (columns : any): string, buildBody : (data : any): string, columns : any, data : any): string | boolean, onFilterChange (changedColumn : string | mui-datatables.mui-datatables.MUIDataTableColumn | null, filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList'], type : mui-datatables.mui-datatables.FilterType | 'chip' | 'reset', changedColumnIndex : number, displayData : mui-datatables.mui-datatables.DisplayData): void, onFilterChipClose (index : number, removedFilter : string, filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList']): void, onFilterConfirm (filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList']): void, onFilterDialogClose (): void, onFilterDialogOpen (): void, onRowClick (rowData : std.Array<string>, rowMeta : {  dataIndex :number,   rowIndex :number}): void, onRowExpansionChange (currentRowsExpanded : std.Array<any>, allRowsExpanded : std.Array<any>, rowsExpanded : std.Array<any> | undefined): void, onRowsDelete (rowsDeleted : {  lookup :{[dataIndex: number] : boolean},   data :std.Array<{  index :number,   dataIndex :number}>}, newTableData : std.Array<any>): void | false, onRowSelectionChange (currentRowsSelected : std.Array<any>, allRowsSelected : std.Array<any>, rowsSelected : std.Array<any> | undefined): void, onSearchChange (searchText : string | null): void, onSearchClose (): void, onSearchOpen (): void, onTableChange (action : string, tableState : mui-datatables.mui-datatables.MUIDataTableState): void, onTableInit (action : string, tableState : mui-datatables.mui-datatables.MUIDataTableState): void, onViewColumnsChange (changedColumn : string, action : string): void,   page :number,   pagination :boolean,   print :mui-datatables.mui-datatables.ToolbarButton, renderExpandableRow (rowData : std.Array<string>, rowMeta : {  dataIndex :number,   rowIndex :number}): react.react.ReactNode,   resizableColumns :boolean,   responsive :mui-datatables.mui-datatables.Responsive,   rowHover :boolean,   rowsExpanded :std.Array<any>,   rowsPerPage :number,   rowsPerPageOptions :std.Array<number>,   rowsSelected :std.Array<any>,   search :mui-datatables.mui-datatables.ToolbarButton,   searchOpen :boolean,   searchProps :react.react.HTMLAttributes<std.HTMLInputElement>,   searchPlaceholder :string,   searchText :string,   selectableRows :mui-datatables.mui-datatables.SelectableRows,   selectableRowsHeader :boolean,   selectableRowsHideCheckboxes :boolean,   selectableRowsOnClick :boolean,   selectToolbarPlacement :'replace' | 'above' | 'none',   serverSide :boolean, setFilterChipProps (colIndex : number, colName : string, data : std.ReadonlyArray<std.Array<any>>): mui-datatables.mui-datatables.MUIDataTableChip, setRowProps (row : std.Array<any>, dataIndex : number, rowIndex : number): object, setTableProps (): object,   sort :boolean,   sortFilterList :boolean,   sortOrder :mui-datatables.mui-datatables.MUISortOptions,   tableId :string,   tableBodyHeight :string,   tableBodyMaxHeight :string,   textLabels :std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels>,   viewColumns :mui-datatables.mui-datatables.ToolbarButton}> */
@js.native
trait MUIDataTableOptions extends js.Object {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var columnOrder: js.UndefOr[js.Array[Double]] = js.native
  
  var confirmFilters: js.UndefOr[Boolean] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var customFilterDialogFooter: js.UndefOr[
    js.Function2[
      /* filterList */ js.Array[js.Array[String]], 
      /* applyNewFilters */ js.UndefOr[js.Function1[/* repeated */ js.Any, _]], 
      ReactElement
    ]
  ] = js.native
  
  var customFooter: js.UndefOr[
    js.Function6[
      /* rowCount */ Double, 
      /* page */ Double, 
      /* rowsPerPage */ Double, 
      /* changeRowsPerPage */ js.Function1[/* page */ String | Double, Unit], 
      /* changePage */ js.Function1[/* newPage */ Double, Unit], 
      /* textLabels */ PartialMUIDataTableTextLaBody, 
      ReactElement
    ]
  ] = js.native
  
  var customRowRender: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* dataIndex */ Double, /* rowIndex */ Double, ReactElement]
  ] = js.native
  
  var customSearch: js.UndefOr[
    js.Function3[
      /* searchQuery */ String, 
      /* currentRow */ js.Array[_], 
      /* columns */ js.Array[_], 
      Boolean
    ]
  ] = js.native
  
  var customSearchRender: js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Function1[/* text */ String, Unit], 
      /* hideSearch */ js.Function0[Unit], 
      /* options */ js.Any, 
      ReactComponentClass[js.Object] | ReactElement
    ]
  ] = js.native
  
  var customSort: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* colIndex */ Double, /* order */ String, js.Array[_]]
  ] = js.native
  
  var customTableBodyFooterRender: js.UndefOr[js.Function1[/* options */ Columns, _]] = js.native
  
  var customToolbar: js.UndefOr[
    js.Function1[/* data */ typingsSlinky.muiDatatables.anon.DisplayData, ReactElement]
  ] = js.native
  
  var customToolbarSelect: js.UndefOr[
    js.Function3[
      /* selectedRows */ DataLookup, 
      /* displayData */ DisplayData, 
      /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit], 
      ReactElement
    ]
  ] = js.native
  
  var disableToolbarSelect: js.UndefOr[Boolean] = js.native
  
  var download: js.UndefOr[ToolbarButton] = js.native
  
  var downloadOptions: js.UndefOr[Partialfilenamestringsepa] = js.native
  
  var draggableColumns: js.UndefOr[MUIDataTableDraggableColumns] = js.native
  
  var elevation: js.UndefOr[Double] = js.native
  
  var enableNestedDataAccess: js.UndefOr[String] = js.native
  
  var expandableRows: js.UndefOr[Boolean] = js.native
  
  var expandableRowsHeader: js.UndefOr[Boolean] = js.native
  
  var expandableRowsOnClick: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[ToolbarButton] = js.native
  
  var filterArrayFullMatch: js.UndefOr[Boolean] = js.native
  
  var filterType: js.UndefOr[FilterType] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var fixedHeaderOptions: js.UndefOr[XAxis] = js.native
  
  var fixedSelectColumn: js.UndefOr[Boolean] = js.native
  
  var isRowExpandable: js.UndefOr[
    js.Function2[
      /* dataIndex */ Double, 
      /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck], 
      Boolean
    ]
  ] = js.native
  
  var isRowSelectable: js.UndefOr[
    js.Function2[
      /* dataIndex */ Double, 
      /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck], 
      Boolean
    ]
  ] = js.native
  
  var jumpToPage: js.UndefOr[Boolean] = js.native
  
  var onCellClick: js.UndefOr[js.Function2[/* colData */ js.Any, /* cellMeta */ ColIndex, Unit]] = js.native
  
  var onChangePage: js.UndefOr[js.Function1[/* currentPage */ Double, Unit]] = js.native
  
  var onChangeRowsPerPage: js.UndefOr[js.Function1[/* numberOfRows */ Double, Unit]] = js.native
  
  var onColumnOrderChange: js.UndefOr[
    js.Function3[
      /* newColumnOrder */ js.Array[Double], 
      /* columnIndex */ Double, 
      /* newPosition */ Double, 
      Unit
    ]
  ] = js.native
  
  var onColumnSortChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* direction */ asc | desc, Unit]] = js.native
  
  var onColumnViewChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* action */ String, Unit]] = js.native
  
  var onDownload: js.UndefOr[
    js.Function4[
      /* buildHead */ js.Function1[/* columns */ js.Any, String], 
      /* buildBody */ js.Function1[/* data */ js.Any, String], 
      /* columns */ js.Any, 
      /* data */ js.Any, 
      String | Boolean
    ]
  ] = js.native
  
  var onFilterChange: js.UndefOr[
    js.Function5[
      /* changedColumn */ String | MUIDataTableColumn | Null, 
      /* filterList */ js.Array[js.Array[String]], 
      /* type */ FilterType | chip | reset, 
      /* changedColumnIndex */ Double, 
      /* displayData */ DisplayData, 
      Unit
    ]
  ] = js.native
  
  var onFilterChipClose: js.UndefOr[
    js.Function3[
      /* index */ Double, 
      /* removedFilter */ String, 
      /* filterList */ js.Array[js.Array[String]], 
      Unit
    ]
  ] = js.native
  
  var onFilterConfirm: js.UndefOr[js.Function1[/* filterList */ js.Array[js.Array[String]], Unit]] = js.native
  
  var onFilterDialogClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFilterDialogOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRowClick: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ RowIndex, Unit]] = js.native
  
  var onRowExpansionChange: js.UndefOr[
    js.Function3[
      /* currentRowsExpanded */ js.Array[_], 
      /* allRowsExpanded */ js.Array[_], 
      /* rowsExpanded */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ] = js.native
  
  var onRowSelectionChange: js.UndefOr[
    js.Function3[
      /* currentRowsSelected */ js.Array[_], 
      /* allRowsSelected */ js.Array[_], 
      /* rowsSelected */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ] = js.native
  
  var onRowsDelete: js.UndefOr[
    js.Function2[/* rowsDeleted */ Lookup, /* newTableData */ js.Array[_], Unit | `false`]
  ] = js.native
  
  var onSearchChange: js.UndefOr[js.Function1[/* searchText */ String | Null, Unit]] = js.native
  
  var onSearchClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSearchOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTableChange: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.native
  
  var onTableInit: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.native
  
  var onViewColumnsChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* action */ String, Unit]] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var pagination: js.UndefOr[Boolean] = js.native
  
  var print: js.UndefOr[ToolbarButton] = js.native
  
  var renderExpandableRow: js.UndefOr[
    js.Function2[/* rowData */ js.Array[String], /* rowMeta */ RowIndex, ReactElement]
  ] = js.native
  
  var resizableColumns: js.UndefOr[Boolean] = js.native
  
  var responsive: js.UndefOr[Responsive] = js.native
  
  var rowHover: js.UndefOr[Boolean] = js.native
  
  var rowsExpanded: js.UndefOr[js.Array[_]] = js.native
  
  var rowsPerPage: js.UndefOr[Double] = js.native
  
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
  
  var rowsSelected: js.UndefOr[js.Array[_]] = js.native
  
  var search: js.UndefOr[ToolbarButton] = js.native
  
  var searchOpen: js.UndefOr[Boolean] = js.native
  
  var searchPlaceholder: js.UndefOr[String] = js.native
  
  var searchProps: js.UndefOr[HTMLAttributes[HTMLInputElement]] = js.native
  
  var searchText: js.UndefOr[String] = js.native
  
  var selectToolbarPlacement: js.UndefOr[replace | above | none] = js.native
  
  var selectableRows: js.UndefOr[SelectableRows] = js.native
  
  var selectableRowsHeader: js.UndefOr[Boolean] = js.native
  
  var selectableRowsHideCheckboxes: js.UndefOr[Boolean] = js.native
  
  var selectableRowsOnClick: js.UndefOr[Boolean] = js.native
  
  var serverSide: js.UndefOr[Boolean] = js.native
  
  var setFilterChipProps: js.UndefOr[
    js.Function3[
      /* colIndex */ Double, 
      /* colName */ String, 
      /* data */ js.Array[js.Array[_]], 
      MUIDataTableChip
    ]
  ] = js.native
  
  var setRowProps: js.UndefOr[
    js.Function3[/* row */ js.Array[_], /* dataIndex */ Double, /* rowIndex */ Double, js.Object]
  ] = js.native
  
  var setTableProps: js.UndefOr[js.Function0[js.Object]] = js.native
  
  var sort: js.UndefOr[Boolean] = js.native
  
  var sortFilterList: js.UndefOr[Boolean] = js.native
  
  var sortOrder: js.UndefOr[MUISortOptions] = js.native
  
  var tableBodyHeight: js.UndefOr[String] = js.native
  
  var tableBodyMaxHeight: js.UndefOr[String] = js.native
  
  var tableId: js.UndefOr[String] = js.native
  
  var textLabels: js.UndefOr[PartialMUIDataTableTextLaBody] = js.native
  
  var viewColumns: js.UndefOr[ToolbarButton] = js.native
}
object MUIDataTableOptions {
  
  @scala.inline
  def apply(): MUIDataTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableOptions]
  }
  
  @scala.inline
  implicit class MUIDataTableOptionsOps[Self <: MUIDataTableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setColumnOrderVarargs(value: Double*): Self = this.set("columnOrder", js.Array(value :_*))
    
    @scala.inline
    def setColumnOrder(value: js.Array[Double]): Self = this.set("columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnOrder: Self = this.set("columnOrder", js.undefined)
    
    @scala.inline
    def setConfirmFilters(value: Boolean): Self = this.set("confirmFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmFilters: Self = this.set("confirmFilters", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCustomFilterDialogFooter(
      value: (/* filterList */ js.Array[js.Array[String]], /* applyNewFilters */ js.UndefOr[js.Function1[/* repeated */ js.Any, _]]) => ReactElement
    ): Self = this.set("customFilterDialogFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCustomFilterDialogFooter: Self = this.set("customFilterDialogFooter", js.undefined)
    
    @scala.inline
    def setCustomFooter(
      value: (/* rowCount */ Double, /* page */ Double, /* rowsPerPage */ Double, /* changeRowsPerPage */ js.Function1[/* page */ String | Double, Unit], /* changePage */ js.Function1[/* newPage */ Double, Unit], /* textLabels */ PartialMUIDataTableTextLaBody) => ReactElement
    ): Self = this.set("customFooter", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteCustomFooter: Self = this.set("customFooter", js.undefined)
    
    @scala.inline
    def setCustomRowRender(value: (/* data */ js.Array[_], /* dataIndex */ Double, /* rowIndex */ Double) => ReactElement): Self = this.set("customRowRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCustomRowRender: Self = this.set("customRowRender", js.undefined)
    
    @scala.inline
    def setCustomSearch(
      value: (/* searchQuery */ String, /* currentRow */ js.Array[_], /* columns */ js.Array[_]) => Boolean
    ): Self = this.set("customSearch", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCustomSearch: Self = this.set("customSearch", js.undefined)
    
    @scala.inline
    def setCustomSearchRender(
      value: (/* searchText */ String, /* handleSearch */ js.Function1[/* text */ String, Unit], /* hideSearch */ js.Function0[Unit], /* options */ js.Any) => ReactComponentClass[js.Object] | ReactElement
    ): Self = this.set("customSearchRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteCustomSearchRender: Self = this.set("customSearchRender", js.undefined)
    
    @scala.inline
    def setCustomSort(value: (/* data */ js.Array[_], /* colIndex */ Double, /* order */ String) => js.Array[_]): Self = this.set("customSort", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCustomSort: Self = this.set("customSort", js.undefined)
    
    @scala.inline
    def setCustomTableBodyFooterRender(value: /* options */ Columns => _): Self = this.set("customTableBodyFooterRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomTableBodyFooterRender: Self = this.set("customTableBodyFooterRender", js.undefined)
    
    @scala.inline
    def setCustomToolbar(value: /* data */ typingsSlinky.muiDatatables.anon.DisplayData => ReactElement): Self = this.set("customToolbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomToolbar: Self = this.set("customToolbar", js.undefined)
    
    @scala.inline
    def setCustomToolbarSelect(
      value: (/* selectedRows */ DataLookup, /* displayData */ DisplayData, /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit]) => ReactElement
    ): Self = this.set("customToolbarSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCustomToolbarSelect: Self = this.set("customToolbarSelect", js.undefined)
    
    @scala.inline
    def setDisableToolbarSelect(value: Boolean): Self = this.set("disableToolbarSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableToolbarSelect: Self = this.set("disableToolbarSelect", js.undefined)
    
    @scala.inline
    def setDownload(value: ToolbarButton): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setDownloadOptions(value: Partialfilenamestringsepa): Self = this.set("downloadOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadOptions: Self = this.set("downloadOptions", js.undefined)
    
    @scala.inline
    def setDraggableColumns(value: MUIDataTableDraggableColumns): Self = this.set("draggableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableColumns: Self = this.set("draggableColumns", js.undefined)
    
    @scala.inline
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    
    @scala.inline
    def setEnableNestedDataAccess(value: String): Self = this.set("enableNestedDataAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNestedDataAccess: Self = this.set("enableNestedDataAccess", js.undefined)
    
    @scala.inline
    def setExpandableRows(value: Boolean): Self = this.set("expandableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandableRows: Self = this.set("expandableRows", js.undefined)
    
    @scala.inline
    def setExpandableRowsHeader(value: Boolean): Self = this.set("expandableRowsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandableRowsHeader: Self = this.set("expandableRowsHeader", js.undefined)
    
    @scala.inline
    def setExpandableRowsOnClick(value: Boolean): Self = this.set("expandableRowsOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandableRowsOnClick: Self = this.set("expandableRowsOnClick", js.undefined)
    
    @scala.inline
    def setFilter(value: ToolbarButton): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterArrayFullMatch(value: Boolean): Self = this.set("filterArrayFullMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterArrayFullMatch: Self = this.set("filterArrayFullMatch", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setFixedHeaderOptions(value: XAxis): Self = this.set("fixedHeaderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeaderOptions: Self = this.set("fixedHeaderOptions", js.undefined)
    
    @scala.inline
    def setFixedSelectColumn(value: Boolean): Self = this.set("fixedSelectColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedSelectColumn: Self = this.set("fixedSelectColumn", js.undefined)
    
    @scala.inline
    def setIsRowExpandable(value: (/* dataIndex */ Double, /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean): Self = this.set("isRowExpandable", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsRowExpandable: Self = this.set("isRowExpandable", js.undefined)
    
    @scala.inline
    def setIsRowSelectable(value: (/* dataIndex */ Double, /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean): Self = this.set("isRowSelectable", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsRowSelectable: Self = this.set("isRowSelectable", js.undefined)
    
    @scala.inline
    def setJumpToPage(value: Boolean): Self = this.set("jumpToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJumpToPage: Self = this.set("jumpToPage", js.undefined)
    
    @scala.inline
    def setOnCellClick(value: (/* colData */ js.Any, /* cellMeta */ ColIndex) => Unit): Self = this.set("onCellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    
    @scala.inline
    def setOnChangePage(value: /* currentPage */ Double => Unit): Self = this.set("onChangePage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangePage: Self = this.set("onChangePage", js.undefined)
    
    @scala.inline
    def setOnChangeRowsPerPage(value: /* numberOfRows */ Double => Unit): Self = this.set("onChangeRowsPerPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeRowsPerPage: Self = this.set("onChangeRowsPerPage", js.undefined)
    
    @scala.inline
    def setOnColumnOrderChange(
      value: (/* newColumnOrder */ js.Array[Double], /* columnIndex */ Double, /* newPosition */ Double) => Unit
    ): Self = this.set("onColumnOrderChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnColumnOrderChange: Self = this.set("onColumnOrderChange", js.undefined)
    
    @scala.inline
    def setOnColumnSortChange(value: (/* changedColumn */ String, /* direction */ asc | desc) => Unit): Self = this.set("onColumnSortChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColumnSortChange: Self = this.set("onColumnSortChange", js.undefined)
    
    @scala.inline
    def setOnColumnViewChange(value: (/* changedColumn */ String, /* action */ String) => Unit): Self = this.set("onColumnViewChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColumnViewChange: Self = this.set("onColumnViewChange", js.undefined)
    
    @scala.inline
    def setOnDownload(
      value: (/* buildHead */ js.Function1[/* columns */ js.Any, String], /* buildBody */ js.Function1[/* data */ js.Any, String], /* columns */ js.Any, /* data */ js.Any) => String | Boolean
    ): Self = this.set("onDownload", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnDownload: Self = this.set("onDownload", js.undefined)
    
    @scala.inline
    def setOnFilterChange(
      value: (/* changedColumn */ String | MUIDataTableColumn | Null, /* filterList */ js.Array[js.Array[String]], /* type */ FilterType | chip | reset, /* changedColumnIndex */ Double, /* displayData */ DisplayData) => Unit
    ): Self = this.set("onFilterChange", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnFilterChange: Self = this.set("onFilterChange", js.undefined)
    
    @scala.inline
    def setOnFilterChipClose(
      value: (/* index */ Double, /* removedFilter */ String, /* filterList */ js.Array[js.Array[String]]) => Unit
    ): Self = this.set("onFilterChipClose", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnFilterChipClose: Self = this.set("onFilterChipClose", js.undefined)
    
    @scala.inline
    def setOnFilterConfirm(value: /* filterList */ js.Array[js.Array[String]] => Unit): Self = this.set("onFilterConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilterConfirm: Self = this.set("onFilterConfirm", js.undefined)
    
    @scala.inline
    def setOnFilterDialogClose(value: () => Unit): Self = this.set("onFilterDialogClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFilterDialogClose: Self = this.set("onFilterDialogClose", js.undefined)
    
    @scala.inline
    def setOnFilterDialogOpen(value: () => Unit): Self = this.set("onFilterDialogOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFilterDialogOpen: Self = this.set("onFilterDialogOpen", js.undefined)
    
    @scala.inline
    def setOnRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => Unit): Self = this.set("onRowClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowExpansionChange(
      value: (/* currentRowsExpanded */ js.Array[_], /* allRowsExpanded */ js.Array[_], /* rowsExpanded */ js.UndefOr[js.Array[_]]) => Unit
    ): Self = this.set("onRowExpansionChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRowExpansionChange: Self = this.set("onRowExpansionChange", js.undefined)
    
    @scala.inline
    def setOnRowSelectionChange(
      value: (/* currentRowsSelected */ js.Array[_], /* allRowsSelected */ js.Array[_], /* rowsSelected */ js.UndefOr[js.Array[_]]) => Unit
    ): Self = this.set("onRowSelectionChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRowSelectionChange: Self = this.set("onRowSelectionChange", js.undefined)
    
    @scala.inline
    def setOnRowsDelete(value: (/* rowsDeleted */ Lookup, /* newTableData */ js.Array[_]) => Unit | `false`): Self = this.set("onRowsDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowsDelete: Self = this.set("onRowsDelete", js.undefined)
    
    @scala.inline
    def setOnSearchChange(value: /* searchText */ String | Null => Unit): Self = this.set("onSearchChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSearchChange: Self = this.set("onSearchChange", js.undefined)
    
    @scala.inline
    def setOnSearchClose(value: () => Unit): Self = this.set("onSearchClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSearchClose: Self = this.set("onSearchClose", js.undefined)
    
    @scala.inline
    def setOnSearchOpen(value: () => Unit): Self = this.set("onSearchOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSearchOpen: Self = this.set("onSearchOpen", js.undefined)
    
    @scala.inline
    def setOnTableChange(value: (/* action */ String, /* tableState */ MUIDataTableState) => Unit): Self = this.set("onTableChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTableChange: Self = this.set("onTableChange", js.undefined)
    
    @scala.inline
    def setOnTableInit(value: (/* action */ String, /* tableState */ MUIDataTableState) => Unit): Self = this.set("onTableInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTableInit: Self = this.set("onTableInit", js.undefined)
    
    @scala.inline
    def setOnViewColumnsChange(value: (/* changedColumn */ String, /* action */ String) => Unit): Self = this.set("onViewColumnsChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnViewColumnsChange: Self = this.set("onViewColumnsChange", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setPrint(value: ToolbarButton): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    
    @scala.inline
    def setRenderExpandableRow(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => ReactElement): Self = this.set("renderExpandableRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderExpandableRow: Self = this.set("renderExpandableRow", js.undefined)
    
    @scala.inline
    def setResizableColumns(value: Boolean): Self = this.set("resizableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizableColumns: Self = this.set("resizableColumns", js.undefined)
    
    @scala.inline
    def setResponsive(value: Responsive): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setRowHover(value: Boolean): Self = this.set("rowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHover: Self = this.set("rowHover", js.undefined)
    
    @scala.inline
    def setRowsExpandedVarargs(value: js.Any*): Self = this.set("rowsExpanded", js.Array(value :_*))
    
    @scala.inline
    def setRowsExpanded(value: js.Array[_]): Self = this.set("rowsExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsExpanded: Self = this.set("rowsExpanded", js.undefined)
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = this.set("rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsPerPage: Self = this.set("rowsPerPage", js.undefined)
    
    @scala.inline
    def setRowsPerPageOptionsVarargs(value: Double*): Self = this.set("rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def setRowsPerPageOptions(value: js.Array[Double]): Self = this.set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsPerPageOptions: Self = this.set("rowsPerPageOptions", js.undefined)
    
    @scala.inline
    def setRowsSelectedVarargs(value: js.Any*): Self = this.set("rowsSelected", js.Array(value :_*))
    
    @scala.inline
    def setRowsSelected(value: js.Array[_]): Self = this.set("rowsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsSelected: Self = this.set("rowsSelected", js.undefined)
    
    @scala.inline
    def setSearch(value: ToolbarButton): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSearchOpen(value: Boolean): Self = this.set("searchOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchOpen: Self = this.set("searchOpen", js.undefined)
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSearchProps(value: HTMLAttributes[HTMLInputElement]): Self = this.set("searchProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchProps: Self = this.set("searchProps", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
    
    @scala.inline
    def setSelectToolbarPlacement(value: replace | above | none): Self = this.set("selectToolbarPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectToolbarPlacement: Self = this.set("selectToolbarPlacement", js.undefined)
    
    @scala.inline
    def setSelectableRows(value: SelectableRows): Self = this.set("selectableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectableRows: Self = this.set("selectableRows", js.undefined)
    
    @scala.inline
    def setSelectableRowsHeader(value: Boolean): Self = this.set("selectableRowsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectableRowsHeader: Self = this.set("selectableRowsHeader", js.undefined)
    
    @scala.inline
    def setSelectableRowsHideCheckboxes(value: Boolean): Self = this.set("selectableRowsHideCheckboxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectableRowsHideCheckboxes: Self = this.set("selectableRowsHideCheckboxes", js.undefined)
    
    @scala.inline
    def setSelectableRowsOnClick(value: Boolean): Self = this.set("selectableRowsOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectableRowsOnClick: Self = this.set("selectableRowsOnClick", js.undefined)
    
    @scala.inline
    def setServerSide(value: Boolean): Self = this.set("serverSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSide: Self = this.set("serverSide", js.undefined)
    
    @scala.inline
    def setSetFilterChipProps(
      value: (/* colIndex */ Double, /* colName */ String, /* data */ js.Array[js.Array[_]]) => MUIDataTableChip
    ): Self = this.set("setFilterChipProps", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetFilterChipProps: Self = this.set("setFilterChipProps", js.undefined)
    
    @scala.inline
    def setSetRowProps(value: (/* row */ js.Array[_], /* dataIndex */ Double, /* rowIndex */ Double) => js.Object): Self = this.set("setRowProps", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetRowProps: Self = this.set("setRowProps", js.undefined)
    
    @scala.inline
    def setSetTableProps(value: () => js.Object): Self = this.set("setTableProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetTableProps: Self = this.set("setTableProps", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortFilterList(value: Boolean): Self = this.set("sortFilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortFilterList: Self = this.set("sortFilterList", js.undefined)
    
    @scala.inline
    def setSortOrder(value: MUISortOptions): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setTableBodyHeight(value: String): Self = this.set("tableBodyHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyHeight: Self = this.set("tableBodyHeight", js.undefined)
    
    @scala.inline
    def setTableBodyMaxHeight(value: String): Self = this.set("tableBodyMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyMaxHeight: Self = this.set("tableBodyMaxHeight", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
    
    @scala.inline
    def setTextLabels(value: PartialMUIDataTableTextLaBody): Self = this.set("textLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextLabels: Self = this.set("textLabels", js.undefined)
    
    @scala.inline
    def setViewColumns(value: ToolbarButton): Self = this.set("viewColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewColumns: Self = this.set("viewColumns", js.undefined)
  }
}
