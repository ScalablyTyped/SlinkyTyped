package typingsSlinky.reactNativeModalPopover.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeModalPopover.popoverControllerMod.PopoverControllerRenderProps
import typingsSlinky.reactNativeModalPopover.popoverControllerMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PopoverController {
  @JSImport("react-native-modal-popover", "PopoverController")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController] = new Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: PopoverControllerRenderProps => ReactElement): Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

