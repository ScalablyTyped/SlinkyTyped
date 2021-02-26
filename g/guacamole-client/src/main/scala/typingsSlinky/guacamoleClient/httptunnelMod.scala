package typingsSlinky.guacamoleClient

import typingsSlinky.guacamoleClient.tunnelMod.Tunnel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httptunnelMod {
  
  @JSImport("guacamole-client/lib/HTTPTunnel", "HTTPTunnel")
  @js.native
  class HTTPTunnel protected () extends Tunnel {
    /**
      * @param tunnelURL The URL of the HTTP tunneling service.
      * @param [crossDomain=false] Whether tunnel requests will be cross-domain, and thus must use CORS
      * mechanisms and headers. By default, it is assumed that tunnel requests
      * will be made to the same domain.
      * @param [extraTunnelHeaders={}] Key value pairs containing the header names and values of any additional
      * headers to be sent in tunnel requests. By default, no extra headers will be added.
      */
    def this(tunnelURL: String) = this()
    def this(tunnelURL: String, crossDomain: Boolean) = this()
    def this(tunnelURL: String, crossDomain: js.UndefOr[scala.Nothing], extraTunnelHeaders: Boolean) = this()
    def this(tunnelURL: String, crossDomain: Boolean, extraTunnelHeaders: Boolean) = this()
  }
}
