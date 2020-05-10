package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 新搜索到的设备列表 */
@js.native
trait CallbackResultBlueToothDevice extends js.Object {
  /** 当前蓝牙设备的信号强度 */
  var RSSI: Double = js.native
  /** 当前蓝牙设备的广播数据段中的 ManufacturerData 数据段。 */
  var advertisData: ArrayBuffer = js.native
  /** 当前蓝牙设备的广播数据段中的 ServiceUUIDs 数据段 */
  var advertisServiceUUIDs: Array[String] = js.native
  /** 用于区分设备的 id */
  var deviceId: String = js.native
  /** 当前蓝牙设备的广播数据段中的 LocalName 数据段 */
  var localName: String = js.native
  /** 蓝牙设备名称，某些设备可能没有 */
  var name: String = js.native
  /** 当前蓝牙设备的广播数据段中的 ServiceData 数据段 */
  var serviceData: js.Object = js.native
}

object CallbackResultBlueToothDevice {
  @scala.inline
  def apply(
    RSSI: Double,
    advertisData: ArrayBuffer,
    advertisServiceUUIDs: Array[String],
    deviceId: String,
    localName: String,
    name: String,
    serviceData: js.Object
  ): CallbackResultBlueToothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], advertisServiceUUIDs = advertisServiceUUIDs.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackResultBlueToothDevice]
  }
  @scala.inline
  implicit class CallbackResultBlueToothDeviceOps[Self <: CallbackResultBlueToothDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRSSI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSSI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvertisData(value: ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvertisServiceUUIDs(value: Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisServiceUUIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

