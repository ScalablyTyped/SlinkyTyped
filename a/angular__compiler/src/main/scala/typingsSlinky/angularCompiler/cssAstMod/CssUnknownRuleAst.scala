package typingsSlinky.angularCompiler.cssAstMod

import typingsSlinky.angularCompiler.cssLexerMod.CssToken
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssUnknownRuleAst")
@js.native
class CssUnknownRuleAst protected () extends CssRuleAst {
  def this(location: ParseSourceSpan, ruleName: String, tokens: js.Array[CssToken]) = this()
  var ruleName: String = js.native
  var tokens: js.Array[CssToken] = js.native
}

