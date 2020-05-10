package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.minappEnvStrings.barCode
import typingsSlinky.minappEnv.minappEnvStrings.datamatrix
import typingsSlinky.minappEnv.minappEnvStrings.pdf417
import typingsSlinky.minappEnv.minappEnvStrings.qrCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanCodeOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ScanCodeCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ScanCodeFailCallback] = js.native
  /** 是否只能从相机扫码，不允许从相册选择图片
    *
    * 最低基础库： `1.2.0` */
  var onlyFromCamera: js.UndefOr[Boolean] = js.native
  /** 扫码类型
    *
    * 可选值：
    * - 'barCode': 一维码;
    * - 'qrCode': 二维码;
    * - 'datamatrix': Data Matrix 码;
    * - 'pdf417': PDF417 条码;
    *
    * 最低基础库： `1.7.0` */
  var scanType: js.UndefOr[Array[barCode | qrCode | datamatrix | pdf417]] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ScanCodeSuccessCallback] = js.native
}

object ScanCodeOption {
  @scala.inline
  def apply(): ScanCodeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanCodeOption]
  }
  @scala.inline
  implicit class ScanCodeOptionOps[Self <: ScanCodeOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOnlyFromCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFromCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyFromCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFromCamera")(js.undefined)
        ret
    }
    @scala.inline
    def withScanType(value: Array[barCode | qrCode | datamatrix | pdf417]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanType")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* result */ ScanCodeSuccessCallbackResult => Unit): Self = {
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

