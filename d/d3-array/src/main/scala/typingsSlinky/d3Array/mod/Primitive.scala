package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - scala.Boolean
  - typingsSlinky.std.Date
*/
trait Primitive extends js.Object

object Primitive {
  @scala.inline
  implicit def apply(value: Boolean): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: js.Date): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Double): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: String): Primitive = value.asInstanceOf[Primitive]
}

