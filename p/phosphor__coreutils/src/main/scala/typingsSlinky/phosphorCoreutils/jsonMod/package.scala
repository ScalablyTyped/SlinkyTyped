package typingsSlinky.phosphorCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonMod {
  type JSONPrimitive = scala.Boolean | scala.Double | java.lang.String | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.phosphorCoreutils.jsonMod.JSONPrimitive
    - typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
    - typingsSlinky.phosphorCoreutils.jsonMod.JSONArray
  */
  type JSONValue = typingsSlinky.phosphorCoreutils.jsonMod._JSONValue | typingsSlinky.phosphorCoreutils.jsonMod.JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.phosphorCoreutils.jsonMod.JSONPrimitive
    - typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
    - typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONArray
  */
  type ReadonlyJSONValue = typingsSlinky.phosphorCoreutils.jsonMod._ReadonlyJSONValue | typingsSlinky.phosphorCoreutils.jsonMod.JSONPrimitive
}
