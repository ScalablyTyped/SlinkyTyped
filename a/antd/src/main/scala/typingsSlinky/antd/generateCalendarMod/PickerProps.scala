package typingsSlinky.antd.generateCalendarMod

import typingsSlinky.antd.antdStrings.date
import typingsSlinky.antd.antdStrings.time
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.generateCalendarMod.PickerPanelBaseProps[DateType]
  - typingsSlinky.antd.generateCalendarMod.PickerPanelDateProps[DateType]
  - typingsSlinky.antd.generateCalendarMod.PickerPanelTimeProps[DateType]
*/
trait PickerProps[DateType] extends js.Object
object PickerProps {
  
  @scala.inline
  def PickerPanelBaseProps[DateType](picker: Exclude[PickerMode, date | time]): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  
  @scala.inline
  def PickerPanelDateProps[DateType](): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  
  @scala.inline
  def PickerPanelTimeProps[DateType](picker: time): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
}
