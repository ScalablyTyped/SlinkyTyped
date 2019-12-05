package typingsSlinky.amapDashJsDashApiDashOverview.AMap.OverView

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.close
import typingsSlinky.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.hide
import typingsSlinky.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.open
import typingsSlinky.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var close: Event[
    typingsSlinky.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.close, 
    js.UndefOr[scala.Nothing]
  ]
  var hide: Event[
    typingsSlinky.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var open: Event[
    typingsSlinky.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.open, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event[
    typingsSlinky.amapDashJsDashApiDashOverview.amapDashJsDashApiDashOverviewStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(
    close: Event[close, js.UndefOr[scala.Nothing]],
    hide: Event[hide, js.UndefOr[scala.Nothing]],
    open: Event[open, js.UndefOr[scala.Nothing]],
    show: Event[show, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

