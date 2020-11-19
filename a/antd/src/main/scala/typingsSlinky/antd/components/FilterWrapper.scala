package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.filterWrapperMod.FilterDropdownMenuWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilterWrapper {
  
  @JSImport("antd/lib/table/hooks/useFilter/FilterWrapper", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FilterDropdownMenuWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FilterWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
