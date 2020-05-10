package typingsSlinky.jsBeautify

import typingsSlinky.jsBeautify.jsBeautifyStrings.`collapse-preserve-inline`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`end-expand`
import typingsSlinky.jsBeautify.jsBeautifyStrings.auto
import typingsSlinky.jsBeautify.jsBeautifyStrings.collapse
import typingsSlinky.jsBeautify.jsBeautifyStrings.expand
import typingsSlinky.jsBeautify.jsBeautifyStrings.force
import typingsSlinky.jsBeautify.jsBeautifyStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsBeautifyOptions extends js.Object {
  var brace_style: js.UndefOr[`collapse-preserve-inline` | collapse | expand | `end-expand` | none] = js.native
  var break_chained_methods: js.UndefOr[Boolean] = js.native
  var e4x: js.UndefOr[Boolean] = js.native
  var end_with_newline: js.UndefOr[Boolean] = js.native
  var eol: js.UndefOr[String] = js.native
  var eval_code: js.UndefOr[Boolean] = js.native
  var indent_char: js.UndefOr[String] = js.native
  var indent_level: js.UndefOr[Double] = js.native
  var indent_size: js.UndefOr[Double] = js.native
  var indent_with_tabs: js.UndefOr[Boolean] = js.native
  var jslint_happy: js.UndefOr[Boolean] = js.native
  var keep_array_indentation: js.UndefOr[Boolean] = js.native
  var keep_function_indentation: js.UndefOr[Boolean] = js.native
  var max_preserve_newlines: js.UndefOr[Double] = js.native
  var preserve_newlines: js.UndefOr[Boolean] = js.native
  var space_after_anon_function: js.UndefOr[Boolean] = js.native
  var space_before_conditional: js.UndefOr[Boolean] = js.native
  var space_in_empty_paren: js.UndefOr[Boolean] = js.native
  var unescape_strings: js.UndefOr[Boolean] = js.native
  var wrap_attributes: js.UndefOr[auto | force] = js.native
  var wrap_attributes_indent_size: js.UndefOr[Double] = js.native
  var wrap_line_length: js.UndefOr[Double] = js.native
}

object JsBeautifyOptions {
  @scala.inline
  def apply(): JsBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsBeautifyOptions]
  }
  @scala.inline
  implicit class JsBeautifyOptionsOps[Self <: JsBeautifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrace_style(value: `collapse-preserve-inline` | collapse | expand | `end-expand` | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brace_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrace_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brace_style")(js.undefined)
        ret
    }
    @scala.inline
    def withBreak_chained_methods(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break_chained_methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreak_chained_methods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break_chained_methods")(js.undefined)
        ret
    }
    @scala.inline
    def withE4x(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e4x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE4x: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e4x")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_with_newline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_with_newline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_with_newline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_with_newline")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withEval_code(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEval_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval_code")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_char(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_char: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_char")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_level: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_level")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_size")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_with_tabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_with_tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_with_tabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_with_tabs")(js.undefined)
        ret
    }
    @scala.inline
    def withJslint_happy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jslint_happy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJslint_happy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jslint_happy")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_array_indentation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_array_indentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_array_indentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_array_indentation")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_function_indentation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_function_indentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_function_indentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_function_indentation")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_preserve_newlines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_preserve_newlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_preserve_newlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_preserve_newlines")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserve_newlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve_newlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserve_newlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve_newlines")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace_after_anon_function(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_after_anon_function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace_after_anon_function: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_after_anon_function")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace_before_conditional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_before_conditional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace_before_conditional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_before_conditional")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace_in_empty_paren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_in_empty_paren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace_in_empty_paren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_in_empty_paren")(js.undefined)
        ret
    }
    @scala.inline
    def withUnescape_strings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape_strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnescape_strings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape_strings")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap_attributes(value: auto | force): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap_attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap_attributes_indent_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap_attributes_indent_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap_attributes_indent_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap_attributes_indent_size")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap_line_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap_line_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap_line_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap_line_length")(js.undefined)
        ret
    }
  }
  
}

