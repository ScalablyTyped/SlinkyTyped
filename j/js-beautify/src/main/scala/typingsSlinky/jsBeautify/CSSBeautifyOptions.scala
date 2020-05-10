package typingsSlinky.jsBeautify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSBeautifyOptions extends js.Object {
  var end_with_newline: js.UndefOr[Boolean] = js.native
  var eol: js.UndefOr[String] = js.native
  var indent_char: js.UndefOr[String] = js.native
  var indent_size: js.UndefOr[Double] = js.native
  var indent_with_tabs: js.UndefOr[Boolean] = js.native
  var newline_between_rules: js.UndefOr[Boolean] = js.native
  var selector_separator_newline: js.UndefOr[Boolean] = js.native
}

object CSSBeautifyOptions {
  @scala.inline
  def apply(): CSSBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSBeautifyOptions]
  }
  @scala.inline
  implicit class CSSBeautifyOptionsOps[Self <: CSSBeautifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withNewline_between_rules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline_between_rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline_between_rules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline_between_rules")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector_separator_newline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector_separator_newline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector_separator_newline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector_separator_newline")(js.undefined)
        ret
    }
  }
  
}

