package typingsSlinky.amapJsApiDriving.AMap.Driving

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiDriving.AnonInfo
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.complete
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.complete, 
    SearchResult | AnonInfo
  ]
  var error: Event_[typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult | AnonInfo], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

