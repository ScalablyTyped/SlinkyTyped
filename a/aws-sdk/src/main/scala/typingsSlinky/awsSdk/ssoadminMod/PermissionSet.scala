package typingsSlinky.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionSet extends StObject {
  
  /**
    * The date that the permission set was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The description of the PermissionSet.
    */
  var Description: js.UndefOr[PermissionSetDescription] = js.native
  
  /**
    * The name of the permission set.
    */
  var Name: js.UndefOr[PermissionSetName] = js.native
  
  /**
    * The ARN of the permission set. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PermissionSetArn: js.UndefOr[typingsSlinky.awsSdk.ssoadminMod.PermissionSetArn] = js.native
  
  /**
    * Used to redirect users within the application during the federation authentication process.
    */
  var RelayState: js.UndefOr[typingsSlinky.awsSdk.ssoadminMod.RelayState] = js.native
  
  /**
    * The length of time that the application user sessions are valid for in the ISO-8601 standard.
    */
  var SessionDuration: js.UndefOr[Duration] = js.native
}
object PermissionSet {
  
  @scala.inline
  def apply(): PermissionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionSet]
  }
  
  @scala.inline
  implicit class PermissionSetMutableBuilder[Self <: PermissionSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: PermissionSetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: PermissionSetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetArnUndefined: Self = StObject.set(x, "PermissionSetArn", js.undefined)
    
    @scala.inline
    def setRelayState(value: RelayState): Self = StObject.set(x, "RelayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelayStateUndefined: Self = StObject.set(x, "RelayState", js.undefined)
    
    @scala.inline
    def setSessionDuration(value: Duration): Self = StObject.set(x, "SessionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionDurationUndefined: Self = StObject.set(x, "SessionDuration", js.undefined)
  }
}
