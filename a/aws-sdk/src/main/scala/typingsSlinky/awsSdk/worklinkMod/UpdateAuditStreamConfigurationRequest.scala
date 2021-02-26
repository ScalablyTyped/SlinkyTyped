package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAuditStreamConfigurationRequest extends StObject {
  
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  var AuditStreamArn: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.AuditStreamArn] = js.native
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
}
object UpdateAuditStreamConfigurationRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn): UpdateAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuditStreamConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateAuditStreamConfigurationRequestMutableBuilder[Self <: UpdateAuditStreamConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditStreamArn(value: AuditStreamArn): Self = StObject.set(x, "AuditStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditStreamArnUndefined: Self = StObject.set(x, "AuditStreamArn", js.undefined)
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
