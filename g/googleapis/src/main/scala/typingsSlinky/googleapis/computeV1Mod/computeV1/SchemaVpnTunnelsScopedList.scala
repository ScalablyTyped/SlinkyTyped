package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaVpnTunnelsScopedList extends js.Object {
  
  /**
    * A list of VPN tunnels contained in this scope.
    */
  var vpnTunnels: js.UndefOr[js.Array[SchemaVpnTunnel]] = js.native
  
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaVpnTunnelsScopedList {
  
  @scala.inline
  def apply(): SchemaVpnTunnelsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnTunnelsScopedList]
  }
  
  @scala.inline
  implicit class SchemaVpnTunnelsScopedListOps[Self <: SchemaVpnTunnelsScopedList] (val x: Self) extends AnyVal {
    
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
    def setVpnTunnelsVarargs(value: SchemaVpnTunnel*): Self = this.set("vpnTunnels", js.Array(value :_*))
    
    @scala.inline
    def setVpnTunnels(value: js.Array[SchemaVpnTunnel]): Self = this.set("vpnTunnels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnTunnels: Self = this.set("vpnTunnels", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
