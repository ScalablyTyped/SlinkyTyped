package typingsSlinky.nextAuth.anon

import typingsSlinky.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Req extends StObject {
  
  var req: IncomingMessage = js.native
}
object Req {
  
  @scala.inline
  def apply(req: IncomingMessage): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  
  @scala.inline
  implicit class ReqMutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
