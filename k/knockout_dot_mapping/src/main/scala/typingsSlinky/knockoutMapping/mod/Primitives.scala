package typingsSlinky.knockoutMapping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Symbol
*/
trait Primitives extends js.Object

object Primitives {
  @scala.inline
  implicit def apply(value: Boolean): Primitives = value.asInstanceOf[Primitives]
  @scala.inline
  implicit def apply(value: Double): Primitives = value.asInstanceOf[Primitives]
  @scala.inline
  implicit def apply(value: String): Primitives = value.asInstanceOf[Primitives]
  @scala.inline
  implicit def apply(value: js.Symbol): Primitives = value.asInstanceOf[Primitives]
}

