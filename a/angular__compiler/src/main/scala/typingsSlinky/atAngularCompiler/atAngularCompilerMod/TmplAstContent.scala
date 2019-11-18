package typingsSlinky.atAngularCompiler.atAngularCompilerMod

import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.TextAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TmplAstContent")
@js.native
class TmplAstContent protected ()
  extends typingsSlinky.atAngularCompiler.publicUnderscoreApiMod.TmplAstContent {
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

