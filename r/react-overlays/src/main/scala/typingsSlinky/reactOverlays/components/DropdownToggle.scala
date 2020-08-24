package typingsSlinky.reactOverlays.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactOverlays.dropdownToggleMod.DropdownToggleProps
import typingsSlinky.reactOverlays.dropdownToggleMod.DropdownToggleRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownToggle {
  @JSImport("react-overlays", "DropdownToggle")
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownToggleProps): Default[tag.type, typingsSlinky.reactOverlays.mod.DropdownToggle] = new Default[tag.type, typingsSlinky.reactOverlays.mod.DropdownToggle](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: DropdownToggleRenderProps => ReactElement): Default[tag.type, typingsSlinky.reactOverlays.mod.DropdownToggle] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, typingsSlinky.reactOverlays.mod.DropdownToggle](js.Array(this.component, __props.asInstanceOf[DropdownToggleProps]))
  }
}

