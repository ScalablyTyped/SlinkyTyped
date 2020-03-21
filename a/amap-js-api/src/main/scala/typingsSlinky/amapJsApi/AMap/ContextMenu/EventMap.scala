package typingsSlinky.amapJsApi.AMap.ContextMenu

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AnonTarget
import typingsSlinky.amapJsApi.amapJsApiStrings.close
import typingsSlinky.amapJsApi.amapJsApiStrings.items
import typingsSlinky.amapJsApi.amapJsApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var close: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.close, AnonTarget[I]]
  var items: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.items, js.UndefOr[scala.Nothing]]
  var open: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.open, AnonTarget[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    close: Event_[close, AnonTarget[I]],
    items: Event_[items, js.UndefOr[scala.Nothing]],
    open: Event_[open, AnonTarget[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

