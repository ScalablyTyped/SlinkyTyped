package typingsSlinky.mailparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HeaderLines = js.Array[typingsSlinky.mailparser.AnonKey]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typingsSlinky.mailparser.mod.AddressObject
    - typingsSlinky.std.Date
    - typingsSlinky.mailparser.mod.StructuredHeader
  */
  type HeaderValue = typingsSlinky.mailparser.mod._HeaderValue | js.Array[java.lang.String] | java.lang.String | js.Date
  type Headers = typingsSlinky.std.Map[java.lang.String, typingsSlinky.mailparser.mod.HeaderValue]
  type Source = typingsSlinky.node.Buffer | typingsSlinky.node.streamMod.Stream | java.lang.String
}
