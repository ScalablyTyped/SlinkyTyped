package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPoliciesForTargetResponse extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
  
  /**
    * The list of policies that match the criteria in the request.
    */
  var Policies: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Policies] = js.native
}
object ListPoliciesForTargetResponse {
  
  @scala.inline
  def apply(): ListPoliciesForTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesForTargetResponse]
  }
  
  @scala.inline
  implicit class ListPoliciesForTargetResponseMutableBuilder[Self <: ListPoliciesForTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPolicies(value: Policies): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: PolicySummary*): Self = StObject.set(x, "Policies", js.Array(value :_*))
  }
}
