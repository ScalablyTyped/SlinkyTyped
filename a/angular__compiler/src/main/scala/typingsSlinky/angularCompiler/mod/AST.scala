package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "AST")
@js.native
class AST protected ()
  extends typingsSlinky.angularCompiler.compilerMod.AST {
  def this(
    span: typingsSlinky.angularCompiler.astMod.ParseSpan,
    /**
    * Absolute location of the expression AST in a source code file.
    */
  sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}
