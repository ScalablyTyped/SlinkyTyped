package typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.MapsEvent
import typingsSlinky.amapJsApi.AMap.Marker
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
import typingsSlinky.amapJsApiPlaceSearch.anon.Data
import typingsSlinky.amapJsApiPlaceSearch.anon.Info
import typingsSlinky.amapJsApiPlaceSearch.anon.LastSelected
import typingsSlinky.amapJsApiPlaceSearch.anon.ListElements
import typingsSlinky.amapJsApiPlaceSearch.anon.SelectChangeEventDataeven
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete, 
    SearchResult
  ] = js.native
  var error: Event_[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error, Info] = js.native
  var infoWindowClick: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick, 
    SelectChangeEventDataeven
  ] = js.native
  var listElementClick: SelectChangeEvent[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick, 
    MouseEvent
  ] = js.native
   // typo in source code
  var listElementDetroyed: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed, 
    SelectChangeEventData
  ] = js.native
  var markerClick: SelectChangeEvent[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick, 
    MapsEvent[click, Marker[_]]
  ] = js.native
  var markerDestoryed: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed, 
    SelectChangeEventData
  ] = js.native
  // internal
  var renderComplete: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete, 
    ListElements
  ] = js.native
  var selectChanged: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged, 
    LastSelected
  ] = js.native
  var willClear: Event_[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear, Data] = js.native
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event_[complete, SearchResult],
    error: Event_[error, Info],
    infoWindowClick: Event_[infoWindowClick, SelectChangeEventDataeven],
    listElementClick: SelectChangeEvent[listElementClick, MouseEvent],
    listElementDetroyed: Event_[listElementDetroyed, SelectChangeEventData],
    markerClick: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]],
    markerDestoryed: Event_[markerDestoryed, SelectChangeEventData],
    renderComplete: Event_[renderComplete, ListElements],
    selectChanged: Event_[selectChanged, LastSelected],
    willClear: Event_[willClear, Data]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], infoWindowClick = infoWindowClick.asInstanceOf[js.Any], listElementClick = listElementClick.asInstanceOf[js.Any], listElementDetroyed = listElementDetroyed.asInstanceOf[js.Any], markerClick = markerClick.asInstanceOf[js.Any], markerDestoryed = markerDestoryed.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any], selectChanged = selectChanged.asInstanceOf[js.Any], willClear = willClear.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComplete(value: Event_[complete, SearchResult]): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Event_[error, Info]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoWindowClick(value: Event_[infoWindowClick, SelectChangeEventDataeven]): Self = this.set("infoWindowClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setListElementClick(value: SelectChangeEvent[listElementClick, MouseEvent]): Self = this.set("listElementClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setListElementDetroyed(value: Event_[listElementDetroyed, SelectChangeEventData]): Self = this.set("listElementDetroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerClick(value: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]]): Self = this.set("markerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerDestoryed(value: Event_[markerDestoryed, SelectChangeEventData]): Self = this.set("markerDestoryed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderComplete(value: Event_[renderComplete, ListElements]): Self = this.set("renderComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectChanged(value: Event_[selectChanged, LastSelected]): Self = this.set("selectChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setWillClear(value: Event_[willClear, Data]): Self = this.set("willClear", value.asInstanceOf[js.Any])
  }
  
}

