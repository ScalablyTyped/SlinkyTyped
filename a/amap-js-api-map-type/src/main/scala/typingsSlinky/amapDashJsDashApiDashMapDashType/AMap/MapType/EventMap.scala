package typingsSlinky.amapDashJsDashApiDashMapDashType.AMap.MapType

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeStrings.hide
import typingsSlinky.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event[
    typingsSlinky.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event[
    typingsSlinky.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(hide: Event[hide, js.UndefOr[scala.Nothing]], show: Event[show, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

