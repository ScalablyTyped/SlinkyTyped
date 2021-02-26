package typingsSlinky.awsSdkNodeHttpHandler

import typingsSlinky.awsSdkNodeHttpHandler.anon.HandlerProtocol
import typingsSlinky.awsSdkNodeHttpHandler.anon.Response
import typingsSlinky.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typingsSlinky.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.transferMod.RequestHandler
import typingsSlinky.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHttpHandlerMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist/cjs/node-http-handler", "NodeHttpHandler")
  @js.native
  class NodeHttpHandler () extends RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(hasConnectionTimeoutSocketTimeoutHttpAgentHttpsAgent: NodeHttpOptions) = this()
    
    val connectionTimeout: js.Any = js.native
    
    @JSName("destroy")
    def destroy_MNodeHttpHandler(): Unit = js.native
    
    def handle(request: typingsSlinky.awsSdkProtocolHttp.mod.HttpRequest, hasAbortSignal: HttpHandlerOptions): js.Promise[Response] = js.native
    
    val httpAgent: js.Any = js.native
    
    val httpsAgent: js.Any = js.native
    
    @JSName("metadata")
    val metadata_NodeHttpHandler: HandlerProtocol = js.native
    
    val socketTimeout: js.Any = js.native
  }
  
  @js.native
  trait NodeHttpOptions extends StObject {
    
    /**
      * The maximum time in milliseconds that the connection phase of a request
      * may take before the connection attempt is abandoned.
      */
    var connectionTimeout: js.UndefOr[Double] = js.native
    
    var httpAgent: js.UndefOr[Agent] = js.native
    
    var httpsAgent: js.UndefOr[typingsSlinky.node.httpsMod.Agent] = js.native
    
    /**
      * The maximum time in milliseconds that a socket may remain idle before it
      * is closed.
      */
    var socketTimeout: js.UndefOr[Double] = js.native
  }
  object NodeHttpOptions {
    
    @scala.inline
    def apply(): NodeHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeHttpOptions]
    }
    
    @scala.inline
    implicit class NodeHttpOptionsMutableBuilder[Self <: NodeHttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      @scala.inline
      def setHttpsAgent(value: typingsSlinky.node.httpsMod.Agent): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      @scala.inline
      def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
}
