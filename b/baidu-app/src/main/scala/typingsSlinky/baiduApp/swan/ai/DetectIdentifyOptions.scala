package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class DetectIdentifyOptionsMutableBuilder[Self <: DetectIdentifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ DetectIdentifyResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWith_face(value: Double): Self = StObject.set(x, "with_face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWith_faceUndefined: Self = StObject.set(x, "with_face", js.undefined)
  }
}
