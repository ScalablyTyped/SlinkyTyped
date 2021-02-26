package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typingsSlinky.angularCompiler.tagsMod.TagDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mlParserLexerMod {
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", "CursorError")
  @js.native
  class CursorError protected () extends StObject {
    def this(msg: String, cursor: CharacterCursor) = this()
    
    var cursor: CharacterCursor = js.native
    
    var msg: String = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", "Token")
  @js.native
  class Token protected () extends StObject {
    def this(`type`: Null, parts: js.Array[String], sourceSpan: ParseSourceSpan) = this()
    def this(`type`: TokenType, parts: js.Array[String], sourceSpan: ParseSourceSpan) = this()
    
    var parts: js.Array[String] = js.native
    
    var sourceSpan: ParseSourceSpan = js.native
    
    var `type`: TokenType | Null = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", "TokenError")
  @js.native
  class TokenError protected () extends ParseError {
    def this(errorMsg: String, tokenType: Null, span: ParseSourceSpan) = this()
    def this(errorMsg: String, tokenType: TokenType, span: ParseSourceSpan) = this()
    
    var tokenType: TokenType | Null = js.native
  }
  
  @js.native
  sealed trait TokenType extends StObject
  @JSImport("@angular/compiler/src/ml_parser/lexer", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
    
    @js.native
    sealed trait ATTR_NAME extends TokenType
    /* 12 */ val ATTR_NAME: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.ATTR_NAME with Double = js.native
    
    @js.native
    sealed trait ATTR_QUOTE extends TokenType
    /* 13 */ val ATTR_QUOTE: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.ATTR_QUOTE with Double = js.native
    
    @js.native
    sealed trait ATTR_VALUE extends TokenType
    /* 14 */ val ATTR_VALUE: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.ATTR_VALUE with Double = js.native
    
    @js.native
    sealed trait CDATA_END extends TokenType
    /* 11 */ val CDATA_END: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.CDATA_END with Double = js.native
    
    @js.native
    sealed trait CDATA_START extends TokenType
    /* 10 */ val CDATA_START: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.CDATA_START with Double = js.native
    
    @js.native
    sealed trait COMMENT_END extends TokenType
    /* 9 */ val COMMENT_END: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.COMMENT_END with Double = js.native
    
    @js.native
    sealed trait COMMENT_START extends TokenType
    /* 8 */ val COMMENT_START: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.COMMENT_START with Double = js.native
    
    @js.native
    sealed trait DOC_TYPE extends TokenType
    /* 15 */ val DOC_TYPE: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.DOC_TYPE with Double = js.native
    
    @js.native
    sealed trait EOF extends TokenType
    /* 21 */ val EOF: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.EOF with Double = js.native
    
    @js.native
    sealed trait ESCAPABLE_RAW_TEXT extends TokenType
    /* 6 */ val ESCAPABLE_RAW_TEXT: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.ESCAPABLE_RAW_TEXT with Double = js.native
    
    @js.native
    sealed trait EXPANSION_CASE_EXP_END extends TokenType
    /* 19 */ val EXPANSION_CASE_EXP_END: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_CASE_EXP_END with Double = js.native
    
    @js.native
    sealed trait EXPANSION_CASE_EXP_START extends TokenType
    /* 18 */ val EXPANSION_CASE_EXP_START: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_CASE_EXP_START with Double = js.native
    
    @js.native
    sealed trait EXPANSION_CASE_VALUE extends TokenType
    /* 17 */ val EXPANSION_CASE_VALUE: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_CASE_VALUE with Double = js.native
    
    @js.native
    sealed trait EXPANSION_FORM_END extends TokenType
    /* 20 */ val EXPANSION_FORM_END: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_FORM_END with Double = js.native
    
    @js.native
    sealed trait EXPANSION_FORM_START extends TokenType
    /* 16 */ val EXPANSION_FORM_START: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.EXPANSION_FORM_START with Double = js.native
    
    @js.native
    sealed trait INCOMPLETE_TAG_OPEN extends TokenType
    /* 4 */ val INCOMPLETE_TAG_OPEN: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.INCOMPLETE_TAG_OPEN with Double = js.native
    
    @js.native
    sealed trait RAW_TEXT extends TokenType
    /* 7 */ val RAW_TEXT: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.RAW_TEXT with Double = js.native
    
    @js.native
    sealed trait TAG_CLOSE extends TokenType
    /* 3 */ val TAG_CLOSE: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.TAG_CLOSE with Double = js.native
    
    @js.native
    sealed trait TAG_OPEN_END extends TokenType
    /* 1 */ val TAG_OPEN_END: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.TAG_OPEN_END with Double = js.native
    
    @js.native
    sealed trait TAG_OPEN_END_VOID extends TokenType
    /* 2 */ val TAG_OPEN_END_VOID: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.TAG_OPEN_END_VOID with Double = js.native
    
    @js.native
    sealed trait TAG_OPEN_START extends TokenType
    /* 0 */ val TAG_OPEN_START: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.TAG_OPEN_START with Double = js.native
    
    @js.native
    sealed trait TEXT extends TokenType
    /* 5 */ val TEXT: typingsSlinky.angularCompiler.mlParserLexerMod.TokenType.TEXT with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", "TokenizeResult")
  @js.native
  class TokenizeResult protected () extends StObject {
    def this(
      tokens: js.Array[Token],
      errors: js.Array[TokenError],
      nonNormalizedIcuExpressions: js.Array[Token]
    ) = this()
    
    var errors: js.Array[TokenError] = js.native
    
    var nonNormalizedIcuExpressions: js.Array[Token] = js.native
    
    var tokens: js.Array[Token] = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/lexer", "tokenize")
  @js.native
  def tokenize(source: String, url: String, getTagDefinition: js.Function1[/* tagName */ String, TagDefinition]): TokenizeResult = js.native
  @JSImport("@angular/compiler/src/ml_parser/lexer", "tokenize")
  @js.native
  def tokenize(
    source: String,
    url: String,
    getTagDefinition: js.Function1[/* tagName */ String, TagDefinition],
    options: TokenizeOptions
  ): TokenizeResult = js.native
  
  /**
    * The _Tokenizer uses objects of this type to move through the input text,
    * extracting "parsed characters". These could be more than one actual character
    * if the text contains escape sequences.
    */
  @js.native
  trait CharacterCursor extends StObject {
    
    /** Advance the cursor by one parsed character. */
    def advance(): Unit = js.native
    
    /** The number of characters left before the end of the cursor. */
    def charsLeft(): Double = js.native
    
    /** The number of characters between `this` cursor and `other` cursor. */
    def diff(other: this.type): Double = js.native
    
    /** Get the parsed characters from the marked start point to the current point. */
    def getChars(start: this.type): String = js.native
    
    /** Get a span from the marked start point to the current point. */
    def getSpan(): ParseSourceSpan = js.native
    def getSpan(start: js.UndefOr[scala.Nothing], leadingTriviaCodePoints: js.Array[Double]): ParseSourceSpan = js.native
    def getSpan(start: this.type): ParseSourceSpan = js.native
    def getSpan(start: this.type, leadingTriviaCodePoints: js.Array[Double]): ParseSourceSpan = js.native
    
    /** Initialize the cursor. */
    def init(): Unit = js.native
    
    /** The parsed character at the current cursor position. */
    def peek(): Double = js.native
  }
  
  @js.native
  trait LexerRange extends StObject {
    
    var endPos: Double = js.native
    
    var startCol: Double = js.native
    
    var startLine: Double = js.native
    
    var startPos: Double = js.native
  }
  object LexerRange {
    
    @scala.inline
    def apply(endPos: Double, startCol: Double, startLine: Double, startPos: Double): LexerRange = {
      val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexerRange]
    }
    
    @scala.inline
    implicit class LexerRangeMutableBuilder[Self <: LexerRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndPos(value: Double): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenizeOptions extends StObject {
    
    /**
      * If this text is stored in a JavaScript string, then we have to deal with escape sequences.
      *
      * **Example 1:**
      *
      * ```
      * "abc\"def\nghi"
      * ```
      *
      * - The `\"` must be converted to `"`.
      * - The `\n` must be converted to a new line character in a token,
      *   but it should not increment the current line for source mapping.
      *
      * **Example 2:**
      *
      * ```
      * "abc\
      *  def"
      * ```
      *
      * The line continuation (`\` followed by a newline) should be removed from a token
      * but the new line should increment the current line for source mapping.
      */
    var escapedString: js.UndefOr[Boolean] = js.native
    
    /**
      * If this text is stored in an external template (e.g. via `templateUrl`) then we need to decide
      * whether or not to normalize the line-endings (from `\r\n` to `\n`) when processing ICU
      * expressions.
      *
      * If `true` then we will normalize ICU expression line endings.
      * The default is `false`, but this will be switched in a future major release.
      */
    var i18nNormalizeLineEndingsInICUs: js.UndefOr[Boolean] = js.native
    
    /** How to tokenize interpolation markers. */
    var interpolationConfig: js.UndefOr[InterpolationConfig] = js.native
    
    /**
      * An array of characters that should be considered as leading trivia.
      * Leading trivia are characters that are not important to the developer, and so should not be
      * included in source-map segments.  A common example is whitespace.
      */
    var leadingTriviaChars: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * If true, do not convert CRLF to LF.
      */
    var preserveLineEndings: js.UndefOr[Boolean] = js.native
    
    /**
      * The start and end point of the text to parse within the `source` string.
      * The entire `source` string is parsed if this is not provided.
      * */
    var range: js.UndefOr[LexerRange] = js.native
    
    /** Whether to tokenize ICU messages (considered as text nodes when false). */
    var tokenizeExpansionForms: js.UndefOr[Boolean] = js.native
  }
  object TokenizeOptions {
    
    @scala.inline
    def apply(): TokenizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeOptions]
    }
    
    @scala.inline
    implicit class TokenizeOptionsMutableBuilder[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscapedString(value: Boolean): Self = StObject.set(x, "escapedString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapedStringUndefined: Self = StObject.set(x, "escapedString", js.undefined)
      
      @scala.inline
      def setI18nNormalizeLineEndingsInICUs(value: Boolean): Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nNormalizeLineEndingsInICUsUndefined: Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", js.undefined)
      
      @scala.inline
      def setInterpolationConfig(value: InterpolationConfig): Self = StObject.set(x, "interpolationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolationConfigUndefined: Self = StObject.set(x, "interpolationConfig", js.undefined)
      
      @scala.inline
      def setLeadingTriviaChars(value: js.Array[String]): Self = StObject.set(x, "leadingTriviaChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingTriviaCharsUndefined: Self = StObject.set(x, "leadingTriviaChars", js.undefined)
      
      @scala.inline
      def setLeadingTriviaCharsVarargs(value: String*): Self = StObject.set(x, "leadingTriviaChars", js.Array(value :_*))
      
      @scala.inline
      def setPreserveLineEndings(value: Boolean): Self = StObject.set(x, "preserveLineEndings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLineEndingsUndefined: Self = StObject.set(x, "preserveLineEndings", js.undefined)
      
      @scala.inline
      def setRange(value: LexerRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setTokenizeExpansionForms(value: Boolean): Self = StObject.set(x, "tokenizeExpansionForms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenizeExpansionFormsUndefined: Self = StObject.set(x, "tokenizeExpansionForms", js.undefined)
    }
  }
}
