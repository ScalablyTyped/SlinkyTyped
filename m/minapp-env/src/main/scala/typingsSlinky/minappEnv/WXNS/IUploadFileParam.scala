package typingsSlinky.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUploadFileParam extends IAPIParam[IUploadFileSuccessResult] {
  
  var filePath: String = js.native
  
  var header: js.UndefOr[AnyObject] = js.native
  
  var name: String = js.native
  
  var url: String = js.native
}
object IUploadFileParam {
  
  @scala.inline
  def apply(filePath: String, name: String, url: String): IUploadFileParam = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUploadFileParam]
  }
  
  @scala.inline
  implicit class IUploadFileParamMutableBuilder[Self <: IUploadFileParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
