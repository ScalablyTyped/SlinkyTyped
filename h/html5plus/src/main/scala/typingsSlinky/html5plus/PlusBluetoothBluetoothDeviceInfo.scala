package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 蓝牙设备信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
@js.native
trait PlusBluetoothBluetoothDeviceInfo extends js.Object {
  /**
    * 蓝牙设备的信号强度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var RSSI: js.UndefOr[String] = js.native
  /**
    * 蓝牙设备的广播数据段中的ManufacturerData数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var advertisData: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  /**
    * 蓝牙设备的广播数据段中的ServiceUUIDs数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var advertisServiceUUIDs: js.UndefOr[js.Array[_]] = js.native
  /**
    * 蓝牙设备的id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * 蓝牙设备的广播数据段中的LocalName数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var localName: js.UndefOr[String] = js.native
  /**
    * 蓝牙设备名称
    * 某些设备可能没有此字段值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * 蓝牙设备的广播数据段中的ServiceData数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var serviceData: js.UndefOr[js.Any] = js.native
}

object PlusBluetoothBluetoothDeviceInfo {
  @scala.inline
  def apply(): PlusBluetoothBluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBluetoothBluetoothDeviceInfo]
  }
  @scala.inline
  implicit class PlusBluetoothBluetoothDeviceInfoOps[Self <: PlusBluetoothBluetoothDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRSSI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSSI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRSSI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSSI")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertisData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisData")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertisServiceUUIDs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisServiceUUIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisServiceUUIDs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisServiceUUIDs")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceData")(js.undefined)
        ret
    }
  }
  
}

