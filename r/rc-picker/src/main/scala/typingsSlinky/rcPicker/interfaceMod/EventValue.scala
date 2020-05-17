package typingsSlinky.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - DateType
  - scala.Null
*/
trait EventValue[DateType] extends js.Object

object EventValue {
  @scala.inline
  implicit def apply[DateType](value: DateType): EventValue[DateType] = value.asInstanceOf[EventValue[DateType]]
  @scala.inline
  implicit def apply[DateType](value: Null): EventValue[DateType] = value.asInstanceOf[EventValue[DateType]]
}

