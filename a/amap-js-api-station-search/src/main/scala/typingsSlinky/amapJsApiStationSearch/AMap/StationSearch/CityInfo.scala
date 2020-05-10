package typingsSlinky.amapJsApiStationSearch.AMap.StationSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CityInfo extends js.Object {
  /**
    * 行政区编码
    */
  var adcode: String = js.native
  /**
    * 城市编码
    */
  var citycode: String = js.native
  /**
    * 该城市的建议结果数目
    */
  var count: Double = js.native
  /**
    * 城市名称
    */
  var name: String = js.native
}

object CityInfo {
  @scala.inline
  def apply(adcode: String, citycode: String, count: Double, name: String): CityInfo = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityInfo]
  }
  @scala.inline
  implicit class CityInfoOps[Self <: CityInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCitycode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("citycode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

