package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSpotDatafeedSubscriptionResult extends StObject {
  
  /**
    * The Spot Instance data feed subscription.
    */
  var SpotDatafeedSubscription: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.SpotDatafeedSubscription] = js.native
}
object CreateSpotDatafeedSubscriptionResult {
  
  @scala.inline
  def apply(): CreateSpotDatafeedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSpotDatafeedSubscriptionResult]
  }
  
  @scala.inline
  implicit class CreateSpotDatafeedSubscriptionResultMutableBuilder[Self <: CreateSpotDatafeedSubscriptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpotDatafeedSubscription(value: SpotDatafeedSubscription): Self = StObject.set(x, "SpotDatafeedSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotDatafeedSubscriptionUndefined: Self = StObject.set(x, "SpotDatafeedSubscription", js.undefined)
  }
}
