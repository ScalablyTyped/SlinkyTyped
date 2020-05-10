package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxiDetails extends js.Object {
  /**
    * 打车终点坐标
    */
  var destination: LngLat = js.native
  /**
    * 该方案的总距离，单位：米
    */
  var distance: Double = js.native
  /**
    * 打车起点坐标
    */
  var origin: LngLat = js.native
  /**
    * 起点名称
    */
  var sname: String = js.native
  /**
    * 耗时，单位：秒
    */
  var time: Double = js.native
  /**
    * 终点名称
    */
  var tname: String = js.native
}

object TaxiDetails {
  @scala.inline
  def apply(destination: LngLat, distance: Double, origin: LngLat, sname: String, time: Double, tname: String): TaxiDetails = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], sname = sname.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiDetails]
  }
  @scala.inline
  implicit class TaxiDetailsOps[Self <: TaxiDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

