package typingsSlinky.amapJsApiCitySearch.AMap.CitySearch

import typingsSlinky.amapJsApi.AMap.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  /**
    * 地区编号
    */
  var adcode: String = js.native
  /**
    * 城市范围
    */
  var bounds: Bounds = js.native
  /**
    * 城市名称
    */
  var city: String = js.native
  /**
    * 成功信息
    */
  var info: String = js.native
  /**
    * 查询信息码
    */
  var infocode: String = js.native
  /**
    * 省份
    */
  var province: String = js.native
  var rectangle: String = js.native
  /**
    * 查询状态
    */
  var status: String = js.native
}

object SearchResult {
  @scala.inline
  def apply(
    adcode: String,
    bounds: Bounds,
    city: String,
    info: String,
    infocode: String,
    province: String,
    rectangle: String,
    status: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infocode = infocode.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
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
    def withBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfocode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infocode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectangle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

