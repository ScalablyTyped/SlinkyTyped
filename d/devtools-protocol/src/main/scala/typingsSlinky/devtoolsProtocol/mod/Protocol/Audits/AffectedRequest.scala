package typingsSlinky.devtoolsProtocol.mod.Protocol.Audits

import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.RequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffectedRequest extends StObject {
  
  /**
    * The unique request id.
    */
  var requestId: RequestId = js.native
  
  var url: js.UndefOr[String] = js.native
}
object AffectedRequest {
  
  @scala.inline
  def apply(requestId: RequestId): AffectedRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffectedRequest]
  }
  
  @scala.inline
  implicit class AffectedRequestMutableBuilder[Self <: AffectedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
