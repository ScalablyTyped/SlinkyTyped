package typingsSlinky.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDetails extends StObject {
  
  var form: js.Object = js.native
  
  var headers: js.Object = js.native
  
  var hostName: String = js.native
  
  var httpMethod: String = js.native
  
  var ipAddress: String = js.native
  
  var queryString: js.Object = js.native
  
  var url: String = js.native
}
object RequestDetails {
  
  @scala.inline
  def apply(
    form: js.Object,
    headers: js.Object,
    hostName: String,
    httpMethod: String,
    ipAddress: String,
    queryString: js.Object,
    url: String
  ): RequestDetails = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetails]
  }
  
  @scala.inline
  implicit class RequestDetailsMutableBuilder[Self <: RequestDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: js.Object): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
