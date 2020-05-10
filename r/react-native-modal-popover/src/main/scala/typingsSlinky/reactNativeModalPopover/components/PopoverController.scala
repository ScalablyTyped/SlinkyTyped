package typingsSlinky.reactNativeModalPopover.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeModalPopover.popoverControllerMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PopoverController {
  @JSImport("react-native-modal-popover", "PopoverController")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController] = new Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PopoverController.type): Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController] = new Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController](js.Array(this.component, js.Dictionary.empty))()
}

