package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyBLECharacteristicValueChangedOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: String = js.native
  /**
  		 * notify 的 descriptor 的 uuid （只有android 会用到，非必填，默认值00002902-0000-10008000-00805f9b34fb）
  		 */
  var descriptorId: js.UndefOr[String] = js.native
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: String = js.native
  /**
  		 * 蓝牙特征值对应服务的 uuid
  		 */
  var serviceId: String = js.native
  /**
  		 * true: 启用 notify; false: 停用 notify
  		 */
  var state: Boolean = js.native
  @JSName("success")
  def success_MNotifyBLECharacteristicValueChangedOptions(res: ErrMsgResponse): Unit = js.native
}

object NotifyBLECharacteristicValueChangedOptions {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    state: Boolean,
    success: ErrMsgResponse => Unit
  ): NotifyBLECharacteristicValueChangedOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangedOptions]
  }
  @scala.inline
  implicit class NotifyBLECharacteristicValueChangedOptionsOps[Self <: NotifyBLECharacteristicValueChangedOptions] (val x: Self) extends AnyVal {
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
    def withState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: ErrMsgResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDescriptorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptorId")(js.undefined)
        ret
    }
  }
  
}

