package typingsSlinky.html.mod

import typingsSlinky.html.htmlStrings.`end-expand`
import typingsSlinky.html.htmlStrings.collapse
import typingsSlinky.html.htmlStrings.expand
import typingsSlinky.html.htmlStrings.keep
import typingsSlinky.html.htmlStrings.normal
import typingsSlinky.html.htmlStrings.separate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintOptions extends js.Object {
  /**
    * Put braces on the same line as control statements (`collapse`),
    * or put braces on own line (Allman / ANSI style, `expand`),
    * or just put end braces on own line (`end-expand`). Default: `collapse`.
    */
  var brace_style: js.UndefOr[collapse | expand | `end-expand`] = js.native
  /** character to indent with. Default: " " (space). */
  var indent_char: js.UndefOr[String] = js.native
  /** Default: `normal`. */
  var indent_scripts: js.UndefOr[keep | separate | normal] = js.native
  /** indentation size. Default: 4. */
  var indent_size: js.UndefOr[Double] = js.native
  /** Maximum amount of characters per line. Default: 70. */
  var max_char: js.UndefOr[Double] = js.native
  /** list of tags, that shouldn't be reformatted. Defaults to inline tags. */
  var unformatted: js.UndefOr[js.Array[String]] = js.native
}

object PrintOptions {
  @scala.inline
  def apply(): PrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintOptions]
  }
  @scala.inline
  implicit class PrintOptionsOps[Self <: PrintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrace_style(value: collapse | expand | `end-expand`): Self = {
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
    def withIndent_scripts(value: keep | separate | normal): Self = {
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
    def withMax_char(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_char: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_char")(js.undefined)
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
  }
  
}

