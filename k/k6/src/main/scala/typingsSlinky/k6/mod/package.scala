package typingsSlinky.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Checker[VT] = js.Function1[/* val */ VT, scala.Boolean]
  type Checkers[VT] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.k6.mod.Checker[VT]]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typingsSlinky.k6.mod.JSONArray
    - typingsSlinky.k6.mod.JSONObject
  */
  type JSONValue = typingsSlinky.k6.mod._JSONValue | scala.Null | scala.Boolean | scala.Double | java.lang.String
  type byte = scala.Double
  type bytes = js.Array[typingsSlinky.k6.mod.byte]
}
