package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 通用物体及场景识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图片中的多个物体及场景标签。
  */
@js.native
trait GeneralIdentifyOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var image: String = js.native
  
   // 图像资源地址
  @JSName("success")
  var success_GeneralIdentifyOptions: js.UndefOr[js.Function1[/* res */ GeneralIdentifyResponse, Unit]] = js.native
}
object GeneralIdentifyOptions {
  
  @scala.inline
  def apply(image: String): GeneralIdentifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralIdentifyOptions]
  }
  
  @scala.inline
  implicit class GeneralIdentifyOptionsOps[Self <: GeneralIdentifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralIdentifyResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
