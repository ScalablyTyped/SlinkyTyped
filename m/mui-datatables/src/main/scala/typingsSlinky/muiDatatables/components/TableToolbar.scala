package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableColumnDef
import typingsSlinky.muiDatatables.mod.MUIDataTableToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableToolbar {
  
  @JSImport("mui-datatables", "TableToolbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterData(value: js.Any): this.type = set("filterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterListVarargs(value: js.Array[String]*): this.type = set("filterList", js.Array(value :_*))
    
    @scala.inline
    def filterList(value: js.Array[js.Array[String]]): this.type = set("filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterUpdate(value: js.Any): this.type = set("filterUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: js.Object): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resetFilters(value: js.Any): this.type = set("resetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchTextUpdate(value: /* args */ js.Any => _): this.type = set("searchTextUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableActions(value: /* args */ js.Any => _): this.type = set("setTableActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def tableRef(value: /* args */ js.Any => _): this.type = set("tableRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def title(value: js.Any): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toggleViewColumn(value: js.Any): this.type = set("toggleViewColumn", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableToolbar): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(columns: js.Array[MUIDataTableColumnDef]): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableToolbar]))
  }
}
