package typingsSlinky.awsSdkTypes.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Date
*/
trait DateInput extends js.Object

object DateInput {
  @scala.inline
  implicit def apply(value: js.Date): DateInput = value.asInstanceOf[DateInput]
  @scala.inline
  implicit def apply(value: Double): DateInput = value.asInstanceOf[DateInput]
  @scala.inline
  implicit def apply(value: String): DateInput = value.asInstanceOf[DateInput]
}

