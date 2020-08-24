package typingsSlinky.luminoCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonMod {
  type JSONPrimitive = scala.Boolean | scala.Double | java.lang.String | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoCoreutils.jsonMod.JSONPrimitive
    - typingsSlinky.luminoCoreutils.jsonMod.JSONObject
    - typingsSlinky.luminoCoreutils.jsonMod.JSONArray
  */
  type JSONValue = typingsSlinky.luminoCoreutils.jsonMod._JSONValue | typingsSlinky.luminoCoreutils.jsonMod.JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoCoreutils.jsonMod.JSONPrimitive
    - typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
    - typingsSlinky.luminoCoreutils.jsonMod.PartialJSONArray
  */
  type PartialJSONValue = typingsSlinky.luminoCoreutils.jsonMod._PartialJSONValue | typingsSlinky.luminoCoreutils.jsonMod.JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoCoreutils.jsonMod.JSONPrimitive
    - typingsSlinky.luminoCoreutils.jsonMod.ReadonlyJSONObject
    - typingsSlinky.luminoCoreutils.jsonMod.ReadonlyJSONArray
  */
  type ReadonlyJSONValue = typingsSlinky.luminoCoreutils.jsonMod._ReadonlyJSONValue | typingsSlinky.luminoCoreutils.jsonMod.JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoCoreutils.jsonMod.JSONPrimitive
    - typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
    - typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONArray
  */
  type ReadonlyPartialJSONValue = typingsSlinky.luminoCoreutils.jsonMod._ReadonlyPartialJSONValue | typingsSlinky.luminoCoreutils.jsonMod.JSONPrimitive
}
