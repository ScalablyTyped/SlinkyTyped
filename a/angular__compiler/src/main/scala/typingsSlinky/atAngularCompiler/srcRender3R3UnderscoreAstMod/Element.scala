package typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod

import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Element")
@js.native
class Element protected () extends Node {
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: Null,
    i18n: Message
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: Null,
    i18n: typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: ParseSourceSpan,
    i18n: typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: Null,
    i18n: Message
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: Null,
    i18n: typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    children: js.Array[Node],
    references: js.Array[Reference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan,
    i18n: typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  var attributes: js.Array[TextAttribute] = js.native
  var children: js.Array[Node] = js.native
  var endSourceSpan: ParseSourceSpan | Null = js.native
  var i18n: js.UndefOr[Message | typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node] = js.native
  var inputs: js.Array[BoundAttribute] = js.native
  var name: String = js.native
  var outputs: js.Array[BoundEvent] = js.native
  var references: js.Array[Reference] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var startSourceSpan: ParseSourceSpan | Null = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

