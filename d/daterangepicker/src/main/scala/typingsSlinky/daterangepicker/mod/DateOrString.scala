package typingsSlinky.daterangepicker.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.moment.mod.Moment
  - typingsSlinky.std.Date
*/
trait DateOrString extends js.Object

object DateOrString {
  @scala.inline
  implicit def apply(value: js.Date): DateOrString = value.asInstanceOf[DateOrString]
  @scala.inline
  implicit def apply(value: Moment): DateOrString = value.asInstanceOf[DateOrString]
  @scala.inline
  implicit def apply(value: String): DateOrString = value.asInstanceOf[DateOrString]
}

