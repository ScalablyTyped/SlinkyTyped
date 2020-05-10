package typingsSlinky.babelParser.mod

import typingsSlinky.babelParser.babelParserStrings.module
import typingsSlinky.babelParser.babelParserStrings.script
import typingsSlinky.babelParser.babelParserStrings.unambiguous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserOptions extends js.Object {
  /**
    * By default, await use is not allowed outside of an async function.
    * Set this to true to accept such code.
    */
  var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.native
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
  /**
    * By default, a return statement at the top level raises an error.
    * Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
  var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.native
  /**
    * By default, exported identifiers must refer to a declared variable.
    * Set this to true to allow export statements to reference undeclared variables.
    */
  var allowUndeclaredExports: js.UndefOr[Boolean] = js.native
  /**
    * By default, the parser adds information about parentheses by setting
    * `extra.parenthesized` to `true` as needed.
    * When this option is `true` the parser creates `ParenthesizedExpression`
    * AST nodes instead of using the `extra` property.
    */
  var createParenthesizedExpressions: js.UndefOr[Boolean] = js.native
  /**
    * Array containing the plugins that you want to enable.
    */
  var plugins: js.UndefOr[js.Array[ParserPlugin]] = js.native
  /**
    * Adds a ranges property to each node: [node.start, node.end]
    */
  var ranges: js.UndefOr[Boolean] = js.native
  /**
    * Correlate output AST nodes with their source filename.
    * Useful when generating code and source maps from the ASTs of multiple input files.
    */
  var sourceFilename: js.UndefOr[String] = js.native
  /**
    * Indicate the mode the code should be parsed in.
    * Can be one of "script", "module", or "unambiguous". Defaults to "script".
    * "unambiguous" will make @babel/parser attempt to guess, based on the presence
    * of ES6 import or export statements.
    * Files with ES6 imports and exports are considered "module" and are otherwise "script".
    */
  var sourceType: js.UndefOr[script | module | unambiguous] = js.native
  /**
    * By default, the first line of code parsed is treated as line 1.
    * You can provide a line number to alternatively start with.
    * Useful for integration with other source tools.
    */
  var startLine: js.UndefOr[Double] = js.native
  /**
    * Should the parser work in strict mode.
    * Defaults to true if sourceType === 'module'. Otherwise, false.
    */
  var strictMode: js.UndefOr[Boolean] = js.native
  /**
    * Adds all parsed tokens to a tokens property on the File node.
    */
  var tokens: js.UndefOr[Boolean] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAwaitOutsideFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAwaitOutsideFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAwaitOutsideFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAwaitOutsideFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowImportExportEverywhere(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImportExportEverywhere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowImportExportEverywhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImportExportEverywhere")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReturnOutsideFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReturnOutsideFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReturnOutsideFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReturnOutsideFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSuperOutsideMethod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSuperOutsideMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSuperOutsideMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSuperOutsideMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUndeclaredExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndeclaredExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUndeclaredExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndeclaredExports")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateParenthesizedExpressions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParenthesizedExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateParenthesizedExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParenthesizedExpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[ParserPlugin]): Self = {
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
    def withRanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: script | module | unambiguous): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLine")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(js.undefined)
        ret
    }
  }
  
}

