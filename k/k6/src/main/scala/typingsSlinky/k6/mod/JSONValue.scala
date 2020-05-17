package typingsSlinky.k6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - typingsSlinky.k6.mod.JSONArray
  - typingsSlinky.k6.mod.JSONObject
*/
trait JSONValue extends js.Object

object JSONValue {
  @scala.inline
  implicit def apply(value: Boolean): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: Double): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: JSONArray): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: JSONObject): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: Null): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: String): JSONValue = value.asInstanceOf[JSONValue]
}

