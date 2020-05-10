package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingOptions extends js.Object {
  /**
    * Information that identifies those detector models and their detectors (instances) for which the logging level is given.
    */
  var detectorDebugOptions: js.UndefOr[DetectorDebugOptions] = js.native
  /**
    * If TRUE, logging is enabled for AWS IoT Events.
    */
  var enabled: LoggingEnabled = js.native
  /**
    * The logging level.
    */
  var level: LoggingLevel = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform logging.
    */
  var roleArn: AmazonResourceName = js.native
}

object LoggingOptions {
  @scala.inline
  def apply(enabled: LoggingEnabled, level: LoggingLevel, roleArn: AmazonResourceName): LoggingOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
  @scala.inline
  implicit class LoggingOptionsOps[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: LoggingEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: LoggingLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorDebugOptions(value: DetectorDebugOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorDebugOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorDebugOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorDebugOptions")(js.undefined)
        ret
    }
  }
  
}

