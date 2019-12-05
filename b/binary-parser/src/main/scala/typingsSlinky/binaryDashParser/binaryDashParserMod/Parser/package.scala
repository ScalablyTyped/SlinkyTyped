package typingsSlinky.binaryDashParser.binaryDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Parser {
  import typingsSlinky.node.Buffer

  type Data = Double | String | (js.Array[Double | typingsSlinky.binaryDashParser.binaryDashParserMod.Parser[js.Any]]) | typingsSlinky.binaryDashParser.binaryDashParserMod.Parser[js.Any] | Buffer
  type Next[O /* <: js.UndefOr[js.Object] */, N /* <: String */, T /* <: js.Any */] = typingsSlinky.binaryDashParser.binaryDashParserMod.Parser[
    Valid[
      O, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in N ]: T}
    */ typingsSlinky.binaryDashParser.binaryDashParserStrings.Next with js.Any
    ]
  ]
  type Parsed[O /* <: js.UndefOr[js.Object] */] = O | js.Object
  type Valid[O /* <: js.UndefOr[js.Object] */, P /* <: js.Object */] = (O with P) | P
}
