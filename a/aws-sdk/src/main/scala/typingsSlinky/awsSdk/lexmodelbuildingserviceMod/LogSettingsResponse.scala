package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSettingsResponse extends js.Object {
  /**
    * The destination where logs are delivered.
    */
  var destination: js.UndefOr[Destination] = js.native
  /**
    * The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.native
  /**
    * The type of logging that is enabled.
    */
  var logType: js.UndefOr[LogType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.native
  /**
    * The resource prefix is the first part of the S3 object key within the S3 bucket that you specified to contain audio logs. For CloudWatch Logs it is the prefix of the log stream name within the log group that you specified. 
    */
  var resourcePrefix: js.UndefOr[ResourcePrefix] = js.native
}

object LogSettingsResponse {
  @scala.inline
  def apply(): LogSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSettingsResponse]
  }
  @scala.inline
  implicit class LogSettingsResponseOps[Self <: LogSettingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: Destination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: KmsKeyArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogType(value: LogType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logType")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcePrefix(value: ResourcePrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePrefix")(js.undefined)
        ret
    }
  }
  
}

