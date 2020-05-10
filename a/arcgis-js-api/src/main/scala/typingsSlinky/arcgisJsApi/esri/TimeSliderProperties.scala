package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-end`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`time-window`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.instant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSliderProperties extends WidgetProperties {
  /**
    * The temporal extent of the entire slider. It defines the entire time period within which you can visualize your time aware data using the time slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#fullTimeExtent)
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.native
  /**
    * When `true`, the time slider will play its animation in a loop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#loop)
    *
    * @default true
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * The time slider mode. This property is used for defining if the temporal data will be displayed cumulatively up to a point in time, a single instant in time, or within a time range. See the following table for possible values.
    *
    * Possible Values       | Description   | Example |
    * ----------------------|-------------- | ------- |
    * instant               | The slider will show temporal data that falls on a single instance in time. Set the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values) property to an array with one date. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-instance.png"> |
    * time-window           | The slider will show temporal data that falls within a given time range. This is the default. Set [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values) property to an array with two dates. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-time-window.png"> |
    * cumulative-from-start | Similar to `time-window` with the start time is always pinned to the start of the slider. Set the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values) property to have one date, which is the end date. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-from-start.png"> |
    * cumulative-from-end   | Also, similar to the `time-window` with the end time pinned to the end of the slider. Set the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values) property to have one date, which is the start date. | <img alt="mode-instance" src="../../assets/img/apiref/widgets/timeslider/mode-from-end.png"> |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#mode)
    *
    * @default "time-window"
    */
  var mode: js.UndefOr[instant | `time-window` | `cumulative-from-start` | `cumulative-from-end`] = js.native
  /**
    * The time (in milliseconds) between animation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#playRate)
    *
    * @default 1000
    */
  var playRate: js.UndefOr[Double] = js.native
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated. If unspecified, ten evenly spaced stops will be added.  To define regularly spaced stops based on specified [time interval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html) and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html), use [StopsByInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByInterval). Use [StopsByCount](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByCount) to define evenly spaced timeline stops. Lastly, for irregular dates use [StopsByDates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByDates). Please refer below for examples of each of these objects.  If a declaration using [StopsByInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByInterval) will result in excess of 10,000 stops then TimeSlider will default to generating ten evenly spaced stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#stops)
    *
    * @default { count : 10 }
    */
  var stops: js.UndefOr[StopsByDates | StopsByCount | StopsByInterval] = js.native
  /**
    * Shows/hides time in the display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#timeVisible)
    *
    * @default false
    */
  var timeVisible: js.UndefOr[Boolean] = js.native
  /**
    * The user defined time extent. Values define the current location of time slider thumbs. The "time-window" [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#mode) has two values, the other modes only have one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values)
    *
    * @default null
    */
  var values: js.UndefOr[js.Array[DateProperties]] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). If this property is set, the TimeSlider widget will update the view's timeExtent property whenever the time slider is manipulated or updated programmatically. This property will affect any time-aware layer in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [TimeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[TimeSliderViewModelProperties] = js.native
}

object TimeSliderProperties {
  @scala.inline
  def apply(): TimeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSliderProperties]
  }
  @scala.inline
  implicit class TimeSliderPropertiesOps[Self <: TimeSliderProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullTimeExtent(value: TimeExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTimeExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullTimeExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTimeExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playRate")(js.undefined)
        ret
    }
    @scala.inline
    def withStops(value: StopsByDates | StopsByCount | StopsByInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[DateProperties]): Self = {
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
    def withView(value: MapViewProperties | SceneViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: TimeSliderViewModelProperties): Self = {
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
  }
  
}

