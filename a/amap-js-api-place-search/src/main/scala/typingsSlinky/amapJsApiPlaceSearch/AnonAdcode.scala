package typingsSlinky.amapJsApiPlaceSearch

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Discount
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Groupbuy
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiPhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdcode extends js.Object {
  /**
    * 所在区域编码
    */
  var adcode: String = js.native
  /**
    * 所在行政区名称
    */
  var adname: String = js.native
  /**
    * 所在城市编码
    */
  var citycode: String = js.native
  /**
    * 所在城市名称
    */
  var cityname: String = js.native
  /**
    * @deprecated 是否有优惠信息
    */
  var discount: Boolean = js.native
  /**
    * @deprecated 优惠信息
    */
  var discounts: js.UndefOr[js.Array[Discount]] = js.native
  /**
    * 电子邮箱
    */
  var email: String = js.native
  /**
    * 入口经纬度
    */
  var entr_location: LngLat | Null = js.native
  /**
    * 出口经纬度
    */
  var exit_location: LngLat | Null = js.native
  /**
    * @deprecated 是否有团购信息
    */
  var groupbuy: Boolean = js.native
  /**
    * @deprecated 团购信息
    */
  var groupbuys: js.UndefOr[js.Array[Groupbuy]] = js.native
  /**
    * 所在省份编码
    */
  var pcode: String = js.native
  /**
    * 照片
    */
  var photos: js.Array[PoiPhoto] = js.native
  /**
    * 所在省份
    */
  var pname: String = js.native
  /**
    * 邮编
    */
  var postcode: String = js.native
  /**
    * 网址
    */
  var website: String = js.native
}

object AnonAdcode {
  @scala.inline
  def apply(
    adcode: String,
    adname: String,
    citycode: String,
    cityname: String,
    discount: Boolean,
    email: String,
    groupbuy: Boolean,
    pcode: String,
    photos: js.Array[PoiPhoto],
    pname: String,
    postcode: String,
    website: String
  ): AnonAdcode = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], adname = adname.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], cityname = cityname.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], groupbuy = groupbuy.asInstanceOf[js.Any], pcode = pcode.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], pname = pname.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdcode]
  }
  @scala.inline
  implicit class AnonAdcodeOps[Self <: AnonAdcode] (val x: Self) extends AnyVal {
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
    def withAdname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCitycode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("citycode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCityname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupbuy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupbuy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[PoiPhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscounts(value: js.Array[Discount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discounts")(js.undefined)
        ret
    }
    @scala.inline
    def withEntr_location(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entr_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntr_locationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entr_location")(null)
        ret
    }
    @scala.inline
    def withExit_location(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit_locationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_location")(null)
        ret
    }
    @scala.inline
    def withGroupbuys(value: js.Array[Groupbuy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupbuys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupbuys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupbuys")(js.undefined)
        ret
    }
  }
  
}

