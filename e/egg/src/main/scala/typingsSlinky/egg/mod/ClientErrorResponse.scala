package typingsSlinky.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientErrorResponse extends StObject {
  
  var body: String | Buffer = js.native
  
  var headers: StringDictionary[String] = js.native
  
  var status: Double = js.native
}
object ClientErrorResponse {
  
  @scala.inline
  def apply(body: String | Buffer, headers: StringDictionary[String], status: Double): ClientErrorResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientErrorResponse]
  }
  
  @scala.inline
  implicit class ClientErrorResponseMutableBuilder[Self <: ClientErrorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
