package typingsSlinky.amapJsApiDriving.AMap.Driving

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TMC extends js.Object {
  /**
    * 此lcode对应的路段长度，单位: 米
    */
  var distance: Double = js.native
  /**
    * 路况信息对应的编码
    * 如果direction是正向 lcode返回值大于0；否则lcode，返回值小于0；
    * 如果返回0则说明此路段无lcode
    */
  var lcode: String | js.Array[scala.Nothing] = js.native
  var path: js.Array[LngLat] = js.native
  var polyline: String = js.native
  /**
    * 路况状态，可能的值有：未知，畅通，缓行，拥堵
    */
  var status: String = js.native
}

object TMC {
  @scala.inline
  def apply(
    distance: Double,
    lcode: String | js.Array[scala.Nothing],
    path: js.Array[LngLat],
    polyline: String,
    status: String
  ): TMC = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], lcode = lcode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMC]
  }
  @scala.inline
  implicit class TMCOps[Self <: TMC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLcode(value: String | js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolyline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
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

