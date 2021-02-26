package typingsSlinky.node.tlsMod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TLSSocketOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
  
  /**
    * If true the TLS socket will be instantiated in server-mode.
    * Defaults to false.
    */
  var isServer: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, specifies that the OCSP status request extension will be
    * added to the client hello and an 'OCSPResponse' event will be
    * emitted on the socket before establishing a secure communication
    */
  var requestOCSP: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional net.Server instance.
    */
  var server: js.UndefOr[typingsSlinky.node.netMod.Server] = js.native
  
  /**
    * An optional Buffer instance containing a TLS session.
    */
  var session: js.UndefOr[Buffer] = js.native
}
object TLSSocketOptions {
  
  @scala.inline
  def apply(): TLSSocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSSocketOptions]
  }
  
  @scala.inline
  implicit class TLSSocketOptionsMutableBuilder[Self <: TLSSocketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
    
    @scala.inline
    def setRequestOCSP(value: Boolean): Self = StObject.set(x, "requestOCSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOCSPUndefined: Self = StObject.set(x, "requestOCSP", js.undefined)
    
    @scala.inline
    def setServer(value: typingsSlinky.node.netMod.Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    @scala.inline
    def setSession(value: Buffer): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
