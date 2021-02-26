package typingsSlinky.chrome.chrome.declarativeWebRequest

import typingsSlinky.chrome.chrome.events.UrlFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMatcher extends StObject {
  
  var contentType: js.UndefOr[js.Array[String]] = js.native
  
  var excludeContentType: js.UndefOr[js.Array[String]] = js.native
  
  var excludeResponseHeader: js.UndefOr[js.Array[HeaderFilter]] = js.native
  
  var resourceType: js.UndefOr[String] = js.native
  
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  
  var url: js.UndefOr[UrlFilter] = js.native
}
object RequestMatcher {
  
  @scala.inline
  def apply(): RequestMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMatcher]
  }
  
  @scala.inline
  implicit class RequestMatcherMutableBuilder[Self <: RequestMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: js.Array[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentTypeVarargs(value: String*): Self = StObject.set(x, "contentType", js.Array(value :_*))
    
    @scala.inline
    def setExcludeContentType(value: js.Array[String]): Self = StObject.set(x, "excludeContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeContentTypeUndefined: Self = StObject.set(x, "excludeContentType", js.undefined)
    
    @scala.inline
    def setExcludeContentTypeVarargs(value: String*): Self = StObject.set(x, "excludeContentType", js.Array(value :_*))
    
    @scala.inline
    def setExcludeResponseHeader(value: js.Array[HeaderFilter]): Self = StObject.set(x, "excludeResponseHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeResponseHeaderUndefined: Self = StObject.set(x, "excludeResponseHeader", js.undefined)
    
    @scala.inline
    def setExcludeResponseHeaderVarargs(value: HeaderFilter*): Self = StObject.set(x, "excludeResponseHeader", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setResponseHeaders(value: js.Array[HeaderFilter]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setResponseHeadersVarargs(value: HeaderFilter*): Self = StObject.set(x, "responseHeaders", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: UrlFilter): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
