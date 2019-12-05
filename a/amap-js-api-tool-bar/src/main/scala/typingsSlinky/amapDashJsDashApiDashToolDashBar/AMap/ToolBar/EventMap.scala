package typingsSlinky.amapDashJsDashApiDashToolDashBar.AMap.ToolBar

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashToolDashBar.Anon_Lnglat
import typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.`location-failed`
import typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.`location-success`
import typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.hide
import typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.location
import typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.show
import typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.zoomin
import typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.zoomout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event[
    typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var location: Event[
    typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.location, 
    Anon_Lnglat
  ]
   // TODO geolocation.getCurrentPosition
  var `location-failed`: Event[
    typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.`location-failed`, 
    js.UndefOr[scala.Nothing]
  ]
  // internal
  var `location-success`: Event[
    typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.`location-success`, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event[
    typingsSlinky.amapDashJsDashApiDashToolDashBar.amapDashJsDashApiDashToolDashBarStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
  var zoomchanged: Event[zoomin | zoomout, js.UndefOr[scala.Nothing]]
}

object EventMap {
  @scala.inline
  def apply(
    hide: Event[hide, js.UndefOr[scala.Nothing]],
    location: Event[location, Anon_Lnglat],
    `location-failed`: Event[`location-failed`, js.UndefOr[scala.Nothing]],
    `location-success`: Event[`location-success`, js.UndefOr[scala.Nothing]],
    show: Event[show, js.UndefOr[scala.Nothing]],
    zoomchanged: Event[zoomin | zoomout, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], zoomchanged = zoomchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("location-failed")(`location-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("location-success")(`location-success`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

