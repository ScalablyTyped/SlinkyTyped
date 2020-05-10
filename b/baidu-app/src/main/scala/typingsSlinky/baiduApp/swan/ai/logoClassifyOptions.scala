package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测和识别图片中的品牌 LOGO 信息
		 */
@js.native
trait logoClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var custom_lib: js.UndefOr[Boolean] = js.native
  var image: String = js.native
   // 是否只检索用户子库，true则只检索用户子库，false(默认)为检索底库+用户子库。
  @JSName("success")
  var success_logoClassifyOptions: js.UndefOr[js.Function1[/* res */ logoClassifyResponse, Unit]] = js.native
}

object logoClassifyOptions {
  @scala.inline
  def apply(image: String): logoClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[logoClassifyOptions]
  }
  @scala.inline
  implicit class logoClassifyOptionsOps[Self <: logoClassifyOptions] (val x: Self) extends AnyVal {
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
    def withCustom_lib(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_lib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_lib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_lib")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ logoClassifyResponse => Unit): Self = {
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

