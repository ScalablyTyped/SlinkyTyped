package typingsSlinky.angularCompiler.cssAstMod

import typingsSlinky.angularCompiler.cssLexerMod.CssToken
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssBlockRuleAst")
@js.native
class CssBlockRuleAst protected () extends CssRuleAst {
  def this(location: ParseSourceSpan, `type`: BlockType, block: CssBlockAst) = this()
  def this(location: ParseSourceSpan, `type`: BlockType, block: CssBlockAst, name: CssToken) = this()
  var block: CssBlockAst = js.native
  var name: CssToken | Null = js.native
  var `type`: BlockType = js.native
}

