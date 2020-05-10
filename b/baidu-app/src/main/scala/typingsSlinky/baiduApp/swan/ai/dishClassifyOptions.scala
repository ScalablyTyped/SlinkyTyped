package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于菜品识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图
		 * 片的菜品名称、卡路里信息、置信度。
		 */
@js.native
trait dishClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var filter_threshold: js.UndefOr[Double] = js.native
  var image: String = js.native
   // 返回结果top n，默认5。
  @JSName("success")
  var success_dishClassifyOptions: js.UndefOr[js.Function1[/* res */ dishClassifyResponse, Unit]] = js.native
   // 默认0.95，可以通过该参数调节识别效果，降低非菜识别率.
  var top_num: js.UndefOr[Double] = js.native
}

object dishClassifyOptions {
  @scala.inline
  def apply(image: String): dishClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[dishClassifyOptions]
  }
  @scala.inline
  implicit class dishClassifyOptionsOps[Self <: dishClassifyOptions] (val x: Self) extends AnyVal {
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
    def withFilter_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ dishClassifyResponse => Unit): Self = {
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

