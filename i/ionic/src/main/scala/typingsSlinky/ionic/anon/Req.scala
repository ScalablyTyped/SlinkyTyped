package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.SuperAgentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Req extends StObject {
  
  var req: SuperAgentRequest = js.native
}
object Req {
  
  @scala.inline
  def apply(req: SuperAgentRequest): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  
  @scala.inline
  implicit class ReqMutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReq(value: SuperAgentRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
