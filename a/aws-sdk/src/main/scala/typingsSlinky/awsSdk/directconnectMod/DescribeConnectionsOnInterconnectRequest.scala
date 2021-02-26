package typingsSlinky.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionsOnInterconnectRequest extends StObject {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId = js.native
}
object DescribeConnectionsOnInterconnectRequest {
  
  @scala.inline
  def apply(interconnectId: InterconnectId): DescribeConnectionsOnInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectionsOnInterconnectRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectionsOnInterconnectRequestMutableBuilder[Self <: DescribeConnectionsOnInterconnectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
  }
}
