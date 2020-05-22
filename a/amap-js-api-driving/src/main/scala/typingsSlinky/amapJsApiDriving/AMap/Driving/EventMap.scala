package typingsSlinky.amapJsApiDriving.AMap.Driving

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.complete
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.error
import typingsSlinky.amapJsApiDriving.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.complete, 
    SearchResult | Info
  ]
  var error: Event_[typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult | Info], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

