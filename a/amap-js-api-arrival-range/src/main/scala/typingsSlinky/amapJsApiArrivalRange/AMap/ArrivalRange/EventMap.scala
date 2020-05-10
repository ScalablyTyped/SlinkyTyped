package typingsSlinky.amapJsApiArrivalRange.AMap.ArrivalRange

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiArrivalRange.AnonInfo
import typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var error: Event_[typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error, AnonInfo] = js.native
}

object EventMap {
  @scala.inline
  def apply(error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Event_[error, AnonInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

