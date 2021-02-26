package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserGroupsResponse extends StObject {
  
  /**
    * The list of groups the user is a member of.
    */
  var GroupList: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.GroupList] = js.native
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object ListUserGroupsResponse {
  
  @scala.inline
  def apply(): ListUserGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserGroupsResponse]
  }
  
  @scala.inline
  implicit class ListUserGroupsResponseMutableBuilder[Self <: ListUserGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupList(value: GroupList): Self = StObject.set(x, "GroupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupListUndefined: Self = StObject.set(x, "GroupList", js.undefined)
    
    @scala.inline
    def setGroupListVarargs(value: Group*): Self = StObject.set(x, "GroupList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
