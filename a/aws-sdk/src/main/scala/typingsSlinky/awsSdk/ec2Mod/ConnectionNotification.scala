package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionNotification extends js.Object {
  /**
    * The events for the notification. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.native
  /**
    * The ARN of the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.native
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: js.UndefOr[String] = js.native
  /**
    * The state of the notification.
    */
  var ConnectionNotificationState: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ConnectionNotificationState] = js.native
  /**
    * The type of notification.
    */
  var ConnectionNotificationType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ConnectionNotificationType] = js.native
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
}

object ConnectionNotification {
  @scala.inline
  def apply(): ConnectionNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionNotification]
  }
  @scala.inline
  implicit class ConnectionNotificationOps[Self <: ConnectionNotification] (val x: Self) extends AnyVal {
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
    def withConnectionNotificationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionNotificationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionNotificationState(value: ConnectionNotificationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionNotificationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationState")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionNotificationType(value: ConnectionNotificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionNotificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNotificationType")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceId(value: String): Self = {
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
    def withVpcEndpointId(value: String): Self = {
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

