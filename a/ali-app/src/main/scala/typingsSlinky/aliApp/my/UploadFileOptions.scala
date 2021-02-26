package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppStrings.audio
import typingsSlinky.aliApp.aliAppStrings.image
import typingsSlinky.aliApp.aliAppStrings.video
import typingsSlinky.aliApp.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 文件名，即对应的 key, 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var fileName: String = js.native
  
  /** 要上传文件资源的本地定位符 */
  var filePath: String = js.native
  
  /**
    * 文件类型
    */
  var fileType: image | video | audio = js.native
  
  /** HTTP 请求中其他额外的 form 数据 */
  var formData: js.UndefOr[js.Any] = js.native
  
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.native
  
  @JSName("success")
  var success_UploadFileOptions: js.UndefOr[js.Function1[/* res */ Data, Unit]] = js.native
  
  /** 开发者服务器地址 */
  var url: String = js.native
}
object UploadFileOptions {
  
  @scala.inline
  def apply(fileName: String, filePath: String, fileType: image | video | audio, url: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  
  @scala.inline
  implicit class UploadFileOptionsMutableBuilder[Self <: UploadFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileType(value: image | video | audio): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setHeader(value: RequestHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ Data => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
