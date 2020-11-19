package typingsSlinky.graphql

import typingsSlinky.graphql.astMod.Token
import typingsSlinky.graphql.sourceMod.Source
import typingsSlinky.graphql.tokenKindMod.TokenKindEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/language/lexer", JSImport.Namespace)
@js.native
object lexerMod extends js.Object {
  
  def isPunctuatorToken(token: Token): Boolean = js.native
  
  def isPunctuatorTokenKind(kind: TokenKindEnum): Boolean = js.native
  
  @js.native
  class Lexer protected () extends js.Object {
    def this(source: Source) = this()
    
    /**
      * Advances the token stream to the next non-ignored token.
      */
    def advance(): Token = js.native
    
    /**
      * The previously focused non-ignored token.
      */
    var lastToken: Token = js.native
    
    /**
      * The (1-indexed) line containing the current token.
      */
    var line: Double = js.native
    
    /**
      * The character offset at which the current line begins.
      */
    var lineStart: Double = js.native
    
    /**
      * Looks ahead and returns the next non-ignored token, but does not change
      * the state of Lexer.
      */
    def lookahead(): Token = js.native
    
    var source: Source = js.native
    
    /**
      * The currently focused non-ignored token.
      */
    var token: Token = js.native
  }
}
