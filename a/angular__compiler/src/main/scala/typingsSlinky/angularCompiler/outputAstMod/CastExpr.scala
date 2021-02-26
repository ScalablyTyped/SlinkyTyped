package typingsSlinky.angularCompiler.outputAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "CastExpr")
@js.native
class CastExpr protected () extends Expression {
  def this(value: Expression) = this()
  def this(value: Expression, `type`: Type) = this()
  def this(value: Expression, `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(value: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var value: Expression = js.native
}
