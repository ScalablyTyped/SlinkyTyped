package typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hotel extends js.Object {
  /**
    * 特色服务
    */
  var addition: String = js.native
  /**
    * 信息来源
    */
  var deep_src: String = js.native
  /**
    * 环境评分
    */
  var environment_rating: String = js.native
  /**
    * 设施评分
    */
  var faci_rating: String = js.native
  /**
    * 卫生评分
    */
  var health_rating: String = js.native
  /**
    * 简介
    */
  var intro: String = js.native
  /**
    * 最低房价
    */
  var lowest_price: String = js.native
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto] = js.native
  /**
    * 综合评分
    */
  var rating: String = js.native
  /**
    * 服务评分
    */
  var service_rating: String = js.native
  /**
    * 星级
    */
  var star: String = js.native
  /**
    * 交通提示
    */
  var traffic: String = js.native
}

object Hotel {
  @scala.inline
  def apply(
    addition: String,
    deep_src: String,
    environment_rating: String,
    faci_rating: String,
    health_rating: String,
    intro: String,
    lowest_price: String,
    photos: js.Array[PoiPhoto],
    rating: String,
    service_rating: String,
    star: String,
    traffic: String
  ): Hotel = {
    val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], deep_src = deep_src.asInstanceOf[js.Any], environment_rating = environment_rating.asInstanceOf[js.Any], faci_rating = faci_rating.asInstanceOf[js.Any], health_rating = health_rating.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], lowest_price = lowest_price.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], service_rating = service_rating.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hotel]
  }
  @scala.inline
  implicit class HotelOps[Self <: Hotel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeep_src(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep_src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment_rating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaci_rating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faci_rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealth_rating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health_rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntro(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowest_price(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowest_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[PoiPhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService_rating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("star")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraffic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

