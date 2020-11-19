package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableColumnDef
import typingsSlinky.muiDatatables.mod.MUIDataTableHead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHead {
  
  @JSImport("mui-datatables", "TableHead")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnsVarargs(value: MUIDataTableColumnDef*): this.type = set("columns", js.Array(value :_*))
    
    @scala.inline
    def columns(value: js.Array[MUIDataTableColumnDef]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: js.Object): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def page(value: js.Any): this.type = set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedRows(value: js.Any): this.type = set("selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRef(value: js.Any): this.type = set("setCellRef", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableHead): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TableHead.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
