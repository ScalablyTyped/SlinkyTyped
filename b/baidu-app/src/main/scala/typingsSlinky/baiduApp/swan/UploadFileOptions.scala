package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 上传下载
@js.native
trait UploadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 要上传文件资源的路径 */
  var filePath: String = js.native
  
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[js.Any] = js.native
  
  /** HTTP 请求 Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.native
  
  /** 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var name: String = js.native
  
  /** 开发者服务器 url */
  var url: String = js.native
}
object UploadFileOptions {
  
  @scala.inline
  def apply(filePath: String, name: String, url: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  
  @scala.inline
  implicit class UploadFileOptionsMutableBuilder[Self <: UploadFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setHeader(value: RequestHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
