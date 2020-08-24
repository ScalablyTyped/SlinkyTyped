package typingsSlinky.amapJsApi.AMap.ContextMenu

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.amapJsApiStrings.close
import typingsSlinky.amapJsApi.amapJsApiStrings.items
import typingsSlinky.amapJsApi.amapJsApiStrings.open
import typingsSlinky.amapJsApi.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap[I] extends js.Object {
  var close: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.close, Target[I]] = js.native
  var items: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.items, js.UndefOr[scala.Nothing]] = js.native
  var open: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.open, Target[I]] = js.native
}

object EventMap {
  @scala.inline
  def apply[I](
    close: Event_[close, Target[I]],
    items: Event_[items, js.UndefOr[scala.Nothing]],
    open: Event_[open, Target[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap[I]]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: Event_[close, Target[I]]): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: Event_[items, js.UndefOr[scala.Nothing]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Event_[open, Target[I]]): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}

