package typingsSlinky.angularCompiler.cssAstMod

import typingsSlinky.angularCompiler.cssLexerMod.CssToken
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssUnknownTokenListAst")
@js.native
class CssUnknownTokenListAst protected () extends CssRuleAst {
  def this(location: ParseSourceSpan, name: String, tokens: js.Array[CssToken]) = this()
  
  var name: String = js.native
  
  var tokens: js.Array[CssToken] = js.native
}
