package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDeliverabilityTrackingOption extends StObject {
  
  /**
    * A verified domain that’s associated with your AWS account and currently has an active Deliverability dashboard subscription.
    */
  var Domain: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.Domain] = js.native
  
  /**
    * An object that contains information about the inbox placement data settings for the domain.
    */
  var InboxPlacementTrackingOption: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.InboxPlacementTrackingOption] = js.native
  
  /**
    * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
    */
  var SubscriptionStartDate: js.UndefOr[js.Date] = js.native
}
object DomainDeliverabilityTrackingOption {
  
  @scala.inline
  def apply(): DomainDeliverabilityTrackingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDeliverabilityTrackingOption]
  }
  
  @scala.inline
  implicit class DomainDeliverabilityTrackingOptionMutableBuilder[Self <: DomainDeliverabilityTrackingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setInboxPlacementTrackingOption(value: InboxPlacementTrackingOption): Self = StObject.set(x, "InboxPlacementTrackingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboxPlacementTrackingOptionUndefined: Self = StObject.set(x, "InboxPlacementTrackingOption", js.undefined)
    
    @scala.inline
    def setSubscriptionStartDate(value: js.Date): Self = StObject.set(x, "SubscriptionStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionStartDateUndefined: Self = StObject.set(x, "SubscriptionStartDate", js.undefined)
  }
}
