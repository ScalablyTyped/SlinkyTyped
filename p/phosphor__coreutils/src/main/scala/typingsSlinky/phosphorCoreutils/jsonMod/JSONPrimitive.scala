package typingsSlinky.phosphorCoreutils.jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - scala.Null
*/
trait JSONPrimitive
  extends JSONValue
     with ReadonlyJSONValue

object JSONPrimitive {
  @scala.inline
  implicit def apply(value: Boolean): JSONPrimitive = value.asInstanceOf[JSONPrimitive]
  @scala.inline
  implicit def apply(value: Double): JSONPrimitive = value.asInstanceOf[JSONPrimitive]
  @scala.inline
  implicit def apply(value: Null): JSONPrimitive = value.asInstanceOf[JSONPrimitive]
  @scala.inline
  implicit def apply(value: String): JSONPrimitive = value.asInstanceOf[JSONPrimitive]
}

