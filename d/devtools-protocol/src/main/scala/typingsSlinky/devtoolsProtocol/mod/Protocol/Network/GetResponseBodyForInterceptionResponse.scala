package typingsSlinky.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResponseBodyForInterceptionResponse extends StObject {
  
  /**
    * True, if content was sent as base64.
    */
  var base64Encoded: Boolean = js.native
  
  /**
    * Response body.
    */
  var body: String = js.native
}
object GetResponseBodyForInterceptionResponse {
  
  @scala.inline
  def apply(base64Encoded: Boolean, body: String): GetResponseBodyForInterceptionResponse = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseBodyForInterceptionResponse]
  }
  
  @scala.inline
  implicit class GetResponseBodyForInterceptionResponseMutableBuilder[Self <: GetResponseBodyForInterceptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase64Encoded(value: Boolean): Self = StObject.set(x, "base64Encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
