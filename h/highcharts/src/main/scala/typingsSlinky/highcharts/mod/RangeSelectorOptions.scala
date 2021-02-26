package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelectorOptions extends StObject {
  
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
    * Defaults to: (see online documentation for example)
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
    * 1970. The first argument passed is a value to parse, second is a boolean
    * indicating use of the UTC time.
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
  implicit class RangeSelectorOptionsMutableBuilder[Self <: RangeSelectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllButtonsEnabled(value: Boolean): Self = StObject.set(x, "allButtonsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllButtonsEnabledUndefined: Self = StObject.set(x, "allButtonsEnabled", js.undefined)
    
    @scala.inline
    def setButtonPosition(value: RangeSelectorButtonPositionOptions): Self = StObject.set(x, "buttonPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonPositionUndefined: Self = StObject.set(x, "buttonPosition", js.undefined)
    
    @scala.inline
    def setButtonSpacing(value: Double): Self = StObject.set(x, "buttonSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonSpacingUndefined: Self = StObject.set(x, "buttonSpacing", js.undefined)
    
    @scala.inline
    def setButtonTheme(value: SVGAttributes): Self = StObject.set(x, "buttonTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonThemeUndefined: Self = StObject.set(x, "buttonTheme", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[RangeSelectorButtonsOptions]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: RangeSelectorButtonsOptions*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
    
    @scala.inline
    def setInputBoxBorderColor(value: ColorString): Self = StObject.set(x, "inputBoxBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBoxBorderColorUndefined: Self = StObject.set(x, "inputBoxBorderColor", js.undefined)
    
    @scala.inline
    def setInputBoxHeight(value: Double): Self = StObject.set(x, "inputBoxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBoxHeightUndefined: Self = StObject.set(x, "inputBoxHeight", js.undefined)
    
    @scala.inline
    def setInputBoxWidth(value: Double): Self = StObject.set(x, "inputBoxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBoxWidthUndefined: Self = StObject.set(x, "inputBoxWidth", js.undefined)
    
    @scala.inline
    def setInputDateFormat(value: String): Self = StObject.set(x, "inputDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDateFormatUndefined: Self = StObject.set(x, "inputDateFormat", js.undefined)
    
    @scala.inline
    def setInputDateParser(value: /* value */ String => Double): Self = StObject.set(x, "inputDateParser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputDateParserUndefined: Self = StObject.set(x, "inputDateParser", js.undefined)
    
    @scala.inline
    def setInputEditDateFormat(value: String): Self = StObject.set(x, "inputEditDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputEditDateFormatUndefined: Self = StObject.set(x, "inputEditDateFormat", js.undefined)
    
    @scala.inline
    def setInputEnabled(value: Boolean): Self = StObject.set(x, "inputEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputEnabledUndefined: Self = StObject.set(x, "inputEnabled", js.undefined)
    
    @scala.inline
    def setInputPosition(value: RangeSelectorInputPositionOptions): Self = StObject.set(x, "inputPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPositionUndefined: Self = StObject.set(x, "inputPosition", js.undefined)
    
    @scala.inline
    def setInputStyle(value: CSSObject): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: CSSObject): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
