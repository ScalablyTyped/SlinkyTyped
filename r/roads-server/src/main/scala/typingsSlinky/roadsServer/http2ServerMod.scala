package typingsSlinky.roadsServer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.http2Mod.Http2Server
import typingsSlinky.node.http2Mod.ServerHttp2Stream
import typingsSlinky.roads.mod.Response
import typingsSlinky.roads.mod.Road
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object http2ServerMod {
  
  @JSImport("roads-server/types/http2Server", JSImport.Default)
  @js.native
  class default protected () extends Server {
    /**
      * Constructs a new Server object that helps create Roads servers.
      *
      * @param {Road} road The Road that handles all the routes
      */
    def this(road: Road) = this()
  }
  
  @js.native
  trait Server extends StObject {
    
    /**
      * Start the http server. Accepts the same parameters as HttpServer.listen
      *
      * @param {number} port
      * @param {string} hostname
      */
    def listen(port: Double, hostname: String): Http2Server = js.native
    
    /**
      * Standard logic for turning each request into a road request, and communicating the response
      * back to the client
      *
      * @param {ServerHttp2Stream} stream
      * @param {object} headers
      */
    /* protected */ def onStream(stream: ServerHttp2Stream, headers: StringDictionary[js.Any]): Unit = js.native
    
    /**
      * This is the road object that will handle all requests
      * @type {Road}
      */
    var road: Road = js.native
    
    /**
      * Helper function to write a roads Response object to an HTTPResponse object
      *
      * @param {ServerHttp2Stream} stream
      * @param {Response} response
      */
    /* protected */ def sendResponse(stream: ServerHttp2Stream, response: Response): Unit = js.native
    
    /**
      * This is the node.js http2 server from the http2 library.
      * @todo  support HTTPS
      * @type HTTPServer
      */
    var server: Http2Server = js.native
  }
  object Server {
    
    @scala.inline
    def apply(
      listen: (Double, String) => Http2Server,
      onStream: (ServerHttp2Stream, StringDictionary[js.Any]) => Unit,
      road: Road,
      sendResponse: (ServerHttp2Stream, Response) => Unit,
      server: Http2Server
    ): Server = {
      val __obj = js.Dynamic.literal(listen = js.Any.fromFunction2(listen), onStream = js.Any.fromFunction2(onStream), road = road.asInstanceOf[js.Any], sendResponse = js.Any.fromFunction2(sendResponse), server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    @scala.inline
    implicit class ServerMutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListen(value: (Double, String) => Http2Server): Self = StObject.set(x, "listen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStream(value: (ServerHttp2Stream, StringDictionary[js.Any]) => Unit): Self = StObject.set(x, "onStream", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRoad(value: Road): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendResponse(value: (ServerHttp2Stream, Response) => Unit): Self = StObject.set(x, "sendResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setServer(value: Http2Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
