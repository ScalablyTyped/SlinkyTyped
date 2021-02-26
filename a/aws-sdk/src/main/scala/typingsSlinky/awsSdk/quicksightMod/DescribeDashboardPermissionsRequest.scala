package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDashboardPermissionsRequest extends StObject {
  
  /**
    * The ID of the AWS account that contains the dashboard that you're describing permissions for.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The ID for the dashboard, also added to the IAM policy.
    */
  var DashboardId: RestrictiveResourceId = js.native
}
object DescribeDashboardPermissionsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DashboardId: RestrictiveResourceId): DescribeDashboardPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardPermissionsRequest]
  }
  
  @scala.inline
  implicit class DescribeDashboardPermissionsRequestMutableBuilder[Self <: DescribeDashboardPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
  }
}
