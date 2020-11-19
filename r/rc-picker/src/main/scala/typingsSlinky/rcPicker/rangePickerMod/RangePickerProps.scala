package typingsSlinky.rcPicker.rangePickerMod

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
  - typingsSlinky.rcPicker.rangePickerMod.RangePickerBaseProps[DateType]
  - typingsSlinky.rcPicker.rangePickerMod.RangePickerDateProps[DateType]
  - typingsSlinky.rcPicker.rangePickerMod.RangePickerTimeProps[DateType]
*/
trait RangePickerProps[DateType] extends js.Object
object RangePickerProps {
  
  @scala.inline
  def RangePickerBaseProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
  
  @scala.inline
  def RangePickerDateProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
  
  @scala.inline
  def RangePickerTimeProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
}
