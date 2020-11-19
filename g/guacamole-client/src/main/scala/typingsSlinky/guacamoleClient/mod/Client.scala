package typingsSlinky.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "Client")
@js.native
class Client protected ()
  extends typingsSlinky.guacamoleClient.clientMod.Client {
  /**
    * @param tunnel The tunnel to use to send and receive Guacamole instructions.
    */
  def this(tunnel: typingsSlinky.guacamoleClient.webSocketTunnelMod.WebSocketTunnel) = this()
}
