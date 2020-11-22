package typingsSlinky.awsSdkNodeHttpHandler

import typingsSlinky.awsSdkNodeHttpHandler.nodeHttp2HandlerMod.NodeHttp2Options
import typingsSlinky.awsSdkNodeHttpHandler.nodeHttpHandlerMod.NodeHttpOptions
import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-http-handler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val streamCollector: StreamCollector = js.native
  
  @js.native
  class NodeHttp2Handler ()
    extends typingsSlinky.awsSdkNodeHttpHandler.nodeHttp2HandlerMod.NodeHttp2Handler {
    def this(http2Options: NodeHttp2Options) = this()
  }
  
  @js.native
  class NodeHttpHandler ()
    extends typingsSlinky.awsSdkNodeHttpHandler.nodeHttpHandlerMod.NodeHttpHandler {
    def this(hasConnectionTimeoutSocketTimeoutHttpAgentHttpsAgent: NodeHttpOptions) = this()
  }
}
