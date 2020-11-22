package typingsSlinky.reactNativeCommunityPicker.pickerMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/picker/typings/Picker", "Picker")
@js.native
class Picker ()
  extends Component[PickerProps, js.Object, js.Any]
/* static members */
@JSImport("@react-native-community/picker/typings/Picker", "Picker")
@js.native
object Picker extends js.Object {
  
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
