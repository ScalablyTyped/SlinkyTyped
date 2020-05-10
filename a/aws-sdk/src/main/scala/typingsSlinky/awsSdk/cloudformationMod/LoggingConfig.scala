package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfig extends js.Object {
  /**
    * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's handlers.
    */
  var LogGroupName: typingsSlinky.awsSdk.cloudformationMod.LogGroupName = js.native
  /**
    * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
    */
  var LogRoleArn: RoleArn = js.native
}

object LoggingConfig {
  @scala.inline
  def apply(LogGroupName: LogGroupName, LogRoleArn: RoleArn): LoggingConfig = {
    val __obj = js.Dynamic.literal(LogGroupName = LogGroupName.asInstanceOf[js.Any], LogRoleArn = LogRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
  @scala.inline
  implicit class LoggingConfigOps[Self <: LoggingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

