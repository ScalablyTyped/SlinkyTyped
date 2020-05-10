package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用户向服务请求识别身份证，身份证识别包括正面和背面。
		 */
@js.native
trait ocrIdCardOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图片资源地址
  var detect_direction: js.UndefOr[Boolean] = js.native
   // front：身份证含照片的一面；back：身份证带国徽的一面。
  var detect_risk: js.UndefOr[Boolean] = js.native
   // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true; false: 不检测旋转角度，默认不检测。
  var id_card_side: js.UndefOr[String] = js.native
  var image: String = js.native
   // 是否开启身份证风险类型(身份证复印件、临时身份证、身份证翻拍、修改过的身份证)功能，默认不开启，即：false。可选值:true-开启；false-不开启。
  @JSName("success")
  var success_ocrIdCardOptions: js.UndefOr[js.Function1[/* res */ ocrIdCardResponse, Unit]] = js.native
}

object ocrIdCardOptions {
  @scala.inline
  def apply(image: String): ocrIdCardOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrIdCardOptions]
  }
  @scala.inline
  implicit class ocrIdCardOptionsOps[Self <: ocrIdCardOptions] (val x: Self) extends AnyVal {
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
    def withDetect_risk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect_risk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetect_risk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect_risk")(js.undefined)
        ret
    }
    @scala.inline
    def withId_card_side(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_card_side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId_card_side: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_card_side")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ ocrIdCardResponse => Unit): Self = {
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

