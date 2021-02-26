package typingsSlinky.angularCompiler.outputAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "LiteralArrayExpr")
@js.native
class LiteralArrayExpr protected () extends Expression {
  def this(entries: js.Array[Expression]) = this()
  def this(entries: js.Array[Expression], `type`: Type) = this()
  def this(entries: js.Array[Expression], `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(entries: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(entries: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var entries: js.Array[Expression] = js.native
}
