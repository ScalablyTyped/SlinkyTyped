package typingsSlinky.reactOverlays.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.dropdownMenuMod.DropdownMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit def make(companion: DropdownMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

