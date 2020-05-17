package typingsSlinky.reactSlider.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactSlider.anon.Index
import typingsSlinky.reactSlider.anon.Value
import typingsSlinky.reactSlider.reactSliderStrings.horizontal
import typingsSlinky.reactSlider.reactSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSliderProps extends js.Object {
  /**
    * aria-label for screen-readers to apply to the thumbs.
    * Use an array for more than one thumb.
    * The length of the array must match the number of thumbs in the value array.
    */
  var ariaLabel: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * aria-valuetext for screen-readers.
    * Can be a static string, or a function that returns a string.
    */
  var ariaValuetext: js.UndefOr[String | (js.Function1[/* value */ Index, String])] = js.native
  /**
    * The css class set on the slider node.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Determines the initial positions of the thumbs and the number of thumbs.
    *
    * If a number is passed a slider with one thumb will be rendered.
    * If an array is passed each value will determine the position of one thumb.
    * The values in the array must be sorted.
    */
  var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * If `true` the thumbs can't be moved.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Inverts the slider.
    */
  var invert: js.UndefOr[Boolean] = js.native
  /**
    * The maximum value of the slider.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value of the slider.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * The minimal distance between any pair of thumbs.
    * Must be positive, but zero means they can sit on top of each other.
    */
  var minDistance: js.UndefOr[Double] = js.native
  /**
    * Callback called only after moving a thumb has ended.
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.native
  /**
    * Callback called before starting to move a thumb.
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.native
  /**
    * Callback called on every value change.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.native
  /**
    * Callback called when the the slider is clicked (thumb or tracks).
    * Receives the value at the clicked position as argument.
    */
  var onSliderClick: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Determines whether the slider moves horizontally (from left to right)
    * or vertically (from top to bottom).
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  /**
    * The result of the function is the value to be added or subtracted
    * when the `Page Up` or `Page Down` keys are pressed.
    *
    * The current `step` value will be passed as the only argument.
    * By default, paging will modify `step` by a factor of 10.
    */
  var pageFn: js.UndefOr[js.Function1[/* step */ Double, Double]] = js.native
  /**
    * If `true` the active thumb will push other thumbs
    * within the constraints of `min`, `max`, `step` and `minDistance`.
    */
  var pearling: js.UndefOr[Boolean] = js.native
  /**
    * Provide a custom render function for dynamic thumb content.
    * The render function will be passed two arguments.The first is
    * an object that should be added to your thumb node,
    */
  var renderThumb: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Index, ReactElement]] = js.native
  /**
    * Provide a custom render function for the track node.
    * The render function will be passed two arguments. The first is
    * an object that should be added to your handle node.
    */
  var renderTrack: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Value, ReactElement]] = js.native
  /**
    * Disables thumb move when clicking the slider track
    */
  var snapDragDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Value to be added or subtracted on each step the slider makes.
    * Must be greater than zero.
    * `max - min` should be evenly divisible by the step value.
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * The css class set on the thumb that is currently being moved.
    */
  var thumbActiveClassName: js.UndefOr[String] = js.native
  /**
    * The css class set on each thumb node.
    *
    * In addition each thumb will receive a numbered css class of the form
    * `${thumbClassName}-${i}`, e.g. `thumb-0`, `thumb-1`, ...
    */
  var thumbClassName: js.UndefOr[String] = js.native
  /**
    * The css class set on the tracks between the thumbs.
    * In addition track fragment will receive a numbered css class of the form
    * `${trackClassName}-${i}`, e.g. `track-0`, `track-1`, ...
    */
  var trackClassName: js.UndefOr[String] = js.native
  /**
    * Like `defaultValue` but for
    * [controlled components](http://facebook.github.io/react/docs/forms.html#controlled-components).
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * If `true` tracks between the thumbs will be rendered.
    */
  var withTracks: js.UndefOr[Boolean] = js.native
}

object ReactSliderProps {
  @scala.inline
  def apply(): ReactSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactSliderProps]
  }
  @scala.inline
  implicit class ReactSliderPropsOps[Self <: ReactSliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabel(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaValuetextFunction1(value: /* value */ Index => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValuetext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAriaValuetext(value: String | (js.Function1[/* value */ Index, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValuetext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaValuetext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValuetext")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
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
    def withInvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAfterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSliderClick(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSliderClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
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
    def withPageFn(value: /* step */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFn")(js.undefined)
        ret
    }
    @scala.inline
    def withPearling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pearling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPearling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pearling")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderThumb(value: (/* props */ js.Object, /* state */ Index) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumb")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumb")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTrack(value: (/* props */ js.Object, /* state */ Value) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTrack")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapDragDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapDragDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapDragDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapDragDisabled")(js.undefined)
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
    def withThumbActiveClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbActiveClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbActiveClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbActiveClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWithTracks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTracks")(js.undefined)
        ret
    }
  }
  
}

