package typingsSlinky.angularCompiler.r3AstMod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/r3_ast", "Content")
@js.native
class Content protected () extends Node {
  def this(selector: String, attributes: js.Array[TextAttribute], sourceSpan: ParseSourceSpan) = this()
  def this(selector: String, attributes: js.Array[TextAttribute], sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: ParseSourceSpan,
    i18n: typingsSlinky.angularCompiler.i18nAstMod.Node
  ) = this()
  
  var attributes: js.Array[TextAttribute] = js.native
  
  var i18n: js.UndefOr[Message | typingsSlinky.angularCompiler.i18nAstMod.Node] = js.native
  
  val name: /* "ng-content" */ String = js.native
  
  var selector: String = js.native
}
