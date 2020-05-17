package typingsSlinky.rmcCalendar.calendarPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Tuple2[typingsSlinky.std.Date, typingsSlinky.std.Date]
  - js.Array[typingsSlinky.std.Date]
*/
trait SelectDateType extends js.Object

object SelectDateType {
  @scala.inline
  implicit def apply(value: js.Array[js.Date]): SelectDateType = value.asInstanceOf[SelectDateType]
  @scala.inline
  implicit def apply(value: js.Tuple2[js.Date, js.Date]): SelectDateType = value.asInstanceOf[SelectDateType]
}

