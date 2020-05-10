package typingsSlinky.reactNativeModalPopover.components

import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Rect
import typingsSlinky.reactNativeModalPopover.popoverMod.PopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  @JSImport("react-native-modal-popover", "Popover")
  @js.native
  object component extends js.Object
  
  def withProps(p: PopoverProps): SharedBuilder_PopoverProps149441464[typingsSlinky.reactNativeModalPopover.mod.Popover] = new SharedBuilder_PopoverProps149441464[typingsSlinky.reactNativeModalPopover.mod.Popover](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(fromRect: Rect): SharedBuilder_PopoverProps149441464[typingsSlinky.reactNativeModalPopover.mod.Popover] = {
    val __props = js.Dynamic.literal(fromRect = fromRect.asInstanceOf[js.Any])
    new SharedBuilder_PopoverProps149441464[typingsSlinky.reactNativeModalPopover.mod.Popover](js.Array(this.component, __props.asInstanceOf[PopoverProps]))
  }
}

