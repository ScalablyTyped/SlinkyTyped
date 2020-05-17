package typingsSlinky.antd.generatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.generatePickerMod.RangePickerBaseProps[DateType]
  - typingsSlinky.antd.generatePickerMod.RangePickerDateProps[DateType]
  - typingsSlinky.antd.generatePickerMod.RangePickerTimeProps[DateType]
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

