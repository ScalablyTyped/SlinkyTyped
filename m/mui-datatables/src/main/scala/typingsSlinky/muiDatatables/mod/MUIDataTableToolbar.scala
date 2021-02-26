package typingsSlinky.muiDatatables.mod

import slinky.core.facade.ReactElement
import typingsSlinky.muiDatatables.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableToolbar extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var columnOrder: js.UndefOr[js.Array[Double]] = js.native
  
  var columns: js.Array[MUIDataTableColumnDef] = js.native
  
  var data: js.UndefOr[js.Array[MUIDataTableData]] = js.native
  
  var displayData: js.UndefOr[DisplayData] = js.native
  
  var filterData: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  var filterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var options: js.UndefOr[MUIDataTableOptions] = js.native
  
  var resetFilters: js.UndefOr[js.Function0[_]] = js.native
  
  var searchClose: js.UndefOr[js.Function0[_]] = js.native
  
  var searchText: js.UndefOr[ReactElement] = js.native
  
  var searchTextUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var setTableActions: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var tableRef: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
  
  var toggleViewColumn: js.UndefOr[js.Function1[/* a */ js.Any, _]] = js.native
  
  var updateFilterByType: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}
object MUIDataTableToolbar {
  
  @scala.inline
  def apply(columns: js.Array[MUIDataTableColumnDef]): MUIDataTableToolbar = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableToolbar]
  }
  
  @scala.inline
  implicit class MUIDataTableToolbarMutableBuilder[Self <: MUIDataTableToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrderUndefined: Self = StObject.set(x, "columnOrder", js.undefined)
    
    @scala.inline
    def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[MUIDataTableData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: MUIDataTableData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDisplayData(value: DisplayData): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    @scala.inline
    def setDisplayDataVarargs(value: Data*): Self = StObject.set(x, "displayData", js.Array(value :_*))
    
    @scala.inline
    def setFilterData(value: js.Array[js.Array[_]]): Self = StObject.set(x, "filterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDataUndefined: Self = StObject.set(x, "filterData", js.undefined)
    
    @scala.inline
    def setFilterDataVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "filterData", js.Array(value :_*))
    
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterListUndefined: Self = StObject.set(x, "filterList", js.undefined)
    
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value :_*))
    
    @scala.inline
    def setFilterUpdate(value: /* args */ js.Any => _): Self = StObject.set(x, "filterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterUpdateUndefined: Self = StObject.set(x, "filterUpdate", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResetFilters(value: () => _): Self = StObject.set(x, "resetFilters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetFiltersUndefined: Self = StObject.set(x, "resetFilters", js.undefined)
    
    @scala.inline
    def setSearchClose(value: () => _): Self = StObject.set(x, "searchClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearchCloseUndefined: Self = StObject.set(x, "searchClose", js.undefined)
    
    @scala.inline
    def setSearchText(value: ReactElement): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextReactElement(value: ReactElement): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    @scala.inline
    def setSearchTextUpdate(value: /* args */ js.Any => _): Self = StObject.set(x, "searchTextUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchTextUpdateUndefined: Self = StObject.set(x, "searchTextUpdate", js.undefined)
    
    @scala.inline
    def setSetTableActions(value: /* args */ js.Any => _): Self = StObject.set(x, "setTableActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTableActionsUndefined: Self = StObject.set(x, "setTableActions", js.undefined)
    
    @scala.inline
    def setTableRef(value: /* args */ js.Any => _): Self = StObject.set(x, "tableRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableRefUndefined: Self = StObject.set(x, "tableRef", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToggleViewColumn(value: /* a */ js.Any => _): Self = StObject.set(x, "toggleViewColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleViewColumnUndefined: Self = StObject.set(x, "toggleViewColumn", js.undefined)
    
    @scala.inline
    def setUpdateFilterByType(value: /* args */ js.Any => _): Self = StObject.set(x, "updateFilterByType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateFilterByTypeUndefined: Self = StObject.set(x, "updateFilterByType", js.undefined)
  }
}
