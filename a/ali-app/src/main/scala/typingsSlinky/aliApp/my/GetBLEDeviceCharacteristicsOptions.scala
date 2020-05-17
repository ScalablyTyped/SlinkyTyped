package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.characteristicsArraychara
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBLEDeviceCharacteristicsOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: String = js.native
  /**
  		 * 蓝牙服务 uuid
  		 */
  var serviceId: String = js.native
  /**
  		 * 成功则返回本机蓝牙适配器状态
  		 */
  @JSName("success")
  def success_MGetBLEDeviceCharacteristicsOptions(res: characteristicsArraychara): Unit = js.native
}

object GetBLEDeviceCharacteristicsOptions {
  @scala.inline
  def apply(deviceId: String, serviceId: String, success: characteristicsArraychara => Unit): GetBLEDeviceCharacteristicsOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsOptions]
  }
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsOptionsOps[Self <: GetBLEDeviceCharacteristicsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: characteristicsArraychara => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

