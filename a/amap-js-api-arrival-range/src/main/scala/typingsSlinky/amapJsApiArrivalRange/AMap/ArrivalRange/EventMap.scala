package typingsSlinky.amapJsApiArrivalRange.AMap.ArrivalRange

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
import typingsSlinky.amapJsApiArrivalRange.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var error: Event_[typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

