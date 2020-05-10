package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationLogsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to write your logs to CloudWatch Logs or an S3 bucket.
    */
  var iamRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The settings for your conversation logs. You can log text, audio, or both.
    */
  var logSettings: js.UndefOr[LogSettingsResponseList] = js.native
}

object ConversationLogsResponse {
  @scala.inline
  def apply(): ConversationLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationLogsResponse]
  }
  @scala.inline
  implicit class ConversationLogsResponseOps[Self <: ConversationLogsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamRoleArn(value: IamRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogSettings(value: LogSettingsResponseList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logSettings")(js.undefined)
        ret
    }
  }
  
}

