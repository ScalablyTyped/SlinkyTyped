package typingsSlinky.reactNativeCommunityPicker

import slinky.core.ReactComponentClass
import typingsSlinky.reactNativeCommunityPicker.pickerIOSMod.PickerIOSProps
import typingsSlinky.reactNativeCommunityPicker.pickerMod.PickerItemProps
import typingsSlinky.reactNativeCommunityPicker.pickerMod.PickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/picker", "Picker")
  @js.native
  class Picker protected ()
    extends typingsSlinky.reactNativeCommunityPicker.pickerMod.Picker {
    def this(props: PickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps, context: js.Any) = this()
  }
  object Picker {
    
    @JSImport("@react-native-community/picker", "Picker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@react-native-community/picker", "Picker.Item")
    @js.native
    def Item: ReactComponentClass[PickerItemProps] = js.native
    @scala.inline
    def Item_=(x: ReactComponentClass[PickerItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dialog.
      */
    /* static member */
    @JSImport("@react-native-community/picker", "Picker.MODE_DIALOG")
    @js.native
    def MODE_DIALOG: String = js.native
    @scala.inline
    def MODE_DIALOG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DIALOG")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dropdown (this is the default).
      */
    /* static member */
    @JSImport("@react-native-community/picker", "Picker.MODE_DROPDOWN")
    @js.native
    def MODE_DROPDOWN: String = js.native
    @scala.inline
    def MODE_DROPDOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DROPDOWN")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-native-community/picker", "PickerIOS")
  @js.native
  class PickerIOS protected ()
    extends typingsSlinky.reactNativeCommunityPicker.pickerIOSMod.PickerIOS {
    def this(props: PickerIOSProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerIOSProps, context: js.Any) = this()
  }
  object PickerIOS {
    
    /* was `typeof PickerIOSItem` */
    @JSImport("@react-native-community/picker", "PickerIOS.Item")
    @js.native
    class Item ()
      extends typingsSlinky.reactNativeCommunityPicker.pickerIOSMod.PickerIOS.Item
  }
}
