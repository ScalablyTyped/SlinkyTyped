package typingsSlinky.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEmergencyContactSettingsResponse extends StObject {
  
  /**
    * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support.
    */
  var EmergencyContactList: js.UndefOr[typingsSlinky.awsSdk.shieldMod.EmergencyContactList] = js.native
}
object DescribeEmergencyContactSettingsResponse {
  
  @scala.inline
  def apply(): DescribeEmergencyContactSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEmergencyContactSettingsResponse]
  }
  
  @scala.inline
  implicit class DescribeEmergencyContactSettingsResponseMutableBuilder[Self <: DescribeEmergencyContactSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmergencyContactList(value: EmergencyContactList): Self = StObject.set(x, "EmergencyContactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmergencyContactListUndefined: Self = StObject.set(x, "EmergencyContactList", js.undefined)
    
    @scala.inline
    def setEmergencyContactListVarargs(value: EmergencyContact*): Self = StObject.set(x, "EmergencyContactList", js.Array(value :_*))
  }
}
