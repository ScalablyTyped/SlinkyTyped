package typingsSlinky.reactJsonView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Object
*/
trait TypeDefaultValue extends js.Object

object TypeDefaultValue {
  @scala.inline
  implicit def apply(value: Boolean): TypeDefaultValue = value.asInstanceOf[TypeDefaultValue]
  @scala.inline
  implicit def apply(value: Double): TypeDefaultValue = value.asInstanceOf[TypeDefaultValue]
  @scala.inline
  implicit def apply(value: js.Object): TypeDefaultValue = value.asInstanceOf[TypeDefaultValue]
  @scala.inline
  implicit def apply(value: String): TypeDefaultValue = value.asInstanceOf[TypeDefaultValue]
}

