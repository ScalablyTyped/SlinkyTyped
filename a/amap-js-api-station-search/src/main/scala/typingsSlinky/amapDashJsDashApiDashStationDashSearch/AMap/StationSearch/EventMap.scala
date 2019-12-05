package typingsSlinky.amapDashJsDashApiDashStationDashSearch.AMap.StationSearch

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashStationDashSearch.Anon_Info
import typingsSlinky.amapDashJsDashApiDashStationDashSearch.amapDashJsDashApiDashStationDashSearchStrings.complete
import typingsSlinky.amapDashJsDashApiDashStationDashSearch.amapDashJsDashApiDashStationDashSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashStationDashSearch.amapDashJsDashApiDashStationDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashStationDashSearch.amapDashJsDashApiDashStationDashSearchStrings.error, 
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

