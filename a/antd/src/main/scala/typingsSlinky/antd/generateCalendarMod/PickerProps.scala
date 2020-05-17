package typingsSlinky.antd.generateCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.generateCalendarMod.PickerPanelBaseProps[DateType]
  - typingsSlinky.antd.generateCalendarMod.PickerPanelDateProps[DateType]
  - typingsSlinky.antd.generateCalendarMod.PickerPanelTimeProps[DateType]
*/
trait PickerProps[DateType] extends js.Object

object PickerProps {
  @scala.inline
  implicit def apply[DateType](value: PickerPanelBaseProps[DateType]): PickerProps[DateType] = value.asInstanceOf[PickerProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: PickerPanelDateProps[DateType]): PickerProps[DateType] = value.asInstanceOf[PickerProps[DateType]]
  @scala.inline
  implicit def apply[DateType](value: PickerPanelTimeProps[DateType]): PickerProps[DateType] = value.asInstanceOf[PickerProps[DateType]]
}

