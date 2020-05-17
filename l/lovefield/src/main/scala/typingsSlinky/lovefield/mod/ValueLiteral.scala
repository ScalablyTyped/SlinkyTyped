package typingsSlinky.lovefield.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.std.Date
*/
trait ValueLiteral extends js.Object

object ValueLiteral {
  @scala.inline
  implicit def apply(value: Boolean): ValueLiteral = value.asInstanceOf[ValueLiteral]
  @scala.inline
  implicit def apply(value: js.Date): ValueLiteral = value.asInstanceOf[ValueLiteral]
  @scala.inline
  implicit def apply(value: Double): ValueLiteral = value.asInstanceOf[ValueLiteral]
  @scala.inline
  implicit def apply(value: String): ValueLiteral = value.asInstanceOf[ValueLiteral]
}

