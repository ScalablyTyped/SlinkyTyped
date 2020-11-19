package typingsSlinky.guacamoleClient.mod

import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0000`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0100`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0200`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0201`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0202`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0203`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0204`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0205`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0206`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0207`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0208`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0209`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x020a`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x020b`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0300`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0301`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0303`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x0308`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x030d`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x030f`
import typingsSlinky.guacamoleClient.guacamoleClientNumbers.`0x031d`
import typingsSlinky.guacamoleClient.statusMod.Status.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "Status")
@js.native
class Status protected ()
  extends typingsSlinky.guacamoleClient.statusMod.Status {
  /**
    * @param code The Guacamole status code, as defined by Guacamole.Status.Code.
    * @param [message] An optional human-readable message.
    */
  def this(code: Code) = this()
  def this(code: Code, message: String) = this()
}
@JSImport("guacamole-client", "Status")
@js.native
object Status extends js.Object {
  
  @js.native
  object Code extends js.Object {
    
    val CLIENT_BAD_REQUEST: `0x0300` = js.native
    
    val CLIENT_BAD_TYPE: `0x030f` = js.native
    
    val CLIENT_FORBIDDEN: `0x0303` = js.native
    
    val CLIENT_OVERRUN: `0x030d` = js.native
    
    val CLIENT_TIMEOUT: `0x0308` = js.native
    
    val CLIENT_TOO_MANY: `0x031d` = js.native
    
    val CLIENT_UNAUTHORIZED: `0x0301` = js.native
    
    val RESOURCE_CLOSED: `0x0206` = js.native
    
    val RESOURCE_CONFLICT: `0x0205` = js.native
    
    val RESOURCE_NOT_FOUND: `0x0204` = js.native
    
    val SERVER_BUSY: `0x0201` = js.native
    
    val SERVER_ERROR: `0x0200` = js.native
    
    val SESSION_CLOSED: `0x020b` = js.native
    
    val SESSION_CONFLICT: `0x0209` = js.native
    
    val SESSION_TIMEOUT: `0x020a` = js.native
    
    val SUCCESS: `0x0000` = js.native
    
    val UNSUPPORTED: `0x0100` = js.native
    
    val UPSTREAM_ERROR: `0x0203` = js.native
    
    val UPSTREAM_NOT_FOUND: `0x0207` = js.native
    
    val UPSTREAM_TIMEOUT: `0x0202` = js.native
    
    val UPSTREAM_UNAVAILABLE: `0x0208` = js.native
    
    def fromHTTPCode(status: Double): typingsSlinky.guacamoleClient.statusMod.Status.Code = js.native
    
    def fromWebSocketCode(code: Double): typingsSlinky.guacamoleClient.statusMod.Status.Code = js.native
  }
}
