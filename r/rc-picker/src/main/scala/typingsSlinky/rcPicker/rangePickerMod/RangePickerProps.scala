package typingsSlinky.rcPicker.rangePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcPicker.rangePickerMod.RangePickerBaseProps[DateType]
  - typingsSlinky.rcPicker.rangePickerMod.RangePickerDateProps[DateType]
  - typingsSlinky.rcPicker.rangePickerMod.RangePickerTimeProps[DateType]
*/
trait RangePickerProps[DateType] extends js.Object

object RangePickerProps {
  @scala.inline
  implicit def apply[DateType](value: RangePickerBaseProps[DateType]): RangePickerProps[DateType] = value.asInstanceOf[RangePickerProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: RangePickerDateProps[DateType]): RangePickerProps[DateType] = value.asInstanceOf[RangePickerProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: RangePickerTimeProps[DateType]): RangePickerProps[DateType] = value.asInstanceOf[RangePickerProps[DateType]]
}

