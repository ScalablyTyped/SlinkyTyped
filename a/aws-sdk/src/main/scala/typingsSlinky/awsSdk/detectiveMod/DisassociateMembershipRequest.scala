package typingsSlinky.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateMembershipRequest extends StObject {
  
  /**
    * The ARN of the behavior graph to remove the member account from. The member account's member status in the behavior graph must be ENABLED.
    */
  var GraphArn: typingsSlinky.awsSdk.detectiveMod.GraphArn = js.native
}
object DisassociateMembershipRequest {
  
  @scala.inline
  def apply(GraphArn: GraphArn): DisassociateMembershipRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembershipRequest]
  }
  
  @scala.inline
  implicit class DisassociateMembershipRequestMutableBuilder[Self <: DisassociateMembershipRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
