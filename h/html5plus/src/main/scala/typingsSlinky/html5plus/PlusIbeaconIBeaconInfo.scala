package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iBeacon设备信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
  */
@js.native
trait PlusIbeaconIBeaconInfo extends js.Object {
  /**
    * iBeacon设备的距离精度信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var accuracy: js.UndefOr[Double] = js.native
  /**
    * iBeacon设备的主id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var major: js.UndefOr[String] = js.native
  /**
    * iBeacon设备的次id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var minor: js.UndefOr[String] = js.native
  /**
    * iBeacon设备的距离
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var proximity: js.UndefOr[Double] = js.native
  /**
    * iBeacon设备的信号强度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var rssi: js.UndefOr[String] = js.native
  /**
    * iBeacon设备广播的uuid
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var uuid: js.UndefOr[String] = js.native
}

object PlusIbeaconIBeaconInfo {
  @scala.inline
  def apply(): PlusIbeaconIBeaconInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIbeaconIBeaconInfo]
  }
  @scala.inline
  implicit class PlusIbeaconIBeaconInfoOps[Self <: PlusIbeaconIBeaconInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withMajor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(js.undefined)
        ret
    }
    @scala.inline
    def withMinor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(js.undefined)
        ret
    }
    @scala.inline
    def withProximity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProximity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(js.undefined)
        ret
    }
    @scala.inline
    def withRssi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rssi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRssi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rssi")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

