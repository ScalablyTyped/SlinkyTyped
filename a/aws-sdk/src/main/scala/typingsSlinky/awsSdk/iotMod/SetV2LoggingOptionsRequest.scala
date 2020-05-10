package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetV2LoggingOptionsRequest extends js.Object {
  /**
    * The default logging level.
    */
  var defaultLogLevel: js.UndefOr[LogLevel] = js.native
  /**
    * If true all logs are disabled. The default is false.
    */
  var disableAllLogs: js.UndefOr[DisableAllLogs] = js.native
  /**
    * The ARN of the role that allows IoT to write to Cloudwatch logs.
    */
  var roleArn: js.UndefOr[AwsArn] = js.native
}

object SetV2LoggingOptionsRequest {
  @scala.inline
  def apply(): SetV2LoggingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetV2LoggingOptionsRequest]
  }
  @scala.inline
  implicit class SetV2LoggingOptionsRequestOps[Self <: SetV2LoggingOptionsRequest] (val x: Self) extends AnyVal {
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

