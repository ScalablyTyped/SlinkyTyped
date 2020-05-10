package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchOutputConfig extends js.Object {
  /**
    * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name, Systems Manager automatically creates a log group for you. The log group uses the following naming format: aws/ssm/SystemsManagerDocumentName.
    */
  var CloudWatchLogGroupName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CloudWatchLogGroupName] = js.native
  /**
    * Enables Systems Manager to send command output to CloudWatch Logs.
    */
  var CloudWatchOutputEnabled: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CloudWatchOutputEnabled] = js.native
}

object CloudWatchOutputConfig {
  @scala.inline
  def apply(): CloudWatchOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchOutputConfig]
  }
  @scala.inline
  implicit class CloudWatchOutputConfigOps[Self <: CloudWatchOutputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchLogGroupName(value: CloudWatchLogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchOutputEnabled(value: CloudWatchOutputEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchOutputEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchOutputEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchOutputEnabled")(js.undefined)
        ret
    }
  }
  
}

