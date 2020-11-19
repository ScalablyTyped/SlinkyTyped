package typingsSlinky.reactOverlays.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.dropdownMenuMod.DropdownMenuProps
import typingsSlinky.reactOverlays.dropdownMenuMod.DropdownMenuRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu {
  
  @JSImport("react-overlays", "DropdownMenu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.DropdownMenu] {
    
    @scala.inline
    def alignEnd(value: Boolean): this.type = set("alignEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popperConfig(value: js.Object): this.type = set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootCloseEvent(value: String): this.type = set("rootCloseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def usePopper(value: Boolean): this.type = set("usePopper", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: DropdownMenuRenderProps => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownMenuProps]))
  }
}
