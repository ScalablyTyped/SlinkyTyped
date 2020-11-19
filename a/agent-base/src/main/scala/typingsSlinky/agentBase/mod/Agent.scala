package typingsSlinky.agentBase.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base `http.Agent` implementation.
  * No pooling/keep-alive is implemented by default.
  *
  * @param {Function} callback
  * @api public
  */
@JSImport("agent-base", "Agent")
@js.native
class Agent () extends EventEmitter {
  def this(callback: AgentCallback) = this()
  def this(callback: AgentOptions) = this()
  def this(callback: js.UndefOr[scala.Nothing], _opts: AgentOptions) = this()
  def this(callback: AgentCallback, _opts: AgentOptions) = this()
  def this(callback: AgentOptions, _opts: AgentOptions) = this()
  
  /**
    * Called by node-core's "_http_client.js" module when creating
    * a new HTTP request with this Agent instance.
    *
    * @api public
    */
  def addRequest(req: ClientRequest, _opts: RequestOptions): Unit = js.native
  
  def callback(req: ClientRequest, opts: RequestOptions): AgentCallbackReturn | js.Promise[AgentCallbackReturn] = js.native
  def callback(req: ClientRequest, opts: RequestOptions, fn: AgentCallbackCallback): Unit = js.native
  
  def defaultPort: Double = js.native
  def defaultPort_=(v: Double): Unit = js.native
  
  def destroy(): Unit = js.native
  
  var explicitDefaultPort: js.Any = js.native
  
  var explicitProtocol: js.Any = js.native
  
  def freeSocket(socket: Socket, opts: AgentOptions): Unit = js.native
  
  var maxFreeSockets: Double = js.native
  
  var maxSockets: Double = js.native
  
  var options: typingsSlinky.node.httpsMod.AgentOptions = js.native
  
  var promisifiedCallback: js.Any = js.native
  
  def protocol: String = js.native
  def protocol_=(v: String): Unit = js.native
  
  var requests: StringDictionary[js.Array[IncomingMessage]] = js.native
  
  var sockets: StringDictionary[js.Array[Socket]] = js.native
  
  var timeout: Double | Null = js.native
}
