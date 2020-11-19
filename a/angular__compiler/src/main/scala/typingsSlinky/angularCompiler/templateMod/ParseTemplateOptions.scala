package typingsSlinky.angularCompiler.templateMod

import typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsSlinky.angularCompiler.mlParserLexerMod.LexerRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseTemplateOptions extends js.Object {
  
  /**
    * Render `$localize` message ids with additional legacy message ids.
    *
    * This option defaults to `true` but in the future the defaul will be flipped.
    *
    * For now set this option to false if you have migrated the translation files to use the new
    * `$localize` message id format and you are not using compile time translation merging.
    */
  var enableI18nLegacyMessageIdFormat: js.UndefOr[Boolean] = js.native
  
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
  
  /**
    * How to parse interpolation markers.
    */
  var interpolationConfig: js.UndefOr[InterpolationConfig] = js.native
  
  /**
    * An array of characters that should be considered as leading trivia.
    * Leading trivia are characters that are not important to the developer, and so should not be
    * included in source-map segments.  A common example is whitespace.
    */
  var leadingTriviaChars: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Include whitespace nodes in the parsed output.
    */
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  
  /**
    * The start and end point of the text to parse within the `source` string.
    * The entire `source` string is parsed if this is not provided.
    * */
  var range: js.UndefOr[LexerRange] = js.native
}
object ParseTemplateOptions {
  
  @scala.inline
  def apply(): ParseTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseTemplateOptions]
  }
  
  @scala.inline
  implicit class ParseTemplateOptionsOps[Self <: ParseTemplateOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableI18nLegacyMessageIdFormat(value: Boolean): Self = this.set("enableI18nLegacyMessageIdFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableI18nLegacyMessageIdFormat: Self = this.set("enableI18nLegacyMessageIdFormat", js.undefined)
    
    @scala.inline
    def setEscapedString(value: Boolean): Self = this.set("escapedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapedString: Self = this.set("escapedString", js.undefined)
    
    @scala.inline
    def setI18nNormalizeLineEndingsInICUs(value: Boolean): Self = this.set("i18nNormalizeLineEndingsInICUs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18nNormalizeLineEndingsInICUs: Self = this.set("i18nNormalizeLineEndingsInICUs", js.undefined)
    
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
    def setPreserveWhitespaces(value: Boolean): Self = this.set("preserveWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveWhitespaces: Self = this.set("preserveWhitespaces", js.undefined)
    
    @scala.inline
    def setRange(value: LexerRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
