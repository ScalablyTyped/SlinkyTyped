package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudwatchLogsAction extends js.Object {
  /**
    * The CloudWatch log group to which the action sends data.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * The IAM role that allows access to the CloudWatch log.
    */
  var roleArn: AwsArn = js.native
}

object CloudwatchLogsAction {
  @scala.inline
  def apply(logGroupName: LogGroupName, roleArn: AwsArn): CloudwatchLogsAction = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchLogsAction]
  }
  @scala.inline
  implicit class CloudwatchLogsActionOps[Self <: CloudwatchLogsAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: AwsArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

