package typingsSlinky.agentkeepalive.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.httpsMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("agentkeepalive", "HttpsAgent")
@js.native
class HttpsAgent () extends Agent {
  def this(opts: HttpOptions) = this()
  
  def createSocket(req: IncomingMessage, options: RequestOptions, cb: js.Function): Unit = js.native
  
  def getCurrentStatus(): AgentStatus = js.native
  
  val statusChanged: Boolean = js.native
}
