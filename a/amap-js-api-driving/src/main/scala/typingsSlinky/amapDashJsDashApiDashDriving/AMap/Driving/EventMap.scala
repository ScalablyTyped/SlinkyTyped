package typingsSlinky.amapDashJsDashApiDashDriving.AMap.Driving

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashDriving.Anon_Info
import typingsSlinky.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.complete
import typingsSlinky.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.complete, 
    SearchResult | Anon_Info
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, SearchResult | Anon_Info], error: Event[error, Anon_Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

