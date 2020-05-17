package typingsSlinky.nivoLine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.std.Date
*/
trait LineValue extends js.Object

object LineValue {
  @scala.inline
  implicit def apply(value: js.Date): LineValue = value.asInstanceOf[LineValue]
  @scala.inline
  implicit def apply(value: Double): LineValue = value.asInstanceOf[LineValue]
  @scala.inline
  implicit def apply(value: String): LineValue = value.asInstanceOf[LineValue]
}

