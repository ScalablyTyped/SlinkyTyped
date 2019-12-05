package typingsSlinky.amapDashJsDashApiDashLineDashSearch.AMap.LineSearch

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashLineDashSearch.Anon_Info
import typingsSlinky.amapDashJsDashApiDashLineDashSearch.amapDashJsDashApiDashLineDashSearchStrings.complete
import typingsSlinky.amapDashJsDashApiDashLineDashSearch.amapDashJsDashApiDashLineDashSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashLineDashSearch.amapDashJsDashApiDashLineDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashLineDashSearch.amapDashJsDashApiDashLineDashSearchStrings.error, 
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

