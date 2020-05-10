package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.AnonFont
import typingsSlinky.plotlyJs.PartialPadding
import typingsSlinky.plotlyJs.PartialSliderStep
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

@js.native
trait Slider extends js.Object {
  /**
  	 * Determines which button (by index starting from 0) is
  	 * considered active.
  	 */
  var active: Double = js.native
  /**
  	 * Sets the background color of the slider grip
  	 * while dragging.
  	 */
  var activebgcolor: Color = js.native
  /**
  	 * Sets the background color of the slider.
  	 */
  var bgcolor: Color = js.native
  /**
  	 * Sets the color of the border enclosing the slider.
  	 */
  var bordercolor: Color = js.native
  /**
  	 * Sets the width (in px) of the border enclosing the slider.
  	 */
  var borderwidth: Double = js.native
  var currentvalue: AnonFont = js.native
  /**
  	 * Sets the font of the slider step labels.
  	 */
  var font: Font = js.native
  /**
  	 * Sets the length of the slider
  	 * This measure excludes the padding of both ends.
  	 * That is, the slider's length is this length minus the
  	 * padding on both ends.
  	 */
  var len: Double = js.native
  /**
  	 * Determines whether this slider length
  	 * is set in units of plot *fraction* or in *pixels.
  	 * Use `len` to set the value.
  	 */
  var lenmode: fraction | pixels = js.native
  /**
  	 * Sets the length in pixels of minor step tick marks
  	 */
  var minorticklen: Double = js.native
  /**
  	 * Set the padding of the slider component along each side.
  	 */
  var pad: PartialPadding = js.native
  var steps: js.Array[PartialSliderStep] = js.native
  /**
  	 * Sets the color of the border enclosing the slider.
  	 */
  var tickcolor: Color = js.native
  /**
  	 * Sets the length in pixels of step tick marks
  	 */
  var ticklen: Double = js.native
  /**
  	 * Sets the tick width (in px).
  	 */
  var tickwidth: Double = js.native
  var transition: Transition = js.native
  /**
  	 * Determines whether or not the slider is visible.
  	 */
  var visible: Boolean = js.native
  /**
  	 * Sets the x position (in normalized coordinates) of the slider.
  	 */
  var x: Double = js.native
  /**
  	 * Sets the slider's horizontal position anchor.
  	 * This anchor binds the `x` position to the *left*, *center*
  	 * or *right* of the range selector.
  	 */
  var xanchor: auto | left | center | right = js.native
  /**
  	 * Sets the y position (in normalized coordinates) of the slider.
  	 */
  var y: Double = js.native
  /**
  	 * Sets the slider's vertical position anchor
  	 * This anchor binds the `y` position to the *top*, *middle*
  	 * or *bottom* of the range selector.
  	 */
  var yanchor: auto | top | middle | bottom = js.native
}

object Slider {
  @scala.inline
  def apply(
    active: Double,
    activebgcolor: Color,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    currentvalue: AnonFont,
    font: Font,
    len: Double,
    lenmode: fraction | pixels,
    minorticklen: Double,
    pad: PartialPadding,
    steps: js.Array[PartialSliderStep],
    tickcolor: Color,
    ticklen: Double,
    tickwidth: Double,
    transition: Transition,
    visible: Boolean,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): Slider = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], activebgcolor = activebgcolor.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], currentvalue = currentvalue.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], lenmode = lenmode.asInstanceOf[js.Any], minorticklen = minorticklen.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
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
    def withActivebgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activebgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBordercolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentvalue(value: AnonFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLenmode(value: fraction | pixels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorticklen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorticklen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPad(value: PartialPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[PartialSliderStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicklen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticklen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXanchor(value: auto | left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYanchor(value: auto | top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yanchor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

