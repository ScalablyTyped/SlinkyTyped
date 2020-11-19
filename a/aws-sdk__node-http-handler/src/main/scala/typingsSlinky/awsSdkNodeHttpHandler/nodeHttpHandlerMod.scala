package typingsSlinky.awsSdkNodeHttpHandler

import typingsSlinky.awsSdkTypes.httpMod.HttpHandler
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-http-handler/build/node-http-handler", JSImport.Namespace)
@js.native
object nodeHttpHandlerMod extends js.Object {
  
  @js.native
  class NodeHttpHandler () extends HttpHandler[Readable, NodeHttpOptions] {
    def this(httpOptions: NodeHttpOptions) = this()
    
    val httpOptions: js.Any = js.native
  }
}
