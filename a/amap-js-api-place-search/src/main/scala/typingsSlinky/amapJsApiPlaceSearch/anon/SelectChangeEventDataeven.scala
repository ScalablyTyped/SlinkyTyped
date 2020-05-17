package typingsSlinky.amapJsApiPlaceSearch.anon

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.amapJsApi.AMap.InfoWindow
import typingsSlinky.amapJsApi.AMap.Marker
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Poi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-place-search.AMap.PlaceSearch.SelectChangeEventData & {  event  :std.MouseEvent,   infoWindow  :amap-js-api.AMap.InfoWindow<any>,   infoWindowContentDom  :std.HTMLDivElement} */
@js.native
trait SelectChangeEventDataeven extends js.Object {
  /**
    * 当前选中的POI的信息
    */
  var data: js.Array[Poi] = js.native
  var event: MouseEvent = js.native
  /**
    * 当前选中的POI的ID
    */
  var id: String = js.native
  /**
    * 索引
    */
  var index: Double = js.native
  var infoWindow: InfoWindow[_] = js.native
  var infoWindowContentDom: HTMLDivElement = js.native
  /**
    * 当前选中的POI在结果面板中对应的列表项
    */
  var listElement: HTMLLIElement = js.native
  /**
    * 当前选中的POI对应的在地图中的Marker对象
    */
  var marker: Marker[_] = js.native
}

object SelectChangeEventDataeven {
  @scala.inline
  def apply(
    data: js.Array[Poi],
    event: MouseEvent,
    id: String,
    index: Double,
    infoWindow: InfoWindow[_],
    infoWindowContentDom: HTMLDivElement,
    listElement: HTMLLIElement,
    marker: Marker[_]
  ): SelectChangeEventDataeven = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], infoWindow = infoWindow.asInstanceOf[js.Any], infoWindowContentDom = infoWindowContentDom.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectChangeEventDataeven]
  }
  @scala.inline
  implicit class SelectChangeEventDataevenOps[Self <: SelectChangeEventDataeven] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[Poi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoWindow(value: InfoWindow[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoWindowContentDom(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindowContentDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListElement(value: HTMLLIElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: Marker[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

