package typingsSlinky.amapJsApiArrivalRange.AMap.ArrivalRange

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiArrivalRange.AnonInfo
import typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var error: Event_[typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

