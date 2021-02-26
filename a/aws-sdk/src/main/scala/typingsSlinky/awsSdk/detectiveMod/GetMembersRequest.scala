package typingsSlinky.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMembersRequest extends StObject {
  
  /**
    * The list of AWS account identifiers for the member account for which to return member details. You cannot use GetMembers to retrieve information about member accounts that were removed from the behavior graph.
    */
  var AccountIds: AccountIdList = js.native
  
  /**
    * The ARN of the behavior graph for which to request the member details.
    */
  var GraphArn: typingsSlinky.awsSdk.detectiveMod.GraphArn = js.native
}
object GetMembersRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIdList, GraphArn: GraphArn): GetMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersRequest]
  }
  
  @scala.inline
  implicit class GetMembersRequestMutableBuilder[Self <: GetMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
