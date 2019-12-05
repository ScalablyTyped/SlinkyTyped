package typingsSlinky.amapDashJsDashApiDashPlaceDashSearch

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch.SelectChangeEvent
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch.SelectChangeEventData
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementClick
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Click extends js.Object {
  var lastSelected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ]) | Null
  var selected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ])
}

object Anon_Click {
  @scala.inline
  def apply(
    selected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ]),
    lastSelected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ]) = null
  ): Anon_Click = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    if (lastSelected != null) __obj.updateDynamic("lastSelected")(lastSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Click]
  }
}

