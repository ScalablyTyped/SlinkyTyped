package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMonitoringSubscriptionRequest extends StObject {
  
  /**
    * The ID of the distribution that you are disabling metrics for.
    */
  var DistributionId: String = js.native
}
object DeleteMonitoringSubscriptionRequest {
  
  @scala.inline
  def apply(DistributionId: String): DeleteMonitoringSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMonitoringSubscriptionRequest]
  }
  
  @scala.inline
  implicit class DeleteMonitoringSubscriptionRequestMutableBuilder[Self <: DeleteMonitoringSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
  }
}
