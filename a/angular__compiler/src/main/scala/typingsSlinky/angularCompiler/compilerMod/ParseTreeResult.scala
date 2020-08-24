package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.ParseTreeResult {
  def this(
    rootNodes: js.Array[Node],
    errors: js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError]
  ) = this()
}

