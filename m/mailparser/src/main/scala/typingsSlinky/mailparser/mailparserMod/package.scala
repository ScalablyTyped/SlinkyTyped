package typingsSlinky.mailparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mailparserMod {
  import typingsSlinky.mailparser.Anon_Key
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.streamMod.Stream
  import typingsSlinky.std.Map

  type HeaderLines = js.Array[Anon_Key]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typings.mailparser.mailparserMod.AddressObject
    - typings.std.Date
    - typings.mailparser.mailparserMod.StructuredHeader
  */
  type HeaderValue = _HeaderValue | js.Array[String] | String | js.Date
  type Headers = Map[String, HeaderValue]
  type Source = Buffer | Stream | String
}
