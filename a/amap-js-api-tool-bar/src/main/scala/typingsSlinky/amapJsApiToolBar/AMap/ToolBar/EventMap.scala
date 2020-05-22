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

trait EventMap extends js.Object {
  var hide: Event_[
    typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var location: Event_[typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.location, Lnglat]
   // TODO geolocation.getCurrentPosition
  var `location-failed`: Event_[
    typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`, 
    js.UndefOr[scala.Nothing]
  ]
  // internal
  var `location-success`: Event_[
    typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event_[
    typingsSlinky.amapJsApiToolBar.amapJsApiToolBarStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
  var zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]
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
}

