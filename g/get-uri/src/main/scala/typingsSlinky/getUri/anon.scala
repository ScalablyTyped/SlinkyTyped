package typingsSlinky.getUri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.getUri.fileMod.FileReadable
import typingsSlinky.getUri.httpMod.HttpOrHttpsModule
import typingsSlinky.node.anon.AutoClose
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.RequestListener
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.httpMod.Server
import typingsSlinky.node.httpMod.ServerOptions
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cache extends StObject {
    
    var cache: js.UndefOr[FileReadable] = js.native
  }
  object Cache {
    
    @scala.inline
    def apply(): Cache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: FileReadable): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): ReadStream = js.native
    def apply(path: PathLike, options: String): ReadStream = js.native
    def apply(path: PathLike, options: AutoClose): ReadStream = js.native
  }
  
  @js.native
  trait Typeofhttp extends HttpOrHttpsModule {
    
    var Agent: Instantiable0[typingsSlinky.node.httpMod.Agent] = js.native
    
    // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
    var ClientRequest: Instantiable1[/* url */ String, typingsSlinky.node.httpMod.ClientRequest] = js.native
    
    var IncomingMessage: Instantiable1[/* socket */ Socket, typingsSlinky.node.httpMod.IncomingMessage] = js.native
    
    val METHODS: js.Array[String] = js.native
    
    // https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
    var OutgoingMessage: Instantiable0[typingsSlinky.node.httpMod.OutgoingMessage] = js.native
    
    val STATUS_CODES: js.Any = js.native
    
    var Server: Instantiable0[typingsSlinky.node.httpMod.Server] = js.native
    
    // https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
    var ServerResponse: Instantiable1[/* req */ IncomingMessage, typingsSlinky.node.httpMod.ServerResponse] = js.native
    
    def createServer(): Server = js.native
    def createServer(options: ServerOptions): Server = js.native
    def createServer(options: ServerOptions, requestListener: RequestListener): Server = js.native
    def createServer(requestListener: RequestListener): Server = js.native
    
    def get(options: String): ClientRequest = js.native
    def get(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def get(options: RequestOptions): ClientRequest = js.native
    def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def get(options: URL_): ClientRequest = js.native
    def get(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def get(url: String, options: RequestOptions): ClientRequest = js.native
    def get(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def get(url: URL_, options: RequestOptions): ClientRequest = js.native
    def get(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    
    var globalAgent: Agent = js.native
    
    /**
      * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
      * Defaults to 16KB. Configurable using the [`--max-http-header-size`][] CLI option.
      */
    val maxHeaderSize: Double = js.native
    
    def request(options: String): ClientRequest = js.native
    def request(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def request(options: RequestOptions): ClientRequest = js.native
    def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def request(options: URL_): ClientRequest = js.native
    def request(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def request(url: String, options: RequestOptions): ClientRequest = js.native
    def request(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def request(url: URL_, options: RequestOptions): ClientRequest = js.native
    def request(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  }
  
  @js.native
  trait Typeofhttps extends HttpOrHttpsModule {
    
    var Agent: Instantiable0[typingsSlinky.node.httpsMod.Agent] = js.native
    
    var Server: Instantiable0[typingsSlinky.node.httpsMod.Server] = js.native
    
    def createServer(): typingsSlinky.node.httpsMod.Server = js.native
    def createServer(options: typingsSlinky.node.httpsMod.ServerOptions): typingsSlinky.node.httpsMod.Server = js.native
    def createServer(options: typingsSlinky.node.httpsMod.ServerOptions, requestListener: RequestListener): typingsSlinky.node.httpsMod.Server = js.native
    def createServer(requestListener: RequestListener): typingsSlinky.node.httpsMod.Server = js.native
    
    def get(options: String): ClientRequest = js.native
    def get(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def get(options: typingsSlinky.node.httpsMod.RequestOptions): ClientRequest = js.native
    def get(
      options: typingsSlinky.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ IncomingMessage, Unit]
    ): ClientRequest = js.native
    def get(options: URL_): ClientRequest = js.native
    def get(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def get(url: String, options: typingsSlinky.node.httpsMod.RequestOptions): ClientRequest = js.native
    def get(
      url: String,
      options: typingsSlinky.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ IncomingMessage, Unit]
    ): ClientRequest = js.native
    def get(url: URL_, options: typingsSlinky.node.httpsMod.RequestOptions): ClientRequest = js.native
    def get(
      url: URL_,
      options: typingsSlinky.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ IncomingMessage, Unit]
    ): ClientRequest = js.native
    
    var globalAgent: typingsSlinky.node.httpsMod.Agent = js.native
    
    def request(options: String): ClientRequest = js.native
    def request(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def request(options: typingsSlinky.node.httpsMod.RequestOptions): ClientRequest = js.native
    def request(
      options: typingsSlinky.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ IncomingMessage, Unit]
    ): ClientRequest = js.native
    def request(options: URL_): ClientRequest = js.native
    def request(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def request(url: String, options: typingsSlinky.node.httpsMod.RequestOptions): ClientRequest = js.native
    def request(
      url: String,
      options: typingsSlinky.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ IncomingMessage, Unit]
    ): ClientRequest = js.native
    def request(url: URL_, options: typingsSlinky.node.httpsMod.RequestOptions): ClientRequest = js.native
    def request(
      url: URL_,
      options: typingsSlinky.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ IncomingMessage, Unit]
    ): ClientRequest = js.native
  }
}
