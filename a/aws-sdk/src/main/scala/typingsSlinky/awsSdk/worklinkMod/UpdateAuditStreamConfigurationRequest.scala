package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAuditStreamConfigurationRequest extends js.Object {
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
  implicit class UpdateAuditStreamConfigurationRequestOps[Self <: UpdateAuditStreamConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetArn(value: FleetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuditStreamArn(value: AuditStreamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditStreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditStreamArn")(js.undefined)
        ret
    }
  }
  
}

