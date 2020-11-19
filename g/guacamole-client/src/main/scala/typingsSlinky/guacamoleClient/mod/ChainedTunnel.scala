package typingsSlinky.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "ChainedTunnel")
@js.native
class ChainedTunnel protected ()
  extends typingsSlinky.guacamoleClient.chainedTunnelMod.ChainedTunnel {
  /**
    * @param tunnelChain The tunnels to use, in order of priority.
    */
  def this(tunnels: typingsSlinky.guacamoleClient.tunnelMod.Tunnel*) = this()
}
