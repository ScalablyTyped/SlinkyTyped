package typingsSlinky.reactMdMenu.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdMenu.toggleChildrenMod.ToggleChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToggleChildren {
  
  @scala.inline
  def apply(disableDropdownIcon: Boolean, visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(disableDropdownIcon = disableDropdownIcon.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToggleChildrenProps]))
  }
  
  @JSImport("@react-md/menu/types/ToggleChildren", "ToggleChildren")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def dropdownIcon(value: ReactElement): this.type = set("dropdownIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToggleChildrenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
