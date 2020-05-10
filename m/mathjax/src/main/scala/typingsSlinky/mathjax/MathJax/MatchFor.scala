package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchFor extends js.Object {
  /*Whether to match the font size for the HTML-CSS output.*/
  var `HTML-CSS`: js.UndefOr[Boolean] = js.native
  /*Whether to match the font size for the NativeMML output.*/
  var NativeMML: js.UndefOr[Boolean] = js.native
  /*Whether to match the font size for the SVG output.*/
  var SVG: js.UndefOr[Boolean] = js.native
}

object MatchFor {
  @scala.inline
  def apply(): MatchFor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchFor]
  }
  @scala.inline
  implicit class MatchForOps[Self <: MatchFor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withHTML-CSS`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML-CSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHTML-CSS`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML-CSS")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeMML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NativeMML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeMML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NativeMML")(js.undefined)
        ret
    }
    @scala.inline
    def withSVG(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSVG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG")(js.undefined)
        ret
    }
  }
  
}

