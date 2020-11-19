package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt ()
  extends typingsSlinky.angularCompiler.publicApiMod.JSDocCommentStmt {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(
    tags: js.UndefOr[scala.Nothing],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    tags: js.Array[JSDocTag],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
