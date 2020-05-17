package typingsSlinky.fromnow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Date
  - java.lang.String
  - scala.Double
*/
trait DateOkay extends js.Object

object DateOkay {
  @scala.inline
  implicit def apply(value: js.Date): DateOkay = value.asInstanceOf[DateOkay]
  @scala.inline
  implicit def apply(value: Double): DateOkay = value.asInstanceOf[DateOkay]
  @scala.inline
  implicit def apply(value: String): DateOkay = value.asInstanceOf[DateOkay]
}

