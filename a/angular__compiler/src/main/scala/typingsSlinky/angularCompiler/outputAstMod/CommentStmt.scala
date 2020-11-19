package typingsSlinky.angularCompiler.outputAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "CommentStmt")
@js.native
class CommentStmt protected () extends Statement {
  def this(comment: String) = this()
  def this(comment: String, multiline: Boolean) = this()
  def this(comment: String, multiline: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(comment: String, multiline: Boolean, sourceSpan: ParseSourceSpan) = this()
  
  var comment: String = js.native
  
  var multiline: Boolean = js.native
}
