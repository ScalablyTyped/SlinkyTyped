package typingsSlinky.amapDashJsDashApiDashScale.AMap.Scale

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashScale.amapDashJsDashApiDashScaleStrings.hide
import typingsSlinky.amapDashJsDashApiDashScale.amapDashJsDashApiDashScaleStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event[
    typingsSlinky.amapDashJsDashApiDashScale.amapDashJsDashApiDashScaleStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event[
    typingsSlinky.amapDashJsDashApiDashScale.amapDashJsDashApiDashScaleStrings.show, 
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

