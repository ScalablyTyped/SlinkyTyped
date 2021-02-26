package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableHeadRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeadRow {
  
  @JSImport("mui-datatables", "TableHeadRow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableHeadRow.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MUIDataTableHeadRow): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
