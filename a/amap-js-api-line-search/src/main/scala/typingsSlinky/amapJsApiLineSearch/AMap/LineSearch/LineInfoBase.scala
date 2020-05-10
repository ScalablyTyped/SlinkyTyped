package typingsSlinky.amapJsApiLineSearch.AMap.LineSearch

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineInfoBase extends LineInfo {
  /**
    * 所在城市的城市编码
    */
  var citycode: String = js.native
  /**
    * 终点站
    */
  var end_stop: String = js.native
  /**
    * 公交线路id，该id是唯一标识
    */
  var id: String = js.native
  /**
    * 线路名称
    */
  var name: String = js.native
  /**
    * 线路经纬度
    */
  var path: js.Array[LngLat] = js.native
  /**
    * 首发站
    */
  var start_stop: String = js.native
  /**
    * 公交类型列表
    */
  var `type`: String = js.native
}

object LineInfoBase {
  @scala.inline
  def apply(
    citycode: String,
    end_stop: String,
    id: String,
    name: String,
    path: js.Array[LngLat],
    start_stop: String,
    `type`: String
  ): LineInfoBase = {
    val __obj = js.Dynamic.literal(citycode = citycode.asInstanceOf[js.Any], end_stop = end_stop.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineInfoBase]
  }
  @scala.inline
  implicit class LineInfoBaseOps[Self <: LineInfoBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCitycode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("citycode")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_stop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

