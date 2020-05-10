package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * networkinfo模块用于获取网络信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
@js.native
trait PlusNetworkinfo extends js.Object {
  /**
    * 蜂窝移动2G网络
    * 网络状态常量，当前设备连接到蜂窝移动2G网络，固定值为4。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_CELL2G: js.UndefOr[Double] = js.native
  /**
    * 蜂窝移动3G网络
    * 网络状态常量，当前设备连接到蜂窝移动3G网络，固定值为5。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_CELL3G: js.UndefOr[Double] = js.native
  /**
    * 蜂窝移动4G网络
    * 网络状态常量，当前设备连接到蜂窝移动4G网络，固定值为6。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_CELL4G: js.UndefOr[Double] = js.native
  /**
    * 有线网络
    * 网络状态常量，当前设备连接到有线网络，固定值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_ETHERNET: js.UndefOr[Double] = js.native
  /**
    * 未连接网络
    * 网络状态常量，当前设备网络未连接网络，固定值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_NONE: js.UndefOr[Double] = js.native
  /**
    * 网络连接状态未知
    * 网络状态常量，表示当前设备网络状态未知，固定值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_UNKNOW: js.UndefOr[Double] = js.native
  /**
    * 无线WIFI网络
    * 网络状态常量，当前设备连接到无线WIFI网络，固定值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_WIFI: js.UndefOr[Double] = js.native
  /**
    * 获取设备当前连接的网络类型
    * 获取当前设备连接的网络类型，返回值为网络类型常量，可取值CONNECTION_*常量。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def getCurrentType(): Double = js.native
}

object PlusNetworkinfo {
  @scala.inline
  def apply(getCurrentType: () => Double): PlusNetworkinfo = {
    val __obj = js.Dynamic.literal(getCurrentType = js.Any.fromFunction0(getCurrentType))
    __obj.asInstanceOf[PlusNetworkinfo]
  }
  @scala.inline
  implicit class PlusNetworkinfoOps[Self <: PlusNetworkinfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCurrentType(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCONNECTION_CELL2G(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_CELL2G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONNECTION_CELL2G: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_CELL2G")(js.undefined)
        ret
    }
    @scala.inline
    def withCONNECTION_CELL3G(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_CELL3G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONNECTION_CELL3G: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_CELL3G")(js.undefined)
        ret
    }
    @scala.inline
    def withCONNECTION_CELL4G(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_CELL4G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONNECTION_CELL4G: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_CELL4G")(js.undefined)
        ret
    }
    @scala.inline
    def withCONNECTION_ETHERNET(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_ETHERNET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONNECTION_ETHERNET: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_ETHERNET")(js.undefined)
        ret
    }
    @scala.inline
    def withCONNECTION_NONE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONNECTION_NONE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_NONE")(js.undefined)
        ret
    }
    @scala.inline
    def withCONNECTION_UNKNOW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_UNKNOW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONNECTION_UNKNOW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_UNKNOW")(js.undefined)
        ret
    }
    @scala.inline
    def withCONNECTION_WIFI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_WIFI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONNECTION_WIFI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_WIFI")(js.undefined)
        ret
    }
  }
  
}

