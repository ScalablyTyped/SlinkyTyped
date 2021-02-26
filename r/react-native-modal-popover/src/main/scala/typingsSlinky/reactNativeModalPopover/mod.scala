package typingsSlinky.reactNativeModalPopover

import typingsSlinky.reactNativeModalPopover.anon.ArrowSize
import typingsSlinky.reactNativeModalPopover.anon.Children
import typingsSlinky.reactNativeModalPopover.anon.OnPopoverDisplayed
import typingsSlinky.reactNativeModalPopover.anon.PartialPopoverProps
import typingsSlinky.reactNativeModalPopover.popoverControllerMod.Props
import typingsSlinky.reactNativeModalPopover.popoverMod.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-modal-popover", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.reactNativeModalPopover.popoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-modal-popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover", "default.defaultProps")
    @js.native
    def defaultProps: PartialPopoverProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialPopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover", "default.propTypes")
    @js.native
    def propTypes: ArrowSize = js.native
    @scala.inline
    def propTypes_=(x: ArrowSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal-popover", "Popover")
  @js.native
  class Popover protected ()
    extends typingsSlinky.reactNativeModalPopover.popoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  /* static members */
  object Popover {
    
    @JSImport("react-native-modal-popover", "Popover")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover", "Popover.defaultProps")
    @js.native
    def defaultProps: PartialPopoverProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialPopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover", "Popover.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover", "Popover.propTypes")
    @js.native
    def propTypes: ArrowSize = js.native
    @scala.inline
    def propTypes_=(x: ArrowSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal-popover", "PopoverController")
  @js.native
  class PopoverController protected ()
    extends typingsSlinky.reactNativeModalPopover.popoverControllerMod.PopoverController {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  /* static members */
  object PopoverController {
    
    @JSImport("react-native-modal-popover", "PopoverController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover", "PopoverController.propTypes")
    @js.native
    def propTypes: Children = js.native
    @scala.inline
    def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal-popover", "PopoverTouchable")
  @js.native
  class PopoverTouchable protected ()
    extends typingsSlinky.reactNativeModalPopover.popoverTouchableMod.PopoverTouchable {
    def this(props: typingsSlinky.reactNativeModalPopover.popoverTouchableMod.Props) = this()
  }
  /* static members */
  object PopoverTouchable {
    
    @JSImport("react-native-modal-popover", "PopoverTouchable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover", "PopoverTouchable.propTypes")
    @js.native
    def propTypes: OnPopoverDisplayed = js.native
    @scala.inline
    def propTypes_=(x: OnPopoverDisplayed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
