package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationRecorderStatus extends js.Object {
  /**
    * The error code indicating that the recording failed.
    */
  var lastErrorCode: js.UndefOr[String] = js.native
  /**
    * The message indicating that the recording failed due to an error.
    */
  var lastErrorMessage: js.UndefOr[String] = js.native
  /**
    * The time the recorder was last started.
    */
  var lastStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The last (previous) status of the recorder.
    */
  var lastStatus: js.UndefOr[RecorderStatus] = js.native
  /**
    * The time when the status was last changed.
    */
  var lastStatusChangeTime: js.UndefOr[js.Date] = js.native
  /**
    * The time the recorder was last stopped.
    */
  var lastStopTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the configuration recorder.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies whether or not the recorder is currently recording.
    */
  var recording: js.UndefOr[Boolean] = js.native
}

object ConfigurationRecorderStatus {
  @scala.inline
  def apply(): ConfigurationRecorderStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRecorderStatus]
  }
  @scala.inline
  implicit class ConfigurationRecorderStatusOps[Self <: ConfigurationRecorderStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatus(value: RecorderStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatusChangeTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusChangeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatusChangeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusChangeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStopTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStopTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStopTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStopTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withRecording(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recording")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecording: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recording")(js.undefined)
        ret
    }
  }
  
}

