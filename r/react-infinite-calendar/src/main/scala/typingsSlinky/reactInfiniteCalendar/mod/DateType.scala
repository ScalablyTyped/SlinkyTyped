package typingsSlinky.reactInfiniteCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Date
  - java.lang.String
  - scala.Double
*/
trait DateType extends js.Object

object DateType {
  @scala.inline
  implicit def apply(value: js.Date): DateType = value.asInstanceOf[DateType]
  @scala.inline
  implicit def apply(value: Double): DateType = value.asInstanceOf[DateType]
  @scala.inline
  implicit def apply(value: String): DateType = value.asInstanceOf[DateType]
}

