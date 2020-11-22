package typingsSlinky.prettier.mod

import typingsSlinky.prettier.prettierStrings.`as-needed`
import typingsSlinky.prettier.prettierStrings.all
import typingsSlinky.prettier.prettierStrings.always
import typingsSlinky.prettier.prettierStrings.auto
import typingsSlinky.prettier.prettierStrings.avoid
import typingsSlinky.prettier.prettierStrings.consistent
import typingsSlinky.prettier.prettierStrings.cr
import typingsSlinky.prettier.prettierStrings.crlf
import typingsSlinky.prettier.prettierStrings.css
import typingsSlinky.prettier.prettierStrings.es5
import typingsSlinky.prettier.prettierStrings.ignore
import typingsSlinky.prettier.prettierStrings.lf
import typingsSlinky.prettier.prettierStrings.never
import typingsSlinky.prettier.prettierStrings.none
import typingsSlinky.prettier.prettierStrings.off
import typingsSlinky.prettier.prettierStrings.preserve
import typingsSlinky.prettier.prettierStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions[T] extends RequiredOptions {
  
  def locEnd(node: T): Double = js.native
  
  def locStart(node: T): Double = js.native
  
  var originalText: String = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply[T](
    arrowParens: avoid | always,
    bracketSpacing: Boolean,
    embeddedInHtml: Boolean,
    embeddedLanguageFormatting: auto | off,
    endOfLine: auto | lf | crlf | cr,
    filepath: String,
    htmlWhitespaceSensitivity: css | strict | ignore,
    insertPragma: Boolean,
    jsxBracketSameLine: Boolean,
    jsxSingleQuote: Boolean,
    locEnd: T => Double,
    locStart: T => Double,
    originalText: String,
    parser: (LiteralUnion[BuiltInParserName, String]) | CustomParser,
    plugins: js.Array[String | Plugin[_]],
    printWidth: Double,
    proseWrap: always | never | preserve,
    quoteProps: `as-needed` | consistent | preserve,
    rangeEnd: Double,
    rangeStart: Double,
    requirePragma: Boolean,
    semi: Boolean,
    singleQuote: Boolean,
    tabWidth: Double,
    trailingComma: none | es5 | all,
    useTabs: Boolean,
    vueIndentScriptAndStyle: Boolean
  ): ParserOptions[T] = {
    val __obj = js.Dynamic.literal(arrowParens = arrowParens.asInstanceOf[js.Any], bracketSpacing = bracketSpacing.asInstanceOf[js.Any], embeddedInHtml = embeddedInHtml.asInstanceOf[js.Any], embeddedLanguageFormatting = embeddedLanguageFormatting.asInstanceOf[js.Any], endOfLine = endOfLine.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], htmlWhitespaceSensitivity = htmlWhitespaceSensitivity.asInstanceOf[js.Any], insertPragma = insertPragma.asInstanceOf[js.Any], jsxBracketSameLine = jsxBracketSameLine.asInstanceOf[js.Any], jsxSingleQuote = jsxSingleQuote.asInstanceOf[js.Any], locEnd = js.Any.fromFunction1(locEnd), locStart = js.Any.fromFunction1(locStart), originalText = originalText.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printWidth = printWidth.asInstanceOf[js.Any], proseWrap = proseWrap.asInstanceOf[js.Any], quoteProps = quoteProps.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], requirePragma = requirePragma.asInstanceOf[js.Any], semi = semi.asInstanceOf[js.Any], singleQuote = singleQuote.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any], vueIndentScriptAndStyle = vueIndentScriptAndStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions[T]]
  }
  
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions[_], T] (val x: Self with ParserOptions[T]) extends AnyVal {
    
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
    def setLocEnd(value: T => Double): Self = this.set("locEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocStart(value: T => Double): Self = this.set("locStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOriginalText(value: String): Self = this.set("originalText", value.asInstanceOf[js.Any])
  }
}
