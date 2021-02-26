package typingsSlinky.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateProactiveEngagementDetailsRequest extends StObject {
  
  /**
    * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you for escalations to the DRT and to initiate proactive customer support.  To enable proactive engagement, the contact list must include at least one phone number.  The contacts that you provide here replace any contacts that were already defined. If you already have contacts defined and want to use them, retrieve the list using DescribeEmergencyContactSettings and then provide it here.  
    */
  var EmergencyContactList: typingsSlinky.awsSdk.shieldMod.EmergencyContactList = js.native
}
object AssociateProactiveEngagementDetailsRequest {
  
  @scala.inline
  def apply(EmergencyContactList: EmergencyContactList): AssociateProactiveEngagementDetailsRequest = {
    val __obj = js.Dynamic.literal(EmergencyContactList = EmergencyContactList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateProactiveEngagementDetailsRequest]
  }
  
  @scala.inline
  implicit class AssociateProactiveEngagementDetailsRequestMutableBuilder[Self <: AssociateProactiveEngagementDetailsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmergencyContactList(value: EmergencyContactList): Self = StObject.set(x, "EmergencyContactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmergencyContactListVarargs(value: EmergencyContact*): Self = StObject.set(x, "EmergencyContactList", js.Array(value :_*))
  }
}
