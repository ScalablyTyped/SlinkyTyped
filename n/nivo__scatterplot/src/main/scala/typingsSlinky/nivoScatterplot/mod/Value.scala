package typingsSlinky.nivoScatterplot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Date
*/
trait Value extends js.Object

object Value {
  @scala.inline
  implicit def apply(value: js.Date): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Double): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
}

