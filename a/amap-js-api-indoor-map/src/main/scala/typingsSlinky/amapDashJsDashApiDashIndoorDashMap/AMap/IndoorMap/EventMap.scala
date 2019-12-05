package typingsSlinky.amapDashJsDashApiDashIndoorDashMap.AMap.IndoorMap

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.click
import typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.complete
import typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.floor_complete
import typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.mouseout
import typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.mouseover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var click: MouseEvent[
    typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.click
  ]
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.complete, 
    js.UndefOr[scala.Nothing]
  ]
  var floor_complete: Event[
    typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.floor_complete, 
    SearchResult
  ]
  var mouseout: MouseEvent[
    typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.mouseout
  ]
  var mouseover: MouseEvent[
    typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapStrings.mouseover
  ]
}

object EventMap {
  @scala.inline
  def apply(
    click: MouseEvent[click],
    complete: Event[complete, js.UndefOr[scala.Nothing]],
    floor_complete: Event[floor_complete, SearchResult],
    mouseout: MouseEvent[mouseout],
    mouseover: MouseEvent[mouseover]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], floor_complete = floor_complete.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

