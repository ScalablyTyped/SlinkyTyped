package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamGroupDetails extends StObject {
  
  /**
    * A list of the managed policies that are attached to the IAM group.
    */
  var AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList] = js.native
  
  /**
    * Indicates when the IAM group was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the IAM group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the IAM group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of inline policies that are embedded in the group.
    */
  var GroupPolicyList: js.UndefOr[AwsIamGroupPolicyList] = js.native
  
  /**
    * The path to the group.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamGroupDetails {
  
  @scala.inline
  def apply(): AwsIamGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamGroupDetails]
  }
  
  @scala.inline
  implicit class AwsIamGroupDetailsMutableBuilder[Self <: AwsIamGroupDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedManagedPolicies(value: AwsIamAttachedManagedPolicyList): Self = StObject.set(x, "AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedManagedPoliciesUndefined: Self = StObject.set(x, "AttachedManagedPolicies", js.undefined)
    
    @scala.inline
    def setAttachedManagedPoliciesVarargs(value: AwsIamAttachedManagedPolicy*): Self = StObject.set(x, "AttachedManagedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setCreateDate(value: NonEmptyString): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setGroupId(value: NonEmptyString): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setGroupPolicyList(value: AwsIamGroupPolicyList): Self = StObject.set(x, "GroupPolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupPolicyListUndefined: Self = StObject.set(x, "GroupPolicyList", js.undefined)
    
    @scala.inline
    def setGroupPolicyListVarargs(value: AwsIamGroupPolicy*): Self = StObject.set(x, "GroupPolicyList", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
