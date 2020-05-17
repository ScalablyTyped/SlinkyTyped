package typingsSlinky.amapJsApiToolBar.AMap.ToolBar

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`
import typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`
import typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.hide
import typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.location
import typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.show
import typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.zoomin
import typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.zoomout
import typingsSlinky.amapJsApiToolBar.anon.Lnglat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var hide: Event_[
    typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.hide, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  var location: Event_[typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.location, Lnglat] = js.native
   // TODO geolocation.getCurrentPosition
  var `location-failed`: Event_[
    typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  // internal
  var `location-success`: Event_[
    typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  var show: Event_[
    typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.show, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  var zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]] = js.native
}

object EventMap {
  @scala.inline
  def apply(
    hide: Event_[hide, js.UndefOr[scala.Nothing]],
    location: Event_[location, Lnglat],
    `location-failed`: Event_[`location-failed`, js.UndefOr[scala.Nothing]],
    `location-success`: Event_[`location-success`, js.UndefOr[scala.Nothing]],
    show: Event_[show, js.UndefOr[scala.Nothing]],
    zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], zoomchanged = zoomchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("location-failed")(`location-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("location-success")(`location-success`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: Event_[hide, js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Event_[location, Lnglat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLocation-failed`(value: Event_[`location-failed`, js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLocation-success`(value: Event_[`location-success`, js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location-success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: Event_[show, js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomchanged(value: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomchanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

