package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.fall
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.spring
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.summer
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.winter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaylightViewModelProperties extends js.Object {
  /**
    * A season can be set instead of a date. Each season uses a fixed date corresponding to the seasonsal equinoxes and solstices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#currentSeason)
    *
    * @default "spring"
    */
  var currentSeason: js.UndefOr[spring | summer | fall | winter] = js.native
  /**
    * Starts or pauses the daytime animation cycling through the minutes of the day. Set to `true` to start the animation and to `false` to pause it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#dayPlaying)
    *
    * @default false
    */
  var dayPlaying: js.UndefOr[Boolean] = js.native
  /**
    * The calendar date in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#localDate)
    */
  var localDate: js.UndefOr[DateProperties] = js.native
  /**
    * Controls the daytime and date animation speed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#playSpeedMultiplier)
    *
    * @default 1.0
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.native
  /**
    * Slider position for the time of day in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset). The position represents the time of the day in minutes. Possible values range between 0 and 1440.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#timeSliderPosition)
    */
  var timeSliderPosition: js.UndefOr[Double] = js.native
  /**
    * The difference in hours between UTC time and the time displayed in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset)
    */
  var utcOffset: js.UndefOr[Double] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
  /**
    * Starts or pauses the date animation cycling through the months of the year. Set to `true` to start the animation and to `false` to pause it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#yearPlaying)
    *
    * @default false
    */
  var yearPlaying: js.UndefOr[Boolean] = js.native
}

object DaylightViewModelProperties {
  @scala.inline
  def apply(): DaylightViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightViewModelProperties]
  }
  @scala.inline
  implicit class DaylightViewModelPropertiesOps[Self <: DaylightViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSeason(value: spring | summer | fall | winter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSeason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSeason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSeason")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPlaying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPlaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalDate(value: DateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaySpeedMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playSpeedMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaySpeedMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playSpeedMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSliderPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSliderPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSliderPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSliderPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withUtcOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtcOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: SceneViewProperties): Self = {
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
    def withYearPlaying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearPlaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearPlaying")(js.undefined)
        ret
    }
  }
  
}

