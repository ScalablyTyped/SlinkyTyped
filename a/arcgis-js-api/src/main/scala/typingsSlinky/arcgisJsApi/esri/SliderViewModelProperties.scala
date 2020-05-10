package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tick
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderViewModelProperties extends js.Object {
  /**
    * A function used to format user inputs. As opposed to [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which formats thumb labels, the `inputFormatFunction` formats thumb values in the input element when the user begins to edit them.  The image below demonstrates how slider input values resemble corresponding slider values by default and won't match the formatting set in `labelFormatFunction`.  ![Slider without input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-no-input-formatter.png%20%22Slider%20without%20input%20formatter%22)  If you want to format slider input values so they match thumb labels, you can pass the same function set in `labelFormatFunction` to `inputFormatFunction` for consistent formatting.  ![Slider with input formatter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-input-formatter.png%20%22Slider%20with%20input%20formatter%22)  However, if an `inputFormatFunction` is specified, you must also write a corresponding [inputParseFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction) to parse user inputs to understandable slider values. In most cases, if you specify an `inputFormatFunction`, you should set the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction) to the same value for consistency between labels and inputs.  This property overrides the default input formatter, which formats by calling `toString()` on the input value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction)
    */
  var inputFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction). This property must be set if an `inputFormatFunction` is set. Otherwise the slider values will likely not update to their expected positions.  Overrides the default input parses, which is a parsed floating point number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction)
    */
  var inputParseFunction: js.UndefOr[InputParser] = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.  By default labels are formatted in the following way:
    *   * When the data range is less than `10` (`(max - min) < 10`), labels are rounded based on the value set in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision) property.
    *   * When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision).
    *
    *
    * Use this property to override the behavior defined above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  /**
    * The maximum possible data/thumb value of the slider. In the constructor, if one of the values specified in [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) is greater than the `max` value specified in this property, then the `max` will update to the highest value in `values`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum possible data/thumb value of the slider. In the constructor, if one of the values specified in [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) is less than the `min` value specified in this property, then the `min` will update to the lowest value in `values`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#min)
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Defines how slider values should be rounded. This number indicates the number of decimal places slider values should round to when they have been moved.  This value also indicates the precision of thumb [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labels) when the data range ([max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#max) - [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#min)) is less than `10`.  When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in this property.  For example, given the default precision of `4`, and the following slider configuration, The label of the thumb will display two decimal places, but the precision of the actual thumb value will not be lost even when the user slides or moves the thumb.
    * ```js
    * const slider = new SliderVM({
    *   min: 20,
    *   max: 100,  // data range of 80
    *   values: [50.4331],
    *   // thumb label will display 50.43
    *   // thumb value will maintain precision, so
    *   // value will remain at 50.4331
    * });
    * ```
    *
    * If the user manually enters a value that has a higher precision than what's indicated by
    * this property, the precision of that thumb value will be maintained until the thumb
    * is moved by the user. At that point, the value will be rounded according to the indicated precision.
    *
    * If thumb labels aren't visible, they must be enabled with [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelInputsEnabled).
    *
    * Keep in mind this property rounds thumb [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) and shouldn't be used exclusively
    * for formatting purposes. To format thumb `labels`, use the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
    * property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision)
    *
    * @default 4
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * When `false`, the user can freely move any slider thumb to any position along the track. By default, a thumb's position is constrained to the positions of neighboring thumbs so you cannot move one thumb past another. Set this property to `false` to disable this constraining behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#thumbsConstrained)
    *
    * @default true
    */
  var thumbsConstrained: js.UndefOr[Boolean] = js.native
  /**
    * An array of numbers representing absolute thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.native
}

object SliderViewModelProperties {
  @scala.inline
  def apply(): SliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderViewModelProperties]
  }
  @scala.inline
  implicit class SliderViewModelPropertiesOps[Self <: SliderViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

