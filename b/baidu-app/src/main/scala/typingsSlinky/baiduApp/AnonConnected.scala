package typingsSlinky.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnected extends js.Object {
  /**
  				 * 连接目前的状态
  				 */
  var connected: Boolean = js.native
  /**
  				 * 蓝牙设备 id，参考 device 对象
  				 */
  var deviceId: String = js.native
}

object AnonConnected {
  @scala.inline
  def apply(connected: Boolean, deviceId: String): AnonConnected = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnected]
  }
  @scala.inline
  implicit class AnonConnectedOps[Self <: AnonConnected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

