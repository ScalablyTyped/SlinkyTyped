package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordOperation extends CommsOperation {
  var recordingAccessToken: js.UndefOr[String] = js.native
  var recordingLocation: js.UndefOr[String] = js.native
}

object RecordOperation {
  @scala.inline
  def apply(): RecordOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordOperation]
  }
  @scala.inline
  implicit class RecordOperationOps[Self <: RecordOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordingAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingAccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingAccessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordingLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingLocation")(js.undefined)
        ret
    }
  }
  
}

