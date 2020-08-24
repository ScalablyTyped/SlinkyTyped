package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "AST")
@js.native
class AST protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.AST {
  def this(
    span: typingsSlinky.angularCompiler.astMod.ParseSpan,
    /**
    * Absolute location of the expression AST in a source code file.
    */
  sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}

