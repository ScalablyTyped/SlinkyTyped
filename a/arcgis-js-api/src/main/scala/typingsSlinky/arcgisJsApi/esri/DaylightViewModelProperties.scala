package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.fall
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.spring
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.summer
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.winter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DaylightViewModelProperties extends StObject {
  
  /**
    * A season can be set instead of a date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#currentSeason)
    */
  var currentSeason: js.UndefOr[spring | summer | fall | winter] = js.native
  
  /**
    * Starts or pauses the daytime animation cycling through the minutes of the day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#dayPlaying)
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
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.native
  
  /**
    * Slider position for the time of day in the timezone given by [utcOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#utcOffset).
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
    * Starts or pauses the date animation cycling through the months of the year.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html#yearPlaying)
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
  implicit class DaylightViewModelPropertiesMutableBuilder[Self <: DaylightViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSeason(value: spring | summer | fall | winter): Self = StObject.set(x, "currentSeason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSeasonUndefined: Self = StObject.set(x, "currentSeason", js.undefined)
    
    @scala.inline
    def setDayPlaying(value: Boolean): Self = StObject.set(x, "dayPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPlayingUndefined: Self = StObject.set(x, "dayPlaying", js.undefined)
    
    @scala.inline
    def setLocalDate(value: DateProperties): Self = StObject.set(x, "localDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalDateDate(value: js.Date): Self = StObject.set(x, "localDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalDateUndefined: Self = StObject.set(x, "localDate", js.undefined)
    
    @scala.inline
    def setPlaySpeedMultiplier(value: Double): Self = StObject.set(x, "playSpeedMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaySpeedMultiplierUndefined: Self = StObject.set(x, "playSpeedMultiplier", js.undefined)
    
    @scala.inline
    def setTimeSliderPosition(value: Double): Self = StObject.set(x, "timeSliderPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSliderPositionUndefined: Self = StObject.set(x, "timeSliderPosition", js.undefined)
    
    @scala.inline
    def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcOffsetUndefined: Self = StObject.set(x, "utcOffset", js.undefined)
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setYearPlaying(value: Boolean): Self = StObject.set(x, "yearPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearPlayingUndefined: Self = StObject.set(x, "yearPlaying", js.undefined)
  }
}
