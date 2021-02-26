package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var filePath: String = js.native
  
  // 视频文件路径，可以是临时文件路径也可以是永久文件路径
  @JSName("success")
  def success_MSaveVideoOptions(errMsg: String): Unit = js.native
}
object SaveVideoOptions {
  
  @scala.inline
  def apply(filePath: String, success: String => Unit): SaveVideoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[SaveVideoOptions]
  }
  
  @scala.inline
  implicit class SaveVideoOptionsMutableBuilder[Self <: SaveVideoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: String => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
