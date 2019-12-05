package typingsSlinky.amapDashJsDashApiDashDistrictDashSearch.AMap.DistrictSearch

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashDistrictDashSearch.Anon_Info
import typingsSlinky.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.complete
import typingsSlinky.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.error, 
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

