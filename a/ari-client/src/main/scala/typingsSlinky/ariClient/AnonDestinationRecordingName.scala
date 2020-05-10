package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDestinationRecordingName extends js.Object {
  var destinationRecordingName: String = js.native
  var recordingName: String = js.native
}

object AnonDestinationRecordingName {
  @scala.inline
  def apply(destinationRecordingName: String, recordingName: String): AnonDestinationRecordingName = {
    val __obj = js.Dynamic.literal(destinationRecordingName = destinationRecordingName.asInstanceOf[js.Any], recordingName = recordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDestinationRecordingName]
  }
  @scala.inline
  implicit class AnonDestinationRecordingNameOps[Self <: AnonDestinationRecordingName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationRecordingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationRecordingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

