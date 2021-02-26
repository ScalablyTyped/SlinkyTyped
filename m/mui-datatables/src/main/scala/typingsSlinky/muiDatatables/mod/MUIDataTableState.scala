package typingsSlinky.muiDatatables.mod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.muiDatatables.anon.Data
import typingsSlinky.muiDatatables.anon.DataIndex
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableState extends StObject {
  
  var activeColumn: String | Null = js.native
  
  var announceText: String | Null = js.native
  
  var columnOrder: js.Array[Double] = js.native
  
  var columns: js.Array[MUIDataTableColumnState] = js.native
  
  var count: Double = js.native
  
  var data: js.Array[_] = js.native
  
  var displayData: DisplayData = js.native
  
  var expandedRows: MUIDataTableStateRows = js.native
  
  var filterData: js.Array[js.Array[String]] = js.native
  
  var filterList: js.Array[js.Array[String]] = js.native
  
  var page: Double = js.native
  
  var previousSelectedRow: Null | DataIndex = js.native
  
  var rowsPerPage: Double = js.native
  
  var rowsPerPageOptions: js.Array[Double] = js.native
  
  var searchProps: HTMLAttributes[HTMLInputElement] | Null = js.native
  
  var searchText: String | Null = js.native
  
  var selectedRows: MUIDataTableStateRows = js.native
  
  var showResponsive: Boolean = js.native
  
  var sortOrder: MUISortOptions = js.native
}
object MUIDataTableState {
  
  @scala.inline
  def apply(
    columnOrder: js.Array[Double],
    columns: js.Array[MUIDataTableColumnState],
    count: Double,
    data: js.Array[_],
    displayData: DisplayData,
    expandedRows: MUIDataTableStateRows,
    filterData: js.Array[js.Array[String]],
    filterList: js.Array[js.Array[String]],
    page: Double,
    rowsPerPage: Double,
    rowsPerPageOptions: js.Array[Double],
    selectedRows: MUIDataTableStateRows,
    showResponsive: Boolean,
    sortOrder: MUISortOptions
  ): MUIDataTableState = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], displayData = displayData.asInstanceOf[js.Any], expandedRows = expandedRows.asInstanceOf[js.Any], filterData = filterData.asInstanceOf[js.Any], filterList = filterList.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any], rowsPerPageOptions = rowsPerPageOptions.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], showResponsive = showResponsive.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableState]
  }
  
  @scala.inline
  implicit class MUIDataTableStateMutableBuilder[Self <: MUIDataTableState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveColumn(value: String): Self = StObject.set(x, "activeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColumnNull: Self = StObject.set(x, "activeColumn", null)
    
    @scala.inline
    def setAnnounceText(value: String): Self = StObject.set(x, "announceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnounceTextNull: Self = StObject.set(x, "announceText", null)
    
    @scala.inline
    def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnState]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: MUIDataTableColumnState*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDisplayData(value: DisplayData): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataVarargs(value: Data*): Self = StObject.set(x, "displayData", js.Array(value :_*))
    
    @scala.inline
    def setExpandedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterData(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDataVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterData", js.Array(value :_*))
    
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value :_*))
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSelectedRow(value: DataIndex): Self = StObject.set(x, "previousSelectedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSelectedRowNull: Self = StObject.set(x, "previousSelectedRow", null)
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPageOptions(value: js.Array[Double]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPageOptionsVarargs(value: Double*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def setSearchProps(value: HTMLAttributes[HTMLInputElement]): Self = StObject.set(x, "searchProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPropsNull: Self = StObject.set(x, "searchProps", null)
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextNull: Self = StObject.set(x, "searchText", null)
    
    @scala.inline
    def setSelectedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowResponsive(value: Boolean): Self = StObject.set(x, "showResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: MUISortOptions): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
