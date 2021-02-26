package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import typingsSlinky.muiDatatables.mod.MUIDataTableResize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableResize {
  
  @JSImport("mui-datatables", "TableResize")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowSelected(value: Boolean): this.type = set("rowSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeable(value: /* args */ js.Any => _): this.type = set("setResizeable", js.Any.fromFunction1(value))
    
    @scala.inline
    def updateDividers(value: /* args */ js.Any => _): this.type = set("updateDividers", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: TableResize.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MUIDataTableResize): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
