package typingsSlinky.highland.Highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[java.lang.String]
  - js.Function
*/
trait MappingHint extends js.Object

object MappingHint {
  @scala.inline
  implicit def apply(value: js.Array[String]): MappingHint = value.asInstanceOf[MappingHint]
  @scala.inline
  implicit def apply(value: Double): MappingHint = value.asInstanceOf[MappingHint]
  @scala.inline
  implicit def apply(value: js.Function): MappingHint = value.asInstanceOf[MappingHint]
}

