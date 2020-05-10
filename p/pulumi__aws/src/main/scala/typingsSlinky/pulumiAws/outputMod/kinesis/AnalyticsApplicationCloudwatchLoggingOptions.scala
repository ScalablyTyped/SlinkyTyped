package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationCloudwatchLoggingOptions extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  var logStreamArn: String = js.native
  var roleArn: String = js.native
}

object AnalyticsApplicationCloudwatchLoggingOptions {
  @scala.inline
  def apply(id: String, logStreamArn: String, roleArn: String): AnalyticsApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationCloudwatchLoggingOptions]
  }
  @scala.inline
  implicit class AnalyticsApplicationCloudwatchLoggingOptionsOps[Self <: AnalyticsApplicationCloudwatchLoggingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogStreamArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

