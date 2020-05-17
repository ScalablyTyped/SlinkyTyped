package typingsSlinky.rcPicker.pickerPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcPicker.pickerPanelMod.PickerPanelBaseProps[DateType]
  - typingsSlinky.rcPicker.pickerPanelMod.PickerPanelDateProps[DateType]
  - typingsSlinky.rcPicker.pickerPanelMod.PickerPanelTimeProps[DateType]
*/
trait PickerPanelProps[DateType] extends js.Object

object PickerPanelProps {
  @scala.inline
  implicit def apply[DateType](value: PickerPanelBaseProps[DateType]): PickerPanelProps[DateType] = value.asInstanceOf[PickerPanelProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: PickerPanelDateProps[DateType]): PickerPanelProps[DateType] = value.asInstanceOf[PickerPanelProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: PickerPanelTimeProps[DateType]): PickerPanelProps[DateType] = value.asInstanceOf[PickerPanelProps[DateType]]
}

