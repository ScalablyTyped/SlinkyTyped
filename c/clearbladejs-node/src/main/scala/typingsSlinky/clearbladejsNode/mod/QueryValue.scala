package typingsSlinky.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait QueryValue extends js.Object

object QueryValue {
  @scala.inline
  implicit def apply(value: Boolean): QueryValue = value.asInstanceOf[QueryValue]
  @scala.inline
  implicit def apply(value: Double): QueryValue = value.asInstanceOf[QueryValue]
  @scala.inline
  implicit def apply(value: String): QueryValue = value.asInstanceOf[QueryValue]
}

