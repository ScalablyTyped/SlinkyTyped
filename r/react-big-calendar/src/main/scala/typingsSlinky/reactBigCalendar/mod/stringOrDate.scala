package typingsSlinky.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Date
*/
trait stringOrDate extends js.Object

object stringOrDate {
  @scala.inline
  implicit def apply(value: js.Date): stringOrDate = value.asInstanceOf[stringOrDate]
  @scala.inline
  implicit def apply(value: String): stringOrDate = value.asInstanceOf[stringOrDate]
}

