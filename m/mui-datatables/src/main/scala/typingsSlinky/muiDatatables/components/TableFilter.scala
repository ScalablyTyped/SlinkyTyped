package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableFilter
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableFilter {
  
  @scala.inline
  def apply(filterData: js.Array[_], options: MUIDataTableOptions): Builder = {
    val __props = js.Dynamic.literal(filterData = filterData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableFilter]))
  }
  
  @JSImport("mui-datatables", "TableFilter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterList(value: js.Array[js.Array[String]]): this.type = set("filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterListVarargs(value: js.Array[String]*): this.type = set("filterList", js.Array(value :_*))
    
    @scala.inline
    def onFilterReset(value: /* args */ js.Any => _): this.type = set("onFilterReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFilterUpdate(value: /* args */ js.Any => _): this.type = set("onFilterUpdate", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableFilter): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
