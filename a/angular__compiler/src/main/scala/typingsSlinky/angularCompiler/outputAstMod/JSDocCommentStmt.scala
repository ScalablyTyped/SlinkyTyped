package typingsSlinky.angularCompiler.outputAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt () extends Statement {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(tags: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(tags: js.Array[JSDocTag], sourceSpan: ParseSourceSpan) = this()
  
  var tags: js.Array[JSDocTag] = js.native
}
