package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class animalClassifyOptionsMutableBuilder[Self <: animalClassifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ animalClassifyResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTop_num(value: Double): Self = StObject.set(x, "top_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_numUndefined: Self = StObject.set(x, "top_num", js.undefined)
  }
}
