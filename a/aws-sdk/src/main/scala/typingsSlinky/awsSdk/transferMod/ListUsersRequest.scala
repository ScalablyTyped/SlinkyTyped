package typingsSlinky.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUsersRequest extends StObject {
  
  /**
    * Specifies the number of users to return as a response to the ListUsers request.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.transferMod.MaxResults] = js.native
  
  /**
    * When you can get additional results from the ListUsers call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional users.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.transferMod.NextToken] = js.native
  
  /**
    * A system-assigned unique identifier for a server that has users assigned to it.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
}
object ListUsersRequest {
  
  @scala.inline
  def apply(ServerId: ServerId): ListUsersRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersRequest]
  }
  
  @scala.inline
  implicit class ListUsersRequestMutableBuilder[Self <: ListUsersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
