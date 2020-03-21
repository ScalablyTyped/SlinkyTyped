package typingsSlinky.angularCompiler.cssAstMod

import typingsSlinky.angularCompiler.cssLexerMod.CssToken
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssKeyframeRuleAst")
@js.native
class CssKeyframeRuleAst protected () extends CssBlockRuleAst {
  def this(location: ParseSourceSpan, name: CssToken, block: CssBlockAst) = this()
}

