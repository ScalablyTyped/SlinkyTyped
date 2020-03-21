package typingsSlinky.amapJsApiGeolocation.AMap.Geolocation

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete, 
    GeolocationResult
  ]
  var error: Event_[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.error, ErrorStatus]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, GeolocationResult], error: Event_[error, ErrorStatus]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

