package typingsSlinky.cyberblastWebserver

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cyberblastLogger.mod.Logger
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cyberblast/webserver", "WebServer")
  @js.native
  class WebServer () extends StObject {
    def this(webConfigFile: String) = this()
    def this(webConfigFile: js.UndefOr[scala.Nothing], logConfigFile: String) = this()
    def this(webConfigFile: String, logConfigFile: String) = this()
    
    def respondError(error: String, context: ServerContext): js.Promise[Unit] = js.native
    def respondError(error: String, context: ServerContext, code: js.UndefOr[scala.Nothing], message: String): js.Promise[Unit] = js.native
    def respondError(error: String, context: ServerContext, code: Double): js.Promise[Unit] = js.native
    def respondError(error: String, context: ServerContext, code: Double, message: String): js.Promise[Unit] = js.native
    def respondError(error: js.Error, context: ServerContext): js.Promise[Unit] = js.native
    def respondError(error: js.Error, context: ServerContext, code: js.UndefOr[scala.Nothing], message: String): js.Promise[Unit] = js.native
    def respondError(error: js.Error, context: ServerContext, code: Double): js.Promise[Unit] = js.native
    def respondError(error: js.Error, context: ServerContext, code: Double, message: String): js.Promise[Unit] = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait ServerContext extends StObject {
    
    var client: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[String | Buffer] = js.native
    
    var logger: js.UndefOr[Logger] = js.native
    
    var request: IncomingMessage = js.native
    
    var response: ServerResponse = js.native
    
    var route: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var server: WebServer = js.native
  }
  object ServerContext {
    
    @scala.inline
    def apply(request: IncomingMessage, response: ServerResponse, server: WebServer): ServerContext = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerContext]
    }
    
    @scala.inline
    implicit class ServerContextMutableBuilder[Self <: ServerContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setRequest(value: IncomingMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: ServerResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: StringDictionary[js.Any]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      @scala.inline
      def setServer(value: WebServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
