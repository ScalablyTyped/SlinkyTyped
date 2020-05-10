package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSelectorOptions extends js.Object {
  /**
    * (Highstock, Gantt) Whether to enable all buttons from the start. By
    * default buttons are only enabled if the corresponding time range exists
    * on the X axis, but enabling all buttons allows for dynamically loading
    * different time ranges.
    */
  var allButtonsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Positioning for the button row.
    */
  var buttonPosition: js.UndefOr[RangeSelectorButtonPositionOptions] = js.native
  /**
    * (Highstock, Gantt) The space in pixels between the buttons in the range
    * selector.
    */
  var buttonSpacing: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) A collection of attributes for the buttons. The object
    * takes SVG attributes like `fill`, `stroke`, `stroke-width`, as well as
    * `style`, a collection of CSS properties for the text.
    *
    * The object can also be extended with states, so you can set
    * presentational options for `hover`, `select` or `disabled` button states.
    *
    * CSS styles for the text label.
    *
    * In styled mode, the buttons are styled by the
    * `.highcharts-range-selector-buttons .highcharts-button` rule with its
    * different states.
    */
  var buttonTheme: js.UndefOr[SVGAttributes] = js.native
  /**
    * (Highstock, Gantt) An array of configuration objects for the buttons.
    *
    * Defaults to
    *
    *  (see online documentation for example)
    */
  var buttons: js.UndefOr[js.Array[RangeSelectorButtonsOptions]] = js.native
  /**
    * (Highstock, Gantt) Enable or disable the range selector.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) When the rangeselector is floating, the plot area does
    * not reserve space for it. This opens for positioning anywhere on the
    * chart.
    */
  var floating: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) The border color of the date input boxes.
    */
  var inputBoxBorderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highstock, Gantt) The pixel height of the date input boxes.
    */
  var inputBoxHeight: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The pixel width of the date input boxes.
    */
  var inputBoxWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The date format in the input boxes when not selected
    * for editing. Defaults to `%b %e, %Y`.
    */
  var inputDateFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) A custom callback function to parse values entered in
    * the input boxes and return a valid JavaScript time as milliseconds since
    * 1970.
    */
  var inputDateParser: js.UndefOr[RangeSelectorParseCallbackFunction] = js.native
  /**
    * (Highstock, Gantt) The date format in the input boxes when they are
    * selected for editing. This must be a format that is recognized by
    * JavaScript Date.parse.
    */
  var inputEditDateFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) Enable or disable the date input boxes. Defaults to
    * enabled when there is enough space, disabled if not (typically mobile).
    */
  var inputEnabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Positioning for the input boxes. Allowed properties
    * are `align`, `x` and `y`.
    */
  var inputPosition: js.UndefOr[RangeSelectorInputPositionOptions] = js.native
  /**
    * (Highstock, Gantt) CSS for the HTML inputs in the range selector.
    *
    * In styled mode, the inputs are styled by the `.highcharts-range-input
    * text` rule in SVG mode, and `input.highcharts-range-selector` when
    * active.
    */
  var inputStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highstock, Gantt) CSS styles for the labels - the Zoom, From and To
    * texts.
    *
    * In styled mode, the labels are styled by the `.highcharts-range-label`
    * class.
    */
  var labelStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highstock, Gantt) The index of the button to appear pre-selected.
    */
  var selected: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The vertical alignment of the rangeselector box.
    * Allowed properties are `top`, `middle`, `bottom`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highstock, Gantt) The x offset of the range selector relative to its
    * horizontal alignment within `chart.spacingLeft` and `chart.spacingRight`.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The y offset of the range selector relative to its
    * horizontal alignment within `chart.spacingLeft` and `chart.spacingRight`.
    */
  var y: js.UndefOr[Double] = js.native
}

object RangeSelectorOptions {
  @scala.inline
  def apply(): RangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorOptions]
  }
  @scala.inline
  implicit class RangeSelectorOptionsOps[Self <: RangeSelectorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllButtonsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allButtonsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllButtonsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allButtonsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonPosition(value: RangeSelectorButtonPositionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonTheme(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[RangeSelectorButtonsOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
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
    def withFloating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(js.undefined)
        ret
    }
    @scala.inline
    def withInputBoxBorderColor(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBoxBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBoxBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBoxBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withInputBoxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBoxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBoxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBoxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withInputBoxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBoxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBoxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBoxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDateParser(value: /* value */ String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDateParser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInputDateParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDateParser")(js.undefined)
        ret
    }
    @scala.inline
    def withInputEditDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEditDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputEditDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEditDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withInputEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInputPosition(value: RangeSelectorInputPositionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: VerticalAlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
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
  }
  
}

