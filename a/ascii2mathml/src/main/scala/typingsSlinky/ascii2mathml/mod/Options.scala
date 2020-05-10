package typingsSlinky.ascii2mathml.mod

import typingsSlinky.ascii2mathml.ascii2mathmlStrings.`inline`
import typingsSlinky.ascii2mathml.ascii2mathmlStrings.block
import typingsSlinky.ascii2mathml.ascii2mathmlStrings.ltr
import typingsSlinky.ascii2mathml.ascii2mathmlStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var annotate: js.UndefOr[Boolean] = js.native
  var bare: js.UndefOr[Boolean] = js.native
  var colSep: js.UndefOr[String] = js.native
  var decimalMark: js.UndefOr[String] = js.native
  var dir: js.UndefOr[ltr | rtl] = js.native
  var display: js.UndefOr[`inline` | block] = js.native
  var rowSep: js.UndefOr[String] = js.native
  var standalone: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotate")(js.undefined)
        ret
    }
    @scala.inline
    def withBare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bare")(js.undefined)
        ret
    }
    @scala.inline
    def withColSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSep")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalMark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalMark")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: `inline` | block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSep")(js.undefined)
        ret
    }
    @scala.inline
    def withStandalone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(js.undefined)
        ret
    }
  }
  
}

