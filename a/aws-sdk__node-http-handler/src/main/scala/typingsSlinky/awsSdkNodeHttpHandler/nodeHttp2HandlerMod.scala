package typingsSlinky.awsSdkNodeHttpHandler

import typingsSlinky.awsSdkNodeHttpHandler.anon.HandlerProtocol
import typingsSlinky.awsSdkNodeHttpHandler.anon.Response
import typingsSlinky.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typingsSlinky.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.transferMod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHttp2HandlerMod {
  
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
  
  @js.native
  trait NodeHttp2Options extends StObject {
    
    /**
      * The maximum time in milliseconds that a stream may remain idle before it
      * is closed.
      */
    var requestTimeout: js.UndefOr[Double] = js.native
    
    /**
      * The maximum time in milliseconds that a session or socket may remain idle
      * before it is closed.
      * https://nodejs.org/docs/latest-v12.x/api/http2.html#http2_http2session_and_sockets
      */
    var sessionTimeout: js.UndefOr[Double] = js.native
  }
  object NodeHttp2Options {
    
    @scala.inline
    def apply(): NodeHttp2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeHttp2Options]
    }
    
    @scala.inline
    implicit class NodeHttp2OptionsMutableBuilder[Self <: NodeHttp2Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    }
  }
}
