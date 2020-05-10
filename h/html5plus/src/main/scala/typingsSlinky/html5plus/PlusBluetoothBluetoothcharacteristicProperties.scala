package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 蓝牙设备特征值支持的操作类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
@js.native
trait PlusBluetoothBluetoothcharacteristicProperties extends js.Object {
  /**
    * 特征值是否支持indicate操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var indicate: js.UndefOr[Boolean] = js.native
  /**
    * 特征值是否支持notify操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  @JSName("notify")
  var notify_FPlusBluetoothBluetoothcharacteristicProperties: js.UndefOr[Boolean] = js.native
  /**
    * 特征值是否支持read操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var read: js.UndefOr[Boolean] = js.native
  /**
    * 特征值是否支持write操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var write: js.UndefOr[Boolean] = js.native
}

object PlusBluetoothBluetoothcharacteristicProperties {
  @scala.inline
  def apply(): PlusBluetoothBluetoothcharacteristicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBluetoothBluetoothcharacteristicProperties]
  }
  @scala.inline
  implicit class PlusBluetoothBluetoothcharacteristicPropertiesOps[Self <: PlusBluetoothBluetoothcharacteristicProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndicate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicate")(js.undefined)
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

