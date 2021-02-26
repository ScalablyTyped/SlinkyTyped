package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class dishClassifyOptionsMutableBuilder[Self <: dishClassifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter_threshold(value: Double): Self = StObject.set(x, "filter_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_thresholdUndefined: Self = StObject.set(x, "filter_threshold", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ dishClassifyResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTop_num(value: Double): Self = StObject.set(x, "top_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_numUndefined: Self = StObject.set(x, "top_num", js.undefined)
  }
}
