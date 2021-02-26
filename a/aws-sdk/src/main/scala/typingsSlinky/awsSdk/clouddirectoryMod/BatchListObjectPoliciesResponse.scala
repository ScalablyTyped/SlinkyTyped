package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListObjectPoliciesResponse extends StObject {
  
  /**
    * A list of policy ObjectIdentifiers, that are attached to the object.
    */
  var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object BatchListObjectPoliciesResponse {
  
  @scala.inline
  def apply(): BatchListObjectPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectPoliciesResponse]
  }
  
  @scala.inline
  implicit class BatchListObjectPoliciesResponseMutableBuilder[Self <: BatchListObjectPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedPolicyIds(value: ObjectIdentifierList): Self = StObject.set(x, "AttachedPolicyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedPolicyIdsUndefined: Self = StObject.set(x, "AttachedPolicyIds", js.undefined)
    
    @scala.inline
    def setAttachedPolicyIdsVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "AttachedPolicyIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
