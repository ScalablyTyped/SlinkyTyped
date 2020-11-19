package typingsSlinky.agentkeepalive.mod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpAgent extends Agent {
  
  def createSocket(req: IncomingMessage, options: RequestOptions, cb: js.Function): Unit = js.native
  
  def getCurrentStatus(): AgentStatus = js.native
  
  val statusChanged: Boolean = js.native
}
