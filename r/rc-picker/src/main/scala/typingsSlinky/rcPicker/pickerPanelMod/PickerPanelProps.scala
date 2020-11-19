package typingsSlinky.rcPicker.pickerPanelMod

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
  - typingsSlinky.rcPicker.pickerPanelMod.PickerPanelBaseProps[DateType]
  - typingsSlinky.rcPicker.pickerPanelMod.PickerPanelDateProps[DateType]
  - typingsSlinky.rcPicker.pickerPanelMod.PickerPanelTimeProps[DateType]
*/
trait PickerPanelProps[DateType] extends js.Object
object PickerPanelProps {
  
  @scala.inline
  def PickerPanelBaseProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): PickerPanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelProps[DateType]]
  }
  
  @scala.inline
  def PickerPanelDateProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerPanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelProps[DateType]]
  }
  
  @scala.inline
  def PickerPanelTimeProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): PickerPanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelProps[DateType]]
  }
}
