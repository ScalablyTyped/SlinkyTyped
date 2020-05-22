package typingsSlinky.amapJsApi.AMap.InfoWindow

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.amapJsApiStrings.change
import typingsSlinky.amapJsApi.amapJsApiStrings.close
import typingsSlinky.amapJsApi.amapJsApiStrings.open
import typingsSlinky.amapJsApi.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var change: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.change, Target[I]]
  var close: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.close, Target[I]]
  var open: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.open, Target[I]]
}

object EventMap {
  @scala.inline
  def apply[I](change: Event_[change, Target[I]], close: Event_[close, Target[I]], open: Event_[open, Target[I]]): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap[I]]
  }
}

