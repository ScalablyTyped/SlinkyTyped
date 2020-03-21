package typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.MapsEvent
import typingsSlinky.amapJsApi.AMap.Marker
import typingsSlinky.amapJsApiPlaceSearch.AnonData
import typingsSlinky.amapJsApiPlaceSearch.AnonInfo
import typingsSlinky.amapJsApiPlaceSearch.AnonLastSelected
import typingsSlinky.amapJsApiPlaceSearch.AnonListElements
import typingsSlinky.amapJsApiPlaceSearch.SelectChangeEventDataeven
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.click
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error, AnonInfo]
  var infoWindowClick: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick, 
    SelectChangeEventDataeven
  ]
  var listElementClick: SelectChangeEvent[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick, 
    MouseEvent
  ]
   // typo in source code
  var listElementDetroyed: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed, 
    SelectChangeEventData
  ]
  var markerClick: SelectChangeEvent[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick, 
    MapsEvent[click, Marker[_]]
  ]
  var markerDestoryed: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed, 
    SelectChangeEventData
  ]
  // internal
  var renderComplete: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete, 
    AnonListElements
  ]
  var selectChanged: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged, 
    AnonLastSelected
  ]
  var willClear: Event_[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear, AnonData]
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event_[complete, SearchResult],
    error: Event_[error, AnonInfo],
    infoWindowClick: Event_[infoWindowClick, SelectChangeEventDataeven],
    listElementClick: SelectChangeEvent[listElementClick, MouseEvent],
    listElementDetroyed: Event_[listElementDetroyed, SelectChangeEventData],
    markerClick: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]],
    markerDestoryed: Event_[markerDestoryed, SelectChangeEventData],
    renderComplete: Event_[renderComplete, AnonListElements],
    selectChanged: Event_[selectChanged, AnonLastSelected],
    willClear: Event_[willClear, AnonData]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], infoWindowClick = infoWindowClick.asInstanceOf[js.Any], listElementClick = listElementClick.asInstanceOf[js.Any], listElementDetroyed = listElementDetroyed.asInstanceOf[js.Any], markerClick = markerClick.asInstanceOf[js.Any], markerDestoryed = markerDestoryed.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any], selectChanged = selectChanged.asInstanceOf[js.Any], willClear = willClear.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

