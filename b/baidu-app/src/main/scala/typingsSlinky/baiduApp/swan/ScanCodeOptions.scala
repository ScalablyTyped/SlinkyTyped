package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanCodeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 是否只能从相机扫码，不允许从相册选择图片
  		 * @version 1.2.0
  		 */
  var onlyFromCamera: js.UndefOr[Boolean] = js.native
  /**
  		 * 扫码类型，参数类型是数组
  		 * 二维码是'qrCode'，一维码是'barCode'，DataMatrix是‘datamatrix’，pdf417是‘pdf417’。
  		 * @version 1.7.0
  		 */
  var scanType: js.UndefOr[js.Array[String]] = js.native
  @JSName("success")
  def success_MScanCodeOptions(res: ScanCodeData): Unit = js.native
}

object ScanCodeOptions {
  @scala.inline
  def apply(success: ScanCodeData => Unit): ScanCodeOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ScanCodeOptions]
  }
  @scala.inline
  implicit class ScanCodeOptionsOps[Self <: ScanCodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: ScanCodeData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
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
    def withScanType(value: js.Array[String]): Self = {
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
  }
  
}

