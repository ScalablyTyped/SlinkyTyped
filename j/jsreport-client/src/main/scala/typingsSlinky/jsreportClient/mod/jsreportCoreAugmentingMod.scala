package typingsSlinky.jsreportClient.mod

import typingsSlinky.jsreportClient.anon.PartialRequest
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("jsreport-core", JSImport.Namespace)
@js.native
object jsreportCoreAugmentingMod extends js.Object {
  
  @js.native
  trait Client extends js.Object {
    
    def render(req: PartialRequest): js.Promise[ClientRenderResponse] = js.native
    def render(req: PartialRequest, options: js.Object): js.Promise[ClientRenderResponse] = js.native
  }
  
  @js.native
  trait ClientRenderResponse extends ServerResponse {
    
    def body(): js.Promise[Buffer] = js.native
  }
}
