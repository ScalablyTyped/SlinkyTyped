package typingsSlinky.javascriptDashObfuscator

import org.scalajs.dom.raw.Node
import typingsSlinky.javascriptDashObfuscator.estreeMod.Identifier
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/node-transformers/TReplaceableIdentifiers", JSImport.Namespace)
@js.native
object srcTypesNodeDashTransformersTReplaceableIdentifiersMod extends js.Object {
  type TReplaceableIdentifiers = Map[Node, Map[String, js.Array[Identifier]]]
}

