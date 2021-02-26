package typingsSlinky.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePermissionSetRequest extends StObject {
  
  /**
    * The description of the PermissionSet.
    */
  var Description: js.UndefOr[PermissionSetDescription] = js.native
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typingsSlinky.awsSdk.ssoadminMod.InstanceArn = js.native
  
  /**
    * The name of the PermissionSet.
    */
  var Name: PermissionSetName = js.native
  
  /**
    * Used to redirect users within the application during the federation authentication process.
    */
  var RelayState: js.UndefOr[typingsSlinky.awsSdk.ssoadminMod.RelayState] = js.native
  
  /**
    * The length of time that the application user sessions are valid in the ISO-8601 standard.
    */
  var SessionDuration: js.UndefOr[Duration] = js.native
  
  /**
    * The tags to attach to the new PermissionSet.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreatePermissionSetRequest {
  
  @scala.inline
  def apply(InstanceArn: InstanceArn, Name: PermissionSetName): CreatePermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePermissionSetRequest]
  }
  
  @scala.inline
  implicit class CreatePermissionSetRequestMutableBuilder[Self <: CreatePermissionSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: PermissionSetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: PermissionSetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelayState(value: RelayState): Self = StObject.set(x, "RelayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelayStateUndefined: Self = StObject.set(x, "RelayState", js.undefined)
    
    @scala.inline
    def setSessionDuration(value: Duration): Self = StObject.set(x, "SessionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionDurationUndefined: Self = StObject.set(x, "SessionDuration", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
