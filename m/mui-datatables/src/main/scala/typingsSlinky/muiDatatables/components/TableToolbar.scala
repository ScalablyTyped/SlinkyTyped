package typingsSlinky.muiDatatables.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.anon.Data
import typingsSlinky.muiDatatables.mod.DisplayData
import typingsSlinky.muiDatatables.mod.MUIDataTableColumnDef
import typingsSlinky.muiDatatables.mod.MUIDataTableData
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import typingsSlinky.muiDatatables.mod.MUIDataTableToolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableToolbar {
  
  @scala.inline
  def apply(columns: js.Array[MUIDataTableColumnDef]): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableToolbar]))
  }
  
  @JSImport("mui-datatables", "TableToolbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnOrder(value: js.Array[Double]): this.type = set("columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnOrderVarargs(value: Double*): this.type = set("columnOrder", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[MUIDataTableData]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: MUIDataTableData*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def displayData(value: DisplayData): this.type = set("displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayDataVarargs(value: Data*): this.type = set("displayData", js.Array(value :_*))
    
    @scala.inline
    def filterData(value: js.Array[js.Array[_]]): this.type = set("filterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterDataVarargs(value: js.Array[js.Any]*): this.type = set("filterData", js.Array(value :_*))
    
    @scala.inline
    def filterList(value: js.Array[js.Array[String]]): this.type = set("filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterListVarargs(value: js.Array[String]*): this.type = set("filterList", js.Array(value :_*))
    
    @scala.inline
    def filterUpdate(value: /* args */ js.Any => _): this.type = set("filterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resetFilters(value: () => _): this.type = set("resetFilters", js.Any.fromFunction0(value))
    
    @scala.inline
    def searchClose(value: () => _): this.type = set("searchClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def searchText(value: ReactElement): this.type = set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchTextReactElement(value: ReactElement): this.type = set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchTextUpdate(value: /* args */ js.Any => _): this.type = set("searchTextUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableActions(value: /* args */ js.Any => _): this.type = set("setTableActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def tableRef(value: /* args */ js.Any => _): this.type = set("tableRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toggleViewColumn(value: /* a */ js.Any => _): this.type = set("toggleViewColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def updateFilterByType(value: /* args */ js.Any => _): this.type = set("updateFilterByType", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableToolbar): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
