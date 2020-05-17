package typingsSlinky.popmotion.valueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.popmotion.valueMod.ValueMap
  - typingsSlinky.popmotion.valueMod.ValueList
*/
trait Value extends js.Object

object Value {
  @scala.inline
  implicit def apply(value: Double): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: ValueList): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: ValueMap): Value = value.asInstanceOf[Value]
}

