package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomJoinRequest extends js.Object {
  
  /** The capabilities that this client supports for realtime communication. */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  
  /** Client address for the player joining the room. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomJoinRequest. */
  var kind: js.UndefOr[String] = js.native
  
  /** Network diagnostics for the client joining the room. */
  var networkDiagnostics: js.UndefOr[NetworkDiagnostics] = js.native
}
object RoomJoinRequest {
  
  @scala.inline
  def apply(): RoomJoinRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomJoinRequest]
  }
  
  @scala.inline
  implicit class RoomJoinRequestOps[Self <: RoomJoinRequest] (val x: Self) extends AnyVal {
    
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
    def setCapabilitiesVarargs(value: String*): Self = this.set("capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setClientAddress(value: RoomClientAddress): Self = this.set("clientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAddress: Self = this.set("clientAddress", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNetworkDiagnostics(value: NetworkDiagnostics): Self = this.set("networkDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkDiagnostics: Self = this.set("networkDiagnostics", js.undefined)
  }
}
