package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.DebouncedMUIDataTableSearch
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DebounceTableSearch {
  
  @scala.inline
  def apply(debounceWait: Double): Builder = {
    val __props = js.Dynamic.literal(debounceWait = debounceWait.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DebouncedMUIDataTableSearch]))
  }
  
  @JSImport("mui-datatables", "DebounceTableSearch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onHide(value: /* args */ js.Any => _): this.type = set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSearch(value: /* args */ js.Any => _): this.type = set("onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DebouncedMUIDataTableSearch): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
