package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ASTWithName")
@js.native
abstract class ASTWithName protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.ASTWithName {
  def this(
    span: typingsSlinky.angularCompiler.astMod.ParseSpan,
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    nameSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}
