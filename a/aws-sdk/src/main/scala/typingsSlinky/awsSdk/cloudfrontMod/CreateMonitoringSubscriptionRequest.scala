package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMonitoringSubscriptionRequest extends StObject {
  
  /**
    * The ID of the distribution that you are enabling metrics for.
    */
  var DistributionId: String = js.native
  
  /**
    * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
    */
  var MonitoringSubscription: typingsSlinky.awsSdk.cloudfrontMod.MonitoringSubscription = js.native
}
object CreateMonitoringSubscriptionRequest {
  
  @scala.inline
  def apply(DistributionId: String, MonitoringSubscription: MonitoringSubscription): CreateMonitoringSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], MonitoringSubscription = MonitoringSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitoringSubscriptionRequest]
  }
  
  @scala.inline
  implicit class CreateMonitoringSubscriptionRequestMutableBuilder[Self <: CreateMonitoringSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringSubscription(value: MonitoringSubscription): Self = StObject.set(x, "MonitoringSubscription", value.asInstanceOf[js.Any])
  }
}
