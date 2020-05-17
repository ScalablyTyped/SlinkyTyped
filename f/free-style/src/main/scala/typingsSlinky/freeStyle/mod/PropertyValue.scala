package typingsSlinky.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - scala.Boolean
  - java.lang.String
*/
trait PropertyValue extends js.Object

object PropertyValue {
  @scala.inline
  implicit def apply(value: Boolean): PropertyValue = value.asInstanceOf[PropertyValue]
  @scala.inline
  implicit def apply(value: Double): PropertyValue = value.asInstanceOf[PropertyValue]
  @scala.inline
  implicit def apply(value: String): PropertyValue = value.asInstanceOf[PropertyValue]
}

