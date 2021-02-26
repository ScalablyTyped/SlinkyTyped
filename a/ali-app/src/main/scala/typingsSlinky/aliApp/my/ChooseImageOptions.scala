package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.ApFilePaths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseImageOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 最大可选照片数，默认1张 */
  var count: Double = js.native
  
  /** 相册选取或者拍照，默认 [‘camera’,‘album’] */
  var sourceType: js.Array[ImageSourceType] = js.native
  
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MChooseImageOptions(res: ApFilePaths): Unit = js.native
}
object ChooseImageOptions {
  
  @scala.inline
  def apply(count: Double, sourceType: js.Array[ImageSourceType], success: ApFilePaths => Unit): ChooseImageOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseImageOptions]
  }
  
  @scala.inline
  implicit class ChooseImageOptionsMutableBuilder[Self <: ChooseImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: js.Array[ImageSourceType]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeVarargs(value: ImageSourceType*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: ApFilePaths => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
