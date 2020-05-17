package typingsSlinky.rcPicker.pickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcPicker.pickerMod.PickerBaseProps[DateType]
  - typingsSlinky.rcPicker.pickerMod.PickerDateProps[DateType]
  - typingsSlinky.rcPicker.pickerMod.PickerTimeProps[DateType]
*/
trait PickerProps[DateType] extends js.Object

object PickerProps {
  @scala.inline
  implicit def apply[DateType](value: PickerBaseProps[DateType]): PickerProps[DateType] = value.asInstanceOf[PickerProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: PickerDateProps[DateType]): PickerProps[DateType] = value.asInstanceOf[PickerProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: PickerTimeProps[DateType]): PickerProps[DateType] = value.asInstanceOf[PickerProps[DateType]]
}

