package typingsSlinky.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonRequestParams extends StObject {
  
  var body: js.Object = js.native
  
  var headers: js.Object = js.native
  
  var ip: String = js.native
  
  var method: String = js.native
  
  var path: String = js.native
  
  var query: js.Object = js.native
}
object CommonRequestParams {
  
  @scala.inline
  def apply(body: js.Object, headers: js.Object, ip: String, method: String, path: String, query: js.Object): CommonRequestParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonRequestParams]
  }
  
  @scala.inline
  implicit class CommonRequestParamsMutableBuilder[Self <: CommonRequestParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
