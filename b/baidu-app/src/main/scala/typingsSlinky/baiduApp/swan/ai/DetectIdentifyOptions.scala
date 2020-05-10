package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用户向服务请求检测图像中的主体位置。
		 */
@js.native
trait DetectIdentifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String = js.native
   // 如果检测主体是人，主体区域是否带上人脸部分，0-不带人脸区域，其他-带人脸区域，裁剪类需求推荐带人脸，检索/识别类需求推荐不带人脸。默认取1，带人脸。
  @JSName("success")
  var success_DetectIdentifyOptions: js.UndefOr[js.Function1[/* res */ DetectIdentifyResponse, Unit]] = js.native
   // 图像资源地址
  var with_face: js.UndefOr[Double] = js.native
}

object DetectIdentifyOptions {
  @scala.inline
  def apply(image: String): DetectIdentifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectIdentifyOptions]
  }
  @scala.inline
  implicit class DetectIdentifyOptionsOps[Self <: DetectIdentifyOptions] (val x: Self) extends AnyVal {
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
    def withSuccess(value: /* res */ DetectIdentifyResponse => Unit): Self = {
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
    def withWith_face(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("with_face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWith_face: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("with_face")(js.undefined)
        ret
    }
  }
  
}

