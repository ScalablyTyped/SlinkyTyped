package typingsSlinky.pulumiAws.vpcEndpointConnectionNotificationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointConnectionNotificationState extends js.Object {
  /**
    * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
    */
  val connectionEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN of the SNS topic for the notifications.
    */
  val connectionNotificationArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of notification.
    */
  val notificationType: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the notification.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC Endpoint to receive notifications for.
    */
  val vpcEndpointId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC Endpoint Service to receive notifications for.
    */
  val vpcEndpointServiceId: js.UndefOr[Input[String]] = js.native
}

object VpcEndpointConnectionNotificationState {
  @scala.inline
  def apply(): VpcEndpointConnectionNotificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointConnectionNotificationState]
  }
  @scala.inline
  implicit class VpcEndpointConnectionNotificationStateOps[Self <: VpcEndpointConnectionNotificationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionEvents(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionNotificationArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionNotificationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionNotificationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionNotificationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointServiceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointServiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointServiceId")(js.undefined)
        ret
    }
  }
  
}

