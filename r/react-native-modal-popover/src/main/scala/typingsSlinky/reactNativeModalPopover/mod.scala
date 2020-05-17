package typingsSlinky.reactNativeModalPopover

import typingsSlinky.reactNativeModalPopover.anon.ArrowSize
import typingsSlinky.reactNativeModalPopover.anon.Children
import typingsSlinky.reactNativeModalPopover.anon.OnPopoverDisplayed
import typingsSlinky.reactNativeModalPopover.anon.PartialPopoverProps
import typingsSlinky.reactNativeModalPopover.popoverMod.PopoverProps
import typingsSlinky.reactNativeModalPopover.popoverTouchableMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal-popover", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Popover protected ()
    extends typingsSlinky.reactNativeModalPopover.popoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  
  @js.native
  class PopoverController ()
    extends typingsSlinky.reactNativeModalPopover.popoverControllerMod.PopoverController
  
  @js.native
  class PopoverTouchable protected ()
    extends typingsSlinky.reactNativeModalPopover.popoverTouchableMod.PopoverTouchable {
    def this(props: Props) = this()
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.reactNativeModalPopover.popoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  
  /* static members */
  @js.native
  object Popover extends js.Object {
    var defaultProps: PartialPopoverProps = js.native
    var displayName: String = js.native
    var propTypes: ArrowSize = js.native
  }
  
  /* static members */
  @js.native
  object PopoverController extends js.Object {
    var propTypes: Children = js.native
  }
  
  /* static members */
  @js.native
  object PopoverTouchable extends js.Object {
    var propTypes: OnPopoverDisplayed = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: PartialPopoverProps = js.native
    var displayName: String = js.native
    var propTypes: ArrowSize = js.native
  }
  
}

