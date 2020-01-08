package typingsSlinky.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAuditStreamConfigurationRequest extends js.Object {
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  var AuditStreamArn: js.UndefOr[typingsSlinky.awsDashSdk.clientsWorklinkMod.AuditStreamArn] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsDashSdk.clientsWorklinkMod.FleetArn = js.native
}

object UpdateAuditStreamConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, AuditStreamArn: AuditStreamArn = null): UpdateAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    if (AuditStreamArn != null) __obj.updateDynamic("AuditStreamArn")(AuditStreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuditStreamConfigurationRequest]
  }
}

