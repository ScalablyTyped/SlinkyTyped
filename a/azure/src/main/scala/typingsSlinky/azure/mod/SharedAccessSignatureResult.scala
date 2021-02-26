package typingsSlinky.azure.mod

import typingsSlinky.azure.anon.Se
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedAccessSignatureResult extends StObject {
  
  var baseUrl: String = js.native
  
  var path: String = js.native
  
  var queryString: Se = js.native
  
  def url(): String = js.native
}
object SharedAccessSignatureResult {
  
  @scala.inline
  def apply(baseUrl: String, path: String, queryString: Se, url: () => String): SharedAccessSignatureResult = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[SharedAccessSignatureResult]
  }
  
  @scala.inline
  implicit class SharedAccessSignatureResultMutableBuilder[Self <: SharedAccessSignatureResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: Se): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: () => String): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
  }
}
