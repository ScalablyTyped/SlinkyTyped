package typingsSlinky.antlr4Autosuggest.mod

import typingsSlinky.antlr4.mod.Lexer
import typingsSlinky.antlr4.mod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antlr4-autosuggest", "autosuggester")
@js.native
object autosuggester extends js.Object {
  
  def apply(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser]): AutoSuggester_ = js.native
  def apply(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser], casePref: CasePreference): AutoSuggester_ = js.native
}
