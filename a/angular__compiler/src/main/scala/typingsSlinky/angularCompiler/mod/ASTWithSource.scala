package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ASTWithSource")
@js.native
class ASTWithSource protected ()
  extends typingsSlinky.angularCompiler.compilerMod.ASTWithSource {
  def this(
    ast: typingsSlinky.angularCompiler.astMod.AST,
    source: String,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typingsSlinky.angularCompiler.astMod.ParserError]
  ) = this()
  def this(
    ast: typingsSlinky.angularCompiler.astMod.AST,
    source: Null,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typingsSlinky.angularCompiler.astMod.ParserError]
  ) = this()
}
