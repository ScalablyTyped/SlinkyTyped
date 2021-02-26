package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableHeadCell
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import typingsSlinky.muiDatatables.mod.MUISortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeadCell {
  
  @scala.inline
  def apply(hint: String, options: MUIDataTableOptions, sort: Boolean, toggleSort: js.Any => js.Any): Builder = {
    val __props = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], toggleSort = js.Any.fromFunction1(toggleSort))
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableHeadCell]))
  }
  
  @JSImport("mui-datatables", "TableHeadCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortOrder(value: MUISortOptions): this.type = set("sortOrder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableHeadCell): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
