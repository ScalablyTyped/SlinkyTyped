package typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch

import org.scalajs.dom.raw.HTMLLIElement
import typingsSlinky.amapJsApi.AMap.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectChangeEventData extends js.Object {
  /**
    * 当前选中的POI的信息
    */
  var data: js.Array[Poi] = js.native
  /**
    * 当前选中的POI的ID
    */
  var id: String = js.native
  /**
    * 索引
    */
  var index: Double = js.native
  /**
    * 当前选中的POI在结果面板中对应的列表项
    */
  var listElement: HTMLLIElement = js.native
  /**
    * 当前选中的POI对应的在地图中的Marker对象
    */
  var marker: Marker[_] = js.native
}

object SelectChangeEventData {
  @scala.inline
  def apply(data: js.Array[Poi], id: String, index: Double, listElement: HTMLLIElement, marker: Marker[_]): SelectChangeEventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectChangeEventData]
  }
  @scala.inline
  implicit class SelectChangeEventDataOps[Self <: SelectChangeEventData] (val x: Self) extends AnyVal {
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

