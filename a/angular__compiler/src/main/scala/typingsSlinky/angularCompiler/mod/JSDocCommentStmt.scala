package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt ()
  extends typingsSlinky.angularCompiler.publicApiMod.JSDocCommentStmt {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(
    tags: js.Array[JSDocTag],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

