package typingsSlinky.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pickerMod {
  
  type OmitPanelProps[Props] = typingsSlinky.std.Omit[
    Props, 
    typingsSlinky.rcPicker.rcPickerStrings.onChange | typingsSlinky.rcPicker.rcPickerStrings.hideHeader | typingsSlinky.rcPicker.rcPickerStrings.pickerValue | typingsSlinky.rcPicker.rcPickerStrings.onPickerValueChange
  ]
}
