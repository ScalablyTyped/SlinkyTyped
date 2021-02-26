package typingsSlinky.followRedirects

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.followRedirects.mod.FollowOptions
import typingsSlinky.followRedirects.mod.FollowResponse
import typingsSlinky.followRedirects.mod.RedirectableRequest
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined follow-redirects.follow-redirects.Override<{readonly request (options : node.http.RequestOptions): node.http.ClientRequest, readonly request (options : string): node.http.ClientRequest, readonly request (options : node.url.URL): node.http.ClientRequest, readonly request (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest,   IncomingMessage :new (socket : node.net.Socket): node.http.IncomingMessage,   ServerResponse :new (req : node.http.IncomingMessage): node.http.ServerResponse, readonly get (options : node.http.RequestOptions): node.http.ClientRequest, readonly get (options : string): node.http.ClientRequest, readonly get (options : node.url.URL): node.http.ClientRequest, readonly get (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly createServer (): node.http.Server, readonly createServer (requestListener : node.http.RequestListener): node.http.Server, readonly createServer (options : node.http.ServerOptions): node.http.Server, readonly createServer (options : node.http.ServerOptions, requestListener : node.http.RequestListener): node.http.Server,  readonly STATUS_CODES,   Agent :new (): node.http.Agent,  readonly maxHeaderSize :number,   ClientRequest :new (url : string): node.http.ClientRequest,   OutgoingMessage :new (): node.http.OutgoingMessage,   Server :new (): node.http.Server,   globalAgent :node.http.Agent,  readonly METHODS :std.Array<string>}, follow-redirects.follow-redirects.RedirectScheme<node.http.RequestOptions, node.http.ClientRequest, node.http.IncomingMessage>> */
object httpMod {
  
  @JSImport("follow-redirects/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "Agent")
  @js.native
  class Agent ()
    extends typingsSlinky.node.httpMod.Agent
  @JSImport("follow-redirects/http", "Agent")
  @js.native
  def Agent: Instantiable0[typingsSlinky.node.httpMod.Agent] = js.native
  @scala.inline
  def Agent_=(x: Instantiable0[typingsSlinky.node.httpMod.Agent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Agent")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "ClientRequest")
  @js.native
  class ClientRequest protected ()
    extends typingsSlinky.node.httpMod.ClientRequest {
    def this(url: String) = this()
  }
  @JSImport("follow-redirects/http", "ClientRequest")
  @js.native
  def ClientRequest: Instantiable1[/* url */ String, typingsSlinky.node.httpMod.ClientRequest] = js.native
  @scala.inline
  def ClientRequest_=(x: Instantiable1[/* url */ String, typingsSlinky.node.httpMod.ClientRequest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientRequest")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "IncomingMessage")
  @js.native
  class IncomingMessage protected ()
    extends typingsSlinky.node.httpMod.IncomingMessage {
    def this(socket: Socket) = this()
  }
  @JSImport("follow-redirects/http", "IncomingMessage")
  @js.native
  def IncomingMessage: Instantiable1[/* socket */ Socket, typingsSlinky.node.httpMod.IncomingMessage] = js.native
  @scala.inline
  def IncomingMessage_=(x: Instantiable1[/* socket */ Socket, typingsSlinky.node.httpMod.IncomingMessage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncomingMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "METHODS")
  @js.native
  def METHODS: js.Array[String] = js.native
  @scala.inline
  def METHODS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METHODS")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "OutgoingMessage")
  @js.native
  class OutgoingMessage ()
    extends typingsSlinky.node.httpMod.OutgoingMessage
  @JSImport("follow-redirects/http", "OutgoingMessage")
  @js.native
  def OutgoingMessage: Instantiable0[typingsSlinky.node.httpMod.OutgoingMessage] = js.native
  @scala.inline
  def OutgoingMessage_=(x: Instantiable0[typingsSlinky.node.httpMod.OutgoingMessage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OutgoingMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "STATUS_CODES")
  @js.native
  def STATUS_CODES: js.Any = js.native
  @scala.inline
  def STATUS_CODES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_CODES")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "Server")
  @js.native
  class Server ()
    extends typingsSlinky.node.httpMod.Server
  @JSImport("follow-redirects/http", "Server")
  @js.native
  def Server: Instantiable0[typingsSlinky.node.httpMod.Server] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "ServerResponse")
  @js.native
  class ServerResponse protected ()
    extends typingsSlinky.node.httpMod.ServerResponse {
    def this(req: typingsSlinky.node.httpMod.IncomingMessage) = this()
  }
  @JSImport("follow-redirects/http", "ServerResponse")
  @js.native
  def ServerResponse: Instantiable1[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    typingsSlinky.node.httpMod.ServerResponse
  ] = js.native
  @scala.inline
  def ServerResponse_=(
    x: Instantiable1[
      /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
      typingsSlinky.node.httpMod.ServerResponse
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerResponse")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Server_=(x: Instantiable0[typingsSlinky.node.httpMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "createServer")
  @js.native
  def createServer(): typingsSlinky.node.httpMod.Server = js.native
  @JSImport("follow-redirects/http", "createServer")
  @js.native
  def createServer_FhttpMod: js.Function0[typingsSlinky.node.httpMod.Server] = js.native
  
  @scala.inline
  def createServer_FhttpMod_=(x: js.Function0[typingsSlinky.node.httpMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createServer")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "get")
  @js.native
  def get(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  @JSImport("follow-redirects/http", "get")
  @js.native
  def get(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsSlinky.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  @JSImport("follow-redirects/http", "get")
  @js.native
  def get(options: String): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  @JSImport("follow-redirects/http", "get")
  @js.native
  def get(
    options: String,
    callback: js.Function1[/* res */ typingsSlinky.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  
  @JSImport("follow-redirects/http", "globalAgent")
  @js.native
  def globalAgent: typingsSlinky.node.httpMod.Agent = js.native
  @scala.inline
  def globalAgent_=(x: typingsSlinky.node.httpMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "maxHeaderSize")
  @js.native
  def maxHeaderSize: Double = js.native
  @scala.inline
  def maxHeaderSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderSize")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "request")
  @js.native
  def request(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  @JSImport("follow-redirects/http", "request")
  @js.native
  def request(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsSlinky.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  @JSImport("follow-redirects/http", "request")
  @js.native
  def request(options: String): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  @JSImport("follow-redirects/http", "request")
  @js.native
  def request(
    options: String,
    callback: js.Function1[/* res */ typingsSlinky.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
}
