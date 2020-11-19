package typingsSlinky.angularCompiler.cssLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_lexer", "LexedCssResult")
@js.native
class LexedCssResult protected () extends js.Object {
  def this(error: Null, token: CssToken) = this()
  def this(error: js.Error, token: CssToken) = this()
  
  var error: js.Error | Null = js.native
  
  var token: CssToken = js.native
}
