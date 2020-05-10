package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetV2LoggingLevelRequest extends js.Object {
  /**
    * The log level.
    */
  var logLevel: LogLevel = js.native
  /**
    * The log target.
    */
  var logTarget: LogTarget = js.native
}

object SetV2LoggingLevelRequest {
  @scala.inline
  def apply(logLevel: LogLevel, logTarget: LogTarget): SetV2LoggingLevelRequest = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], logTarget = logTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetV2LoggingLevelRequest]
  }
  @scala.inline
  implicit class SetV2LoggingLevelRequestOps[Self <: SetV2LoggingLevelRequest] (val x: Self) extends AnyVal {
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
    def withLogTarget(value: LogTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

