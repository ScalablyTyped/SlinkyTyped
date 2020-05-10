package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingOptionsPayload extends js.Object {
  /**
    * The log level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
}

object LoggingOptionsPayload {
  @scala.inline
  def apply(roleArn: AwsArn): LoggingOptionsPayload = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptionsPayload]
  }
  @scala.inline
  implicit class LoggingOptionsPayloadOps[Self <: LoggingOptionsPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: AwsArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
  }
  
}

