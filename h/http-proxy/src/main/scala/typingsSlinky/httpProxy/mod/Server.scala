package typingsSlinky.httpProxy.mod

import typingsSlinky.httpProxy.httpProxyStrings.close
import typingsSlinky.httpProxy.httpProxyStrings.econnreset
import typingsSlinky.httpProxy.httpProxyStrings.end
import typingsSlinky.httpProxy.httpProxyStrings.error
import typingsSlinky.httpProxy.httpProxyStrings.proxyReq
import typingsSlinky.httpProxy.httpProxyStrings.proxyReqWs
import typingsSlinky.httpProxy.httpProxyStrings.proxyRes
import typingsSlinky.httpProxy.httpProxyStrings.start
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends EventEmitter {
  
  def addListener(event: String, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * A function that closes the inner webserver and stops listening on given port
    */
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * A function that wraps the object in a webserver, for your convenience
    * @param port - Port to listen on
    */
  def listen(port: Double): Server = js.native
  
  def on(event: String, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_close(
    event: close,
    listener: js.Function3[/* proxyRes */ IncomingMessage, /* proxySocket */ Socket, /* proxyHead */ js.Any, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_econnreset(
    event: econnreset,
    listener: js.Function4[
      /* err */ js.Error, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* target */ ProxyTargetUrl, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_end(
    event: end,
    listener: js.Function3[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* proxyRes */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: ErrorCallback): this.type = js.native
  @JSName("on")
  def on_proxyReq(
    event: proxyReq,
    listener: js.Function4[
      /* proxyReq */ ClientRequest, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* options */ ServerOptions, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_proxyReqWs(
    event: proxyReqWs,
    listener: js.Function5[
      /* proxyReq */ ClientRequest, 
      /* req */ IncomingMessage, 
      /* socket */ Socket, 
      /* options */ ServerOptions, 
      /* head */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_proxyRes(
    event: proxyRes,
    listener: js.Function3[
      /* proxyRes */ IncomingMessage, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_start(
    event: start,
    listener: js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* target */ ProxyTargetUrl, Unit]
  ): this.type = js.native
  
  def once(event: String, listener: js.Function0[Unit]): this.type = js.native
  
  def removeListener(event: String, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Used for proxying regular HTTP(S) requests
    * @param req - Client request.
    * @param res - Client response.
    * @param options - Additionnal options.
    */
  def web(req: IncomingMessage, res: ServerResponse): Unit = js.native
  def web(
    req: IncomingMessage,
    res: ServerResponse,
    options: js.UndefOr[scala.Nothing],
    callback: ErrorCallback
  ): Unit = js.native
  def web(req: IncomingMessage, res: ServerResponse, options: ServerOptions): Unit = js.native
  def web(req: IncomingMessage, res: ServerResponse, options: ServerOptions, callback: ErrorCallback): Unit = js.native
  
  /**
    * Used for proxying regular HTTP(S) requests
    * @param req - Client request.
    * @param socket - Client socket.
    * @param head - Client head.
    * @param options - Additionnal options.
    */
  def ws(req: IncomingMessage, socket: js.Any, head: js.Any): Unit = js.native
  def ws(
    req: IncomingMessage,
    socket: js.Any,
    head: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: ErrorCallback
  ): Unit = js.native
  def ws(req: IncomingMessage, socket: js.Any, head: js.Any, options: ServerOptions): Unit = js.native
  def ws(
    req: IncomingMessage,
    socket: js.Any,
    head: js.Any,
    options: ServerOptions,
    callback: ErrorCallback
  ): Unit = js.native
}
