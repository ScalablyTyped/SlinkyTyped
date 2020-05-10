package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandPlugin extends js.Object {
  /**
    * The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent. 
    */
  var Name: js.UndefOr[CommandPluginName] = js.native
  /**
    * Output of the plugin execution.
    */
  var Output: js.UndefOr[CommandPluginOutput] = js.native
  /**
    * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript  test_folder is the name of the Amazon S3 bucket;  ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix; i-1234567876543 is the instance ID; awsrunShellScript is the name of the plugin.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript  test_folder is the name of the Amazon S3 bucket;  ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix; i-1234567876543 is the instance ID; awsrunShellScript is the name of the plugin.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
  /**
    * A numeric response code generated after running the plugin. 
    */
  var ResponseCode: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ResponseCode] = js.native
  /**
    * The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent. 
    */
  var ResponseFinishDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The time the plugin started running. 
    */
  var ResponseStartDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then this string is empty.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.native
  /**
    * The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for the command was not specified, then this string is empty.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.native
  /**
    * The status of this plugin. You can run a document with multiple plugins.
    */
  var Status: js.UndefOr[CommandPluginStatus] = js.native
  /**
    * A detailed status of the plugin execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and they don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typingsSlinky.awsSdk.ssmMod.StatusDetails] = js.native
}

object CommandPlugin {
  @scala.inline
  def apply(): CommandPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandPlugin]
  }
  @scala.inline
  implicit class CommandPluginOps[Self <: CommandPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: CommandPluginName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: CommandPluginOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputS3BucketName(value: S3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputS3KeyPrefix(value: S3KeyPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3KeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputS3Region(value: S3Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3Region: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3Region")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCode(value: ResponseCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseFinishDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseFinishDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseFinishDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseFinishDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseStartDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseStartDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseStartDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardErrorUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardErrorUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardErrorUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardErrorUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardOutputUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardOutputUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardOutputUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardOutputUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: CommandPluginStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusDetails(value: StatusDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(js.undefined)
        ret
    }
  }
  
}

