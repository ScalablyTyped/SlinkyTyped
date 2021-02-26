package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.anon.Data
import typingsSlinky.muiDatatables.mod.DisplayData
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import typingsSlinky.muiDatatables.mod.MUIDataTableToolbarSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableToolbarSelect {
  
  @scala.inline
  def apply(options: MUIDataTableOptions): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableToolbarSelect]))
  }
  
  @JSImport("mui-datatables", "TableToolbarSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayData(value: DisplayData): this.type = set("displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayDataVarargs(value: Data*): this.type = set("displayData", js.Array(value :_*))
    
    @scala.inline
    def onRowsDelete(value: /* args */ js.Any => _): this.type = set("onRowsDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowSelected(value: Boolean): this.type = set("rowSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectRowUpdate(value: /* args */ js.Any => _): this.type = set("selectRowUpdate", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableToolbarSelect): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
