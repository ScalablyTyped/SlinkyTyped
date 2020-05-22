package typingsSlinky.amapJsApi.AMap.TileLayer

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.amapJsApiStrings.complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.complete, js.UndefOr[scala.Nothing]]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

