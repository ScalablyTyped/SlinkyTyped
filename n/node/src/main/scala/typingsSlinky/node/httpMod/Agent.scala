package typingsSlinky.node.httpMod

import typingsSlinky.node.NodeJS.ReadOnlyDict
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http", "Agent")
@js.native
class Agent () extends js.Object {
  def this(opts: AgentOptions) = this()
  
  /**
    * Destroy any sockets that are currently in use by the agent.
    * It is usually not necessary to do this. However, if you are using an agent with KeepAlive enabled,
    * then it is best to explicitly shut down the agent when you know that it will no longer be used. Otherwise,
    * sockets may hang open for quite a long time before the server terminates them.
    */
  def destroy(): Unit = js.native
  
  val freeSockets: ReadOnlyDict[js.Array[Socket]] = js.native
  
  var maxFreeSockets: Double = js.native
  
  var maxSockets: Double = js.native
  
  var maxTotalSockets: Double = js.native
  
  val requests: ReadOnlyDict[js.Array[IncomingMessage]] = js.native
  
  val sockets: ReadOnlyDict[js.Array[Socket]] = js.native
}
