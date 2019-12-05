package typingsSlinky.amapDashJsDashApiDashGeolocation.AMap.Geolocation

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.complete
import typingsSlinky.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.complete, 
    GeolocationResult
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.error, 
    ErrorStatus
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, GeolocationResult], error: Event[error, ErrorStatus]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

