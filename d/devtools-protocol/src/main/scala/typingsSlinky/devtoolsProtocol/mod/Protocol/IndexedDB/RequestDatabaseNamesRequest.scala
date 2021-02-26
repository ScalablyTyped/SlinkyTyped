package typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDatabaseNamesRequest extends StObject {
  
  /**
    * Security origin.
    */
  var securityOrigin: String = js.native
}
object RequestDatabaseNamesRequest {
  
  @scala.inline
  def apply(securityOrigin: String): RequestDatabaseNamesRequest = {
    val __obj = js.Dynamic.literal(securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseNamesRequest]
  }
  
  @scala.inline
  implicit class RequestDatabaseNamesRequestMutableBuilder[Self <: RequestDatabaseNamesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
  }
}
