package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditStreamConfigurationRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
}
object DescribeAuditStreamConfigurationRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditStreamConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribeAuditStreamConfigurationRequestMutableBuilder[Self <: DescribeAuditStreamConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
