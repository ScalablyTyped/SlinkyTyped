package typingsSlinky.awsSdkNodeHttpHandler.nodeHttp2HandlerMod

import typingsSlinky.awsSdkNodeHttpHandler.anon.HandlerProtocol
import typingsSlinky.awsSdkNodeHttpHandler.anon.Response
import typingsSlinky.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typingsSlinky.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.transferMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-http-handler/dist/cjs/node-http2-handler", "NodeHttp2Handler")
@js.native
class NodeHttp2Handler () extends RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
  def this(http2Options: NodeHttp2Options) = this()
  
  val connectionPool: js.Any = js.native
  
  @JSName("destroy")
  def destroy_MNodeHttp2Handler(): Unit = js.native
  
  var getSession: js.Any = js.native
  
  def handle(request: typingsSlinky.awsSdkProtocolHttp.mod.HttpRequest, hasAbortSignal: HttpHandlerOptions): js.Promise[Response] = js.native
  
  val http2Options: js.Any = js.native
  
  @JSName("metadata")
  val metadata_NodeHttp2Handler: HandlerProtocol = js.native
}
