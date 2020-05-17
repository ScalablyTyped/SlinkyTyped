package typingsSlinky.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.reactBigCalendar.mod.DateFormatFunction
*/
trait DateFormat extends js.Object

object DateFormat {
  @scala.inline
  implicit def apply(value: DateFormatFunction): DateFormat = value.asInstanceOf[DateFormat]
  @scala.inline
  implicit def apply(value: String): DateFormat = value.asInstanceOf[DateFormat]
}

