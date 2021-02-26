package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.i18nAstMod.Node
import typingsSlinky.angularCompiler.r3AstMod.TextAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstContent")
@js.native
class TmplAstContent protected ()
  extends typingsSlinky.angularCompiler.compilerMod.TmplAstContent {
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}
