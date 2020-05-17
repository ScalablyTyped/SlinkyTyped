package typingsSlinky.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Date
*/
trait FormatInput extends js.Object

object FormatInput {
  @scala.inline
  implicit def apply(value: js.Date): FormatInput = value.asInstanceOf[FormatInput]
  @scala.inline
  implicit def apply(value: Double): FormatInput = value.asInstanceOf[FormatInput]
  @scala.inline
  implicit def apply(value: String): FormatInput = value.asInstanceOf[FormatInput]
}

