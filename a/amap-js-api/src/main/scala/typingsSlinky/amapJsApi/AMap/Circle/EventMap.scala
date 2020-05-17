package typingsSlinky.amapJsApi.AMap.Circle

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.MapsEvent
import typingsSlinky.amapJsApi.amapJsApiStrings.change
import typingsSlinky.amapJsApi.amapJsApiStrings.click
import typingsSlinky.amapJsApi.amapJsApiStrings.dblclick
import typingsSlinky.amapJsApi.amapJsApiStrings.hide
import typingsSlinky.amapJsApi.amapJsApiStrings.mousedown
import typingsSlinky.amapJsApi.amapJsApiStrings.mousemove
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseover
import typingsSlinky.amapJsApi.amapJsApiStrings.mouseup
import typingsSlinky.amapJsApi.amapJsApiStrings.options
import typingsSlinky.amapJsApi.amapJsApiStrings.rightclick
import typingsSlinky.amapJsApi.amapJsApiStrings.setCenter
import typingsSlinky.amapJsApi.amapJsApiStrings.setRadius
import typingsSlinky.amapJsApi.amapJsApiStrings.show
import typingsSlinky.amapJsApi.amapJsApiStrings.touchend
import typingsSlinky.amapJsApi.amapJsApiStrings.touchmove
import typingsSlinky.amapJsApi.amapJsApiStrings.touchstart
import typingsSlinky.amapJsApi.anon.TargetI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap[I]
  extends typingsSlinky.amapJsApi.AMap.ShapeOverlay.EventMap[I] {
  var setCenter: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.setCenter, js.UndefOr[scala.Nothing]] = js.native
  var setRadius: Event_[typingsSlinky.amapJsApi.amapJsApiStrings.setRadius, js.UndefOr[scala.Nothing]] = js.native
}

object EventMap {
  @scala.inline
  def apply[I](
    change: Event_[change, TargetI[I]],
    click: MapsEvent[click, I],
    dblclick: MapsEvent[dblclick, I],
    hide: Event_[hide, TargetI[I]],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    options: Event_[options, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, I],
    setCenter: Event_[setCenter, js.UndefOr[scala.Nothing]],
    setRadius: Event_[setRadius, js.UndefOr[scala.Nothing]],
    show: Event_[show, TargetI[I]],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], setCenter = setCenter.asInstanceOf[js.Any], setRadius = setRadius.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap[I]]
  }
  @scala.inline
  implicit class EventMapOps[Self[i] <: EventMap[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withSetCenter(value: Event_[setCenter, js.UndefOr[scala.Nothing]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRadius(value: Event_[setRadius, js.UndefOr[scala.Nothing]]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRadius")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

