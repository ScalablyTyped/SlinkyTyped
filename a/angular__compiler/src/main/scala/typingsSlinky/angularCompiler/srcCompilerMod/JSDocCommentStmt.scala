package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt ()
  extends typingsSlinky.angularCompiler.outputAstMod.JSDocCommentStmt {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(
    tags: js.Array[JSDocTag],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

