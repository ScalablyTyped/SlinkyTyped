package typingsSlinky.greasemonkey.GM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Boolean
  - scala.Double
*/
trait Value extends js.Object

object Value {
  @scala.inline
  implicit def apply(value: Boolean): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Double): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
}

