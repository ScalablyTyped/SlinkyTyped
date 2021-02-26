package typingsSlinky.connect

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new connect server.
    * @public
    */
  @JSImport("connect", JSImport.Namespace)
  @js.native
  def apply(): Server = js.native
  
  @JSImport("connect", "IncomingMessage")
  @js.native
  class IncomingMessage protected ()
    extends typingsSlinky.node.httpMod.IncomingMessage {
    def this(socket: Socket) = this()
    
    var originalUrl: js.UndefOr[String] = js.native
  }
  
  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ NextFunction, 
    Unit
  ]
  
  type HandleFunction = SimpleHandleFunction | NextHandleFunction | ErrorHandleFunction
  
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  
  type NextHandleFunction = js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction, Unit]
  
  @js.native
  trait Server extends EventEmitter {
    
    def apply(req: typingsSlinky.node.httpMod.IncomingMessage, res: ServerResponse): Unit = js.native
    def apply(req: typingsSlinky.node.httpMod.IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
    
    /**
      * Handle server requests, punting them down
      * the middleware stack.
      *
      * @private
      */
    def handle(req: typingsSlinky.node.httpMod.IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
    
    def listen(handle: js.Any): typingsSlinky.node.httpMod.Server = js.native
    def listen(handle: js.Any, listeningListener: js.Function): typingsSlinky.node.httpMod.Server = js.native
    def listen(path: String): typingsSlinky.node.httpMod.Server = js.native
    def listen(path: String, callback: js.Function): typingsSlinky.node.httpMod.Server = js.native
    /**
      * Listen for connections.
      *
      * This method takes the same arguments
      * as node's `http.Server#listen()`.
      *
      * HTTP and HTTPS:
      *
      * If you run your application both as HTTP
      * and HTTPS you may wrap them individually,
      * since your Connect "server" is really just
      * a JavaScript `Function`.
      *
      *      var connect = require('connect')
      *        , http = require('http')
      *        , https = require('https');
      *
      *      var app = connect();
      *
      *      http.createServer(app).listen(80);
      *      https.createServer(options, app).listen(443);
      *
      * @api public
      */
    def listen(port: Double): typingsSlinky.node.httpMod.Server = js.native
    def listen(
      port: Double,
      hostname: js.UndefOr[scala.Nothing],
      backlog: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: js.UndefOr[scala.Nothing], backlog: Double): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: js.UndefOr[scala.Nothing], backlog: Double, callback: js.Function): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: js.UndefOr[scala.Nothing], callback: js.Function): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String, backlog: js.UndefOr[scala.Nothing], callback: js.Function): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String, backlog: Double): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String, backlog: Double, callback: js.Function): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String, callback: js.Function): typingsSlinky.node.httpMod.Server = js.native
    
    var route: String = js.native
    
    var stack: js.Array[ServerStackItem] = js.native
    
    /**
      * Utilize the given middleware `handle` to the given `route`,
      * defaulting to _/_. This "route" is the mount-point for the
      * middleware, when given a value other than _/_ the middleware
      * is only effective when that segment is present in the request's
      * pathname.
      *
      * For example if we were to mount a function at _/admin_, it would
      * be invoked on _/admin_, and _/admin/settings_, however it would
      * not be invoked for _/_, or _/posts_.
      *
      * @public
      */
    def use(fn: HandleFunction): Server = js.native
    def use(route: String, fn: HandleFunction): Server = js.native
  }
  
  type ServerHandle = HandleFunction | typingsSlinky.node.httpMod.Server
  
  @js.native
  trait ServerStackItem extends StObject {
    
    var handle: ServerHandle = js.native
    
    var route: String = js.native
  }
  object ServerStackItem {
    
    @scala.inline
    def apply(handle: ServerHandle, route: String): ServerStackItem = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerStackItem]
    }
    
    @scala.inline
    implicit class ServerStackItemMutableBuilder[Self <: ServerStackItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: ServerHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleFunction2(value: (/* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleFunction3(value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction) => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHandleFunction4(
        value: (/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction) => Unit
      ): Self = StObject.set(x, "handle", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleHandleFunction = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]
}
