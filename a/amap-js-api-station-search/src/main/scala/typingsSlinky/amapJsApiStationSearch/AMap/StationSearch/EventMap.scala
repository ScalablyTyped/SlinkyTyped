package typingsSlinky.amapJsApiStationSearch.AMap.StationSearch

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiStationSearch.AnonInfo
import typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete
import typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

