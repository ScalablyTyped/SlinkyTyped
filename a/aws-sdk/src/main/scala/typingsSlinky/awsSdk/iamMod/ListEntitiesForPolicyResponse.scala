package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEntitiesForPolicyResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  
  /**
    * A list of IAM groups that the policy is attached to.
    */
  var PolicyGroups: js.UndefOr[PolicyGroupListType] = js.native
  
  /**
    * A list of IAM roles that the policy is attached to.
    */
  var PolicyRoles: js.UndefOr[PolicyRoleListType] = js.native
  
  /**
    * A list of IAM users that the policy is attached to.
    */
  var PolicyUsers: js.UndefOr[PolicyUserListType] = js.native
}
object ListEntitiesForPolicyResponse {
  
  @scala.inline
  def apply(): ListEntitiesForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesForPolicyResponse]
  }
  
  @scala.inline
  implicit class ListEntitiesForPolicyResponseMutableBuilder[Self <: ListEntitiesForPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setPolicyGroups(value: PolicyGroupListType): Self = StObject.set(x, "PolicyGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyGroupsUndefined: Self = StObject.set(x, "PolicyGroups", js.undefined)
    
    @scala.inline
    def setPolicyGroupsVarargs(value: PolicyGroup*): Self = StObject.set(x, "PolicyGroups", js.Array(value :_*))
    
    @scala.inline
    def setPolicyRoles(value: PolicyRoleListType): Self = StObject.set(x, "PolicyRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyRolesUndefined: Self = StObject.set(x, "PolicyRoles", js.undefined)
    
    @scala.inline
    def setPolicyRolesVarargs(value: PolicyRole*): Self = StObject.set(x, "PolicyRoles", js.Array(value :_*))
    
    @scala.inline
    def setPolicyUsers(value: PolicyUserListType): Self = StObject.set(x, "PolicyUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUsersUndefined: Self = StObject.set(x, "PolicyUsers", js.undefined)
    
    @scala.inline
    def setPolicyUsersVarargs(value: PolicyUser*): Self = StObject.set(x, "PolicyUsers", js.Array(value :_*))
  }
}
