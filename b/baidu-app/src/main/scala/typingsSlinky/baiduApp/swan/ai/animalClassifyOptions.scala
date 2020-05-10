package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测和识别图片中的动物信息
		 */
@js.native
trait animalClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String = js.native
   // 返回预测得分top结果数，默认为6
  @JSName("success")
  var success_animalClassifyOptions: js.UndefOr[js.Function1[/* res */ animalClassifyResponse, Unit]] = js.native
   // 图像资源地址
  var top_num: js.UndefOr[Double] = js.native
}

object animalClassifyOptions {
  @scala.inline
  def apply(image: String): animalClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[animalClassifyOptions]
  }
  @scala.inline
  implicit class animalClassifyOptionsOps[Self <: animalClassifyOptions] (val x: Self) extends AnyVal {
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
    def withSuccess(value: /* res */ animalClassifyResponse => Unit): Self = {
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
    @scala.inline
    def withTop_num(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_num")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop_num: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_num")(js.undefined)
        ret
    }
  }
  
}

