package typingsSlinky.angularCompiler.outputAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ExpressionStatement")
@js.native
class ExpressionStatement protected () extends Statement {
  def this(expr: Expression) = this()
  def this(expr: Expression, sourceSpan: ParseSourceSpan) = this()
  def this(
    expr: Expression,
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(expr: Expression, sourceSpan: Null, leadingComments: js.Array[LeadingComment_]) = this()
  def this(expr: Expression, sourceSpan: ParseSourceSpan, leadingComments: js.Array[LeadingComment_]) = this()
  
  var expr: Expression = js.native
}
