package typingsSlinky.jsBeautify

import typingsSlinky.jsBeautify.jsBeautifyStrings.`aligned-multiple`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`force-aligned`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`force-expand-multiline`
import typingsSlinky.jsBeautify.jsBeautifyStrings.auto
import typingsSlinky.jsBeautify.jsBeautifyStrings.force
import typingsSlinky.jsBeautify.jsBeautifyStrings.keep
import typingsSlinky.jsBeautify.jsBeautifyStrings.separate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See https://github.com/beautify-web/js-beautify/blob/v1.8.2/js/src/html/beautifier.js#L268-L330
@js.native
trait HTMLBeautifyOptions extends js.Object {
  var content_unformatted: js.UndefOr[js.Array[String]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var end_with_newline: js.UndefOr[Boolean] = js.native
  var eol: js.UndefOr[String] = js.native
  var extra_liners: js.UndefOr[js.Array[String]] = js.native
  var indent_body_inner_html: js.UndefOr[Boolean] = js.native
  var indent_char: js.UndefOr[String] = js.native
  var indent_handlebars: js.UndefOr[Boolean] = js.native
  var indent_head_inner_html: js.UndefOr[Boolean] = js.native
  var indent_inner_html: js.UndefOr[Boolean] = js.native
  var indent_scripts: js.UndefOr[keep | separate] = js.native
  var indent_size: js.UndefOr[Double] = js.native
  var indent_with_tabs: js.UndefOr[Boolean] = js.native
  var `inline`: js.UndefOr[js.Array[String]] = js.native
  var max_preserve_newlines: js.UndefOr[Double] = js.native
  var preserve_newlines: js.UndefOr[Boolean] = js.native
  var unformatted: js.UndefOr[js.Array[String]] = js.native
  var void_elements: js.UndefOr[js.Array[String]] = js.native
  var wrap_attributes: js.UndefOr[auto | force | `force-expand-multiline` | `force-aligned` | `aligned-multiple`] = js.native
  var wrap_attributes_indent_size: js.UndefOr[Double] = js.native
  var wrap_line_length: js.UndefOr[Double] = js.native
}

object HTMLBeautifyOptions {
  @scala.inline
  def apply(): HTMLBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLBeautifyOptions]
  }
  @scala.inline
  implicit class HTMLBeautifyOptionsOps[Self <: HTMLBeautifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent_unformatted(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_unformatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_unformatted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_unformatted")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
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
    def withExtra_liners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_liners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra_liners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_liners")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_body_inner_html(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_body_inner_html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_body_inner_html: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_body_inner_html")(js.undefined)
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
    def withIndent_handlebars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_handlebars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_handlebars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_handlebars")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_head_inner_html(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_head_inner_html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_head_inner_html: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_head_inner_html")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_inner_html(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_inner_html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_inner_html: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_inner_html")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_scripts(value: keep | separate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_scripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_scripts")(js.undefined)
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
    def withInline(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
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
    def withUnformatted(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unformatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnformatted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unformatted")(js.undefined)
        ret
    }
    @scala.inline
    def withVoid_elements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("void_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoid_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("void_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap_attributes(value: auto | force | `force-expand-multiline` | `force-aligned` | `aligned-multiple`): Self = {
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

