package typingsSlinky.amapJsApiCitySearch.AMap.CitySearch

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete
import typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.error
import typingsSlinky.amapJsApiCitySearch.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

