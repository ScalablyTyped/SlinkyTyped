package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ASTWithSource")
@js.native
class ASTWithSource protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.ASTWithSource {
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

