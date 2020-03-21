package typingsSlinky.binaryParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Parser {
  type Data = scala.Double | java.lang.String | (js.Array[scala.Double | typingsSlinky.binaryParser.mod.Parser[js.Any]]) | typingsSlinky.binaryParser.mod.Parser[js.Any] | typingsSlinky.node.Buffer
  type Next[O /* <: js.UndefOr[js.Object] */, N /* <: java.lang.String */, T /* <: js.Any */] = typingsSlinky.binaryParser.mod.Parser[
    typingsSlinky.binaryParser.mod.Parser.Valid[
      O, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in N ]: T}
    */ typingsSlinky.binaryParser.binaryParserStrings.Next with js.Any
    ]
  ]
  type Parsed[O /* <: js.UndefOr[js.Object] */] = O | js.Object
  type Valid[O /* <: js.UndefOr[js.Object] */, P /* <: js.Object */] = (O with P) | P
}
