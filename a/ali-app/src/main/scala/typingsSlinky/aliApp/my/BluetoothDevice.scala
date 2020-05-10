package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 蓝牙设备信息
	 */
@js.native
trait BluetoothDevice extends js.Object {
  /**
  		 * 设备信号强度
  		 */
  var RSSI: Double = js.native
  /**
  		 * 设备的广播内容
  		 */
  var advertisData: js.typedarray.ArrayBuffer = js.native
  /**
  		 * 设备的 id
  		 */
  var deviceId: String = js.native
  /**
  		 * (兼容旧版本) 值与 name 一致
  		 */
  var deviceName: String = js.native
  /**
  		 * 广播设备名称
  		 */
  var localName: String = js.native
  /**
  		 * 设备的manufacturerData
  		 */
  var manufacturerData: js.typedarray.ArrayBuffer = js.native
  /**
  		 * 蓝牙设备名称，某些设备可能没有
  		 */
  var name: String = js.native
}

object BluetoothDevice {
  @scala.inline
  def apply(
    RSSI: Double,
    advertisData: js.typedarray.ArrayBuffer,
    deviceId: String,
    deviceName: String,
    localName: String,
    manufacturerData: js.typedarray.ArrayBuffer,
    name: String
  ): BluetoothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDevice]
  }
  @scala.inline
  implicit class BluetoothDeviceOps[Self <: BluetoothDevice] (val x: Self) extends AnyVal {
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
    def withAdvertisData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

