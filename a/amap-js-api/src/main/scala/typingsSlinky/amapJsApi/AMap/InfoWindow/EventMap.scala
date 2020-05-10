package typingsSlinky.amapJsApi.AMap.InfoWindow

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AnonTarget
import typingsSlinky.amapJsApi.amapJsApiStrings.change
import typingsSlinky.amapJsApi.amapJsApiStrings.close
import typingsSlinky.amapJsApi.amapJsApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap[I] extends js.Object {
  var change: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.change, AnonTarget[I]] = js.native
  var close: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.close, AnonTarget[I]] = js.native
  var open: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.open, AnonTarget[I]] = js.native
}

object EventMap {
  @scala.inline
  def apply[I](
    change: Event_[change, AnonTarget[I]],
    close: Event_[close, AnonTarget[I]],
    open: Event_[open, AnonTarget[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap[I]]
  }
  @scala.inline
  implicit class EventMapOps[Self[i] <: EventMap[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withChange(value: Event_[change, AnonTarget[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: Event_[close, AnonTarget[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Event_[open, AnonTarget[I]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

