package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBluetoothDevicesDiscoveryOption extends js.Object {
  /** 是否允许重复上报同一设备。如果允许重复上报，则 `wx.onBlueToothDeviceFound` 方法会多次上报同一设备，但是 RSSI 值会有不同。 */
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartBluetoothDevicesDiscoveryCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartBluetoothDevicesDiscoveryFailCallback] = js.native
  /** 上报设备的间隔。0 表示找到新设备立即上报，其他数值根据传入的间隔上报。 */
  var interval: js.UndefOr[Double] = js.native
  /** 要搜索但蓝牙设备主 service 的 uuid 列表。某些蓝牙设备会广播自己的主 service 的 uuid。如果设置此参数，则只搜索广播包有对应 uuid 的主服务的蓝牙设备。建议主要通过该参数过滤掉周边不需要处理的其他蓝牙设备。 */
  var services: js.UndefOr[Array[String]] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartBluetoothDevicesDiscoverySuccessCallback] = js.native
}

object StartBluetoothDevicesDiscoveryOption {
  @scala.inline
  def apply(): StartBluetoothDevicesDiscoveryOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBluetoothDevicesDiscoveryOption]
  }
  @scala.inline
  implicit class StartBluetoothDevicesDiscoveryOptionOps[Self <: StartBluetoothDevicesDiscoveryOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDuplicatesKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicatesKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDuplicatesKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicatesKey")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

