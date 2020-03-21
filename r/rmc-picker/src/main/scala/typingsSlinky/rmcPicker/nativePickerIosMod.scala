package typingsSlinky.rmcPicker

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.Picker
import typingsSlinky.reactNative.mod.PickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-picker/lib/NativePicker.ios", JSImport.Namespace)
@js.native
object nativePickerIosMod extends js.Object {
  @js.native
  class default () extends Picker
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Item: ReactComponentClass[PickerItemProps] = js.native
    /**
      * On Android, display the options in a dialog.
      */
    var MODE_DIALOG: String = js.native
    /**
      * On Android, display the options in a dropdown (this is the default).
      */
    var MODE_DROPDOWN: String = js.native
  }
  
}

