package typingsSlinky.amapJsApiStationSearch.AMap.StationSearch

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Busline extends js.Object {
  /**
    * 首发站名称
    */
  var end_stop: String = js.native
  /**
    * 公交线路id，该id是唯一标识
    */
  var id: String = js.native
  /**
    * 公交线路途经此站的经纬度
    */
  var location: LngLat = js.native
  /**
    * 公交线路名称
    */
  var name: String = js.native
  /**
    * 首发站名称
    */
  var start_stop: String = js.native
}

object Busline {
  @scala.inline
  def apply(end_stop: String, id: String, location: LngLat, name: String, start_stop: String): Busline = {
    val __obj = js.Dynamic.literal(end_stop = end_stop.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Busline]
  }
  @scala.inline
  implicit class BuslineOps[Self <: Busline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd_stop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_stop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_stop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

