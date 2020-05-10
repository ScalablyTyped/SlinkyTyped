package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBluetoothDeviceFoundCallbackResult extends js.Object {
  /** 新搜索到的设备列表 */
  var devices: CallbackResultBlueToothDevice = js.native
}

object OnBluetoothDeviceFoundCallbackResult {
  @scala.inline
  def apply(devices: CallbackResultBlueToothDevice): OnBluetoothDeviceFoundCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBluetoothDeviceFoundCallbackResult]
  }
  @scala.inline
  implicit class OnBluetoothDeviceFoundCallbackResultOps[Self <: OnBluetoothDeviceFoundCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevices(value: CallbackResultBlueToothDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

