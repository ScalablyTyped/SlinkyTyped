package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableFooter
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableFooter {
  
  @JSImport("mui-datatables", "TableFooter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def changePage(value: /* e */ js.Any => _): this.type = set("changePage", js.Any.fromFunction1(value))
    
    @scala.inline
    def changeRowsPerPage(value: /* e */ js.Any => _): this.type = set("changeRowsPerPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowCount(value: Double): this.type = set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsPerPage(value: Double): this.type = set("rowsPerPage", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableFooter): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TableFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
