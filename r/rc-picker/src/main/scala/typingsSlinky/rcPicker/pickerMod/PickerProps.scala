package typingsSlinky.rcPicker.pickerMod

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.rcPicker.rcPickerStrings.date
import typingsSlinky.rcPicker.rcPickerStrings.time
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcPicker.pickerMod.PickerBaseProps[DateType]
  - typingsSlinky.rcPicker.pickerMod.PickerDateProps[DateType]
  - typingsSlinky.rcPicker.pickerMod.PickerTimeProps[DateType]
*/
trait PickerProps[DateType] extends js.Object
object PickerProps {
  
  @scala.inline
  def PickerBaseProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  
  @scala.inline
  def PickerDateProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  
  @scala.inline
  def PickerTimeProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
}
