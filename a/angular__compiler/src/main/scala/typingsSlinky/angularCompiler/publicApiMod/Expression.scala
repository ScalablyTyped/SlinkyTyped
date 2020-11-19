package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "Expression")
@js.native
abstract class Expression ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.Expression {
  def this(`type`: typingsSlinky.angularCompiler.outputAstMod.Type) = this()
  def this(
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(`type`: Null, sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
