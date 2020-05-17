package typingsSlinky.nodeSass.mod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSass.mod.types.Null
  - typingsSlinky.nodeSass.mod.types.Number
  - typingsSlinky.nodeSass.mod.types.String
  - typingsSlinky.nodeSass.mod.types.Color
  - typingsSlinky.nodeSass.mod.types.Boolean
  - typingsSlinky.nodeSass.mod.types.List
  - typingsSlinky.nodeSass.mod.types.Map
*/
trait Value extends ReturnValue

object Value {
  @scala.inline
  implicit def apply(value: Boolean): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Color): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: List): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Map): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Null): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Number): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
}

