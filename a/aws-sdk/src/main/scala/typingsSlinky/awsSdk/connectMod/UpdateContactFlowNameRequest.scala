package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContactFlowNameRequest extends StObject {
  
  /**
    * The identifier of the contact flow.
    */
  var ContactFlowId: typingsSlinky.awsSdk.connectMod.ContactFlowId = js.native
  
  /**
    * The description of the contact flow.
    */
  var Description: js.UndefOr[ContactFlowDescription] = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The name of the contact flow.
    */
  var Name: js.UndefOr[ContactFlowName] = js.native
}
object UpdateContactFlowNameRequest {
  
  @scala.inline
  def apply(ContactFlowId: ContactFlowId, InstanceId: InstanceId): UpdateContactFlowNameRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactFlowNameRequest]
  }
  
  @scala.inline
  implicit class UpdateContactFlowNameRequestMutableBuilder[Self <: UpdateContactFlowNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ContactFlowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ContactFlowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
