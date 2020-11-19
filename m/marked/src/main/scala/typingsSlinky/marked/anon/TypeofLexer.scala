package typingsSlinky.marked.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.marked.mod.Lexer_
import typingsSlinky.marked.mod.MarkedOptions
import typingsSlinky.marked.mod.Rules
import typingsSlinky.marked.mod.TokensList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLexer
  extends Instantiable0[Lexer_]
     with Instantiable1[/* options */ MarkedOptions, Lexer_] {
  
  def lex(src: TokensList): TokensList = js.native
  def lex(src: TokensList, options: MarkedOptions): TokensList = js.native
  
  var rules: Rules = js.native
}
