package typingsSlinky.antlr4

import typingsSlinky.antlr4.antlr4Numbers.`-1`
import typingsSlinky.antlr4.inputStreamMod.InputStream
import typingsSlinky.antlr4.parserRuleContextMod.ParserRuleContext
import typingsSlinky.antlr4.recognizerMod.Recognizer
import typingsSlinky.antlr4.tokenMod.Token
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("antlr4/error/Errors", "FailedPredicateException")
  @js.native
  class FailedPredicateException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "InputMismatchException")
  @js.native
  class InputMismatchException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "LexerNoViableAltException")
  @js.native
  class LexerNoViableAltException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "NoViableAltException")
  @js.native
  class NoViableAltException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "ParseCancellationException")
  @js.native
  class ParseCancellationException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "RecognitionException")
  @js.native
  class RecognitionException () extends Error {
    
    var ctx: ParserRuleContext = js.native
    
    def getExpectedTokens(): js.Array[Token] = js.native
    
    var input: InputStream = js.native
    
    var offendingState: `-1` = js.native
    
    var offendingToken: Token = js.native
    
    var recognizer: Recognizer = js.native
  }
}
