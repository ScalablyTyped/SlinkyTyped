package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableIoTLoggingParams extends js.Object {
  /**
    * Specifies the types of information to be logged.
    */
  var logLevel: LogLevel = js.native
  /**
    * The ARN of the IAM role used for logging.
    */
  var roleArnForLogging: RoleArn = js.native
}

object EnableIoTLoggingParams {
  @scala.inline
  def apply(logLevel: LogLevel, roleArnForLogging: RoleArn): EnableIoTLoggingParams = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], roleArnForLogging = roleArnForLogging.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableIoTLoggingParams]
  }
  @scala.inline
  implicit class EnableIoTLoggingParamsOps[Self <: EnableIoTLoggingParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArnForLogging(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArnForLogging")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

