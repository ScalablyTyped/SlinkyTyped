package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViaStop extends js.Object {
  /**
    * 途径车站点ID
    */
  var id: String = js.native
  /**
    * 站点经纬度信息
    */
  var location: LngLat = js.native
  /**
    * 途径车站点名称
    */
  var name: String = js.native
  /**
    * 途径站点的进站时间，如大于24:00,则表示跨天
    */
  var time: Double = js.native
  /**
    * 途径站点的停靠时间，单位：分钟
    */
  @JSName("wait")
  var wait_FViaStop: Double = js.native
}

object ViaStop {
  @scala.inline
  def apply(id: String, location: LngLat, name: String, time: Double, wait: Double): ViaStop = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViaStop]
  }
  @scala.inline
  implicit class ViaStopOps[Self <: ViaStop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

