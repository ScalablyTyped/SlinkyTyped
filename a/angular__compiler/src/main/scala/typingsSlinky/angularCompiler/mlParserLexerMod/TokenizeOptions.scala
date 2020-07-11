package typingsSlinky.angularCompiler.mlParserLexerMod

import typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizeOptions extends js.Object {
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
  var escapedString: js.UndefOr[Boolean] = js.undefined
  /** How to tokenize interpolation markers. */
  var interpolationConfig: js.UndefOr[InterpolationConfig] = js.undefined
  /**
    * An array of characters that should be considered as leading trivia.
    * Leading trivia are characters that are not important to the developer, and so should not be
    * included in source-map segments.  A common example is whitespace.
    */
  var leadingTriviaChars: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The start and end point of the text to parse within the `source` string.
    * The entire `source` string is parsed if this is not provided.
    * */
  var range: js.UndefOr[LexerRange] = js.undefined
  /** Whether to tokenize ICU messages (considered as text nodes when false). */
  var tokenizeExpansionForms: js.UndefOr[Boolean] = js.undefined
}

object TokenizeOptions {
  @scala.inline
  def apply(): TokenizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizeOptions]
  }
  @scala.inline
  implicit class TokenizeOptionsOps[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEscapedString(value: Boolean): Self = this.set("escapedString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapedString: Self = this.set("escapedString", js.undefined)
    @scala.inline
    def setInterpolationConfig(value: InterpolationConfig): Self = this.set("interpolationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolationConfig: Self = this.set("interpolationConfig", js.undefined)
    @scala.inline
    def setLeadingTriviaCharsVarargs(value: String*): Self = this.set("leadingTriviaChars", js.Array(value :_*))
    @scala.inline
    def setLeadingTriviaChars(value: js.Array[String]): Self = this.set("leadingTriviaChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeadingTriviaChars: Self = this.set("leadingTriviaChars", js.undefined)
    @scala.inline
    def setRange(value: LexerRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setTokenizeExpansionForms(value: Boolean): Self = this.set("tokenizeExpansionForms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenizeExpansionForms: Self = this.set("tokenizeExpansionForms", js.undefined)
  }
  
}

