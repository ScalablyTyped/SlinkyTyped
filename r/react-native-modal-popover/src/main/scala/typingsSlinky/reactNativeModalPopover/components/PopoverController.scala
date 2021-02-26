package typingsSlinky.reactNativeModalPopover.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeModalPopover.popoverControllerMod.PopoverControllerRenderProps
import typingsSlinky.reactNativeModalPopover.popoverControllerMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverController {
  
  @scala.inline
  def apply(children: PopoverControllerRenderProps => ReactElement): Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-native-modal-popover", "PopoverController")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController] = new Default[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverController](js.Array(this.component, p.asInstanceOf[js.Any]))
}
