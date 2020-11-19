package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "ASTWithName")
@js.native
abstract class ASTWithName protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.ASTWithName {
  def this(
    span: typingsSlinky.angularCompiler.astMod.ParseSpan,
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    nameSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}
