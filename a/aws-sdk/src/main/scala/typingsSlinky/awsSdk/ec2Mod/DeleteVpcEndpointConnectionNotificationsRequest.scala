package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcEndpointConnectionNotificationsRequest extends js.Object {
  /**
    * One or more notification IDs.
    */
  var ConnectionNotificationIds: ValueStringList = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DeleteVpcEndpointConnectionNotificationsRequest {
  @scala.inline
  def apply(ConnectionNotificationIds: ValueStringList): DeleteVpcEndpointConnectionNotificationsRequest = {
    val __obj = js.Dynamic.literal(ConnectionNotificationIds = ConnectionNotificationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointConnectionNotificationsRequest]
  }
  @scala.inline
  implicit class DeleteVpcEndpointConnectionNotificationsRequestOps[Self <: DeleteVpcEndpointConnectionNotificationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionNotificationIds(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationIds")(value.asInstanceOf[js.Any])
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

