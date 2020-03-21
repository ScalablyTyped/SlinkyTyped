package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.JSDocCommentStmt {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(
    tags: js.Array[JSDocTag],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

