package typingsSlinky.antd.generatePickerMod

import typingsSlinky.antd.antdStrings.date
import typingsSlinky.antd.antdStrings.time
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[DateType]
  - typingsSlinky.antd.generatePickerMod.RangePickerDateProps[DateType]
  - typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[DateType]
*/
trait RangePickerProps[DateType] extends js.Object
object RangePickerProps {
  
  @scala.inline
  def RangePickerBaseProps[DateType](picker: Exclude[PickerMode, date | time]): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
  
  @scala.inline
  def RangePickerDateProps[DateType](): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
  
  @scala.inline
  def RangePickerTimeProps[DateType](picker: time): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
}
