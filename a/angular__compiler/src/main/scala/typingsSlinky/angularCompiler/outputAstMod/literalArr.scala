package typingsSlinky.angularCompiler.outputAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "literalArr")
@js.native
object literalArr extends js.Object {
  
  def apply(values: js.Array[Expression]): LiteralArrayExpr = js.native
  def apply(values: js.Array[Expression], `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan): LiteralArrayExpr = js.native
  def apply(values: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan): LiteralArrayExpr = js.native
  def apply(values: js.Array[Expression], `type`: Type): LiteralArrayExpr = js.native
  def apply(values: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan): LiteralArrayExpr = js.native
}
