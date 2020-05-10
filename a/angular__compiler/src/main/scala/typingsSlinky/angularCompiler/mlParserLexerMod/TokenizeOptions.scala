package typingsSlinky.angularCompiler.mlParserLexerMod

import typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var escapedString: js.UndefOr[Boolean] = js.native
  /** How to tokenize interpolation markers. */
  var interpolationConfig: js.UndefOr[InterpolationConfig] = js.native
  /**
    * An array of characters that should be considered as leading trivia.
    * Leading trivia are characters that are not important to the developer, and so should not be
    * included in source-map segments.  A common example is whitespace.
    */
  var leadingTriviaChars: js.UndefOr[js.Array[String]] = js.native
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
  implicit class TokenizeOptionsOps[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscapedString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapedString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapedString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapedString")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolationConfig(value: InterpolationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLeadingTriviaChars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingTriviaChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingTriviaChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingTriviaChars")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: LexerRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenizeExpansionForms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizeExpansionForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenizeExpansionForms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizeExpansionForms")(js.undefined)
        ret
    }
  }
  
}

