package typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApi.AMap.MapsEvent
import typingsSlinky.amapDashJsDashApi.AMap.Marker
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_Click
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_Data
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_Event
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_Info
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_ListElements
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.click
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.complete
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.error
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.infoWindowClick
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementClick
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementDetroyed
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerClick
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerDestoryed
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.renderComplete
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.selectChanged
import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.willClear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.error, 
    Anon_Info
  ]
  var infoWindowClick: Event[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.infoWindowClick, 
    SelectChangeEventData with Anon_Event
  ]
  var listElementClick: SelectChangeEvent[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementClick, 
    MouseEvent
  ]
   // typo in source code
  var listElementDetroyed: Event[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementDetroyed, 
    SelectChangeEventData
  ]
  var markerClick: SelectChangeEvent[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerClick, 
    MapsEvent[click, Marker[_]]
  ]
  var markerDestoryed: Event[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerDestoryed, 
    SelectChangeEventData
  ]
  // internal
  var renderComplete: Event[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.renderComplete, 
    Anon_ListElements
  ]
  var selectChanged: Event[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.selectChanged, 
    Anon_Click
  ]
  var willClear: Event[
    typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.willClear, 
    Anon_Data
  ]
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event[complete, SearchResult],
    error: Event[error, Anon_Info],
    infoWindowClick: Event[infoWindowClick, SelectChangeEventData with Anon_Event],
    listElementClick: SelectChangeEvent[listElementClick, MouseEvent],
    listElementDetroyed: Event[listElementDetroyed, SelectChangeEventData],
    markerClick: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]],
    markerDestoryed: Event[markerDestoryed, SelectChangeEventData],
    renderComplete: Event[renderComplete, Anon_ListElements],
    selectChanged: Event[selectChanged, Anon_Click],
    willClear: Event[willClear, Anon_Data]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], infoWindowClick = infoWindowClick.asInstanceOf[js.Any], listElementClick = listElementClick.asInstanceOf[js.Any], listElementDetroyed = listElementDetroyed.asInstanceOf[js.Any], markerClick = markerClick.asInstanceOf[js.Any], markerDestoryed = markerDestoryed.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any], selectChanged = selectChanged.asInstanceOf[js.Any], willClear = willClear.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

