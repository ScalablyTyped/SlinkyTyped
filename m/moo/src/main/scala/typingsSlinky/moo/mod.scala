package typingsSlinky.moo

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.moo.mooBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moo", "compile")
  @js.native
  def compile(rules: Rules): Lexer = js.native
  
  @JSImport("moo", "error")
  @js.native
  val error: ErrorRule = js.native
  
  @JSImport("moo", "fallback")
  @js.native
  val fallback: FallbackRule = js.native
  
  @JSImport("moo", "keywords")
  @js.native
  def keywords(kws: StringDictionary[String | js.Array[String]]): TypeMapper = js.native
  
  @JSImport("moo", "states")
  @js.native
  def states(states: StringDictionary[Rules]): Lexer = js.native
  @JSImport("moo", "states")
  @js.native
  def states(states: StringDictionary[Rules], start: String): Lexer = js.native
  
  @js.native
  trait ErrorRule extends StObject {
    
    var error: `true` = js.native
  }
  object ErrorRule {
    
    @scala.inline
    def apply(error: `true`): ErrorRule = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorRule]
    }
    
    @scala.inline
    implicit class ErrorRuleMutableBuilder[Self <: ErrorRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FallbackRule extends StObject {
    
    var fallback: `true` = js.native
  }
  object FallbackRule {
    
    @scala.inline
    def apply(fallback: `true`): FallbackRule = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackRule]
    }
    
    @scala.inline
    implicit class FallbackRuleMutableBuilder[Self <: FallbackRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: `true`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lexer extends StObject {
    
    /**
      * Returns a string with a pretty error message.
      */
    def formatError(token: Token): String = js.native
    def formatError(token: Token, message: String): String = js.native
    
    /**
      * Can be used by parsers like nearley to check whether a given token type can be parsed by this lexer.
      */
    def has(tokenType: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[Token]] = js.native
    
    /**
      * When you reach the end of Moo's internal buffer, next() will return undefined.
      * You can always reset() it and feed it more data when that happens.
      */
    def next(): js.UndefOr[Token] = js.native
    
    /**
      * Returns back to the previous state in the stack.
      */
    def popState(): Unit = js.native
    
    /**
      * Transitions to the provided state and pushes the state onto the state
      * stack.
      */
    def pushState(state: String): Unit = js.native
    
    /**
      * Empty the internal buffer of the lexer, and set the line, column, and offset counts back to their initial value.
      */
    def reset(): this.type = js.native
    def reset(chunk: js.UndefOr[scala.Nothing], state: LexerState): this.type = js.native
    def reset(chunk: String): this.type = js.native
    def reset(chunk: String, state: LexerState): this.type = js.native
    
    /**
      * Returns current state, which you can later pass it as the second argument
      * to reset() to explicitly control the internal state of the lexer.
      */
    def save(): LexerState = js.native
    
    /**
      * Transitiosn to the provided state. Does not push onto the state stack.
      */
    def setState(state: String): Unit = js.native
  }
  
  @js.native
  trait LexerState extends StObject {
    
    var col: Double = js.native
    
    var line: Double = js.native
    
    var state: String = js.native
  }
  object LexerState {
    
    @scala.inline
    def apply(col: Double, line: Double, state: String): LexerState = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexerState]
    }
    
    @scala.inline
    implicit class LexerStateMutableBuilder[Self <: LexerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rule extends StObject {
    
    /**
      * You can have a token type that both matches tokens and contains error values.
      */
    var error: js.UndefOr[`true`] = js.native
    
    /**
      * Moo tracks detailed information about the input for you.
      * It will track line numbers, as long as you apply the `lineBreaks: true`
      * option to any tokens which might contain newlines. Moo will try to warn you if you forget to do this.
      */
    var lineBreaks: js.UndefOr[Boolean] = js.native
    
    var `match`: js.UndefOr[js.RegExp | String | js.Array[String]] = js.native
    
    /**
      * Moves to a new state, but does not affect the stack.
      */
    var next: js.UndefOr[String] = js.native
    
    /**
      * Returns to a previous state, by removing one or more states from the stack.
      */
    var pop: js.UndefOr[Double] = js.native
    
    /**
      * Moves the lexer to a new state, and pushes the old state onto the stack.
      */
    var push: js.UndefOr[String] = js.native
    
    /**
      * Used for mapping one set of types to another.
      * See https://github.com/no-context/moo#keywords for an example
      */
    var `type`: js.UndefOr[TypeMapper] = js.native
    
    /**
      * Moo doesn't allow capturing groups, but you can supply a transform function, value(),
      * which will be called on the value before storing it in the Token object.
      */
    var value: js.UndefOr[js.Function1[/* x */ String, String]] = js.native
  }
  object Rule {
    
    @scala.inline
    def apply(): Rule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setLineBreaks(value: Boolean): Self = StObject.set(x, "lineBreaks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreaksUndefined: Self = StObject.set(x, "lineBreaks", js.undefined)
      
      @scala.inline
      def setMatch(value: js.RegExp | String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchRegExp(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value :_*))
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPop(value: Double): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      @scala.inline
      def setPush(value: String): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setType(value: /* x */ String => String): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: /* x */ String => String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Rules = StringDictionary[js.RegExp | String | (js.Array[Rule | String]) | Rule | ErrorRule | FallbackRule]
  
  @js.native
  trait Token extends StObject {
    
    /**
      * The column where the match begins, starting from 1.
      */
    var col: Double = js.native
    
    /**
      * The line number of the beginning of the match, starting from 1.
      */
    var line: Double = js.native
    
    /**
      * The number of line breaks found in the match. (Always zero if this rule has lineBreaks: false.)
      */
    var lineBreaks: Double = js.native
    
    /**
      * The number of bytes from the start of the buffer where the match starts.
      */
    var offset: Double = js.native
    
    /**
      * The complete match.
      */
    var text: String = js.native
    
    /**
      * The name of the group, as passed to compile.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /**
      * The match contents.
      */
    var value: String = js.native
  }
  object Token {
    
    @scala.inline
    def apply(col: Double, line: Double, lineBreaks: Double, offset: Double, text: String, value: String): Token = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineBreaks = lineBreaks.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreaks(value: Double): Self = StObject.set(x, "lineBreaks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeMapper = js.Function1[/* x */ String, String]
}
