package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowLog extends js.Object {
  /**
    * The date and time the flow log was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * Information about the error that occurred. Rate limited indicates that CloudWatch Logs throttling has been applied for one or more network interfaces, or that you've reached the limit on the number of log groups that you can create. Access error indicates that the IAM role associated with the flow log does not have sufficient permissions to publish to CloudWatch Logs. Unknown error indicates an internal error.
    */
  var DeliverLogsErrorMessage: js.UndefOr[String] = js.native
  /**
    * The ARN of the IAM role that posts logs to CloudWatch Logs.
    */
  var DeliverLogsPermissionArn: js.UndefOr[String] = js.native
  /**
    * The status of the logs delivery (SUCCESS | FAILED).
    */
  var DeliverLogsStatus: js.UndefOr[String] = js.native
  /**
    * The flow log ID.
    */
  var FlowLogId: js.UndefOr[String] = js.native
  /**
    * The status of the flow log (ACTIVE).
    */
  var FlowLogStatus: js.UndefOr[String] = js.native
  /**
    * Specifies the destination to which the flow log data is published. Flow log data can be published to an CloudWatch Logs log group or an Amazon S3 bucket. If the flow log publishes to CloudWatch Logs, this element indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group to which the data is published. If the flow log publishes to Amazon S3, this element indicates the ARN of the Amazon S3 bucket to which the data is published.
    */
  var LogDestination: js.UndefOr[String] = js.native
  /**
    * Specifies the type of destination to which the flow log data is published. Flow log data can be published to CloudWatch Logs or Amazon S3.
    */
  var LogDestinationType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LogDestinationType] = js.native
  /**
    * The format of the flow log record.
    */
  var LogFormat: js.UndefOr[String] = js.native
  /**
    * The name of the flow log group.
    */
  var LogGroupName: js.UndefOr[String] = js.native
  /**
    * The maximum interval of time, in seconds, during which a flow of packets is captured and aggregated into a flow log record. When a network interface is attached to a Nitro-based instance, the aggregation interval is always 60 seconds (1 minute) or less, regardless of the specified value. Valid Values: 60 | 600 
    */
  var MaxAggregationInterval: js.UndefOr[Integer] = js.native
  /**
    * The ID of the resource on which the flow log was created.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * The tags for the flow log.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of traffic captured for the flow log.
    */
  var TrafficType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TrafficType] = js.native
}

object FlowLog {
  @scala.inline
  def apply(): FlowLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowLog]
  }
  @scala.inline
  implicit class FlowLogOps[Self <: FlowLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliverLogsErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverLogsErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliverLogsErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverLogsErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliverLogsPermissionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverLogsPermissionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliverLogsPermissionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverLogsPermissionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliverLogsStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverLogsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliverLogsStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverLogsStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowLogId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowLogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowLogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowLogId")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowLogStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowLogStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowLogStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowLogStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLogDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withLogDestinationType(value: LogDestinationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogDestinationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogDestinationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogDestinationType")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAggregationInterval(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAggregationInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAggregationInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAggregationInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficType(value: TrafficType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficType")(js.undefined)
        ret
    }
  }
  
}

