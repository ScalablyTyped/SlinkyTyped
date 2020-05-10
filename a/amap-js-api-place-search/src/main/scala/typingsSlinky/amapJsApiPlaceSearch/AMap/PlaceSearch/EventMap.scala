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

@js.native
trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete, 
    SearchResult
  ] = js.native
  var error: Event_[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error, AnonInfo] = js.native
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
    AnonListElements
  ] = js.native
  var selectChanged: Event_[
    typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged, 
    AnonLastSelected
  ] = js.native
  var willClear: Event_[typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear, AnonData] = js.native
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
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: Event_[complete, SearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Event_[error, AnonInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoWindowClick(value: Event_[infoWindowClick, SelectChangeEventDataeven]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindowClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListElementClick(value: SelectChangeEvent[listElementClick, MouseEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listElementClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListElementDetroyed(value: Event_[listElementDetroyed, SelectChangeEventData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listElementDetroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerClick(value: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerDestoryed(value: Event_[markerDestoryed, SelectChangeEventData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerDestoryed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderComplete(value: Event_[renderComplete, AnonListElements]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectChanged(value: Event_[selectChanged, AnonLastSelected]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWillClear(value: Event_[willClear, AnonData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willClear")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

