package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointConnectionNotificationRequest extends js.Object {
  /**
    * One or more events for the endpoint. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.native
  /**
    * The ARN for the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.native
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: typingsSlinky.awsSdk.ec2Mod.ConnectionNotificationId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object ModifyVpcEndpointConnectionNotificationRequest {
  @scala.inline
  def apply(ConnectionNotificationId: ConnectionNotificationId): ModifyVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionNotificationId = ConnectionNotificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointConnectionNotificationRequest]
  }
  @scala.inline
  implicit class ModifyVpcEndpointConnectionNotificationRequestOps[Self <: ModifyVpcEndpointConnectionNotificationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionNotificationId(value: ConnectionNotificationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionEvents(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionNotificationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionNotificationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

