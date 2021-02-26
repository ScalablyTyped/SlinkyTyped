package typingsSlinky.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTunnelResponse extends StObject {
  
  /**
    * The tunnel being described.
    */
  var tunnel: js.UndefOr[Tunnel] = js.native
}
object DescribeTunnelResponse {
  
  @scala.inline
  def apply(): DescribeTunnelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTunnelResponse]
  }
  
  @scala.inline
  implicit class DescribeTunnelResponseMutableBuilder[Self <: DescribeTunnelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTunnel(value: Tunnel): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
  }
}
