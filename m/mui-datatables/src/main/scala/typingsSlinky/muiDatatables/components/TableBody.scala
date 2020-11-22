package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.anon.RowIndex
import typingsSlinky.muiDatatables.mod.MUIDataTableBody
import typingsSlinky.muiDatatables.mod.MUIDataTableColumnDef
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import typingsSlinky.muiDatatables.mod.MUIDataTableStateRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody {
  
  @JSImport("mui-datatables", "TableBody")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def columnOrderVarargs(value: Double*): this.type = set("columnOrder", js.Array(value :_*))
    
    @scala.inline
    def columnOrder(value: js.Array[Double]): this.type = set("columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedRows(value: MUIDataTableStateRows): this.type = set("expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterListVarargs(value: js.Array[String]*): this.type = set("filterList", js.Array(value :_*))
    
    @scala.inline
    def filterList(value: js.Array[js.Array[String]]): this.type = set("filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => Unit): this.type = set("onRowClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousSelectedRow(value: Double): this.type = set("previousSelectedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousSelectedRowNull: this.type = set("previousSelectedRow", null)
    
    @scala.inline
    def rowsPerPage(value: Double): this.type = set("rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectRowUpdate(value: /* args */ js.Any => _): this.type = set("selectRowUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectedRows(value: MUIDataTableStateRows): this.type = set("selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableId(value: String): this.type = set("tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toggleExpandRow(value: /* args */ js.Any => _): this.type = set("toggleExpandRow", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableBody): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    classes: js.Object,
    columns: js.Array[MUIDataTableColumnDef],
    count: Double,
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: MUIDataTableOptions
  ): Builder = {
    val __props = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableBody]))
  }
}
