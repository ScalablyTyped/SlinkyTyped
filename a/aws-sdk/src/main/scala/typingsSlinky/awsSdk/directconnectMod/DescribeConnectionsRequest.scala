package typingsSlinky.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionsRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
}
object DescribeConnectionsRequest {
  
  @scala.inline
  def apply(): DescribeConnectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionsRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectionsRequestMutableBuilder[Self <: DescribeConnectionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
  }
}
