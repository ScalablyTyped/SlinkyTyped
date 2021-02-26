package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePolicyRequest extends StObject {
  
  /**
    * The policy text content to add to the new policy. The text that you supply must adhere to the rules of the policy type you specify in the Type parameter.
    */
  var Content: PolicyContent = js.native
  
  /**
    * An optional description to assign to the policy.
    */
  var Description: PolicyDescription = js.native
  
  /**
    * The friendly name to assign to the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: PolicyName = js.native
  
  /**
    * A list of tags that you want to attach to the newly created policy. For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to null. For more information about tagging, see Tagging AWS Organizations resources in the AWS Organizations User Guide.  If any one of the tags is invalid or if you exceed the allowed number of tags for a policy, then the entire request fails and the policy is not created. 
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Tags] = js.native
  
  /**
    * The type of policy to create. You can specify one of the following values:    AISERVICES_OPT_OUT_POLICY     BACKUP_POLICY     SERVICE_CONTROL_POLICY     TAG_POLICY   
    */
  var Type: PolicyType = js.native
}
object CreatePolicyRequest {
  
  @scala.inline
  def apply(Content: PolicyContent, Description: PolicyDescription, Name: PolicyName, Type: PolicyType): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyRequest]
  }
  
  @scala.inline
  implicit class CreatePolicyRequestMutableBuilder[Self <: CreatePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: PolicyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: PolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: PolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
