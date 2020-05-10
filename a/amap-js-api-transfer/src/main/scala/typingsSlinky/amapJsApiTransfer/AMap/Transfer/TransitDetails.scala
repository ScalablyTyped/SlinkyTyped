package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitDetails extends js.Object {
  /**
    * 地铁站入口
    */
  var entrance: js.UndefOr[SubwayEntrance] = js.native
  /**
    * 地铁站出口
    */
  var exit: js.UndefOr[SubwayEntrance] = js.native
  /**
    * 此换乘段公交路线
    */
  var lines: js.Array[TransitLine] = js.native
  /**
    * 此换乘段的下车站
    */
  var off_station: Stop = js.native
  /**
    * 此换乘段的上车站
    */
  var on_station: Stop = js.native
  /**
    * 此换乘段公交部分（上车站-下车站）坐标集合
    */
  var path: js.Array[LngLat] = js.native
  /**
    * 途径公交站点数（不包括上车站和下车站）
    */
  var via_num: Double = js.native
  /**
    * 途径公交站点集合（不包括上车站和下车站）
    */
  var via_stops: js.Array[Stop] = js.native
}

object TransitDetails {
  @scala.inline
  def apply(
    lines: js.Array[TransitLine],
    off_station: Stop,
    on_station: Stop,
    path: js.Array[LngLat],
    via_num: Double,
    via_stops: js.Array[Stop]
  ): TransitDetails = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], off_station = off_station.asInstanceOf[js.Any], on_station = on_station.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitDetails]
  }
  @scala.inline
  implicit class TransitDetailsOps[Self <: TransitDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLines(value: js.Array[TransitLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOff_station(value: Stop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off_station")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn_station(value: Stop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_station")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVia_num(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via_num")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVia_stops(value: js.Array[Stop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via_stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntrance(value: SubwayEntrance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrance")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: SubwayEntrance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
  }
  
}

