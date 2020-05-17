package typingsSlinky.eonasdanBootstrapDatetimepicker.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Date
  - typingsSlinky.moment.mod.Moment
*/
trait DateComparable extends js.Object

object DateComparable {
  @scala.inline
  implicit def apply(value: js.Date): DateComparable = value.asInstanceOf[DateComparable]
  @scala.inline
  implicit def apply(value: Moment): DateComparable = value.asInstanceOf[DateComparable]
  @scala.inline
  implicit def apply(value: String): DateComparable = value.asInstanceOf[DateComparable]
}

