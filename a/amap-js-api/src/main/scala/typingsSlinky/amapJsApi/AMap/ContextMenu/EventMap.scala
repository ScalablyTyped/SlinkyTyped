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
  implicit class EventMapOps[Self[i] <: EventMap[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withClose(value: Event_[close, Target[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: Event_[items, js.UndefOr[scala.Nothing]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Event_[open, Target[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

