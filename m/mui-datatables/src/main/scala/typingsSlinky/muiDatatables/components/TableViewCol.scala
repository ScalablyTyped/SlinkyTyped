package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableViewCol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableViewCol {
  
  @scala.inline
  def apply(columns: js.Array[_], `object`: js.Object, onColumnUpdate: js.Any => js.Any): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnUpdate = js.Any.fromFunction1(onColumnUpdate))
    __props.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableViewCol]))
  }
  
  @JSImport("mui-datatables", "TableViewCol")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableViewCol): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
