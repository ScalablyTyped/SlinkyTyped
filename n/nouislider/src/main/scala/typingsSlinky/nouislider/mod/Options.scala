package typingsSlinky.nouislider.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nouislider.nouisliderStrings.horizontal
import typingsSlinky.nouislider.nouisliderStrings.lower
import typingsSlinky.nouislider.nouisliderStrings.ltr
import typingsSlinky.nouislider.nouisliderStrings.rtl
import typingsSlinky.nouislider.nouisliderStrings.upper
import typingsSlinky.nouislider.nouisliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Set the animate option to false to prevent the slider from animating to a new value with when calling .val().
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * The animationDuration option can be used to set the animation speed assumed by the slider library.
    * In addition to this, you must manually set the CSS (-webkit-)transition property for the .noUi-state-tap .noUi-origin selector.
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * All values on the slider are part of a range. The range has a minimum and maximum value.
    */
  var behaviour: js.UndefOr[String] = js.native
  /**
    * The connect option can be used to control the bar between the handles or the edges of the slider.
    * If you are using one handle, set the value to either `upper` or `lower`.
    * For sliders with 2 or more handles, pass an array with a boolean for every connecting element,
    * including the edges of the slider. The length of this array must match the handle `count + 1`.
    * Setting `true` sets the bars between the handles, but not between the handles and the sliders edges.
    */
  var connect: js.UndefOr[lower | upper | Boolean | js.Array[Boolean]] = js.native
  /**
    * By default the sliders are top-to-bottom and left-to-right,
    * but you can change this using the direction option,
    * which decides where the upper side of the slider is.
    */
  var direction: js.UndefOr[ltr | rtl] = js.native
  /**
    * To format the slider output, noUiSlider offers a format option.
    * Simply specify to and from functions to encode and decode the values.
    * See manual formatting to the right for usage information.
    * By default, noUiSlider will format output with 2 decimals.
    */
  var format: js.UndefOr[js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.native
  /**
    * The limit option is the opposite of the margin option,
    * limiting the maximum distance between two handles.
    * As with the margin option, the limit option can only be used on linear sliders.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * When using two handles, the minimum distance between the handles can be set using the margin option.
    * The margin value is relative to the value set in 'range'.
    * This option is only available on standard linear sliders.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * The orientation setting can be used to set the slider to "vertical" or "horizontal".
    * Set dimensions! Vertical sliders don't assume a default height, so you'll need to set one.
    * You can use any unit you want, including % or px.
    */
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  /**
    * Padding limits how close to the slider edges handles can be.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * Allows you to generate points along the slider.
    */
  var pips: js.UndefOr[PipsOptions] = js.native
  /**
    * All values on the slider are part of a range. The range has a minimum and maximum value.
    * The minimum value cannot be equal to the maximum value.
    */
  var range: StringDictionary[Double | js.Array[Double]] = js.native
  /**
    * When a non-linear slider has been configured, the snap option can be set to true to force the slider to jump
    * between the specified values.
    */
  var snap: js.UndefOr[Boolean] = js.native
  /**
    * The start option sets the number of handles and their start positions, relative to range.
    */
  var start: Double | (js.Array[js.Array[Double] | Double]) = js.native
  /**
    * By default, the slider slides fluently.
    * In order to make the handles jump between intervals, you can use this option.
    * The step option is relative to the values provided to range.
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * noUiSlider can provide a basic tooltip without using its events system.
    * Set the tooltips option to true to enable.
    * This option can also accept formatting options to format the tooltips content.
    * In that case, pass an array with a formatter for each handle, true to use the default or false to display no tooltip.
    */
  var tooltips: js.UndefOr[Boolean | js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.native
}

object Options {
  @scala.inline
  def apply(
    range: StringDictionary[Double | js.Array[Double]],
    start: Double | (js.Array[js.Array[Double] | Double])
  ): Options = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: StringDictionary[Double | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double | (js.Array[js.Array[Double] | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withBehaviour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviour")(js.undefined)
        ret
    }
    @scala.inline
    def withConnect(value: lower | upper | Boolean | js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: js.Object | (js.Function1[/* repeated */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPips(value: PipsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pips")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipsFunction1(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltips(value: Boolean | js.Object | (js.Function1[/* repeated */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(js.undefined)
        ret
    }
  }
  
}

