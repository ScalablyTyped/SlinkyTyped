package typingsSlinky.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseUrl extends StObject {
  
  var baseUrl: String = js.native
  
  var customHeaders: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
}
object BaseUrl {
  
  @scala.inline
  def apply(baseUrl: String): BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
  
  @scala.inline
  implicit class BaseUrlMutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
  }
}
