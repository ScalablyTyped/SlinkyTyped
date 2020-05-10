package typingsSlinky.escodegen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptions extends js.Object {
  /**
    * Do not include superfluous whitespace characters and line terminators. Default is false.
    */
  var compact: js.UndefOr[Boolean] = js.native
  /**
    * Escape as few characters in string literals as necessary. Default is false.
    */
  var escapeless: js.UndefOr[Boolean] = js.native
  /**
    * Generate hexadecimal a numeric literal if it is shorter than its equivalents. Requires option.format.renumber. Default is false.
    */
  var hexadecimal: js.UndefOr[Boolean] = js.native
  /**
    * The indent options
    */
  var indent: js.UndefOr[IndentOptions] = js.native
  /**
    * Enforce JSON format of numeric and string literals. This option takes precedence over option.format.hexadecimal and option.format.quotes. Default is false.
    */
  var json: js.UndefOr[Boolean] = js.native
  /**
    * New line string. Default is '\n'.
    */
  var newline: js.UndefOr[String] = js.native
  /**
    * Preserve parentheses in new expressions that have no arguments. Default is true.
    */
  var parentheses: js.UndefOr[Boolean] = js.native
  var preserveBlankLines: js.UndefOr[Boolean] = js.native
  /**
    * Delimiter to use for string literals. Accepted values are: 'single', 'double', and 'auto'. When 'auto' is specified, escodegen selects a delimiter that results in a shorter literal. Default is 'single'.
    */
  var quotes: js.UndefOr[String] = js.native
  /**
    * Try to generate shorter numeric literals than toString() (9.8.1). Default is false.
    */
  var renumber: js.UndefOr[Boolean] = js.native
  var safeConcatenation: js.UndefOr[Boolean] = js.native
  /**
    * Preserve semicolons at the end of blocks and programs. Default is true.
    */
  var semicolons: js.UndefOr[Boolean] = js.native
  /**
    * White space string. Default is standard ' ' (\x20).
    */
  var space: js.UndefOr[String] = js.native
}

object FormatOptions {
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeless")(js.undefined)
        ret
    }
    @scala.inline
    def withHexadecimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexadecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexadecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexadecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: IndentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withNewline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(js.undefined)
        ret
    }
    @scala.inline
    def withParentheses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentheses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentheses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentheses")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveBlankLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveBlankLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveBlankLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveBlankLines")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(js.undefined)
        ret
    }
    @scala.inline
    def withRenumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeConcatenation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeConcatenation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeConcatenation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeConcatenation")(js.undefined)
        ret
    }
    @scala.inline
    def withSemicolons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemicolons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolons")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
  }
  
}

