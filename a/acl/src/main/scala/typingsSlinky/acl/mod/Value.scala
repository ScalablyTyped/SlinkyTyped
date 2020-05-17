package typingsSlinky.acl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait Value extends Values

object Value {
  @scala.inline
  implicit def apply(value: Double): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
}

