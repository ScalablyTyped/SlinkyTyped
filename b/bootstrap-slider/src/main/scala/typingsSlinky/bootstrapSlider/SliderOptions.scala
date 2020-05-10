package typingsSlinky.bootstrapSlider

import typingsSlinky.bootstrapSlider.bootstrapSliderStrings.auto
import typingsSlinky.bootstrapSlider.bootstrapSliderStrings.bottom
import typingsSlinky.bootstrapSlider.bootstrapSliderStrings.left
import typingsSlinky.bootstrapSlider.bootstrapSliderStrings.linear
import typingsSlinky.bootstrapSlider.bootstrapSliderStrings.logarithmic
import typingsSlinky.bootstrapSlider.bootstrapSliderStrings.right
import typingsSlinky.bootstrapSlider.bootstrapSliderStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderOptions extends js.Object {
  /**
    * Default: true
    * whether or not the slider is initially enabled
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    * Focus the appropriate slider handle after a value change.
    */
  var focus: js.UndefOr[Boolean] = js.native
  /**
    * Default: returns the plain value
    * formatter callback. Return the value wanted to be displayed in the tooltip
    * @param val the current value to display
    */
  var formatter: js.UndefOr[js.Function1[/* val */ Double, String]] = js.native
  /**
    * Default: 'round'
    * handle shape. Accepts: 'round', 'square', 'triangle' or 'custom'
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * Default: ''
    * set the id of the slider element when it's created
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Default: null
    * ARIA labels for the slider handle's, Use array for multiple values in a
    * range slider.
    */
  var labelledby: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Default: 10
    * maximum possible value
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Default: 0
    * minimum possible value
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Default: false
    * The natural order is used for the arrow keys. Arrow up select the upper slider value for vertical sliders,
    * arrow right the righter slider value for a horizontal slider - no matter if the slider was reversed or not.
    * By default the arrow keys are oriented by arrow up/right to the higher slider value, arrow down/left to the lower slider value.
    */
  var natural_arrow_keys: js.UndefOr[Boolean] = js.native
  /**
    * Default: 'horizontal'
    * set the orientation. Accepts 'vertical' or 'horizontal'
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * Default: number of digits after the decimal of step value
    * The number of digits shown after the decimal. Defaults to the number of digits after the decimal of step value.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Default: false
    * make range slider. Optional if initial value is an array. If initial value is scalar, max will be used for second value.
    */
  var range: js.UndefOr[Boolean] = js.native
  /**
    * Default: []
    * Defines a range array that you want to highlight, for example:
    * [{'start':val1, 'end': val2, 'class': 'optionalAdditionalClassName'}].
    */
  var rangeHighlights: js.UndefOr[js.Array[RangeHighlight]] = js.native
  /**
    * Default: false
    * whether or not the slider should be reversed
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * Default: 'auto'
    */
  var rtl: js.UndefOr[Boolean | auto] = js.native
  /**
    * Default: 'linear'
    * Set to 'logarithmic' to use a logarithmic scale.
    */
  var scale: js.UndefOr[linear | logarithmic] = js.native
  /**
    * Default: 'before'
    * selection placement. Accepts: 'before', 'after' or 'none'. In case of a range slider, the selection will be placed between the handles
    */
  var selection: js.UndefOr[String] = js.native
  /**
    * Default: 1
    * increment step
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Default: [ ]
    * Used to define the values of ticks. Tick marks are indicators to denote special values in the range. This option overwrites min and max options.
    */
  var ticks: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Default: [ ]
    * Defines the labels below the tick marks. Accepts HTML input.
    */
  var ticks_labels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Default: [ ]
    * Defines the positions of the tick values in percentages. The first value should alwasy be 0, the last value should always be 100 percent.
    */
  var ticks_positions: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Default: 0
    * Used to define the snap bounds of a tick. Snaps to the tick if value is within these bounds.
    */
  var ticks_snap_bounds: js.UndefOr[Double] = js.native
  /**
    * Default: false
    * Used to allow for a user to hover over a given tick to see it's value.
    * Useful if custom formatter passed in
    */
  var ticks_tooltip: js.UndefOr[Boolean] = js.native
  /**
    * Default: 'show'
    * whether to show the tooltip on drag, hide the tooltip, or always show the tooltip. Accepts: 'show', 'hide', or 'always'
    */
  var tooltip: js.UndefOr[String] = js.native
  /**
    * Default: null
    * Position of tooltip, relative to slider. Accepts 'top'/'bottom' for
    * horizontal sliders and 'left'/'right' for vertically orientated sliders.
    * Default positions are 'top' for horizontal and 'right' for vertical
    * slider.
    */
  var tooltip_position: js.UndefOr[top | bottom | left | right] = js.native
  /**
    * Default: false
    * if false show one tootip if true show two tooltips one for each handler
    */
  var tooltip_split: js.UndefOr[Boolean] = js.native
  /**
    * Default: 5
    * initial value. Use array to have a range slider.
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.native
}

object SliderOptions {
  @scala.inline
  def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  @scala.inline
  implicit class SliderOptionsOps[Self <: SliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: /* val */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelledby(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelledby: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelledby")(js.undefined)
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
    def withNatural_arrow_keys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natural_arrow_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatural_arrow_keys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natural_arrow_keys")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
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
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeHighlights(value: js.Array[RangeHighlight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeHighlights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeHighlights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeHighlights")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: linear | logarithmic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
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
    def withTicks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks_labels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks_labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks_labels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks_labels")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks_positions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks_positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks_positions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks_positions")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks_snap_bounds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks_snap_bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks_snap_bounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks_snap_bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks_tooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks_tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks_tooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks_tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip_position(value: top | bottom | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip_position: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip_position")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip_split(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip_split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip_split: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip_split")(js.undefined)
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
  }
  
}

