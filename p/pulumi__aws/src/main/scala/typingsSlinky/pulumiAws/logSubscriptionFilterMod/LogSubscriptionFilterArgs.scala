package typingsSlinky.pulumiAws.logSubscriptionFilterMod

import typingsSlinky.pulumiAws.logGroupMod.LogGroup
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSubscriptionFilterArgs extends js.Object {
  /**
    * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
    */
  val destinationArn: Input[String] = js.native
  /**
    * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
    */
  val distribution: js.UndefOr[Input[String]] = js.native
  /**
    * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
    */
  val filterPattern: Input[String] = js.native
  /**
    * The name of the log group to associate the subscription filter with
    */
  val logGroup: Input[String | LogGroup] = js.native
  /**
    * A name for the subscription filter
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object LogSubscriptionFilterArgs {
  @scala.inline
  def apply(destinationArn: Input[String], filterPattern: Input[String], logGroup: Input[String | LogGroup]): LogSubscriptionFilterArgs = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], filterPattern = filterPattern.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSubscriptionFilterArgs]
  }
  @scala.inline
  implicit class LogSubscriptionFilterArgsOps[Self <: LogSubscriptionFilterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterPattern(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogGroup(value: Input[String | LogGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistribution(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}

