package typingsSlinky.amapDashJsDashApiDashCityDashSearch.AMap.CitySearch

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashCityDashSearch.Anon_Info
import typingsSlinky.amapDashJsDashApiDashCityDashSearch.amapDashJsDashApiDashCityDashSearchStrings.complete
import typingsSlinky.amapDashJsDashApiDashCityDashSearch.amapDashJsDashApiDashCityDashSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashCityDashSearch.amapDashJsDashApiDashCityDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashCityDashSearch.amapDashJsDashApiDashCityDashSearchStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, SearchResult], error: Event[error, Anon_Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

