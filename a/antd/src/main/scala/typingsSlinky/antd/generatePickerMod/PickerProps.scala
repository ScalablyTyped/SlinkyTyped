package typingsSlinky.antd.generatePickerMod

import typingsSlinky.antd.antdStrings.date
import typingsSlinky.antd.antdStrings.time
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.generatePickerMod.PickerBaseProps[DateType]
  - typingsSlinky.antd.generatePickerMod.PickerDateProps[DateType]
  - typingsSlinky.antd.generatePickerMod.PickerTimeProps[DateType]
*/
trait PickerProps[DateType] extends js.Object

object PickerProps {
  @scala.inline
  def PickerBaseProps[DateType](picker: Exclude[PickerMode, date | time]): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  @scala.inline
  def PickerDateProps[DateType](): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  @scala.inline
  def PickerTimeProps[DateType](picker: time): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
}

