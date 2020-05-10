package typingsSlinky.amapJsApiGeolocation.AMap.Geolocation

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete, 
    GeolocationResult
  ] = js.native
  var error: Event_[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.error, ErrorStatus] = js.native
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, GeolocationResult], error: Event_[error, ErrorStatus]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: Event_[complete, GeolocationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Event_[error, ErrorStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

