package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableBodyRow
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBodyRow {
  
  @scala.inline
  def apply(options: MUIDataTableOptions): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableBodyRow]))
  }
  
  @JSImport("mui-datatables", "TableBodyRow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* args */ js.Any => _): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowSelected(value: Boolean): this.type = set("rowSelected", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableBodyRow): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
