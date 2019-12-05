package typingsSlinky.amapDashJsDashApi.AMap.ContextMenu

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApi.Anon_Target
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.close
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.items
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var close: Event[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.close, Anon_Target[I]]
  var items: Event[
    typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.items, 
    js.UndefOr[scala.Nothing]
  ]
  var open: Event[typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.open, Anon_Target[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    close: Event[close, Anon_Target[I]],
    items: Event[items, js.UndefOr[scala.Nothing]],
    open: Event[open, Anon_Target[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

