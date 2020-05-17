package typingsSlinky.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Tuple2[
typingsSlinky.rcPicker.interfaceMod.EventValue[DateType], 
typingsSlinky.rcPicker.interfaceMod.EventValue[DateType]]
  - scala.Null
*/
trait RangeValue[DateType] extends js.Object

object RangeValue {
  @scala.inline
  implicit def apply[DateType](value: Null): RangeValue[DateType] = value.asInstanceOf[RangeValue[DateType]]
  @scala.inline
  implicit def apply[DateType](value: js.Tuple2[EventValue[DateType], EventValue[DateType]]): RangeValue[DateType] = value.asInstanceOf[RangeValue[DateType]]
}

