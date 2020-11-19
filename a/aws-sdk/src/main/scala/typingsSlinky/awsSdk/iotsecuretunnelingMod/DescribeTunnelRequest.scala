package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTunnelRequest extends js.Object {
  
  /**
    * The tunnel to describe.
    */
  var tunnelId: TunnelId = js.native
}
object DescribeTunnelRequest {
  
  @scala.inline
  def apply(tunnelId: TunnelId): DescribeTunnelRequest = {
    val __obj = js.Dynamic.literal(tunnelId = tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTunnelRequest]
  }
  
  @scala.inline
  implicit class DescribeTunnelRequestOps[Self <: DescribeTunnelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTunnelId(value: TunnelId): Self = this.set("tunnelId", value.asInstanceOf[js.Any])
  }
}
