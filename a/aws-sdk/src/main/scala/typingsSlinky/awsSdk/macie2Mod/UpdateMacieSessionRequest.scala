package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMacieSessionRequest extends StObject {
  
  /**
    * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
    */
  var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.native
  
  /**
    * Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie activities for the account; and, PAUSED, suspend all Macie activities for the account.
    */
  var status: js.UndefOr[MacieStatus] = js.native
}
object UpdateMacieSessionRequest {
  
  @scala.inline
  def apply(): UpdateMacieSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMacieSessionRequest]
  }
  
  @scala.inline
  implicit class UpdateMacieSessionRequestMutableBuilder[Self <: UpdateMacieSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = StObject.set(x, "findingPublishingFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingPublishingFrequencyUndefined: Self = StObject.set(x, "findingPublishingFrequency", js.undefined)
    
    @scala.inline
    def setStatus(value: MacieStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
