package typingsSlinky.amapDashJsDashApiDashPlaceDashSearch

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapDashJsDashApi.AMap.Marker
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch.SelectChangeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ListElements extends js.Object {
  var listElements: js.Array[HTMLElement]
  var markers: js.Array[Marker[_]]
  var result: js.Array[SelectChangeEventData]
}

object Anon_ListElements {
  @scala.inline
  def apply(
    listElements: js.Array[HTMLElement],
    markers: js.Array[Marker[_]],
    result: js.Array[SelectChangeEventData]
  ): Anon_ListElements = {
    val __obj = js.Dynamic.literal(listElements = listElements.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ListElements]
  }
}

