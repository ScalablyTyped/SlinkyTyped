package typingsSlinky.pulumiAws.vpcEndpointConnectionNotificationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointConnectionNotificationArgs extends js.Object {
  /**
    * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
    */
  val connectionEvents: Input[js.Array[Input[String]]] = js.native
  /**
    * The ARN of the SNS topic for the notifications.
    */
  val connectionNotificationArn: Input[String] = js.native
  /**
    * The ID of the VPC Endpoint to receive notifications for.
    */
  val vpcEndpointId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC Endpoint Service to receive notifications for.
    */
  val vpcEndpointServiceId: js.UndefOr[Input[String]] = js.native
}

object VpcEndpointConnectionNotificationArgs {
  @scala.inline
  def apply(connectionEvents: Input[js.Array[Input[String]]], connectionNotificationArn: Input[String]): VpcEndpointConnectionNotificationArgs = {
    val __obj = js.Dynamic.literal(connectionEvents = connectionEvents.asInstanceOf[js.Any], connectionNotificationArn = connectionNotificationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointConnectionNotificationArgs]
  }
  @scala.inline
  implicit class VpcEndpointConnectionNotificationArgsOps[Self <: VpcEndpointConnectionNotificationArgs] (val x: Self) extends AnyVal {
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
    def withConnectionNotificationArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionNotificationArn")(value.asInstanceOf[js.Any])
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

