package typingsSlinky.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "ASTWithName")
@js.native
abstract class ASTWithName protected ()
  extends typingsSlinky.angularCompiler.astMod.ASTWithName {
  def this(
    span: typingsSlinky.angularCompiler.astMod.ParseSpan,
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    nameSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}
