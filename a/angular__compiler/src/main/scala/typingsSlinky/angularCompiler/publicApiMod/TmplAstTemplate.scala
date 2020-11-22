package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.r3AstMod.BoundAttribute
import typingsSlinky.angularCompiler.r3AstMod.BoundEvent
import typingsSlinky.angularCompiler.r3AstMod.Node
import typingsSlinky.angularCompiler.r3AstMod.Reference
import typingsSlinky.angularCompiler.r3AstMod.TextAttribute
import typingsSlinky.angularCompiler.r3AstMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "TmplAstTemplate")
@js.native
class TmplAstTemplate protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.TmplAstTemplate {
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: Null,
    i18n: Message
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: Null,
    i18n: typingsSlinky.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: typingsSlinky.angularCompiler.i18nAstMod.Node
  ) = this()
}
