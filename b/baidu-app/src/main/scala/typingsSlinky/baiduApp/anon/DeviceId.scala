package typingsSlinky.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceId extends js.Object {
  /**
  				 * 特征值 uuid
  				 */
  var characteristicId: String = js.native
  /**
  				 * 蓝牙设备 id，参考 device 对象
  				 */
  var deviceId: String = js.native
  /**
  				 * 特征值所属服务 uuid
  				 */
  var serviceId: String = js.native
  /**
  				 * 特征值最新的值
  				 */
  var value: js.typedarray.ArrayBuffer = js.native
}

object DeviceId {
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, value: js.typedarray.ArrayBuffer): DeviceId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceId]
  }
  @scala.inline
  implicit class DeviceIdOps[Self <: DeviceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacteristicId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristicId")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withValue(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

