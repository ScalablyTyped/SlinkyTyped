package typingsSlinky.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mithril.mod.ChildArray
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait ChildArrayOrPrimitive extends js.Object

object ChildArrayOrPrimitive {
  @scala.inline
  implicit def apply(value: Boolean): ChildArrayOrPrimitive = value.asInstanceOf[ChildArrayOrPrimitive]
  @scala.inline
  implicit def apply(value: ChildArray): ChildArrayOrPrimitive = value.asInstanceOf[ChildArrayOrPrimitive]
  @scala.inline
  implicit def apply(value: Double): ChildArrayOrPrimitive = value.asInstanceOf[ChildArrayOrPrimitive]
  @scala.inline
  implicit def apply(value: String): ChildArrayOrPrimitive = value.asInstanceOf[ChildArrayOrPrimitive]
}

