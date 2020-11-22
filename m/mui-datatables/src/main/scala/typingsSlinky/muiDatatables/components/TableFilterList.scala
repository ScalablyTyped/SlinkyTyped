package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.anon.FilterType
import typingsSlinky.muiDatatables.mod.MUIDataTableFilterList
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableFilterList {
  
  @JSImport("mui-datatables", "TableFilterList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnNamesVarargs(value: FilterType*): this.type = set("columnNames", js.Array(value :_*))
    
    @scala.inline
    def columnNames(value: js.Array[FilterType]): this.type = set("columnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customFilterListUpdateVarargs(value: js.Any*): this.type = set("customFilterListUpdate", js.Array(value :_*))
    
    @scala.inline
    def customFilterListUpdate(value: js.Array[_]): this.type = set("customFilterListUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterListRenderers(value: /* e */ js.Any => js.Array[_]): this.type = set("filterListRenderers", js.Any.fromFunction1(value))
    
    @scala.inline
    def filterUpdate(value: /* args */ js.Any => _): this.type = set("filterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def serverSideFilterList(value: js.Any): this.type = set("serverSideFilterList", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableFilterList): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(filterList: js.Array[js.Array[String]], options: MUIDataTableOptions): Builder = {
    val __props = js.Dynamic.literal(filterList = filterList.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableFilterList]))
  }
}
