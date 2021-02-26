package typingsSlinky.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("antlr4", "CommonToken")
  @js.native
  class CommonToken protected ()
    extends typingsSlinky.antlr4.tokenMod.CommonToken {
    def this(source: js.Any, `type`: js.Any, channel: js.Any, start: Double, stop: Double) = this()
  }
  /* static members */
  object CommonToken {
    
    @JSImport("antlr4", "CommonToken.EMPTY_SOURCE")
    @js.native
    val EMPTY_SOURCE: js.Any = js.native
  }
  
  @JSImport("antlr4", "CommonTokenStream")
  @js.native
  class CommonTokenStream protected ()
    extends typingsSlinky.antlr4.commonTokenStreamMod.CommonTokenStream {
    def this(lexer: typingsSlinky.antlr4.lexerMod.Lexer) = this()
    def this(lexer: typingsSlinky.antlr4.lexerMod.Lexer, channel: js.Any) = this()
  }
  
  @JSImport("antlr4", "InputStream")
  @js.native
  class InputStream protected ()
    extends typingsSlinky.antlr4.inputStreamMod.InputStream {
    def this(data: String) = this()
    def this(data: String, decodeToUnicodeCodePoints: Boolean) = this()
  }
  
  @JSImport("antlr4", "Interval")
  @js.native
  class Interval protected ()
    extends typingsSlinky.antlr4.intervalSetMod.Interval {
    def this(start: Double, stop: Double) = this()
  }
  
  @JSImport("antlr4", "IntervalSet")
  @js.native
  class IntervalSet ()
    extends typingsSlinky.antlr4.intervalSetMod.IntervalSet
  
  @JSImport("antlr4", "Lexer")
  @js.native
  class Lexer ()
    extends typingsSlinky.antlr4.lexerMod.Lexer
  /* static members */
  object Lexer {
    
    @JSImport("antlr4", "Lexer.DEFAULT_MODE")
    @js.native
    val DEFAULT_MODE: Double = js.native
    
    @JSImport("antlr4", "Lexer.DEFAULT_TOKEN_CHANNEL")
    @js.native
    val DEFAULT_TOKEN_CHANNEL: js.Any = js.native
    
    @JSImport("antlr4", "Lexer.HIDDEN")
    @js.native
    val HIDDEN: js.Any = js.native
    
    @JSImport("antlr4", "Lexer.MAX_CHAR_VALUE")
    @js.native
    val MAX_CHAR_VALUE: Double = js.native
    
    @JSImport("antlr4", "Lexer.MIN_CHAR_VALUE")
    @js.native
    val MIN_CHAR_VALUE: Double = js.native
    
    @JSImport("antlr4", "Lexer.MORE")
    @js.native
    val MORE: Double = js.native
    
    @JSImport("antlr4", "Lexer.SKIP")
    @js.native
    val SKIP: Double = js.native
  }
  
  @JSImport("antlr4", "Parser")
  @js.native
  class Parser protected ()
    extends typingsSlinky.antlr4.parserMod.Parser {
    def this(input: typingsSlinky.antlr4.commonTokenStreamMod.CommonTokenStream) = this()
  }
  
  @JSImport("antlr4", "ParserRuleContext")
  @js.native
  class ParserRuleContext protected ()
    extends typingsSlinky.antlr4.parserRuleContextMod.ParserRuleContext {
    def this(parent: js.Any, invokingState: Double) = this()
  }
  /* static members */
  object ParserRuleContext {
    
    @JSImport("antlr4", "ParserRuleContext.EMPTY")
    @js.native
    val EMPTY: typingsSlinky.antlr4.parserRuleContextMod.ParserRuleContext = js.native
  }
  
  @JSImport("antlr4", "Recognizer")
  @js.native
  class Recognizer ()
    extends typingsSlinky.antlr4.recognizerMod.Recognizer
  
  @JSImport("antlr4", "Token")
  @js.native
  class Token ()
    extends typingsSlinky.antlr4.tokenMod.Token
  /* static members */
  object Token {
    
    @JSImport("antlr4", "Token.EOF")
    @js.native
    val EOF: Double = js.native
    
    @JSImport("antlr4", "Token.EPSILON")
    @js.native
    val EPSILON: Double = js.native
    
    @JSImport("antlr4", "Token.HIDDEN_CHANNEL")
    @js.native
    val HIDDEN_CHANNEL: Double = js.native
    
    @JSImport("antlr4", "Token.INVALID_TYPE")
    @js.native
    val INVALID_TYPE: Double = js.native
    
    @JSImport("antlr4", "Token.MIN_USER_TOKEN_TYPE")
    @js.native
    val MIN_USER_TOKEN_TYPE: Double = js.native
  }
  
  type AntlrRule = typingsSlinky.antlr4.parserRuleContextMod.ParserRuleContext
}
