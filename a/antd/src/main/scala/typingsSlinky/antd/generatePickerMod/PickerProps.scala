package typingsSlinky.antd.generatePickerMod

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
  implicit def apply[DateType](value: PickerBaseProps[DateType]): PickerProps[DateType] = value.asInstanceOf[PickerProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: PickerDateProps[DateType]): PickerProps[DateType] = value.asInstanceOf[PickerProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: PickerTimeProps[DateType]): PickerProps[DateType] = value.asInstanceOf[PickerProps[DateType]]
}

