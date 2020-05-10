package typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait District extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String = js.native
  /**
    * 边界坐标集合
    */
  var boundaries: js.UndefOr[js.Array[js.Array[LngLat]]] = js.native
  /**
    * 中心点经纬度坐标
    */
  var center: LngLat = js.native
  /**
    * 城市编码
    */
  var citycode: String = js.native
  /**
    * 下级行政区信息列表
    */
  var districtList: js.UndefOr[js.Array[District]] = js.native
  /**
    * 行政区划级别
    */
  var level: Level = js.native
  /**
    * 行政区名称
    */
  var name: String = js.native
}

object District {
  @scala.inline
  def apply(adcode: String, center: LngLat, citycode: String, level: Level, name: String): District = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[District]
  }
  @scala.inline
  implicit class DistrictOps[Self <: District] (val x: Self) extends AnyVal {
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
    def withCenter(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCitycode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("citycode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundaries(value: js.Array[js.Array[LngLat]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaries")(js.undefined)
        ret
    }
    @scala.inline
    def withDistrictList(value: js.Array[District]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("districtList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistrictList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("districtList")(js.undefined)
        ret
    }
  }
  
}

