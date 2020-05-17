package typingsSlinky.phosphorCoreutils.jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorCoreutils.jsonMod.JSONPrimitive
  - typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
  - typingsSlinky.phosphorCoreutils.jsonMod.JSONArray
*/
trait JSONValue extends js.Object

object JSONValue {
  @scala.inline
  implicit def apply(value: JSONArray): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: JSONObject): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: JSONPrimitive): JSONValue = value.asInstanceOf[JSONValue]
}

