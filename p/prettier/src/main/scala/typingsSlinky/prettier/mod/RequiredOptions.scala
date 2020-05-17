package typingsSlinky.prettier.mod

import typingsSlinky.prettier.anon.RecordBuiltInParserNameBu
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
import typingsSlinky.prettier.prettierStrings.preserve
import typingsSlinky.prettier.prettierStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequiredOptions
  extends typingsSlinky.prettier.mod.doc.printer.Options {
  /**
    * Include parentheses around a sole arrow function parameter.
    * @default 'always'
    */
  var arrowParens: avoid | always = js.native
  /**
    * Print spaces between brackets in object literals.
    * @default true
    */
  var bracketSpacing: Boolean = js.native
  /**
    * Which end of line characters to apply.
    * @default 'lf'
    */
  var endOfLine: auto | lf | crlf | cr = js.native
  /**
    * Specify the input filepath. This will be used to do parser inference.
    */
  var filepath: String = js.native
  /**
    * How to handle whitespaces in HTML.
    * @default 'css'
    */
  var htmlWhitespaceSensitivity: css | strict | ignore = js.native
  /**
    * Prettier can insert a special @format marker at the top of files specifying that
    * the file has been formatted with prettier. This works well when used in tandem with
    * the --require-pragma option. If there is already a docblock at the top of
    * the file then this option will add a newline to it with the @format marker.
    * @default false
    */
  var insertPragma: Boolean = js.native
  /**
    * Put the `>` of a multi-line JSX element at the end of the last line instead of being alone on the next line.
    * @default false
    */
  var jsxBracketSameLine: Boolean = js.native
  /**
    * Use single quotes in JSX.
    * @default false
    */
  var jsxSingleQuote: Boolean = js.native
  /**
    * Specify which parser to use.
    */
  var parser: BuiltInParserName | CustomParser = js.native
  /**
    * The plugin API is in a beta state.
    */
  var plugins: js.Array[String | Plugin] = js.native
  /**
    * By default, Prettier will wrap markdown text as-is since some services use a linebreak-sensitive renderer.
    * In some cases you may want to rely on editor/viewer soft wrapping instead, so this option allows you to opt out.
    * @default 'preserve'
    */
  var proseWrap: always | never | preserve = js.native
  /**
    * Change when properties in objects are quoted.
    * @default 'as-needed'
    */
  var quoteProps: `as-needed` | consistent | preserve = js.native
  /**
    * Format only a segment of a file.
    * @default Infinity
    */
  var rangeEnd: Double = js.native
  /**
    * Format only a segment of a file.
    * @default 0
    */
  var rangeStart: Double = js.native
  /**
    * Prettier can restrict itself to only format files that contain a special comment, called a pragma, at the top of the file.
    * This is very useful when gradually transitioning large, unformatted codebases to prettier.
    * @default false
    */
  var requirePragma: Boolean = js.native
  /**
    * Print semicolons at the ends of statements.
    * @default true
    */
  var semi: Boolean = js.native
  /**
    * Use single quotes instead of double quotes.
    * @default false
    */
  var singleQuote: Boolean = js.native
  /**
    * Print trailing commas wherever possible.
    * @default 'es5'
    */
  var trailingComma: none | es5 | all = js.native
  /**
    * Whether or not to indent the code inside <script> and <style> tags in Vue files.
    * @default false
    */
  var vueIndentScriptAndStyle: Boolean = js.native
}

object RequiredOptions {
  @scala.inline
  def apply(
    arrowParens: avoid | always,
    bracketSpacing: Boolean,
    endOfLine: auto | lf | crlf | cr,
    filepath: String,
    htmlWhitespaceSensitivity: css | strict | ignore,
    insertPragma: Boolean,
    jsxBracketSameLine: Boolean,
    jsxSingleQuote: Boolean,
    parser: BuiltInParserName | CustomParser,
    plugins: js.Array[String | Plugin],
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
  ): RequiredOptions = {
    val __obj = js.Dynamic.literal(arrowParens = arrowParens.asInstanceOf[js.Any], bracketSpacing = bracketSpacing.asInstanceOf[js.Any], endOfLine = endOfLine.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], htmlWhitespaceSensitivity = htmlWhitespaceSensitivity.asInstanceOf[js.Any], insertPragma = insertPragma.asInstanceOf[js.Any], jsxBracketSameLine = jsxBracketSameLine.asInstanceOf[js.Any], jsxSingleQuote = jsxSingleQuote.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printWidth = printWidth.asInstanceOf[js.Any], proseWrap = proseWrap.asInstanceOf[js.Any], quoteProps = quoteProps.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], requirePragma = requirePragma.asInstanceOf[js.Any], semi = semi.asInstanceOf[js.Any], singleQuote = singleQuote.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any], vueIndentScriptAndStyle = vueIndentScriptAndStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOptions]
  }
  @scala.inline
  implicit class RequiredOptionsOps[Self <: RequiredOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowParens(value: avoid | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowParens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBracketSpacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracketSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndOfLine(value: auto | lf | crlf | cr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlWhitespaceSensitivity(value: css | strict | ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlWhitespaceSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertPragma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertPragma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsxBracketSameLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxBracketSameLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsxSingleQuote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxSingleQuote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParserFunction3(value: (/* text */ String, /* parsers */ RecordBuiltInParserNameBu, /* options */ Options) => AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withParser(value: BuiltInParserName | CustomParser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String | Plugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProseWrap(value: always | never | preserve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proseWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuoteProps(value: `as-needed` | consistent | preserve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequirePragma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirePragma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleQuote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleQuote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrailingComma(value: none | es5 | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingComma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVueIndentScriptAndStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vueIndentScriptAndStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

