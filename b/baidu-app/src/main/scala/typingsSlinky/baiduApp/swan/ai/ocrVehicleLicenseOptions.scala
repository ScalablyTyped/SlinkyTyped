package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 对机动车行驶证正本所有关键字段进行识别
		 */
@js.native
trait ocrVehicleLicenseOptions
  extends BaseOptions[js.Any, js.Any] {
   // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true; false:不检测旋转角度，默认不检测。
  var accuracy: js.UndefOr[String] = js.native
   // 图片资源地址
  var detect_direction: js.UndefOr[Boolean] = js.native
  var image: String = js.native
   // normal 使用快速服务，1200ms左右时延；缺省或其它值使用高精度服务，1600ms左右时延。
  @JSName("success")
  var success_ocrVehicleLicenseOptions: js.UndefOr[js.Function1[/* res */ ocrVehicleLicenseResponse, Unit]] = js.native
}

object ocrVehicleLicenseOptions {
  @scala.inline
  def apply(image: String): ocrVehicleLicenseOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrVehicleLicenseOptions]
  }
  @scala.inline
  implicit class ocrVehicleLicenseOptionsOps[Self <: ocrVehicleLicenseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccuracy(value: String): Self = {
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
    def withDetect_direction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect_direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetect_direction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect_direction")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ ocrVehicleLicenseResponse => Unit): Self = {
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

