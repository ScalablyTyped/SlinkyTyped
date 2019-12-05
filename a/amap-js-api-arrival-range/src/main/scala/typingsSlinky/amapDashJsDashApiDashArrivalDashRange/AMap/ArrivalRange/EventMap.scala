package typingsSlinky.amapDashJsDashApiDashArrivalDashRange.AMap.ArrivalRange

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashArrivalDashRange.Anon_Info
import typingsSlinky.amapDashJsDashApiDashArrivalDashRange.amapDashJsDashApiDashArrivalDashRangeStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashArrivalDashRange.amapDashJsDashApiDashArrivalDashRangeStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(error: Event[error, Anon_Info]): EventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

