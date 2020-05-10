package typingsSlinky.reactOverlays.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactOverlays.dropdownToggleMod.DropdownToggleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownToggle {
  @JSImport("react-overlays", "DropdownToggle")
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownToggleProps): Default[tag.type, typingsSlinky.reactOverlays.mod.DropdownToggle] = new Default[tag.type, typingsSlinky.reactOverlays.mod.DropdownToggle](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DropdownToggle.type): Default[tag.type, typingsSlinky.reactOverlays.mod.DropdownToggle] = new Default[tag.type, typingsSlinky.reactOverlays.mod.DropdownToggle](js.Array(this.component, js.Dictionary.empty))()
}

