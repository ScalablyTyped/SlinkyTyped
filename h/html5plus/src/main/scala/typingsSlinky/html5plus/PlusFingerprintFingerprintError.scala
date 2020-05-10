package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，指纹识别错误信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
  */
@js.native
trait PlusFingerprintFingerprintError extends js.Object {
  /**
    * 指纹识别不匹配
    * 用户指纹识别认证不通过时返回此错误，错误代码常量值为4。
    * 	用户每次尝试指纹识别认证未通过都会触发此错误，此时还可以继续识别认证。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var AUTHENTICATE_MISMATCH: js.UndefOr[Double] = js.native
  /**
    * 指纹识别次数超过限制
    * 用户多次指纹识别认证不通过时返回此错误，错误代码常量值为5。
    * 	通常出现此错误后系统会锁定一段时间禁止使用指纹识别，如果再次调用指纹识别认证会立即返回此错误，因此出现此错误时应该提示用户使用其它方式进行认证。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var AUTHENTICATE_OVERLIMIT: js.UndefOr[Double] = js.native
  /**
    * 取消指纹识别
    * 用户取消指纹识别认证时返回此错误，错误代码常量值为6。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var CANCEL: js.UndefOr[Double] = js.native
  /**
    * 未录入指纹识别
    * 当前设备未录入指纹导致无法使用指纹识别功能时返回此错误，错误代码常量值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var FINGERPRINT_UNENROLLED: js.UndefOr[Double] = js.native
  /**
    * 设备未设置密码锁屏
    * 当前设备为设置密码锁屏导致无法使用指纹识别功能时返回此错误，错误代码常量值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var KEYGUARD_INSECURE: js.UndefOr[Double] = js.native
  /**
    * 未知错误
    * 其它未知错误，错误代码常量值为7。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var UNKNOWN_ERROR: js.UndefOr[Double] = js.native
  /**
    * 不支持指纹识别
    * 当前设备不支持指纹识别功能时返回此错误，错误代码常量值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var UNSUPPORT: js.UndefOr[Double] = js.native
  /**
    * 错误代码
    * 取值范围为FingerprintError对象的错误常量值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var code: js.UndefOr[Double] = js.native
  /**
    * 错误描述信息
    * 详细错误描述信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var message: js.UndefOr[String] = js.native
}

object PlusFingerprintFingerprintError {
  @scala.inline
  def apply(): PlusFingerprintFingerprintError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusFingerprintFingerprintError]
  }
  @scala.inline
  implicit class PlusFingerprintFingerprintErrorOps[Self <: PlusFingerprintFingerprintError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUTHENTICATE_MISMATCH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUTHENTICATE_MISMATCH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAUTHENTICATE_MISMATCH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUTHENTICATE_MISMATCH")(js.undefined)
        ret
    }
    @scala.inline
    def withAUTHENTICATE_OVERLIMIT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUTHENTICATE_OVERLIMIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAUTHENTICATE_OVERLIMIT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUTHENTICATE_OVERLIMIT")(js.undefined)
        ret
    }
    @scala.inline
    def withCANCEL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCANCEL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(js.undefined)
        ret
    }
    @scala.inline
    def withFINGERPRINT_UNENROLLED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FINGERPRINT_UNENROLLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFINGERPRINT_UNENROLLED: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FINGERPRINT_UNENROLLED")(js.undefined)
        ret
    }
    @scala.inline
    def withKEYGUARD_INSECURE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEYGUARD_INSECURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKEYGUARD_INSECURE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEYGUARD_INSECURE")(js.undefined)
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
    def withUNSUPPORT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUNSUPPORT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORT")(js.undefined)
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

