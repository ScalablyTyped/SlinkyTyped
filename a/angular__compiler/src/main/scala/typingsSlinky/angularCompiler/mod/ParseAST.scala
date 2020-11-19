package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "_ParseAST")
@js.native
class ParseAST protected ()
  extends typingsSlinky.angularCompiler.compilerMod.ParseAST {
  def this(
    input: String,
    location: js.Any,
    absoluteOffset: Double,
    tokens: js.Array[typingsSlinky.angularCompiler.lexerMod.Token],
    inputLength: Double,
    parseAction: Boolean,
    errors: js.Array[typingsSlinky.angularCompiler.astMod.ParserError],
    offset: Double
  ) = this()
}
