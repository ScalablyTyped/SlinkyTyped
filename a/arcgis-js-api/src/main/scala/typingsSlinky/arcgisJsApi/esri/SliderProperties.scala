package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`horizontal-reversed`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vertical-reversed`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tick
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderProperties extends WidgetProperties {
  /**
    * When `true`, sets the slider to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#disabled)
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the user can drag the segment between thumbs to update thumb positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#draggableSegmentsEnabled)
    *
    * @default true
    */
  var draggableSegmentsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A function used to format user inputs. As opposed to [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction), which formats thumb labels, the `inputFormatFunction` formats thumb values in the input element when the user begins to edit them.  The image below demonstrates how slider input values resemble corresponding slider values by default and won't match the formatting set in `labelFormatFunction`.  ![Slider without input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-no-input-formatter.png%20%22Slider%20without%20input%20formatter%22)  If you want to format slider input values so they match thumb labels, you can pass the same function set in `labelFormatFunction` to `inputFormatFunction` for consistent formatting.  ![Slider with input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-input-formatter.png%20%22Slider%20with%20input%20formatter%22)  However, if an `inputFormatFunction` is specified, you must also write a corresponding [inputParseFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputParseFunction) to parse user inputs to understandable slider values. In most cases, if you specify an `inputFormatFunction`, you should set the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction) to the same value for consistency between labels and inputs.  This property overrides the default input formatter, which formats by calling `toString()` on the input value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction)
    */
  var inputFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction). This property must be set if an `inputFormatFunction` is set. Otherwise the slider values will likely not update to their expected positions.  Overrides the default input parses, which is a parsed floating point number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputParseFunction)
    */
  var inputParseFunction: js.UndefOr[InputParser] = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.  By default labels are formatted in the following way:
    *   * When the data range is less than `10` (`(max - min) < 10`), labels are rounded based on the value set in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision) property.
    *   * When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision).
    *
    *
    * Use this property to override the behavior defined above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  /**
    * Indicates whether to enable editing input values via keyboard input when the user clicks a label. This allows the user to move the slider thumb to precise values without sliding the thumbs.  ![Slider editable labels](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-edit-label.png%20%22Slider%20with%20editable%20labels%22)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled)
    *
    * @default false
    */
  var labelInputsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to display labels alongside slider thumbs. By default, labels display input thumb values as floating point values with a precision of two digits. The format of labels can be customized via the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).  Alternatively, developers may also use CSS (e.g. `display: none`) to show/hide labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelsVisible)
    *
    * @default false
    */
  var labelsVisible: js.UndefOr[Boolean] = js.native
  /**
    * Determines the layout/orientation of the Slider widget. By default, the slider will render horizontally with the min value on the left side of the track. The possible values are described below.  **`horizontal`**  ![Slider horizontal not reversed](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-horizontal-not-reversed.png%20%22default%20horizontal%20slider%22)  **`horizontal-reversed`**  When the slider is set to `horizontal-reversed`, the max value will render on the left side and the min on the right.  ![Slider horizontal reversed](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-horizontal-reversed.png%20%22reversed%20horizontal%20slider%22)  **`vertical`**  When the slider is set to `vertical`, the max value will render on the top of the track and the min on the bottom.  ![Slider vertical not reversed](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-vertical-not-reversed.png%20%22default%20vertical%20slider%22)  **`vertical-reversed`**  When the slider is set to `vertical-reversed`, the max value will render on the bottom of the track and the min on the top.  ![Slider vertical reversed](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-vertical-reversed.png%20%22reversed%20vertical%20slider%22)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#layout)
    *
    * @default horizontal
    */
  var layout: js.UndefOr[horizontal | `horizontal-reversed` | vertical | `vertical-reversed`] = js.native
  /**
    * The maximum possible data/thumb value of the slider. In the constructor, if one of the values specified in [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values) is greater than the `max` value specified in this property, then the `max` will update to the highest value in `values`.  To display the `max` value's label on the slider, set [visibleElements.rangeLabels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#visibleElements) to `true`. To allow the end user to modify the max value, set [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum possible data/thumb value of the slider. In the constructor, if one of the values specified in [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values) is less than the `min` value specified in this property, then the `min` will update to the lowest value in `values`.  To display the `min` value's label on the slider, set [visibleElements.rangeLabels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#visibleElements) to `true`. To allow the end user to modify the min value, set [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min)
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Defines how slider thumb values should be rounded. This number indicates the number of decimal places slider thumb _values_ should round to when they have been moved.  This value also indicates the precision of thumb [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels) when the data range is less than `10` (i.e. `(max - min) < 10`).  When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in this property.  For example, given the default precision of `4`, and the following slider configuration, The labels of the thumbs will display two decimal places, but the precision of the actual thumb values will not be lost even when the user slides or moves the thumb.
    * ```js
    * const slider = new Slider({
    *   min: 20,
    *   max: 100,  // data range of 80
    *   values: [50.4331],
    *   // thumb label will display 50.43
    *   // thumb value will maintain precision, so
    *   // value will remain at 50.4331
    *   container: "sliderDiv"
    * });
    * ```
    *
    * If the user manually enters a value that has a higher precision than what's indicated by
    * this property, the precision of that thumb value will be maintained until the thumb
    * is moved by the user. At that point, the value will be rounded according to the indicated precision.
    *
    * If thumb labels aren't visible, they must be enabled with [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled).
    *
    * Keep in mind this property rounds thumb [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values) and shouldn't be used exclusively
    * for formatting purposes. To format thumb `labels`, use the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    * property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision)
    *
    * @default 4
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to enable editing range values via keyboard input when the user clicks a [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) label. This allows the user to increase or decrease the data range of the slider.  ![Slider editable range labels](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-edit-range-label.png%20%22Slider%20with%20editable%20range%20labels%22)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled)
    *
    * @default false
    */
  var rangeLabelInputsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to display [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) range values on the slider. The format of labels can be customized via the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction).  Alternatively, developers may also use CSS (e.g. `display: none`) to show/hide labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelsVisible)
    *
    * @default false
    */
  var rangeLabelsVisible: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the closest thumb will snap to the clicked location on the track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#snapOnClickEnabled)
    *
    * @default true
    */
  var snapOnClickEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Sets steps, or intervals, on the slider that restrict user input to specific values. If an array of numbers is passed to this property, the slider thumbs may only be moved to the positions specified in the array.  If a single number is set, then steps are set along the entire slider range at an interval of the provided value. In this scenario, the user may only slide the thumbs to values at the provided interval. For example, if a value of `0.5` is set here, and the slider [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) is `0` and the slider [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) is `10`, then the user will only be able to update the thumbs to values of 0, 0.5, 1.0, 1.5, 2.0, etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#steps)
    */
  var steps: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Function that executes each time a thumb is created on the slider. This can be used to add custom styling to each thumb or hook event listeners to specific thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  var thumbCreatedFunction: js.UndefOr[ThumbCreatedFunction] = js.native
  /**
    * When `false`, the user can freely move any slider thumb to any position along the track. By default, a thumb's position is constrained to the positions of neighboring thumbs so you cannot move one thumb past another. Set this property to `false` to disable this constraining behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbsConstrained)
    *
    * @default true
    */
  var thumbsConstrained: js.UndefOr[Boolean] = js.native
  /**
    * When set, renders ticks along the slider track. See the [TickConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig) documentation for more information on how to configure tick placement, style, and behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#tickConfigs)
    */
  var tickConfigs: js.UndefOr[js.Array[TickConfig]] = js.native
  /**
    * The HTML Element node representing the slider track. Use this property to attach event listeners to the track or to customize the track's CSS.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#trackElement)
    */
  var trackElement: js.UndefOr[HTMLElement] = js.native
  /**
    * An array of numbers representing absolute thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The view model for the Slider widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html) class to access all properties and methods on the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#viewModel)
    */
  var viewModel: js.UndefOr[SliderViewModelProperties] = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#visibleElements)
    */
  var visibleElements: js.UndefOr[SliderVisibleElements] = js.native
}

object SliderProperties {
  @scala.inline
  def apply(): SliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProperties]
  }
  @scala.inline
  implicit class SliderPropertiesOps[Self <: SliderProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDraggableSegmentsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableSegmentsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableSegmentsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableSegmentsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormatFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInputFormatFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormatFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withInputParseFunction(
      value: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputParseFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInputParseFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputParseFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLabelFormatFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelInputsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInputsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInputsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInputsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: horizontal | `horizontal-reversed` | vertical | `vertical-reversed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
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
    def withRangeLabelInputsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeLabelInputsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeLabelInputsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeLabelInputsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeLabelsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeLabelsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeLabelsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeLabelsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapOnClickEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapOnClickEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapOnClickEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapOnClickEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: Double | js.Array[Double]): Self = {
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
    def withThumbCreatedFunction(
      value: (/* index */ Double, /* value */ Double, /* thumbElement */ HTMLElement, /* labelElement */ js.UndefOr[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbCreatedFunction")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutThumbCreatedFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbCreatedFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbsConstrained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbsConstrained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbsConstrained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbsConstrained")(js.undefined)
        ret
    }
    @scala.inline
    def withTickConfigs(value: js.Array[TickConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackElement")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: SliderViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleElements(value: SliderVisibleElements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(js.undefined)
        ret
    }
  }
  
}

