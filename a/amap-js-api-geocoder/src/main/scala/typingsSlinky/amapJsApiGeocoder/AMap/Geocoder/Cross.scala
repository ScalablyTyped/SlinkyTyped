package typingsSlinky.amapJsApiGeocoder.AMap.Geocoder

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cross extends js.Object {
  /**
    * 与查询点的相对方位
    */
  var direction: String = js.native
  /**
    * 道路离查询点最近距离
    */
  var distance: Double = js.native
  /**
    * 第一条道路id
    */
  var first_id: String = js.native
  /**
    * 第一条道路名称
    */
  var first_name: String = js.native
  /**
    * 经纬度
    */
  var location: LngLat = js.native
  /**
    * 第二条道路id
    */
  var second_id: String = js.native
  /**
    * 第二条道路名称
    */
  var second_name: String = js.native
}

object Cross {
  @scala.inline
  def apply(
    direction: String,
    distance: Double,
    first_id: String,
    first_name: String,
    location: LngLat,
    second_id: String,
    second_name: String
  ): Cross = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], first_id = first_id.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], second_id = second_id.asInstanceOf[js.Any], second_name = second_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cross]
  }
  @scala.inline
  implicit class CrossOps[Self <: Cross] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

