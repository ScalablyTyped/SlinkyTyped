package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，指纹识别认证参数
  * 用于设置指纹识别认证界面显示的提示信息等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
  */
@js.native
trait PlusFingerprintAuthenticateOptions extends js.Object {
  /**
    * 在指纹识别过程中显示在界面上的提示信息
    * 如果指纹识别认证过程中不显示提示框，则不显示此信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var message: js.UndefOr[String] = js.native
}

object PlusFingerprintAuthenticateOptions {
  @scala.inline
  def apply(): PlusFingerprintAuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusFingerprintAuthenticateOptions]
  }
  @scala.inline
  implicit class PlusFingerprintAuthenticateOptionsOps[Self <: PlusFingerprintAuthenticateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

