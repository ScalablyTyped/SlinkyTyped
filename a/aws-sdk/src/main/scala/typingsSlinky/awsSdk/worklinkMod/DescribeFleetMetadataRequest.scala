package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetMetadataRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
}
object DescribeFleetMetadataRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeFleetMetadataRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetMetadataRequest]
  }
  
  @scala.inline
  implicit class DescribeFleetMetadataRequestMutableBuilder[Self <: DescribeFleetMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
