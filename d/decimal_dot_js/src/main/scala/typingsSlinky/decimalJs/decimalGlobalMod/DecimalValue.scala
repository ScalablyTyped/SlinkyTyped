package typingsSlinky.decimalJs.decimalGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.decimalJs.decimalGlobalMod.Decimal
*/
trait DecimalValue extends js.Object

object DecimalValue {
  @scala.inline
  implicit def apply(value: Decimal): DecimalValue = value.asInstanceOf[DecimalValue]
  @scala.inline
  implicit def apply(value: Double): DecimalValue = value.asInstanceOf[DecimalValue]
  @scala.inline
  implicit def apply(value: String): DecimalValue = value.asInstanceOf[DecimalValue]
}

