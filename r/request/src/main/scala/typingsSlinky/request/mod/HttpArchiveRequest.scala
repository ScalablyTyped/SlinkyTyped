package typingsSlinky.request.mod

import typingsSlinky.request.anon.MimeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpArchiveRequest extends StObject {
  
  var headers: js.UndefOr[js.Array[NameValuePair]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var postData: js.UndefOr[MimeType] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object HttpArchiveRequest {
  
  @scala.inline
  def apply(): HttpArchiveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpArchiveRequest]
  }
  
  @scala.inline
  implicit class HttpArchiveRequestMutableBuilder[Self <: HttpArchiveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Array[NameValuePair]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: NameValuePair*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPostData(value: MimeType): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
