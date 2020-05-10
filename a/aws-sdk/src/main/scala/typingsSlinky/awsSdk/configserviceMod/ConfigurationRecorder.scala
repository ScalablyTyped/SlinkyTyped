package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationRecorder extends js.Object {
  /**
    * The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating the configuration recorder. You cannot change the assigned name.
    */
  var name: js.UndefOr[RecorderName] = js.native
  /**
    * Specifies the types of AWS resources for which AWS Config records configuration changes.
    */
  var recordingGroup: js.UndefOr[RecordingGroup] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
    */
  var roleARN: js.UndefOr[String] = js.native
}

object ConfigurationRecorder {
  @scala.inline
  def apply(): ConfigurationRecorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRecorder]
  }
  @scala.inline
  implicit class ConfigurationRecorderOps[Self <: ConfigurationRecorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: RecorderName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordingGroup(value: RecordingGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleARN")(js.undefined)
        ret
    }
  }
  
}

