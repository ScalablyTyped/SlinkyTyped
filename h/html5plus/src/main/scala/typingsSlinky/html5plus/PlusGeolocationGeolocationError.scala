package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，定位错误信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
@js.native
trait PlusGeolocationGeolocationError extends js.Object {
  /**
    * 访问权限被拒绝
    * 系统不允许程序获取定位功能，错误代码常量值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var PERMISSION_DENIED: js.UndefOr[Double] = js.native
  /**
    * 位置信息不可用
    * 无法获取有效的位置信息，错误代码常量值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var POSITION_UNAVAILABLE: js.UndefOr[Double] = js.native
  /**
    * 获取位置信息超时
    * 无法在指定的时间内获取位置信息，错误代码常量值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var TIMEOUT: js.UndefOr[Double] = js.native
  /**
    * 未知错误
    * 其它未知错误导致无法获取位置信息，错误代码常量值为4。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var UNKNOWN_ERROR: js.UndefOr[Double] = js.native
  /**
    * 错误代码
    * 取值范围为GeolocationError对象的常量值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var code: js.UndefOr[Double] = js.native
  /**
    * 错误描述信息
    * 详细错误描述信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var message: js.UndefOr[String] = js.native
}

object PlusGeolocationGeolocationError {
  @scala.inline
  def apply(): PlusGeolocationGeolocationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGeolocationGeolocationError]
  }
  @scala.inline
  implicit class PlusGeolocationGeolocationErrorOps[Self <: PlusGeolocationGeolocationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPERMISSION_DENIED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERMISSION_DENIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPERMISSION_DENIED: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERMISSION_DENIED")(js.undefined)
        ret
    }
    @scala.inline
    def withPOSITION_UNAVAILABLE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSITION_UNAVAILABLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPOSITION_UNAVAILABLE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSITION_UNAVAILABLE")(js.undefined)
        ret
    }
    @scala.inline
    def withTIMEOUT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTIMEOUT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT")(js.undefined)
        ret
    }
    @scala.inline
    def withUNKNOWN_ERROR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUNKNOWN_ERROR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

