package typingsSlinky.reactNativeModalPopover.components

import typingsSlinky.reactNativeModalPopover.mod.default
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Rect
import typingsSlinky.reactNativeModalPopover.popoverMod.PopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeModalPopover {
  @JSImport("react-native-modal-popover", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PopoverProps): SharedBuilder_PopoverProps149441464[default] = new SharedBuilder_PopoverProps149441464[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(fromRect: Rect): SharedBuilder_PopoverProps149441464[default] = {
    val __props = js.Dynamic.literal(fromRect = fromRect.asInstanceOf[js.Any])
    new SharedBuilder_PopoverProps149441464[default](js.Array(this.component, __props.asInstanceOf[PopoverProps]))
  }
}

