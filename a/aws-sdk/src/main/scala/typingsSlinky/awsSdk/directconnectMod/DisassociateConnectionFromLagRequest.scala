package typingsSlinky.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateConnectionFromLagRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  
  /**
    * The ID of the LAG.
    */
  var lagId: LagId = js.native
}
object DisassociateConnectionFromLagRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId, lagId: LagId): DisassociateConnectionFromLagRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConnectionFromLagRequest]
  }
  
  @scala.inline
  implicit class DisassociateConnectionFromLagRequestMutableBuilder[Self <: DisassociateConnectionFromLagRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
  }
}
