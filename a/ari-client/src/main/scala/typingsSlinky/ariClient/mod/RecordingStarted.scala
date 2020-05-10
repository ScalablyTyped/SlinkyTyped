package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordingStarted extends Event {
  /* Properties */
  var recording: LiveRecording = js.native
}

object RecordingStarted {
  @scala.inline
  def apply(application: String, recording: LiveRecording, timestamp: js.Date, `type`: String): RecordingStarted = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingStarted]
  }
  @scala.inline
  implicit class RecordingStartedOps[Self <: RecordingStarted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecording(value: LiveRecording): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recording")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

