package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.ParseTreeResult {
  def this(
    rootNodes: js.Array[Node],
    errors: js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError]
  ) = this()
}
