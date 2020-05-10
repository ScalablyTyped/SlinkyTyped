package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 自定义图像审核。
		 */
@js.native
trait imageAuditOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String = js.native
   // 图像资源地址
  var imgUrl: js.UndefOr[String] = js.native
   // 网图URL地址，以网图形式请求，图片Url需要做UrlEncode，不能与image并存。
  @JSName("success")
  var success_imageAuditOptions: js.UndefOr[js.Function1[/* res */ imageAuditResponse, Unit]] = js.native
}

object imageAuditOptions {
  @scala.inline
  def apply(image: String): imageAuditOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditOptions]
  }
  @scala.inline
  implicit class imageAuditOptionsOps[Self <: imageAuditOptions] (val x: Self) extends AnyVal {
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
    def withImgUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ imageAuditResponse => Unit): Self = {
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

