package typingsSlinky.ionic.anon

import typingsSlinky.ionic.httpMod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReqSuperAgentRequest extends StObject {
  
  var req: SuperAgentRequest = js.native
}
object ReqSuperAgentRequest {
  
  @scala.inline
  def apply(req: SuperAgentRequest): ReqSuperAgentRequest = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqSuperAgentRequest]
  }
  
  @scala.inline
  implicit class ReqSuperAgentRequestMutableBuilder[Self <: ReqSuperAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReq(value: SuperAgentRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
