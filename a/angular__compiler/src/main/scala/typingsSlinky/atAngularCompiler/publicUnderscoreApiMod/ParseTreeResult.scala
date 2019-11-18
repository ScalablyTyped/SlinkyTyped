package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.ParseTreeResult {
  def this(
    rootNodes: js.Array[Node],
    errors: js.Array[typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
}

