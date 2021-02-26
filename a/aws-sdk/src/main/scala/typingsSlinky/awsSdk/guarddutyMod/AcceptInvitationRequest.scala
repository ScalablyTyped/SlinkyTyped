package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptInvitationRequest extends StObject {
  
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The value that is used to validate the master account to the member account.
    */
  var InvitationId: String = js.native
  
  /**
    * The account ID of the master GuardDuty account whose invitation you're accepting.
    */
  var MasterId: String = js.native
}
object AcceptInvitationRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, InvitationId: String, MasterId: String): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], InvitationId = InvitationId.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
  
  @scala.inline
  implicit class AcceptInvitationRequestMutableBuilder[Self <: AcceptInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationId(value: String): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterId(value: String): Self = StObject.set(x, "MasterId", value.asInstanceOf[js.Any])
  }
}
