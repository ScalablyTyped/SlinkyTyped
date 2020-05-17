package typingsSlinky.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Boolean
  - scala.Double
  - scala.Null
*/
trait NodeValue extends js.Object

object NodeValue {
  @scala.inline
  implicit def apply(value: Boolean): NodeValue = value.asInstanceOf[NodeValue]
  @scala.inline
  implicit def apply(value: Double): NodeValue = value.asInstanceOf[NodeValue]
  @scala.inline
  implicit def apply(value: Null): NodeValue = value.asInstanceOf[NodeValue]
  @scala.inline
  implicit def apply(value: String): NodeValue = value.asInstanceOf[NodeValue]
}

