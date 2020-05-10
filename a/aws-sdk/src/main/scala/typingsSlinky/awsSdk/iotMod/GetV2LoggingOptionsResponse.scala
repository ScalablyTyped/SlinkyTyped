package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetV2LoggingOptionsResponse extends js.Object {
  /**
    * The default log level.
    */
  var defaultLogLevel: js.UndefOr[LogLevel] = js.native
  /**
    * Disables all logs.
    */
  var disableAllLogs: js.UndefOr[DisableAllLogs] = js.native
  /**
    * The IAM role ARN AWS IoT uses to write to your CloudWatch logs.
    */
  var roleArn: js.UndefOr[AwsArn] = js.native
}

object GetV2LoggingOptionsResponse {
  @scala.inline
  def apply(): GetV2LoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetV2LoggingOptionsResponse]
  }
  @scala.inline
  implicit class GetV2LoggingOptionsResponseOps[Self <: GetV2LoggingOptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLogLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLogLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAllLogs(value: DisableAllLogs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAllLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAllLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAllLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: AwsArn): Self = {
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

