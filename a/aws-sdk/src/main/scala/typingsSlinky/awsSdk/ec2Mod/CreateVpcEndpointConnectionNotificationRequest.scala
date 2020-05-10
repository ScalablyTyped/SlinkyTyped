package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcEndpointConnectionNotificationRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * One or more endpoint events for which to receive notifications. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: ValueStringList = js.native
  /**
    * The ARN of the SNS topic for the notifications.
    */
  var ConnectionNotificationArn: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[VpcEndpointServiceId] = js.native
  /**
    * The ID of the endpoint.
    */
  var VpcEndpointId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcEndpointId] = js.native
}

object CreateVpcEndpointConnectionNotificationRequest {
  @scala.inline
  def apply(ConnectionEvents: ValueStringList, ConnectionNotificationArn: String): CreateVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionEvents = ConnectionEvents.asInstanceOf[js.Any], ConnectionNotificationArn = ConnectionNotificationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointConnectionNotificationRequest]
  }
  @scala.inline
  implicit class CreateVpcEndpointConnectionNotificationRequestOps[Self <: CreateVpcEndpointConnectionNotificationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionEvents(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionNotificationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
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
    @scala.inline
    def withServiceId(value: VpcEndpointServiceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointId(value: VpcEndpointId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(js.undefined)
        ret
    }
  }
  
}

