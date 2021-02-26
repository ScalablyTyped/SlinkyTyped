package typingsSlinky.rcMentions.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcMentions.dropdownMenuMod.DropdownMenuProps
import typingsSlinky.rcMentions.dropdownMenuMod.default
import typingsSlinky.rcMentions.optionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu {
  
  @scala.inline
  def apply(options: js.Array[OptionProps]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownMenuProps]))
  }
  
  @JSImport("rc-mentions/es/DropdownMenu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
