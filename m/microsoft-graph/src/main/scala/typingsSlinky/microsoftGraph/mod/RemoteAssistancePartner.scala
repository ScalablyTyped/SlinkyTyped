package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteAssistancePartner extends Entity {
  
  // Display name of the partner.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[String] = js.native
  
  // TBD. Possible values are: notOnboarded, onboarding, onboarded.
  var onboardingStatus: js.UndefOr[RemoteAssistanceOnboardingStatus] = js.native
  
  // URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
  var onboardingUrl: js.UndefOr[NullableOption[String]] = js.native
}
object RemoteAssistancePartner {
  
  @scala.inline
  def apply(): RemoteAssistancePartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAssistancePartner]
  }
  
  @scala.inline
  implicit class RemoteAssistancePartnerMutableBuilder[Self <: RemoteAssistancePartner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastConnectionDateTime(value: String): Self = StObject.set(x, "lastConnectionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastConnectionDateTimeUndefined: Self = StObject.set(x, "lastConnectionDateTime", js.undefined)
    
    @scala.inline
    def setOnboardingStatus(value: RemoteAssistanceOnboardingStatus): Self = StObject.set(x, "onboardingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnboardingStatusUndefined: Self = StObject.set(x, "onboardingStatus", js.undefined)
    
    @scala.inline
    def setOnboardingUrl(value: NullableOption[String]): Self = StObject.set(x, "onboardingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnboardingUrlNull: Self = StObject.set(x, "onboardingUrl", null)
    
    @scala.inline
    def setOnboardingUrlUndefined: Self = StObject.set(x, "onboardingUrl", js.undefined)
  }
}
