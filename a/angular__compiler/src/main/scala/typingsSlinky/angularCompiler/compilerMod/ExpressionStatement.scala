package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "ExpressionStatement")
@js.native
class ExpressionStatement protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.ExpressionStatement {
  def this(expr: typingsSlinky.angularCompiler.outputAstMod.Expression) = this()
  def this(
    expr: typingsSlinky.angularCompiler.outputAstMod.Expression,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    expr: typingsSlinky.angularCompiler.outputAstMod.Expression,
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[typingsSlinky.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
  def this(
    expr: typingsSlinky.angularCompiler.outputAstMod.Expression,
    sourceSpan: Null,
    leadingComments: js.Array[typingsSlinky.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
  def this(
    expr: typingsSlinky.angularCompiler.outputAstMod.Expression,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    leadingComments: js.Array[typingsSlinky.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
}
