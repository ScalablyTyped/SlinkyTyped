package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait LiteralValue extends js.Object

object LiteralValue {
  @scala.inline
  implicit def apply(value: Boolean): LiteralValue = value.asInstanceOf[LiteralValue]
  @scala.inline
  implicit def apply(value: Double): LiteralValue = value.asInstanceOf[LiteralValue]
  @scala.inline
  implicit def apply(value: String): LiteralValue = value.asInstanceOf[LiteralValue]
}

