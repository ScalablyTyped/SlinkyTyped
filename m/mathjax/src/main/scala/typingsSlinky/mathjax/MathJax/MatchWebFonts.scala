package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchWebFonts extends js.Object {
  /*Initial delay before the first check for web fonts (in milliseconds).*/
  var fontCheckDelay: js.UndefOr[Double] = js.native
  /*How long to keep looking for fonts (in milliseconds).*/
  var fontCheckTimeout: js.UndefOr[Double] = js.native
  /*This block controls whether to apply font size matching for each output mode.*/
  var matchFor: js.UndefOr[MatchFor] = js.native
}

object MatchWebFonts {
  @scala.inline
  def apply(): MatchWebFonts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchWebFonts]
  }
  @scala.inline
  implicit class MatchWebFontsOps[Self <: MatchWebFonts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontCheckDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontCheckDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontCheckDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontCheckDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFontCheckTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontCheckTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontCheckTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontCheckTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchFor(value: MatchFor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFor")(js.undefined)
        ret
    }
  }
  
}

