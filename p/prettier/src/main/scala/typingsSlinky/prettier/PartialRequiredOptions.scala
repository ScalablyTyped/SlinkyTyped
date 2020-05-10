package typingsSlinky.prettier

import typingsSlinky.prettier.mod.AST
import typingsSlinky.prettier.mod.BuiltInParserName
import typingsSlinky.prettier.mod.CustomParser
import typingsSlinky.prettier.mod.Options
import typingsSlinky.prettier.mod.Plugin
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

/* Inlined std.Partial<prettier.prettier.RequiredOptions> */
@js.native
trait PartialRequiredOptions extends js.Object {
  var arrowParens: js.UndefOr[avoid | always] = js.native
  var bracketSpacing: js.UndefOr[Boolean] = js.native
  var endOfLine: js.UndefOr[auto | lf | crlf | cr] = js.native
  var filepath: js.UndefOr[String] = js.native
  var htmlWhitespaceSensitivity: js.UndefOr[css | strict | ignore] = js.native
  var insertPragma: js.UndefOr[Boolean] = js.native
  var jsxBracketSameLine: js.UndefOr[Boolean] = js.native
  var jsxSingleQuote: js.UndefOr[Boolean] = js.native
  var parser: js.UndefOr[BuiltInParserName | CustomParser] = js.native
  var plugins: js.UndefOr[js.Array[String | Plugin]] = js.native
  var printWidth: js.UndefOr[Double] = js.native
  var proseWrap: js.UndefOr[always | never | preserve] = js.native
  var quoteProps: js.UndefOr[`as-needed` | consistent | preserve] = js.native
  var rangeEnd: js.UndefOr[Double] = js.native
  var rangeStart: js.UndefOr[Double] = js.native
  var requirePragma: js.UndefOr[Boolean] = js.native
  var semi: js.UndefOr[Boolean] = js.native
  var singleQuote: js.UndefOr[Boolean] = js.native
  var tabWidth: js.UndefOr[Double] = js.native
  var trailingComma: js.UndefOr[none | es5 | all] = js.native
  var useTabs: js.UndefOr[Boolean] = js.native
  var vueIndentScriptAndStyle: js.UndefOr[Boolean] = js.native
}

object PartialRequiredOptions {
  @scala.inline
  def apply(): PartialRequiredOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequiredOptions]
  }
  @scala.inline
  implicit class PartialRequiredOptionsOps[Self <: PartialRequiredOptions] (val x: Self) extends AnyVal {
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
    def withoutArrowParens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowParens")(js.undefined)
        ret
    }
    @scala.inline
    def withBracketSpacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracketSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBracketSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracketSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOfLine(value: auto | lf | crlf | cr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOfLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfLine")(js.undefined)
        ret
    }
    @scala.inline
    def withFilepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilepath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepath")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlWhitespaceSensitivity(value: css | strict | ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlWhitespaceSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlWhitespaceSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlWhitespaceSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertPragma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertPragma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertPragma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertPragma")(js.undefined)
        ret
    }
    @scala.inline
    def withJsxBracketSameLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxBracketSameLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsxBracketSameLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxBracketSameLine")(js.undefined)
        ret
    }
    @scala.inline
    def withJsxSingleQuote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxSingleQuote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsxSingleQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxSingleQuote")(js.undefined)
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
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String | Plugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withProseWrap(value: always | never | preserve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proseWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProseWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proseWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteProps(value: `as-needed` | consistent | preserve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteProps")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirePragma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirePragma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirePragma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirePragma")(js.undefined)
        ret
    }
    @scala.inline
    def withSemi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semi")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleQuote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleQuote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleQuote")(js.undefined)
        ret
    }
    @scala.inline
    def withTabWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingComma(value: none | es5 | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingComma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingComma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingComma")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withVueIndentScriptAndStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vueIndentScriptAndStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVueIndentScriptAndStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vueIndentScriptAndStyle")(js.undefined)
        ret
    }
  }
  
}

