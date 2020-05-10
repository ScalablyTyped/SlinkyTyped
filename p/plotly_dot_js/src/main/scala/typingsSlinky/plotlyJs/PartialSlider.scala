package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.Color
import typingsSlinky.plotlyJs.mod.Font
import typingsSlinky.plotlyJs.mod.Transition
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.fraction
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.pixels
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Slider> */
@js.native
trait PartialSlider extends js.Object {
  var active: js.UndefOr[Double] = js.native
  var activebgcolor: js.UndefOr[Color] = js.native
  var bgcolor: js.UndefOr[Color] = js.native
  var bordercolor: js.UndefOr[Color] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var currentvalue: js.UndefOr[AnonFont] = js.native
  var font: js.UndefOr[Font] = js.native
  var len: js.UndefOr[Double] = js.native
  var lenmode: js.UndefOr[fraction | pixels] = js.native
  var minorticklen: js.UndefOr[Double] = js.native
  var pad: js.UndefOr[PartialPadding] = js.native
  var steps: js.UndefOr[js.Array[PartialSliderStep]] = js.native
  var tickcolor: js.UndefOr[Color] = js.native
  var ticklen: js.UndefOr[Double] = js.native
  var tickwidth: js.UndefOr[Double] = js.native
  var transition: js.UndefOr[Transition] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var x: js.UndefOr[Double] = js.native
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  var y: js.UndefOr[Double] = js.native
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
}

object PartialSlider {
  @scala.inline
  def apply(): PartialSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSlider]
  }
  @scala.inline
  implicit class PartialSliderOps[Self <: PartialSlider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withActivebgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activebgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivebgcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activebgcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBordercolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordercolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentvalue(value: AnonFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentvalue")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(js.undefined)
        ret
    }
    @scala.inline
    def withLenmode(value: fraction | pixels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLenmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenmode")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorticklen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorticklen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorticklen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorticklen")(js.undefined)
        ret
    }
    @scala.inline
    def withPad(value: PartialPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[PartialSliderStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withTickcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withTicklen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticklen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicklen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticklen")(js.undefined)
        ret
    }
    @scala.inline
    def withTickwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withXanchor(value: auto | left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXanchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xanchor")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withYanchor(value: auto | top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYanchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yanchor")(js.undefined)
        ret
    }
  }
  
}

