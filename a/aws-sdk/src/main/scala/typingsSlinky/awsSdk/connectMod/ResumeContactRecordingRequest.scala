package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumeContactRecordingRequest extends StObject {
  
  /**
    * The identifier of the contact.
    */
  var ContactId: typingsSlinky.awsSdk.connectMod.ContactId = js.native
  
  /**
    * The identifier of the contact. This is the identifier of the contact associated with the first interaction with the contact center.
    */
  var InitialContactId: ContactId = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
}
object ResumeContactRecordingRequest {
  
  @scala.inline
  def apply(ContactId: ContactId, InitialContactId: ContactId, InstanceId: InstanceId): ResumeContactRecordingRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InitialContactId = InitialContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeContactRecordingRequest]
  }
  
  @scala.inline
  implicit class ResumeContactRecordingRequestMutableBuilder[Self <: ResumeContactRecordingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialContactId(value: ContactId): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
