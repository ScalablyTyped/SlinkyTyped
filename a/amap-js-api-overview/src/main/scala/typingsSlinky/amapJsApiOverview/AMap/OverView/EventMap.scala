package typingsSlinky.amapJsApiOverview.AMap.OverView

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiOverview.amapJsApiOverviewStrings.close
import typingsSlinky.amapJsApiOverview.amapJsApiOverviewStrings.hide
import typingsSlinky.amapJsApiOverview.amapJsApiOverviewStrings.open
import typingsSlinky.amapJsApiOverview.amapJsApiOverviewStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var close: Event_[
    typingsSlinky.amapJsApiOverview.amapJsApiOverviewStrings.close, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  var hide: Event_[
    typingsSlinky.amapJsApiOverview.amapJsApiOverviewStrings.hide, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  var open: Event_[
    typingsSlinky.amapJsApiOverview.amapJsApiOverviewStrings.open, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  var show: Event_[
    typingsSlinky.amapJsApiOverview.amapJsApiOverviewStrings.show, 
    js.UndefOr[scala.Nothing]
  ] = js.native
}

object EventMap {
  @scala.inline
  def apply(
    close: Event_[close, js.UndefOr[scala.Nothing]],
    hide: Event_[hide, js.UndefOr[scala.Nothing]],
    open: Event_[open, js.UndefOr[scala.Nothing]],
    show: Event_[show, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
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
    def setClose(value: Event_[close, js.UndefOr[scala.Nothing]]): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(value: Event_[hide, js.UndefOr[scala.Nothing]]): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Event_[open, js.UndefOr[scala.Nothing]]): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: Event_[show, js.UndefOr[scala.Nothing]]): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}

